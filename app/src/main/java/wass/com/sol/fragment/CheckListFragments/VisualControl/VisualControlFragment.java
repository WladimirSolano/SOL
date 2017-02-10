package wass.com.sol.fragment.CheckListFragments.VisualControl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import wass.com.sol.Adapter.CheckList.ExpandableListAdapter;
import wass.com.sol.R;

/**
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class VisualControlFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.visual_control_fragment, container, false);


        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild, "visualControl");

        // setting list adapter
        expListView.setAdapter(listAdapter);

        setRetainInstance(true);

        return rootView;

    }

    private void prepareListData(View view) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<LinearLayout>>();

        // Adding child data
        listDataHeader.add("MAQUINARIAS Y EQUIPOS DE TRABAJO");
        listDataHeader.add("RECIPIENTES PARA RESIDUOS Y DESECHOS ");
        listDataHeader.add("AREAS ");
        listDataHeader.add("INFORMACIÓN OPERACIONAL ");

        // Adding child data
        List<LinearLayout> machineryEquipment = new ArrayList<>();
        machineryEquipment.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> wasteContainers = new ArrayList<>();
        wasteContainers.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> areas = new ArrayList<>();
        areas.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> operationalInformation = new ArrayList<>();
        operationalInformation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), machineryEquipment); // Header, Child data
        listDataChild.put(listDataHeader.get(1), wasteContainers); // Header, Child data
        listDataChild.put(listDataHeader.get(2), areas); // Header, Child data
        listDataChild.put(listDataHeader.get(3), operationalInformation); // Header, Child data
    }
}
