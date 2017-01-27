package wass.com.sol.fragment.CheckListFragments.Security;

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

public class SecurityFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.security_fragment, container, false);

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
        listDataHeader.add("USO DE EQUIPOS DE PROTECCIÓN PERSONAL PARA LA SEGURIDAD");
        listDataHeader.add("CUMPLIMIENTO DE ESTANDARES BASICOS  DE SEGURIDAD");
        listDataHeader.add("CONDICIONES DE LAS INSTALACIONES ELECTRICAS");
        listDataHeader.add("CONDICIONES DE FUNCIONAMIENTO DE  LOS EQUIPOS DE SEGURIDAD");
        listDataHeader.add("UBICACIÓN DE EXTINTORES/MANGUERAS");
        listDataHeader.add("AVISOS Y SEÑALIZACIÓN DE SEGURIDAD");
        listDataHeader.add("HOJAS DE DATOS DE SEGURIDAD DE LOS MATERIALES (MSDS) (HDSM)");
        listDataHeader.add("MAPA DE EVACUACIÓNS");
        listDataHeader.add("ESTACIONES DE ALARMA");
        listDataHeader.add("CONDICIONES DE LOS PASILLOS, VÍAS DE ACCESO Y ESCAPE");
        listDataHeader.add("INSTALACIONES Y RECIPIENTES PARA SUSTANCIAS Y/O MATERIALES Y DESECHOS PELIGROSOS.");
        listDataHeader.add("MANEJO DE DESECHOS Y SUSTANCIAS O MATERIALES  PELIGROSOS");

        // Adding child data
        List<LinearLayout> personalProtectiveEquipment = new ArrayList<>();
        personalProtectiveEquipment.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> complianceBasicSafetyStandars = new ArrayList<>();
        complianceBasicSafetyStandars.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> conditionsOfElectricalsInstallations = new ArrayList<>();
        conditionsOfElectricalsInstallations.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> conditionsOfOperationEquipment = new ArrayList<>();
        conditionsOfOperationEquipment.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> locationOfExtinguishersHose = new ArrayList<>();
        locationOfExtinguishersHose.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> WarningsSafetySignals = new ArrayList<>();
        WarningsSafetySignals.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> MaterialSafetyDataSheets = new ArrayList<>();
        MaterialSafetyDataSheets.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> MapEvacuation = new ArrayList<>();
        MapEvacuation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> alarmsStations = new ArrayList<>();
        alarmsStations.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> conditionsCorridorsAccessExhaustRoute = new ArrayList<>();
        conditionsCorridorsAccessExhaustRoute.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> facilitiesContainersSubtancesMaterialsHazardousWastes = new ArrayList<>();
        facilitiesContainersSubtancesMaterialsHazardousWastes.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> handlingWastesHazardousSubstancesMaterials = new ArrayList<>();
        handlingWastesHazardousSubstancesMaterials.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), personalProtectiveEquipment); // Header, Child data
        listDataChild.put(listDataHeader.get(1), complianceBasicSafetyStandars); // Header, Child data
        listDataChild.put(listDataHeader.get(2), conditionsOfElectricalsInstallations); // Header, Child data
        listDataChild.put(listDataHeader.get(3), conditionsOfOperationEquipment); // Header, Child data
        listDataChild.put(listDataHeader.get(4), locationOfExtinguishersHose); // Header, Child data
        listDataChild.put(listDataHeader.get(5), WarningsSafetySignals); // Header, Child data
        listDataChild.put(listDataHeader.get(6), MaterialSafetyDataSheets); // Header, Child data
        listDataChild.put(listDataHeader.get(7), MapEvacuation); // Header, Child data
        listDataChild.put(listDataHeader.get(8), alarmsStations); // Header, Child data
        listDataChild.put(listDataHeader.get(9), conditionsCorridorsAccessExhaustRoute); // Header, Child data
        listDataChild.put(listDataHeader.get(10), facilitiesContainersSubtancesMaterialsHazardousWastes); // Header, Child data
        listDataChild.put(listDataHeader.get(11), handlingWastesHazardousSubstancesMaterials); // Header, Child data
    }
}
