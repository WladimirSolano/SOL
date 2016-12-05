package wass.com.sol.fragment.CheckListFragments.SanitationPersonalPresentation;

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

import wass.com.sol.R;
import wass.com.sol.fragment.CheckListFragments.ExpandableListAdapter;

/**
 * Created by Lasar-Soporte on 4/12/2016.
 */

public class SanitationPersonalPresentationFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sanitation_personal_presentation, container, false);


        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        return rootView;

    }

    private void prepareListData(View view) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<LinearLayout>>();

        // Adding child data
        listDataHeader.add("PRESENTACION PERSONAL");
        listDataHeader.add("HIGIÉNE PERSONAL");
        listDataHeader.add("SALUD ");

        // Adding child data
        List<LinearLayout> personalPresentation = new ArrayList<>();
        personalPresentation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> personalSanitation = new ArrayList<>();
        personalSanitation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> health = new ArrayList<>();
        health.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> operationalInformation = new ArrayList<>();
        operationalInformation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), personalPresentation); // Header, Child data
        listDataChild.put(listDataHeader.get(1), personalSanitation); // Header, Child data
        listDataChild.put(listDataHeader.get(2), health); // Header, Child data
    }

}
