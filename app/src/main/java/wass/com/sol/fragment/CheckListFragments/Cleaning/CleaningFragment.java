package wass.com.sol.fragment.CheckListFragments.Cleaning;

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
import wass.com.sol.activity.MainActivity;

/**
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class CleaningFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cleaning_fragment, container, false);

        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.cleaning_expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild, "cleaning");

        // setting list adapter
        expListView.setAdapter(listAdapter);

        setRetainInstance(true);

        return rootView;
    }

    private void prepareListData(View view) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<LinearLayout>>();

        // Adding child data
        listDataHeader.add("PISOS");
        listDataHeader.add("PAREDES");
        listDataHeader.add("PUERTAS");
        listDataHeader.add("EXTRACTORES");
        listDataHeader.add("VENTANAS Y BLOQUES DE VENTILACIÓN");
        listDataHeader.add("LUMINARIAS");
        listDataHeader.add("INSTALACIONES SANITARIAS");
        listDataHeader.add("ESTACIONES DE LAVADO DE MANOS");
        listDataHeader.add("DRENAJES");

        // Adding child data
        List<LinearLayout> floors = new ArrayList<>();
        floors.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> walls = new ArrayList<>();
        walls.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> doors = new ArrayList<>();
        doors.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> extractors = new ArrayList<>();
        extractors.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> WindowsVentilationBlocks = new ArrayList<>();
        WindowsVentilationBlocks.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> illuminations = new ArrayList<>();
        illuminations.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> sanitation = new ArrayList<>();
        sanitation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> handwashingStations = new ArrayList<>();
        handwashingStations.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> drainage = new ArrayList<>();
        drainage.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), floors); // Header, Child data
        listDataChild.put(listDataHeader.get(1), walls); // Header, Child data
        listDataChild.put(listDataHeader.get(2), doors); // Header, Child data
        listDataChild.put(listDataHeader.get(3), extractors); // Header, Child data
        listDataChild.put(listDataHeader.get(4), WindowsVentilationBlocks); // Header, Child data
        listDataChild.put(listDataHeader.get(5), illuminations); // Header, Child data
        listDataChild.put(listDataHeader.get(6), sanitation); // Header, Child data
        listDataChild.put(listDataHeader.get(7), handwashingStations); // Header, Child data
        listDataChild.put(listDataHeader.get(8), drainage); // Header, Child data
    }
}
