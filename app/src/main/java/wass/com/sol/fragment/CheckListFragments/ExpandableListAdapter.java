package wass.com.sol.fragment.CheckListFragments;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import wass.com.sol.R;
import wass.com.sol.pojo.cleaning.Doors;

/**
 * Created by oriana on 12/4/2016.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<LinearLayout>> _listDataChild;

    private Doors doors = new Doors();

    private View doorsView = null;
    private View floorView = null;

    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<LinearLayout>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        String childText = this._listDataHeader.get(groupPosition).toLowerCase();
        System.out.println("Group " + childText);
        System.out.println("Group Position " + groupPosition);
        LayoutInflater infalInflater = (LayoutInflater) this._context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        switch (childText){
            case ("puertas") :
                System.out.println("puertas");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.doors_list_item, null);
                }else{
                    if (doorsView == null) {
                        doorsView = infalInflater.inflate(R.layout.doors_list_item, null);
                    }else {
                        convertView = doorsView;
                    }
                }
                break;
            case ("pisos") :
                System.out.println("pisos");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.floor_list_item, null);
                }else{
                    if (floorView == null) {
                        floorView = infalInflater.inflate(R.layout.floor_list_item, null);
                    }else {
                        convertView = floorView;
                    }
                }
                break;

            case ("paredes") :
                System.out.println("paredes");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.walls_list_item, null);
                }
                break;
            case ("extractores") :
                System.out.println("extractores");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.extractors_list_item, null);
                }
                break;
            case ("ventanas y bloques de ventilación") :
                System.out.println("ventanas y bloques de ventilación");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.windows_ventilation_blocks_list_item, null);
                }
                break;
            case ("luminarias") :
                System.out.println("luminarias");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.luminaires_list_item, null);
                }
                break;
            case ("instalaciones sanitarias") :
                System.out.println("instalaciones sanitarias");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.sanitation_personal_presentation, null);
                }
                break;
            case ("estaciones de lavado de manos") :
                System.out.println("estaciones de lavado de manos");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.hand_washing_station_list_item, null);
                }
                break;
            case ("drenajes") :
                System.out.println("drenajes");
                if (convertView == null) {
                    convertView = infalInflater.inflate(R.layout.drainage_list_item, null);
                }
                break;
        }

        /*
        if (childText.equalsIgnoreCase("pisos")) {
            //get spinner floorSC
            final Spinner floorSpinnerSC = (Spinner) convertView.getRootView().findViewById(R.id.floor_sc_spinner);
            floorSpinnerSC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    System.out.println("Pisos " + floorSpinnerSC.getSelectedItem().toString());
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
        */

        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }

        TextView lblListHeader = (TextView) convertView.findViewById(R.id.listTitle);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}
