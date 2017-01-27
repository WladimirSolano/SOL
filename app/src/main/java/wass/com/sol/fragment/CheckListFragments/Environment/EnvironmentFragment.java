package wass.com.sol.fragment.CheckListFragments.Environment;

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
 * Created by Lasar-Soporte on 4/12/2016.
 */

public class EnvironmentFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.environment_fragment, container, false);

        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        setRetainInstance(true);

        return rootView;
    }

    private void prepareListData(View view) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<LinearLayout>>();
        listDataChildAux = new HashMap<String, List<LinearLayout>>();

        // Adding child data
        listDataHeader.add("CLASIFICAR LOS DESECHOS Y RESIDUOS PELIGROSOS Y NO PELIGROSOS " );
        listDataHeader.add("IDENTIFICAR LOS RECIPIENTES SEGÚN EL TIPO DE DESECHO Y/O RESIDUO PELIGROSO Y NO PELIGROSO");
        listDataHeader.add("DISPOSICIÓN,ALMACENAMIENTO Y MANEJO");
        listDataHeader.add("CONTROL DE EMISIONES Y EFLUENTES");
        listDataHeader.add("USO RACIONAL DEL AGUA");
        listDataHeader.add("USO RACIONAL DE LA LUZ");
        listDataHeader.add("CONTROL DE RUIDO");
        listDataHeader.add("PROTECCIÓN DE LAS AREAS VERDES");

        // Adding child data
        List<LinearLayout> classifyngHazardousNonHazardousWastes = new ArrayList<>();
        classifyngHazardousNonHazardousWastes.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> identifyContainersTypeOfWaste = new ArrayList<>();
        identifyContainersTypeOfWaste.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> storageHandling = new ArrayList<>();
        storageHandling.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> controlEmissionsEffluents = new ArrayList<>();
        controlEmissionsEffluents.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> rationalUseOfWater = new ArrayList<>();
        rationalUseOfWater.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> rationalUseOflight = new ArrayList<>();
        rationalUseOflight.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> noiseControl = new ArrayList<>();
        noiseControl.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> protectionOfGreenAreas = new ArrayList<>();
        protectionOfGreenAreas.add((LinearLayout) view.findViewById(R.id.expandedListItem));


        listDataChild.put(listDataHeader.get(0), classifyngHazardousNonHazardousWastes); // Header, Child data
        listDataChild.put(listDataHeader.get(1), identifyContainersTypeOfWaste); // Header, Child data
        listDataChild.put(listDataHeader.get(2), storageHandling); // Header, Child data
        listDataChild.put(listDataHeader.get(3), controlEmissionsEffluents); // Header, Child data
        listDataChild.put(listDataHeader.get(4), rationalUseOfWater); // Header, Child data
        listDataChild.put(listDataHeader.get(5), rationalUseOflight); // Header, Child data
        listDataChild.put(listDataHeader.get(6), noiseControl); // Header, Child data
        listDataChild.put(listDataHeader.get(7), protectionOfGreenAreas); // Header, Child data

    }

}
