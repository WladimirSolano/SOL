package wass.com.sol.Adapter.CheckList;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import wass.com.sol.R;
import wass.com.sol.activity.MainActivity;

/**
 * Created by oriana on 12/4/2016.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<LinearLayout>> _listDataChild;

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

        ViewPager pager = (ViewPager) parent.getRootView().findViewById(R.id.pager);
        System.out.println(pager.getCurrentItem());

        String childText = this._listDataHeader.get(groupPosition).toLowerCase();
        System.out.println("Group " + childText);
        System.out.println("Group Position " + groupPosition);
        LayoutInflater infalInflater = (LayoutInflater) this._context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        switch (childText) {
            //Maintaining cleanliness
            case ("puertas"):
                System.out.println("puertas");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_doorsView() == null) {
                        ((MainActivity) _context).setC_doorsView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_doorsView();
                }
            case ("pisos"):
                System.out.println("pisos");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_floorView() == null) {
                        ((MainActivity) _context).setC_floorView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_floorView();
                }
            case ("paredes"):
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_wallsView() == null) {
                        ((MainActivity) _context).setC_wallsView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_wallsView();
                }
            case ("extractores"):
                System.out.println("extractores");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_extractorsView() == null) {
                        ((MainActivity) _context).setC_extractorsView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_extractorsView();
                }
            case ("ventanas y bloques de ventilación"):
                System.out.println("ventanas y bloques de ventilación");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_windowsVentilationsBlocksView() == null) {
                        ((MainActivity) _context).setC_windowsVentilationsBlocksView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_windowsVentilationsBlocksView();
                }
            case ("luminarias"):
                System.out.println("luminarias");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_luminairesView() == null) {
                        ((MainActivity) _context).setC_luminairesView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_luminairesView();
                }
            case ("instalaciones sanitarias"):
                System.out.println("instalaciones sanitarias");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_sanitationView() == null) {
                        ((MainActivity) _context).setC_sanitationView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_sanitationView();
                }
            case ("estaciones de lavado de manos"):
                System.out.println("estaciones de lavado de manos");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_handWashingStationView() == null) {
                        ((MainActivity) _context).setC_handWashingStationView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_handWashingStationView();
                }
            case ("drenajes"):
                System.out.println("drenajes");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getC_drainageView() == null) {
                        ((MainActivity) _context).setC_drainageView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getC_drainageView();
                }

                //Mantaining Order and Organization views
            case ("maquinarias y equipos de trabajo"):
                System.out.println("maquinarias y equipos de trabajo");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getOo_machineryWorkEquipmentView() == null) {
                        ((MainActivity) _context).setOo_machineryWorkEquipmentView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getOo_machineryWorkEquipmentView();
                }
            case ("utensilios de trabajo (herramientas/implemento de limpieza) asignadas"):
                System.out.println("utensilios de trabajo (herramientas/implemento de limpieza) asignadas");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getOo_assignedWorkToolsView() == null) {
                        ((MainActivity) _context).setOo_assignedWorkToolsView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getOo_assignedWorkToolsView();
                }
            case ("recipientes para residuos y desechos"):
                System.out.println("recipientes para residuos y desechos");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getOo_containersWasteScrapView() == null) {
                        ((MainActivity) _context).setOo_containersWasteScrapView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getOo_containersWasteScrapView();
                }
            case ("bancos,mesones, escritorios de trabajo y sillas"):
                System.out.println("bancos,mesones, escritorios de trabajo y sillas");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getOo_benchesCountersWorkdesksChairsView() == null) {
                        ((MainActivity) _context).setOo_benchesCountersWorkdesksChairsView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getOo_benchesCountersWorkdesksChairsView();
                }
            case ("estantes, escaparates, archivos, bibliotecas"):
                System.out.println("estantes, escaparates, archivos, bibliotecas");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getOo_shelvesShopwindowsArchivesLibrariesView() == null) {
                        ((MainActivity) _context).setOo_shelvesShopwindowsArchivesLibrariesView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getOo_shelvesShopwindowsArchivesLibrariesView();
                }
            case ("carteleras"):
                System.out.println("carteleras");
                if (_context instanceof MainActivity) {
                    if (((MainActivity) _context).getOo_billboardsView() == null) {
                        ((MainActivity) _context).setOo_billboardsView(infalInflater.inflate(R.layout.list_item, null));
                    }
                    return ((MainActivity) _context).getOo_billboardsView();
                }
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
