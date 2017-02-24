package wass.com.sol.fragment.checkListFragments.visualControl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import wass.com.sol.Adapter.CheckList.ExpandableListAdapter;
import wass.com.sol.R;
import wass.com.sol.activity.MainActivity;

/**
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class VisualControlFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;
    private MainActivity mainActivity;


    //Maintaining visual control views
    private View vc_assignedMachineryWorkEquipmentView = null;
    private View vc_containersWasteScrapView = null;
    private View vc_areasView = null;
    private View vc_operationalInformationView = null;

    //Assigned Machinery Work Equipment Value field
    private EditText vc_assignedMachineryWorkEquipment_sc_value;
    private EditText vc_assignedMachineryWorkEquipment_tyc_value;
    private EditText vc_assignedMachineryWorkEquipment_sdc_value;
    private EditText vc_assignedMachineryWorkEquipment_sac_value;
    private EditText vc_assignedMachineryWorkEquipment_sci_value;
    //Assigned Machinery Work Equipment Spinner Value
    private Spinner vc_assignedMachineryWorkEquipment_sc_spinner;
    private Spinner vc_assignedMachineryWorkEquipment_tyc_spinner;
    private Spinner vc_assignedMachineryWorkEquipment_sdc_spinner;
    private Spinner vc_assignedMachineryWorkEquipment_sac_spinner;
    private Spinner vc_assignedMachineryWorkEquipment_sci_spinner;
    //Assigned Machinery Work Equipment Evidence
    private EditText vc_assignedMachineryWorkEquipment_evidence;

    //Containers Waste Scrap Value field
    private EditText vc_containersWasteScrap_sc_value;
    private EditText vc_containersWasteScrap_tyc_value;
    private EditText vc_containersWasteScrap_sdc_value;
    private EditText vc_containersWasteScrap_sac_value;
    private EditText vc_containersWasteScrap_sci_value;
    //Containers Waste Scrap Spinner Value
    private Spinner vc_containersWasteScrap_sc_spinner;
    private Spinner vc_containersWasteScrap_tyc_spinner;
    private Spinner vc_containersWasteScrap_sdc_spinner;
    private Spinner vc_containersWasteScrap_sac_spinner;
    private Spinner vc_containersWasteScrap_sci_spinner;
    //Containers Waste Scrap Evidence
    private EditText vc_containersWasteScrap_evidence;

    //Areas Value field
    private EditText vc_areas_sc_value;
    private EditText vc_areas_tyc_value;
    private EditText vc_areas_sdc_value;
    private EditText vc_areas_sac_value;
    private EditText vc_areas_sci_value;
    //Areas Spinner Value
    private Spinner vc_areas_sc_spinner;
    private Spinner vc_areas_tyc_spinner;
    private Spinner vc_areas_sdc_spinner;
    private Spinner vc_areas_sac_spinner;
    private Spinner vc_areas_sci_spinner;
    //Areas Evidence
    private EditText vc_areas_evidence;

    //Operational Information Value field
    private EditText vc_operationalInformation_sc_value;
    private EditText vc_operationalInformation_tyc_value;
    private EditText vc_operationalInformation_sdc_value;
    private EditText vc_operationalInformation_sac_value;
    private EditText vc_operationalInformation_sci_value;
    //Operational Information Spinner Value
    private Spinner vc_operationalInformation_sc_spinner;
    private Spinner vc_operationalInformation_tyc_spinner;
    private Spinner vc_operationalInformation_sdc_spinner;
    private Spinner vc_operationalInformation_sac_spinner;
    private Spinner vc_operationalInformation_sci_spinner;
    //Operational Information Evidence
    private EditText vc_operationalInformation_evidence;

    public View getVc_assignedMachineryWorkEquipmentView() {
        return vc_assignedMachineryWorkEquipmentView;
    }

    public void setVc_assignedMachineryWorkEquipmentView(View vc_assignedMachineryWorkEquipmentView) {
        this.vc_assignedMachineryWorkEquipmentView = vc_assignedMachineryWorkEquipmentView;
    }

    public View getVc_containersWasteScrapView() {
        return vc_containersWasteScrapView;
    }

    public void setVc_containersWasteScrapView(View vc_containersWasteScrapView) {
        this.vc_containersWasteScrapView = vc_containersWasteScrapView;
    }

    public View getVc_areasView() {
        return vc_areasView;
    }

    public void setVc_areasView(View vc_areasView) {
        this.vc_areasView = vc_areasView;
    }

    public View getVc_operationalInformationView() {
        return vc_operationalInformationView;
    }

    public void setVc_operationalInformationView(View vc_operationalInformationView) {
        this.vc_operationalInformationView = vc_operationalInformationView;
    }

    public EditText getVc_assignedMachineryWorkEquipment_sc_value() {
        return vc_assignedMachineryWorkEquipment_sc_value;
    }

    public void setVc_assignedMachineryWorkEquipment_sc_value(EditText vc_assignedMachineryWorkEquipment_sc_value) {
        this.vc_assignedMachineryWorkEquipment_sc_value = vc_assignedMachineryWorkEquipment_sc_value;
    }

    public EditText getVc_assignedMachineryWorkEquipment_tyc_value() {
        return vc_assignedMachineryWorkEquipment_tyc_value;
    }

    public void setVc_assignedMachineryWorkEquipment_tyc_value(EditText vc_assignedMachineryWorkEquipment_tyc_value) {
        this.vc_assignedMachineryWorkEquipment_tyc_value = vc_assignedMachineryWorkEquipment_tyc_value;
    }

    public EditText getVc_assignedMachineryWorkEquipment_sdc_value() {
        return vc_assignedMachineryWorkEquipment_sdc_value;
    }

    public void setVc_assignedMachineryWorkEquipment_sdc_value(EditText vc_assignedMachineryWorkEquipment_sdc_value) {
        this.vc_assignedMachineryWorkEquipment_sdc_value = vc_assignedMachineryWorkEquipment_sdc_value;
    }

    public EditText getVc_assignedMachineryWorkEquipment_sac_value() {
        return vc_assignedMachineryWorkEquipment_sac_value;
    }

    public void setVc_assignedMachineryWorkEquipment_sac_value(EditText vc_assignedMachineryWorkEquipment_sac_value) {
        this.vc_assignedMachineryWorkEquipment_sac_value = vc_assignedMachineryWorkEquipment_sac_value;
    }

    public EditText getVc_assignedMachineryWorkEquipment_sci_value() {
        return vc_assignedMachineryWorkEquipment_sci_value;
    }

    public void setVc_assignedMachineryWorkEquipment_sci_value(EditText vc_assignedMachineryWorkEquipment_sci_value) {
        this.vc_assignedMachineryWorkEquipment_sci_value = vc_assignedMachineryWorkEquipment_sci_value;
    }

    public Spinner getVc_assignedMachineryWorkEquipment_sc_spinner() {
        return vc_assignedMachineryWorkEquipment_sc_spinner;
    }

    public void setVc_assignedMachineryWorkEquipment_sc_spinner(Spinner vc_assignedMachineryWorkEquipment_sc_spinner) {
        this.vc_assignedMachineryWorkEquipment_sc_spinner = vc_assignedMachineryWorkEquipment_sc_spinner;
    }

    public Spinner getVc_assignedMachineryWorkEquipment_tyc_spinner() {
        return vc_assignedMachineryWorkEquipment_tyc_spinner;
    }

    public void setVc_assignedMachineryWorkEquipment_tyc_spinner(Spinner vc_assignedMachineryWorkEquipment_tyc_spinner) {
        this.vc_assignedMachineryWorkEquipment_tyc_spinner = vc_assignedMachineryWorkEquipment_tyc_spinner;
    }

    public Spinner getVc_assignedMachineryWorkEquipment_sdc_spinner() {
        return vc_assignedMachineryWorkEquipment_sdc_spinner;
    }

    public void setVc_assignedMachineryWorkEquipment_sdc_spinner(Spinner vc_assignedMachineryWorkEquipment_sdc_spinner) {
        this.vc_assignedMachineryWorkEquipment_sdc_spinner = vc_assignedMachineryWorkEquipment_sdc_spinner;
    }

    public Spinner getVc_assignedMachineryWorkEquipment_sac_spinner() {
        return vc_assignedMachineryWorkEquipment_sac_spinner;
    }

    public void setVc_assignedMachineryWorkEquipment_sac_spinner(Spinner vc_assignedMachineryWorkEquipment_sac_spinner) {
        this.vc_assignedMachineryWorkEquipment_sac_spinner = vc_assignedMachineryWorkEquipment_sac_spinner;
    }

    public Spinner getVc_assignedMachineryWorkEquipment_sci_spinner() {
        return vc_assignedMachineryWorkEquipment_sci_spinner;
    }

    public void setVc_assignedMachineryWorkEquipment_sci_spinner(Spinner vc_assignedMachineryWorkEquipment_sci_spinner) {
        this.vc_assignedMachineryWorkEquipment_sci_spinner = vc_assignedMachineryWorkEquipment_sci_spinner;
    }

    public EditText getVc_assignedMachineryWorkEquipment_evidence() {
        return vc_assignedMachineryWorkEquipment_evidence;
    }

    public void setVc_assignedMachineryWorkEquipment_evidence(EditText vc_assignedMachineryWorkEquipment_evidence) {
        this.vc_assignedMachineryWorkEquipment_evidence = vc_assignedMachineryWorkEquipment_evidence;
    }

    public EditText getVc_containersWasteScrap_sc_value() {
        return vc_containersWasteScrap_sc_value;
    }

    public void setVc_containersWasteScrap_sc_value(EditText vc_containersWasteScrap_sc_value) {
        this.vc_containersWasteScrap_sc_value = vc_containersWasteScrap_sc_value;
    }

    public EditText getVc_containersWasteScrap_tyc_value() {
        return vc_containersWasteScrap_tyc_value;
    }

    public void setVc_containersWasteScrap_tyc_value(EditText vc_containersWasteScrap_tyc_value) {
        this.vc_containersWasteScrap_tyc_value = vc_containersWasteScrap_tyc_value;
    }

    public EditText getVc_containersWasteScrap_sdc_value() {
        return vc_containersWasteScrap_sdc_value;
    }

    public void setVc_containersWasteScrap_sdc_value(EditText vc_containersWasteScrap_sdc_value) {
        this.vc_containersWasteScrap_sdc_value = vc_containersWasteScrap_sdc_value;
    }

    public EditText getVc_containersWasteScrap_sac_value() {
        return vc_containersWasteScrap_sac_value;
    }

    public void setVc_containersWasteScrap_sac_value(EditText vc_containersWasteScrap_sac_value) {
        this.vc_containersWasteScrap_sac_value = vc_containersWasteScrap_sac_value;
    }

    public EditText getVc_containersWasteScrap_sci_value() {
        return vc_containersWasteScrap_sci_value;
    }

    public void setVc_containersWasteScrap_sci_value(EditText vc_containersWasteScrap_sci_value) {
        this.vc_containersWasteScrap_sci_value = vc_containersWasteScrap_sci_value;
    }

    public Spinner getVc_containersWasteScrap_sc_spinner() {
        return vc_containersWasteScrap_sc_spinner;
    }

    public void setVc_containersWasteScrap_sc_spinner(Spinner vc_containersWasteScrap_sc_spinner) {
        this.vc_containersWasteScrap_sc_spinner = vc_containersWasteScrap_sc_spinner;
    }

    public Spinner getVc_containersWasteScrap_tyc_spinner() {
        return vc_containersWasteScrap_tyc_spinner;
    }

    public void setVc_containersWasteScrap_tyc_spinner(Spinner vc_containersWasteScrap_tyc_spinner) {
        this.vc_containersWasteScrap_tyc_spinner = vc_containersWasteScrap_tyc_spinner;
    }

    public Spinner getVc_containersWasteScrap_sdc_spinner() {
        return vc_containersWasteScrap_sdc_spinner;
    }

    public void setVc_containersWasteScrap_sdc_spinner(Spinner vc_containersWasteScrap_sdc_spinner) {
        this.vc_containersWasteScrap_sdc_spinner = vc_containersWasteScrap_sdc_spinner;
    }

    public Spinner getVc_containersWasteScrap_sac_spinner() {
        return vc_containersWasteScrap_sac_spinner;
    }

    public void setVc_containersWasteScrap_sac_spinner(Spinner vc_containersWasteScrap_sac_spinner) {
        this.vc_containersWasteScrap_sac_spinner = vc_containersWasteScrap_sac_spinner;
    }

    public Spinner getVc_containersWasteScrap_sci_spinner() {
        return vc_containersWasteScrap_sci_spinner;
    }

    public void setVc_containersWasteScrap_sci_spinner(Spinner vc_containersWasteScrap_sci_spinner) {
        this.vc_containersWasteScrap_sci_spinner = vc_containersWasteScrap_sci_spinner;
    }

    public EditText getVc_containersWasteScrap_evidence() {
        return vc_containersWasteScrap_evidence;
    }

    public void setVc_containersWasteScrap_evidence(EditText vc_containersWasteScrap_evidence) {
        this.vc_containersWasteScrap_evidence = vc_containersWasteScrap_evidence;
    }

    public EditText getVc_areas_sc_value() {
        return vc_areas_sc_value;
    }

    public void setVc_areas_sc_value(EditText vc_areas_sc_value) {
        this.vc_areas_sc_value = vc_areas_sc_value;
    }

    public EditText getVc_areas_tyc_value() {
        return vc_areas_tyc_value;
    }

    public void setVc_areas_tyc_value(EditText vc_areas_tyc_value) {
        this.vc_areas_tyc_value = vc_areas_tyc_value;
    }

    public EditText getVc_areas_sdc_value() {
        return vc_areas_sdc_value;
    }

    public void setVc_areas_sdc_value(EditText vc_areas_sdc_value) {
        this.vc_areas_sdc_value = vc_areas_sdc_value;
    }

    public EditText getVc_areas_sac_value() {
        return vc_areas_sac_value;
    }

    public void setVc_areas_sac_value(EditText vc_areas_sac_value) {
        this.vc_areas_sac_value = vc_areas_sac_value;
    }

    public EditText getVc_areas_sci_value() {
        return vc_areas_sci_value;
    }

    public void setVc_areas_sci_value(EditText vc_areas_sci_value) {
        this.vc_areas_sci_value = vc_areas_sci_value;
    }

    public Spinner getVc_areas_sc_spinner() {
        return vc_areas_sc_spinner;
    }

    public void setVc_areas_sc_spinner(Spinner vc_areas_sc_spinner) {
        this.vc_areas_sc_spinner = vc_areas_sc_spinner;
    }

    public Spinner getVc_areas_tyc_spinner() {
        return vc_areas_tyc_spinner;
    }

    public void setVc_areas_tyc_spinner(Spinner vc_areas_tyc_spinner) {
        this.vc_areas_tyc_spinner = vc_areas_tyc_spinner;
    }

    public Spinner getVc_areas_sdc_spinner() {
        return vc_areas_sdc_spinner;
    }

    public void setVc_areas_sdc_spinner(Spinner vc_areas_sdc_spinner) {
        this.vc_areas_sdc_spinner = vc_areas_sdc_spinner;
    }

    public Spinner getVc_areas_sac_spinner() {
        return vc_areas_sac_spinner;
    }

    public void setVc_areas_sac_spinner(Spinner vc_areas_sac_spinner) {
        this.vc_areas_sac_spinner = vc_areas_sac_spinner;
    }

    public Spinner getVc_areas_sci_spinner() {
        return vc_areas_sci_spinner;
    }

    public void setVc_areas_sci_spinner(Spinner vc_areas_sci_spinner) {
        this.vc_areas_sci_spinner = vc_areas_sci_spinner;
    }

    public EditText getVc_areas_evidence() {
        return vc_areas_evidence;
    }

    public void setVc_areas_evidence(EditText vc_areas_evidence) {
        this.vc_areas_evidence = vc_areas_evidence;
    }

    public EditText getVc_operationalInformation_sc_value() {
        return vc_operationalInformation_sc_value;
    }

    public void setVc_operationalInformation_sc_value(EditText vc_operationalInformation_sc_value) {
        this.vc_operationalInformation_sc_value = vc_operationalInformation_sc_value;
    }

    public EditText getVc_operationalInformation_tyc_value() {
        return vc_operationalInformation_tyc_value;
    }

    public void setVc_operationalInformation_tyc_value(EditText vc_operationalInformation_tyc_value) {
        this.vc_operationalInformation_tyc_value = vc_operationalInformation_tyc_value;
    }

    public EditText getVc_operationalInformation_sdc_value() {
        return vc_operationalInformation_sdc_value;
    }

    public void setVc_operationalInformation_sdc_value(EditText vc_operationalInformation_sdc_value) {
        this.vc_operationalInformation_sdc_value = vc_operationalInformation_sdc_value;
    }

    public EditText getVc_operationalInformation_sac_value() {
        return vc_operationalInformation_sac_value;
    }

    public void setVc_operationalInformation_sac_value(EditText vc_operationalInformation_sac_value) {
        this.vc_operationalInformation_sac_value = vc_operationalInformation_sac_value;
    }

    public EditText getVc_operationalInformation_sci_value() {
        return vc_operationalInformation_sci_value;
    }

    public void setVc_operationalInformation_sci_value(EditText vc_operationalInformation_sci_value) {
        this.vc_operationalInformation_sci_value = vc_operationalInformation_sci_value;
    }

    public Spinner getVc_operationalInformation_sc_spinner() {
        return vc_operationalInformation_sc_spinner;
    }

    public void setVc_operationalInformation_sc_spinner(Spinner vc_operationalInformation_sc_spinner) {
        this.vc_operationalInformation_sc_spinner = vc_operationalInformation_sc_spinner;
    }

    public Spinner getVc_operationalInformation_tyc_spinner() {
        return vc_operationalInformation_tyc_spinner;
    }

    public void setVc_operationalInformation_tyc_spinner(Spinner vc_operationalInformation_tyc_spinner) {
        this.vc_operationalInformation_tyc_spinner = vc_operationalInformation_tyc_spinner;
    }

    public Spinner getVc_operationalInformation_sdc_spinner() {
        return vc_operationalInformation_sdc_spinner;
    }

    public void setVc_operationalInformation_sdc_spinner(Spinner vc_operationalInformation_sdc_spinner) {
        this.vc_operationalInformation_sdc_spinner = vc_operationalInformation_sdc_spinner;
    }

    public Spinner getVc_operationalInformation_sac_spinner() {
        return vc_operationalInformation_sac_spinner;
    }

    public void setVc_operationalInformation_sac_spinner(Spinner vc_operationalInformation_sac_spinner) {
        this.vc_operationalInformation_sac_spinner = vc_operationalInformation_sac_spinner;
    }

    public Spinner getVc_operationalInformation_sci_spinner() {
        return vc_operationalInformation_sci_spinner;
    }

    public void setVc_operationalInformation_sci_spinner(Spinner vc_operationalInformation_sci_spinner) {
        this.vc_operationalInformation_sci_spinner = vc_operationalInformation_sci_spinner;
    }

    public EditText getVc_operationalInformation_evidence() {
        return vc_operationalInformation_evidence;
    }

    public void setVc_operationalInformation_evidence(EditText vc_operationalInformation_evidence) {
        this.vc_operationalInformation_evidence = vc_operationalInformation_evidence;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();

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

        LayoutInflater infalInflater = mainActivity.getLayoutInflater();

        //Maintaining visual control views
        setVc_assignedMachineryWorkEquipmentView(infalInflater.inflate(R.layout.list_item, null));
        setVc_containersWasteScrapView(infalInflater.inflate(R.layout.list_item, null));
        setVc_areasView(infalInflater.inflate(R.layout.list_item, null));
        setVc_operationalInformationView(infalInflater.inflate(R.layout.list_item, null));

        //Assigned Machinery Work Equipment Value field
        vc_assignedMachineryWorkEquipment_sc_value = (EditText) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sc_value);
        vc_assignedMachineryWorkEquipment_tyc_value = (EditText) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.tyc_value);
        vc_assignedMachineryWorkEquipment_sdc_value = (EditText) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sdc_value);
        vc_assignedMachineryWorkEquipment_sac_value = (EditText) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sac_value);
        vc_assignedMachineryWorkEquipment_sci_value = (EditText) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sci_value);
        //Assigned Machinery Work Equipment Value
        vc_assignedMachineryWorkEquipment_sc_spinner = (Spinner) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sc_spinner);
        vc_assignedMachineryWorkEquipment_tyc_spinner = (Spinner) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.tyc_spinner);
        vc_assignedMachineryWorkEquipment_sdc_spinner = (Spinner) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sdc_spinner);
        vc_assignedMachineryWorkEquipment_sac_spinner = (Spinner) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sac_spinner);
        vc_assignedMachineryWorkEquipment_sci_spinner = (Spinner) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.sci_spinner);
        //Assigned Machinery Work Equipment Evidence
        vc_assignedMachineryWorkEquipment_evidence = (EditText) getVc_assignedMachineryWorkEquipmentView().findViewById(R.id.findings_evidence);

        //Containers Waste Scrap Value field
        vc_containersWasteScrap_sc_value = (EditText) getVc_containersWasteScrapView().findViewById(R.id.sc_value);
        vc_containersWasteScrap_tyc_value = (EditText) getVc_containersWasteScrapView().findViewById(R.id.tyc_value);
        vc_containersWasteScrap_sdc_value = (EditText) getVc_containersWasteScrapView().findViewById(R.id.sdc_value);
        vc_containersWasteScrap_sac_value = (EditText) getVc_containersWasteScrapView().findViewById(R.id.sac_value);
        vc_containersWasteScrap_sci_value = (EditText) getVc_containersWasteScrapView().findViewById(R.id.sci_value);
        //Containers Waste Scrap Value
        vc_containersWasteScrap_sc_spinner = (Spinner) getVc_containersWasteScrapView().findViewById(R.id.sc_spinner);
        vc_containersWasteScrap_tyc_spinner = (Spinner) getVc_containersWasteScrapView().findViewById(R.id.tyc_spinner);
        vc_containersWasteScrap_sdc_spinner = (Spinner) getVc_containersWasteScrapView().findViewById(R.id.sdc_spinner);
        vc_containersWasteScrap_sac_spinner = (Spinner) getVc_containersWasteScrapView().findViewById(R.id.sac_spinner);
        vc_containersWasteScrap_sci_spinner = (Spinner) getVc_containersWasteScrapView().findViewById(R.id.sci_spinner);
        //Containers Waste Scrap Evidence
        vc_containersWasteScrap_evidence = (EditText) getVc_containersWasteScrapView().findViewById(R.id.findings_evidence);

        //Areas Value field
        vc_areas_sc_value = (EditText) getVc_areasView().findViewById(R.id.sc_value);
        vc_areas_tyc_value = (EditText) getVc_areasView().findViewById(R.id.tyc_value);
        vc_areas_sdc_value = (EditText) getVc_areasView().findViewById(R.id.sdc_value);
        vc_areas_sac_value = (EditText) getVc_areasView().findViewById(R.id.sac_value);
        vc_areas_sci_value = (EditText) getVc_areasView().findViewById(R.id.sci_value);
        //Areas Value
        vc_areas_sc_spinner = (Spinner) getVc_areasView().findViewById(R.id.sc_spinner);
        vc_areas_tyc_spinner = (Spinner) getVc_areasView().findViewById(R.id.tyc_spinner);
        vc_areas_sdc_spinner = (Spinner) getVc_areasView().findViewById(R.id.sdc_spinner);
        vc_areas_sac_spinner = (Spinner) getVc_areasView().findViewById(R.id.sac_spinner);
        vc_areas_sci_spinner = (Spinner) getVc_areasView().findViewById(R.id.sci_spinner);
        //Areas Evidence
        vc_areas_evidence = (EditText) getVc_areasView().findViewById(R.id.findings_evidence);

        //Operational Information Value field
        vc_operationalInformation_sc_value = (EditText) getVc_operationalInformationView().findViewById(R.id.sc_value);
        vc_operationalInformation_tyc_value = (EditText) getVc_operationalInformationView().findViewById(R.id.tyc_value);
        vc_operationalInformation_sdc_value = (EditText) getVc_operationalInformationView().findViewById(R.id.sdc_value);
        vc_operationalInformation_sac_value = (EditText) getVc_operationalInformationView().findViewById(R.id.sac_value);
        vc_operationalInformation_sci_value = (EditText) getVc_operationalInformationView().findViewById(R.id.sci_value);
        //Operational Information Value
        vc_operationalInformation_sc_spinner = (Spinner) getVc_operationalInformationView().findViewById(R.id.sc_spinner);
        vc_operationalInformation_tyc_spinner = (Spinner) getVc_operationalInformationView().findViewById(R.id.tyc_spinner);
        vc_operationalInformation_sdc_spinner = (Spinner) getVc_operationalInformationView().findViewById(R.id.sdc_spinner);
        vc_operationalInformation_sac_spinner = (Spinner) getVc_operationalInformationView().findViewById(R.id.sac_spinner);
        vc_operationalInformation_sci_spinner = (Spinner) getVc_operationalInformationView().findViewById(R.id.sci_spinner);
        //Operational Information Evidence
        vc_operationalInformation_evidence = (EditText) getVc_operationalInformationView().findViewById(R.id.findings_evidence);
    }
}
