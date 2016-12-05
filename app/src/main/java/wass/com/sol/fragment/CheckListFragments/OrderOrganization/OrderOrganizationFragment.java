package wass.com.sol.fragment.CheckListFragments.OrderOrganization;

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
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class OrderOrganizationFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.order_organization_fragment, container, false);

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
        listDataChildAux = new HashMap<String, List<LinearLayout>>();

        // Adding child data
        listDataHeader.add("MAQUINARIAS Y EQUIPOS DE TRABAJO");
        listDataHeader.add("UTENSILIOS DE TRABAJO (HERRAMIENTAS  /IMPLEMENTO DE LIMPIEZA) ASIGNADAS ");
        listDataHeader.add("RECIPIENTES PARA RESIDUOS Y DESECHOS ");
        listDataHeader.add("BANCOS,MESONES, ESCRITORIOS DE TRABAJO Y SILLAS ");
        listDataHeader.add("ESTANTES, ESCAPARATES, ARCHIVOS, BIBLIOTECAS ");
        listDataHeader.add("CARTELERAS");

        // Adding child data
        List<LinearLayout> machineryEquipment = new ArrayList<>();
        machineryEquipment.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> assignedWorksTools = new ArrayList<>();
        assignedWorksTools.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> wasteContainers = new ArrayList<>();
        wasteContainers.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> banksDestopks = new ArrayList<>();
        banksDestopks.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> archivesLibraries = new ArrayList<>();
        archivesLibraries.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> postCards = new ArrayList<>();
        postCards.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), machineryEquipment); // Header, Child data
        listDataChild.put(listDataHeader.get(1), assignedWorksTools); // Header, Child data
        listDataChild.put(listDataHeader.get(2), wasteContainers); // Header, Child data
        listDataChild.put(listDataHeader.get(3), banksDestopks); // Header, Child data
        listDataChild.put(listDataHeader.get(4), archivesLibraries); // Header, Child data
        listDataChild.put(listDataHeader.get(5), postCards); // Header, Child data
    }

}
