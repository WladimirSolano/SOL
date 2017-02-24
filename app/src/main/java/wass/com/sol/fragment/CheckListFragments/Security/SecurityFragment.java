package wass.com.sol.fragment.checkListFragments.security;

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
 * Created by Lasar-Soporte on 4/12/2016.
 */

public class SecurityFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;
    private MainActivity mainActivity;


    //Maintaining security views
    private View s_usePersonalProtectiveEquipmentView = null;
    private View s_complianceBasicSafetyStandardsView = null;
    private View s_conditionsElectricalInstallationsView = null;
    private View s_operatingConditionsSafetyEquipmentView = null;
    private View s_locationExtinguishersHosesView = null;
    private View s_noticesSafetySignsView = null;
    private View s_materialSafetyDataSheetsView = null;
    private View s_evacuationMapView = null;
    private View s_alarmStationView = null;
    private View s_corridorConditionsAccessEscapeRoutesView = null;
    private View s_installationsContainersHazardousSubstancesMaterialsWasteView = null;
    private View s_managementHazardousWastesSubstancesMaterialsView = null;

    //Operating Conditions Safety Equipment Value field
    private EditText s_usePersonalProtectiveEquipment_sc_value;
    private EditText s_usePersonalProtectiveEquipment_tyc_value;
    private EditText s_usePersonalProtectiveEquipment_sdc_value;
    private EditText s_usePersonalProtectiveEquipment_sac_value;
    private EditText s_usePersonalProtectiveEquipment_sci_value;
    //Operating Conditions Safety Equipment Spinner Value
    private Spinner s_usePersonalProtectiveEquipment_sc_spinner;
    private Spinner s_usePersonalProtectiveEquipment_tyc_spinner;
    private Spinner s_usePersonalProtectiveEquipment_sdc_spinner;
    private Spinner s_usePersonalProtectiveEquipment_sac_spinner;
    private Spinner s_usePersonalProtectiveEquipment_sci_spinner;
    //Operating Conditions Safety Equipment Evidence
    private EditText s_usePersonalProtectiveEquipment_evidence;

    //Compliance Basic Safety Standards Value field
    private EditText s_complianceBasicSafetyStandards_sc_value;
    private EditText s_complianceBasicSafetyStandards_tyc_value;
    private EditText s_complianceBasicSafetyStandards_sdc_value;
    private EditText s_complianceBasicSafetyStandards_sac_value;
    private EditText s_complianceBasicSafetyStandards_sci_value;
    //Compliance Basic Safety Standards Spinner Value
    private Spinner s_complianceBasicSafetyStandards_sc_spinner;
    private Spinner s_complianceBasicSafetyStandards_tyc_spinner;
    private Spinner s_complianceBasicSafetyStandards_sdc_spinner;
    private Spinner s_complianceBasicSafetyStandards_sac_spinner;
    private Spinner s_complianceBasicSafetyStandards_sci_spinner;
    //Compliance Basic Safety Standards Evidence
    private EditText s_complianceBasicSafetyStandards_evidence;

    //Conditions Electrical Installations Value field
    private EditText s_conditionsElectricalInstallations_sc_value;
    private EditText s_conditionsElectricalInstallations_tyc_value;
    private EditText s_conditionsElectricalInstallations_sdc_value;
    private EditText s_conditionsElectricalInstallations_sac_value;
    private EditText s_conditionsElectricalInstallations_sci_value;
    //Conditions Electrical Installations Spinner Value
    private Spinner s_conditionsElectricalInstallations_sc_spinner;
    private Spinner s_conditionsElectricalInstallations_tyc_spinner;
    private Spinner s_conditionsElectricalInstallations_sdc_spinner;
    private Spinner s_conditionsElectricalInstallations_sac_spinner;
    private Spinner s_conditionsElectricalInstallations_sci_spinner;
    //Conditions Electrical Installations Evidence
    private EditText s_conditionsElectricalInstallations_evidence;

    //Operating Conditions Safety Equipment Value field
    private EditText s_operatingConditionsSafetyEquipment_sc_value;
    private EditText s_operatingConditionsSafetyEquipment_tyc_value;
    private EditText s_operatingConditionsSafetyEquipment_sdc_value;
    private EditText s_operatingConditionsSafetyEquipment_sac_value;
    private EditText s_operatingConditionsSafetyEquipment_sci_value;
    //Operating Conditions Safety Equipment Spinner Value
    private Spinner s_operatingConditionsSafetyEquipment_sc_spinner;
    private Spinner s_operatingConditionsSafetyEquipment_tyc_spinner;
    private Spinner s_operatingConditionsSafetyEquipment_sdc_spinner;
    private Spinner s_operatingConditionsSafetyEquipment_sac_spinner;
    private Spinner s_operatingConditionsSafetyEquipment_sci_spinner;
    //Operating Conditions Safety Equipment Evidence
    private EditText s_operatingConditionsSafetyEquipment_evidence;

    //Location Extinguishers Hoses Value field
    private EditText s_locationExtinguishersHoses_sc_value;
    private EditText s_locationExtinguishersHoses_tyc_value;
    private EditText s_locationExtinguishersHoses_sdc_value;
    private EditText s_locationExtinguishersHoses_sac_value;
    private EditText s_locationExtinguishersHoses_sci_value;
    //Location Extinguishers Hoses Spinner Value
    private Spinner s_locationExtinguishersHoses_sc_spinner;
    private Spinner s_locationExtinguishersHoses_tyc_spinner;
    private Spinner s_locationExtinguishersHoses_sdc_spinner;
    private Spinner s_locationExtinguishersHoses_sac_spinner;
    private Spinner s_locationExtinguishersHoses_sci_spinner;
    //Location Extinguishers Hoses Evidence
    private EditText s_locationExtinguishersHoses_evidence;

    //Notices Safety Signs Value field
    private EditText s_noticesSafetySigns_sc_value;
    private EditText s_noticesSafetySigns_tyc_value;
    private EditText s_noticesSafetySigns_sdc_value;
    private EditText s_noticesSafetySigns_sac_value;
    private EditText s_noticesSafetySigns_sci_value;
    //Notices Safety Signs Spinner Value
    private Spinner s_noticesSafetySigns_sc_spinner;
    private Spinner s_noticesSafetySigns_tyc_spinner;
    private Spinner s_noticesSafetySigns_sdc_spinner;
    private Spinner s_noticesSafetySigns_sac_spinner;
    private Spinner s_noticesSafetySigns_sci_spinner;
    //Notices Safety Signs Evidence
    private EditText s_noticesSafetySigns_evidence;

    //Material Safety DataSheets Value field
    private EditText s_materialSafetyDataSheets_sc_value;
    private EditText s_materialSafetyDataSheets_tyc_value;
    private EditText s_materialSafetyDataSheets_sdc_value;
    private EditText s_materialSafetyDataSheets_sac_value;
    private EditText s_materialSafetyDataSheets_sci_value;
    //Material Safety DataSheets Spinner Value
    private Spinner s_materialSafetyDataSheets_sc_spinner;
    private Spinner s_materialSafetyDataSheets_tyc_spinner;
    private Spinner s_materialSafetyDataSheets_sdc_spinner;
    private Spinner s_materialSafetyDataSheets_sac_spinner;
    private Spinner s_materialSafetyDataSheets_sci_spinner;
    //Material Safety DataSheets Evidence
    private EditText s_materialSafetyDataSheets_evidence;

    //Evacuation Map Value field
    private EditText s_evacuationMap_sc_value;
    private EditText s_evacuationMap_tyc_value;
    private EditText s_evacuationMap_sdc_value;
    private EditText s_evacuationMap_sac_value;
    private EditText s_evacuationMap_sci_value;
    //Evacuation Map Spinner Value
    private Spinner s_evacuationMap_sc_spinner;
    private Spinner s_evacuationMap_tyc_spinner;
    private Spinner s_evacuationMap_sdc_spinner;
    private Spinner s_evacuationMap_sac_spinner;
    private Spinner s_evacuationMap_sci_spinner;
    //Evacuation Map Evidence
    private EditText s_evacuationMap_evidence;

    //Alarm Station Value field
    private EditText s_alarmStation_sc_value;
    private EditText s_alarmStation_tyc_value;
    private EditText s_alarmStation_sdc_value;
    private EditText s_alarmStation_sac_value;
    private EditText s_alarmStation_sci_value;
    //Alarm Station Spinner Value
    private Spinner s_alarmStation_sc_spinner;
    private Spinner s_alarmStation_tyc_spinner;
    private Spinner s_alarmStation_sdc_spinner;
    private Spinner s_alarmStation_sac_spinner;
    private Spinner s_alarmStation_sci_spinner;
    //Alarm Station Evidence
    private EditText s_alarmStation_evidence;

    //Corridor Conditions Access Escape Routes Value field
    private EditText s_corridorConditionsAccessEscapeRoutes_sc_value;
    private EditText s_corridorConditionsAccessEscapeRoutes_tyc_value;
    private EditText s_corridorConditionsAccessEscapeRoutes_sdc_value;
    private EditText s_corridorConditionsAccessEscapeRoutes_sac_value;
    private EditText s_corridorConditionsAccessEscapeRoutes_sci_value;
    //Corridor Conditions Access Escape Routes Spinner Value
    private Spinner s_corridorConditionsAccessEscapeRoutes_sc_spinner;
    private Spinner s_corridorConditionsAccessEscapeRoutes_tyc_spinner;
    private Spinner s_corridorConditionsAccessEscapeRoutes_sdc_spinner;
    private Spinner s_corridorConditionsAccessEscapeRoutes_sac_spinner;
    private Spinner s_corridorConditionsAccessEscapeRoutes_sci_spinner;
    //Corridor Conditions Access Escape Routes Evidence
    private EditText s_corridorConditionsAccessEscapeRoutes_evidence;

    //Installations Containers Hazardous Substances Materials Waste Value field
    private EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sc_value;
    private EditText s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value;
    private EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value;
    private EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sac_value;
    private EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sci_value;
    //Installations Containers Hazardous Substances Materials Waste Spinner Value
    private Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner;
    private Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner;
    private Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner;
    private Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner;
    private Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner;
    //Installations Containers Hazardous Substances Materials Waste Evidence
    private EditText s_installationsContainersHazardousSubstancesMaterialsWaste_evidence;

    //Management Hazardous Wastes Substances Materials Value field
    private EditText s_managementHazardousWastesSubstancesMaterials_sc_value;
    private EditText s_managementHazardousWastesSubstancesMaterials_tyc_value;
    private EditText s_managementHazardousWastesSubstancesMaterials_sdc_value;
    private EditText s_managementHazardousWastesSubstancesMaterials_sac_value;
    private EditText s_managementHazardousWastesSubstancesMaterials_sci_value;
    //Management Hazardous Wastes Substances Materials Spinner Value
    private Spinner s_managementHazardousWastesSubstancesMaterials_sc_spinner;
    private Spinner s_managementHazardousWastesSubstancesMaterials_tyc_spinner;
    private Spinner s_managementHazardousWastesSubstancesMaterials_sdc_spinner;
    private Spinner s_managementHazardousWastesSubstancesMaterials_sac_spinner;
    private Spinner s_managementHazardousWastesSubstancesMaterials_sci_spinner;
    //Management Hazardous Wastes Substances Materials Evidence
    private EditText s_managementHazardousWastesSubstancesMaterials_evidence;

    public View getS_usePersonalProtectiveEquipmentView() {
        return s_usePersonalProtectiveEquipmentView;
    }

    public void setS_usePersonalProtectiveEquipmentView(View s_usePersonalProtectiveEquipmentView) {
        this.s_usePersonalProtectiveEquipmentView = s_usePersonalProtectiveEquipmentView;
    }

    public View getS_complianceBasicSafetyStandardsView() {
        return s_complianceBasicSafetyStandardsView;
    }

    public void setS_complianceBasicSafetyStandardsView(View s_complianceBasicSafetyStandardsView) {
        this.s_complianceBasicSafetyStandardsView = s_complianceBasicSafetyStandardsView;
    }

    public View getS_conditionsElectricalInstallationsView() {
        return s_conditionsElectricalInstallationsView;
    }

    public void setS_conditionsElectricalInstallationsView(View s_conditionsElectricalInstallationsView) {
        this.s_conditionsElectricalInstallationsView = s_conditionsElectricalInstallationsView;
    }

    public View getS_operatingConditionsSafetyEquipmentView() {
        return s_operatingConditionsSafetyEquipmentView;
    }

    public void setS_operatingConditionsSafetyEquipmentView(View s_operatingConditionsSafetyEquipmentView) {
        this.s_operatingConditionsSafetyEquipmentView = s_operatingConditionsSafetyEquipmentView;
    }

    public View getS_locationExtinguishersHosesView() {
        return s_locationExtinguishersHosesView;
    }

    public void setS_locationExtinguishersHosesView(View s_locationExtinguishersHosesView) {
        this.s_locationExtinguishersHosesView = s_locationExtinguishersHosesView;
    }

    public View getS_noticesSafetySignsView() {
        return s_noticesSafetySignsView;
    }

    public void setS_noticesSafetySignsView(View s_noticesSafetySignsView) {
        this.s_noticesSafetySignsView = s_noticesSafetySignsView;
    }

    public View getS_materialSafetyDataSheetsView() {
        return s_materialSafetyDataSheetsView;
    }

    public void setS_materialSafetyDataSheetsView(View s_materialSafetyDataSheetsView) {
        this.s_materialSafetyDataSheetsView = s_materialSafetyDataSheetsView;
    }

    public View getS_evacuationMapView() {
        return s_evacuationMapView;
    }

    public void setS_evacuationMapView(View s_evacuationMapView) {
        this.s_evacuationMapView = s_evacuationMapView;
    }

    public View getS_alarmStationView() {
        return s_alarmStationView;
    }

    public void setS_alarmStationView(View s_alarmStationView) {
        this.s_alarmStationView = s_alarmStationView;
    }

    public View getS_corridorConditionsAccessEscapeRoutesView() {
        return s_corridorConditionsAccessEscapeRoutesView;
    }

    public void setS_corridorConditionsAccessEscapeRoutesView(View s_corridorConditionsAccessEscapeRoutesView) {
        this.s_corridorConditionsAccessEscapeRoutesView = s_corridorConditionsAccessEscapeRoutesView;
    }

    public View getS_installationsContainersHazardousSubstancesMaterialsWasteView() {
        return s_installationsContainersHazardousSubstancesMaterialsWasteView;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWasteView(View s_installationsContainersHazardousSubstancesMaterialsWasteView) {
        this.s_installationsContainersHazardousSubstancesMaterialsWasteView = s_installationsContainersHazardousSubstancesMaterialsWasteView;
    }

    public View getS_managementHazardousWastesSubstancesMaterialsView() {
        return s_managementHazardousWastesSubstancesMaterialsView;
    }

    public void setS_managementHazardousWastesSubstancesMaterialsView(View s_managementHazardousWastesSubstancesMaterialsView) {
        this.s_managementHazardousWastesSubstancesMaterialsView = s_managementHazardousWastesSubstancesMaterialsView;
    }

    public EditText getS_usePersonalProtectiveEquipment_sc_value() {
        return s_usePersonalProtectiveEquipment_sc_value;
    }

    public void setS_usePersonalProtectiveEquipment_sc_value(EditText s_usePersonalProtectiveEquipment_sc_value) {
        this.s_usePersonalProtectiveEquipment_sc_value = s_usePersonalProtectiveEquipment_sc_value;
    }

    public EditText getS_usePersonalProtectiveEquipment_tyc_value() {
        return s_usePersonalProtectiveEquipment_tyc_value;
    }

    public void setS_usePersonalProtectiveEquipment_tyc_value(EditText s_usePersonalProtectiveEquipment_tyc_value) {
        this.s_usePersonalProtectiveEquipment_tyc_value = s_usePersonalProtectiveEquipment_tyc_value;
    }

    public EditText getS_usePersonalProtectiveEquipment_sdc_value() {
        return s_usePersonalProtectiveEquipment_sdc_value;
    }

    public void setS_usePersonalProtectiveEquipment_sdc_value(EditText s_usePersonalProtectiveEquipment_sdc_value) {
        this.s_usePersonalProtectiveEquipment_sdc_value = s_usePersonalProtectiveEquipment_sdc_value;
    }

    public EditText getS_usePersonalProtectiveEquipment_sac_value() {
        return s_usePersonalProtectiveEquipment_sac_value;
    }

    public void setS_usePersonalProtectiveEquipment_sac_value(EditText s_usePersonalProtectiveEquipment_sac_value) {
        this.s_usePersonalProtectiveEquipment_sac_value = s_usePersonalProtectiveEquipment_sac_value;
    }

    public EditText getS_usePersonalProtectiveEquipment_sci_value() {
        return s_usePersonalProtectiveEquipment_sci_value;
    }

    public void setS_usePersonalProtectiveEquipment_sci_value(EditText s_usePersonalProtectiveEquipment_sci_value) {
        this.s_usePersonalProtectiveEquipment_sci_value = s_usePersonalProtectiveEquipment_sci_value;
    }

    public Spinner getS_usePersonalProtectiveEquipment_sc_spinner() {
        return s_usePersonalProtectiveEquipment_sc_spinner;
    }

    public void setS_usePersonalProtectiveEquipment_sc_spinner(Spinner s_usePersonalProtectiveEquipment_sc_spinner) {
        this.s_usePersonalProtectiveEquipment_sc_spinner = s_usePersonalProtectiveEquipment_sc_spinner;
    }

    public Spinner getS_usePersonalProtectiveEquipment_tyc_spinner() {
        return s_usePersonalProtectiveEquipment_tyc_spinner;
    }

    public void setS_usePersonalProtectiveEquipment_tyc_spinner(Spinner s_usePersonalProtectiveEquipment_tyc_spinner) {
        this.s_usePersonalProtectiveEquipment_tyc_spinner = s_usePersonalProtectiveEquipment_tyc_spinner;
    }

    public Spinner getS_usePersonalProtectiveEquipment_sdc_spinner() {
        return s_usePersonalProtectiveEquipment_sdc_spinner;
    }

    public void setS_usePersonalProtectiveEquipment_sdc_spinner(Spinner s_usePersonalProtectiveEquipment_sdc_spinner) {
        this.s_usePersonalProtectiveEquipment_sdc_spinner = s_usePersonalProtectiveEquipment_sdc_spinner;
    }

    public Spinner getS_usePersonalProtectiveEquipment_sac_spinner() {
        return s_usePersonalProtectiveEquipment_sac_spinner;
    }

    public void setS_usePersonalProtectiveEquipment_sac_spinner(Spinner s_usePersonalProtectiveEquipment_sac_spinner) {
        this.s_usePersonalProtectiveEquipment_sac_spinner = s_usePersonalProtectiveEquipment_sac_spinner;
    }

    public Spinner getS_usePersonalProtectiveEquipment_sci_spinner() {
        return s_usePersonalProtectiveEquipment_sci_spinner;
    }

    public void setS_usePersonalProtectiveEquipment_sci_spinner(Spinner s_usePersonalProtectiveEquipment_sci_spinner) {
        this.s_usePersonalProtectiveEquipment_sci_spinner = s_usePersonalProtectiveEquipment_sci_spinner;
    }

    public EditText getS_usePersonalProtectiveEquipment_evidence() {
        return s_usePersonalProtectiveEquipment_evidence;
    }

    public void setS_usePersonalProtectiveEquipment_evidence(EditText s_usePersonalProtectiveEquipment_evidence) {
        this.s_usePersonalProtectiveEquipment_evidence = s_usePersonalProtectiveEquipment_evidence;
    }

    public EditText getS_complianceBasicSafetyStandards_sc_value() {
        return s_complianceBasicSafetyStandards_sc_value;
    }

    public void setS_complianceBasicSafetyStandards_sc_value(EditText s_complianceBasicSafetyStandards_sc_value) {
        this.s_complianceBasicSafetyStandards_sc_value = s_complianceBasicSafetyStandards_sc_value;
    }

    public EditText getS_complianceBasicSafetyStandards_tyc_value() {
        return s_complianceBasicSafetyStandards_tyc_value;
    }

    public void setS_complianceBasicSafetyStandards_tyc_value(EditText s_complianceBasicSafetyStandards_tyc_value) {
        this.s_complianceBasicSafetyStandards_tyc_value = s_complianceBasicSafetyStandards_tyc_value;
    }

    public EditText getS_complianceBasicSafetyStandards_sdc_value() {
        return s_complianceBasicSafetyStandards_sdc_value;
    }

    public void setS_complianceBasicSafetyStandards_sdc_value(EditText s_complianceBasicSafetyStandards_sdc_value) {
        this.s_complianceBasicSafetyStandards_sdc_value = s_complianceBasicSafetyStandards_sdc_value;
    }

    public EditText getS_complianceBasicSafetyStandards_sac_value() {
        return s_complianceBasicSafetyStandards_sac_value;
    }

    public void setS_complianceBasicSafetyStandards_sac_value(EditText s_complianceBasicSafetyStandards_sac_value) {
        this.s_complianceBasicSafetyStandards_sac_value = s_complianceBasicSafetyStandards_sac_value;
    }

    public EditText getS_complianceBasicSafetyStandards_sci_value() {
        return s_complianceBasicSafetyStandards_sci_value;
    }

    public void setS_complianceBasicSafetyStandards_sci_value(EditText s_complianceBasicSafetyStandards_sci_value) {
        this.s_complianceBasicSafetyStandards_sci_value = s_complianceBasicSafetyStandards_sci_value;
    }

    public Spinner getS_complianceBasicSafetyStandards_sc_spinner() {
        return s_complianceBasicSafetyStandards_sc_spinner;
    }

    public void setS_complianceBasicSafetyStandards_sc_spinner(Spinner s_complianceBasicSafetyStandards_sc_spinner) {
        this.s_complianceBasicSafetyStandards_sc_spinner = s_complianceBasicSafetyStandards_sc_spinner;
    }

    public Spinner getS_complianceBasicSafetyStandards_tyc_spinner() {
        return s_complianceBasicSafetyStandards_tyc_spinner;
    }

    public void setS_complianceBasicSafetyStandards_tyc_spinner(Spinner s_complianceBasicSafetyStandards_tyc_spinner) {
        this.s_complianceBasicSafetyStandards_tyc_spinner = s_complianceBasicSafetyStandards_tyc_spinner;
    }

    public Spinner getS_complianceBasicSafetyStandards_sdc_spinner() {
        return s_complianceBasicSafetyStandards_sdc_spinner;
    }

    public void setS_complianceBasicSafetyStandards_sdc_spinner(Spinner s_complianceBasicSafetyStandards_sdc_spinner) {
        this.s_complianceBasicSafetyStandards_sdc_spinner = s_complianceBasicSafetyStandards_sdc_spinner;
    }

    public Spinner getS_complianceBasicSafetyStandards_sac_spinner() {
        return s_complianceBasicSafetyStandards_sac_spinner;
    }

    public void setS_complianceBasicSafetyStandards_sac_spinner(Spinner s_complianceBasicSafetyStandards_sac_spinner) {
        this.s_complianceBasicSafetyStandards_sac_spinner = s_complianceBasicSafetyStandards_sac_spinner;
    }

    public Spinner getS_complianceBasicSafetyStandards_sci_spinner() {
        return s_complianceBasicSafetyStandards_sci_spinner;
    }

    public void setS_complianceBasicSafetyStandards_sci_spinner(Spinner s_complianceBasicSafetyStandards_sci_spinner) {
        this.s_complianceBasicSafetyStandards_sci_spinner = s_complianceBasicSafetyStandards_sci_spinner;
    }

    public EditText getS_complianceBasicSafetyStandards_evidence() {
        return s_complianceBasicSafetyStandards_evidence;
    }

    public void setS_complianceBasicSafetyStandards_evidence(EditText s_complianceBasicSafetyStandards_evidence) {
        this.s_complianceBasicSafetyStandards_evidence = s_complianceBasicSafetyStandards_evidence;
    }

    public EditText getS_conditionsElectricalInstallations_sc_value() {
        return s_conditionsElectricalInstallations_sc_value;
    }

    public void setS_conditionsElectricalInstallations_sc_value(EditText s_conditionsElectricalInstallations_sc_value) {
        this.s_conditionsElectricalInstallations_sc_value = s_conditionsElectricalInstallations_sc_value;
    }

    public EditText getS_conditionsElectricalInstallations_tyc_value() {
        return s_conditionsElectricalInstallations_tyc_value;
    }

    public void setS_conditionsElectricalInstallations_tyc_value(EditText s_conditionsElectricalInstallations_tyc_value) {
        this.s_conditionsElectricalInstallations_tyc_value = s_conditionsElectricalInstallations_tyc_value;
    }

    public EditText getS_conditionsElectricalInstallations_sdc_value() {
        return s_conditionsElectricalInstallations_sdc_value;
    }

    public void setS_conditionsElectricalInstallations_sdc_value(EditText s_conditionsElectricalInstallations_sdc_value) {
        this.s_conditionsElectricalInstallations_sdc_value = s_conditionsElectricalInstallations_sdc_value;
    }

    public EditText getS_conditionsElectricalInstallations_sac_value() {
        return s_conditionsElectricalInstallations_sac_value;
    }

    public void setS_conditionsElectricalInstallations_sac_value(EditText s_conditionsElectricalInstallations_sac_value) {
        this.s_conditionsElectricalInstallations_sac_value = s_conditionsElectricalInstallations_sac_value;
    }

    public EditText getS_conditionsElectricalInstallations_sci_value() {
        return s_conditionsElectricalInstallations_sci_value;
    }

    public void setS_conditionsElectricalInstallations_sci_value(EditText s_conditionsElectricalInstallations_sci_value) {
        this.s_conditionsElectricalInstallations_sci_value = s_conditionsElectricalInstallations_sci_value;
    }

    public Spinner getS_conditionsElectricalInstallations_sc_spinner() {
        return s_conditionsElectricalInstallations_sc_spinner;
    }

    public void setS_conditionsElectricalInstallations_sc_spinner(Spinner s_conditionsElectricalInstallations_sc_spinner) {
        this.s_conditionsElectricalInstallations_sc_spinner = s_conditionsElectricalInstallations_sc_spinner;
    }

    public Spinner getS_conditionsElectricalInstallations_tyc_spinner() {
        return s_conditionsElectricalInstallations_tyc_spinner;
    }

    public void setS_conditionsElectricalInstallations_tyc_spinner(Spinner s_conditionsElectricalInstallations_tyc_spinner) {
        this.s_conditionsElectricalInstallations_tyc_spinner = s_conditionsElectricalInstallations_tyc_spinner;
    }

    public Spinner getS_conditionsElectricalInstallations_sdc_spinner() {
        return s_conditionsElectricalInstallations_sdc_spinner;
    }

    public void setS_conditionsElectricalInstallations_sdc_spinner(Spinner s_conditionsElectricalInstallations_sdc_spinner) {
        this.s_conditionsElectricalInstallations_sdc_spinner = s_conditionsElectricalInstallations_sdc_spinner;
    }

    public Spinner getS_conditionsElectricalInstallations_sac_spinner() {
        return s_conditionsElectricalInstallations_sac_spinner;
    }

    public void setS_conditionsElectricalInstallations_sac_spinner(Spinner s_conditionsElectricalInstallations_sac_spinner) {
        this.s_conditionsElectricalInstallations_sac_spinner = s_conditionsElectricalInstallations_sac_spinner;
    }

    public Spinner getS_conditionsElectricalInstallations_sci_spinner() {
        return s_conditionsElectricalInstallations_sci_spinner;
    }

    public void setS_conditionsElectricalInstallations_sci_spinner(Spinner s_conditionsElectricalInstallations_sci_spinner) {
        this.s_conditionsElectricalInstallations_sci_spinner = s_conditionsElectricalInstallations_sci_spinner;
    }

    public EditText getS_conditionsElectricalInstallations_evidence() {
        return s_conditionsElectricalInstallations_evidence;
    }

    public void setS_conditionsElectricalInstallations_evidence(EditText s_conditionsElectricalInstallations_evidence) {
        this.s_conditionsElectricalInstallations_evidence = s_conditionsElectricalInstallations_evidence;
    }

    public EditText getS_operatingConditionsSafetyEquipment_sc_value() {
        return s_operatingConditionsSafetyEquipment_sc_value;
    }

    public void setS_operatingConditionsSafetyEquipment_sc_value(EditText s_operatingConditionsSafetyEquipment_sc_value) {
        this.s_operatingConditionsSafetyEquipment_sc_value = s_operatingConditionsSafetyEquipment_sc_value;
    }

    public EditText getS_operatingConditionsSafetyEquipment_tyc_value() {
        return s_operatingConditionsSafetyEquipment_tyc_value;
    }

    public void setS_operatingConditionsSafetyEquipment_tyc_value(EditText s_operatingConditionsSafetyEquipment_tyc_value) {
        this.s_operatingConditionsSafetyEquipment_tyc_value = s_operatingConditionsSafetyEquipment_tyc_value;
    }

    public EditText getS_operatingConditionsSafetyEquipment_sdc_value() {
        return s_operatingConditionsSafetyEquipment_sdc_value;
    }

    public void setS_operatingConditionsSafetyEquipment_sdc_value(EditText s_operatingConditionsSafetyEquipment_sdc_value) {
        this.s_operatingConditionsSafetyEquipment_sdc_value = s_operatingConditionsSafetyEquipment_sdc_value;
    }

    public EditText getS_operatingConditionsSafetyEquipment_sac_value() {
        return s_operatingConditionsSafetyEquipment_sac_value;
    }

    public void setS_operatingConditionsSafetyEquipment_sac_value(EditText s_operatingConditionsSafetyEquipment_sac_value) {
        this.s_operatingConditionsSafetyEquipment_sac_value = s_operatingConditionsSafetyEquipment_sac_value;
    }

    public EditText getS_operatingConditionsSafetyEquipment_sci_value() {
        return s_operatingConditionsSafetyEquipment_sci_value;
    }

    public void setS_operatingConditionsSafetyEquipment_sci_value(EditText s_operatingConditionsSafetyEquipment_sci_value) {
        this.s_operatingConditionsSafetyEquipment_sci_value = s_operatingConditionsSafetyEquipment_sci_value;
    }

    public Spinner getS_operatingConditionsSafetyEquipment_sc_spinner() {
        return s_operatingConditionsSafetyEquipment_sc_spinner;
    }

    public void setS_operatingConditionsSafetyEquipment_sc_spinner(Spinner s_operatingConditionsSafetyEquipment_sc_spinner) {
        this.s_operatingConditionsSafetyEquipment_sc_spinner = s_operatingConditionsSafetyEquipment_sc_spinner;
    }

    public Spinner getS_operatingConditionsSafetyEquipment_tyc_spinner() {
        return s_operatingConditionsSafetyEquipment_tyc_spinner;
    }

    public void setS_operatingConditionsSafetyEquipment_tyc_spinner(Spinner s_operatingConditionsSafetyEquipment_tyc_spinner) {
        this.s_operatingConditionsSafetyEquipment_tyc_spinner = s_operatingConditionsSafetyEquipment_tyc_spinner;
    }

    public Spinner getS_operatingConditionsSafetyEquipment_sdc_spinner() {
        return s_operatingConditionsSafetyEquipment_sdc_spinner;
    }

    public void setS_operatingConditionsSafetyEquipment_sdc_spinner(Spinner s_operatingConditionsSafetyEquipment_sdc_spinner) {
        this.s_operatingConditionsSafetyEquipment_sdc_spinner = s_operatingConditionsSafetyEquipment_sdc_spinner;
    }

    public Spinner getS_operatingConditionsSafetyEquipment_sac_spinner() {
        return s_operatingConditionsSafetyEquipment_sac_spinner;
    }

    public void setS_operatingConditionsSafetyEquipment_sac_spinner(Spinner s_operatingConditionsSafetyEquipment_sac_spinner) {
        this.s_operatingConditionsSafetyEquipment_sac_spinner = s_operatingConditionsSafetyEquipment_sac_spinner;
    }

    public Spinner getS_operatingConditionsSafetyEquipment_sci_spinner() {
        return s_operatingConditionsSafetyEquipment_sci_spinner;
    }

    public void setS_operatingConditionsSafetyEquipment_sci_spinner(Spinner s_operatingConditionsSafetyEquipment_sci_spinner) {
        this.s_operatingConditionsSafetyEquipment_sci_spinner = s_operatingConditionsSafetyEquipment_sci_spinner;
    }

    public EditText getS_operatingConditionsSafetyEquipment_evidence() {
        return s_operatingConditionsSafetyEquipment_evidence;
    }

    public void setS_operatingConditionsSafetyEquipment_evidence(EditText s_operatingConditionsSafetyEquipment_evidence) {
        this.s_operatingConditionsSafetyEquipment_evidence = s_operatingConditionsSafetyEquipment_evidence;
    }

    public EditText getS_locationExtinguishersHoses_sc_value() {
        return s_locationExtinguishersHoses_sc_value;
    }

    public void setS_locationExtinguishersHoses_sc_value(EditText s_locationExtinguishersHoses_sc_value) {
        this.s_locationExtinguishersHoses_sc_value = s_locationExtinguishersHoses_sc_value;
    }

    public EditText getS_locationExtinguishersHoses_tyc_value() {
        return s_locationExtinguishersHoses_tyc_value;
    }

    public void setS_locationExtinguishersHoses_tyc_value(EditText s_locationExtinguishersHoses_tyc_value) {
        this.s_locationExtinguishersHoses_tyc_value = s_locationExtinguishersHoses_tyc_value;
    }

    public EditText getS_locationExtinguishersHoses_sdc_value() {
        return s_locationExtinguishersHoses_sdc_value;
    }

    public void setS_locationExtinguishersHoses_sdc_value(EditText s_locationExtinguishersHoses_sdc_value) {
        this.s_locationExtinguishersHoses_sdc_value = s_locationExtinguishersHoses_sdc_value;
    }

    public EditText getS_locationExtinguishersHoses_sac_value() {
        return s_locationExtinguishersHoses_sac_value;
    }

    public void setS_locationExtinguishersHoses_sac_value(EditText s_locationExtinguishersHoses_sac_value) {
        this.s_locationExtinguishersHoses_sac_value = s_locationExtinguishersHoses_sac_value;
    }

    public EditText getS_locationExtinguishersHoses_sci_value() {
        return s_locationExtinguishersHoses_sci_value;
    }

    public void setS_locationExtinguishersHoses_sci_value(EditText s_locationExtinguishersHoses_sci_value) {
        this.s_locationExtinguishersHoses_sci_value = s_locationExtinguishersHoses_sci_value;
    }

    public Spinner getS_locationExtinguishersHoses_sc_spinner() {
        return s_locationExtinguishersHoses_sc_spinner;
    }

    public void setS_locationExtinguishersHoses_sc_spinner(Spinner s_locationExtinguishersHoses_sc_spinner) {
        this.s_locationExtinguishersHoses_sc_spinner = s_locationExtinguishersHoses_sc_spinner;
    }

    public Spinner getS_locationExtinguishersHoses_tyc_spinner() {
        return s_locationExtinguishersHoses_tyc_spinner;
    }

    public void setS_locationExtinguishersHoses_tyc_spinner(Spinner s_locationExtinguishersHoses_tyc_spinner) {
        this.s_locationExtinguishersHoses_tyc_spinner = s_locationExtinguishersHoses_tyc_spinner;
    }

    public Spinner getS_locationExtinguishersHoses_sdc_spinner() {
        return s_locationExtinguishersHoses_sdc_spinner;
    }

    public void setS_locationExtinguishersHoses_sdc_spinner(Spinner s_locationExtinguishersHoses_sdc_spinner) {
        this.s_locationExtinguishersHoses_sdc_spinner = s_locationExtinguishersHoses_sdc_spinner;
    }

    public Spinner getS_locationExtinguishersHoses_sac_spinner() {
        return s_locationExtinguishersHoses_sac_spinner;
    }

    public void setS_locationExtinguishersHoses_sac_spinner(Spinner s_locationExtinguishersHoses_sac_spinner) {
        this.s_locationExtinguishersHoses_sac_spinner = s_locationExtinguishersHoses_sac_spinner;
    }

    public Spinner getS_locationExtinguishersHoses_sci_spinner() {
        return s_locationExtinguishersHoses_sci_spinner;
    }

    public void setS_locationExtinguishersHoses_sci_spinner(Spinner s_locationExtinguishersHoses_sci_spinner) {
        this.s_locationExtinguishersHoses_sci_spinner = s_locationExtinguishersHoses_sci_spinner;
    }

    public EditText getS_locationExtinguishersHoses_evidence() {
        return s_locationExtinguishersHoses_evidence;
    }

    public void setS_locationExtinguishersHoses_evidence(EditText s_locationExtinguishersHoses_evidence) {
        this.s_locationExtinguishersHoses_evidence = s_locationExtinguishersHoses_evidence;
    }

    public EditText getS_noticesSafetySigns_sc_value() {
        return s_noticesSafetySigns_sc_value;
    }

    public void setS_noticesSafetySigns_sc_value(EditText s_noticesSafetySigns_sc_value) {
        this.s_noticesSafetySigns_sc_value = s_noticesSafetySigns_sc_value;
    }

    public EditText getS_noticesSafetySigns_tyc_value() {
        return s_noticesSafetySigns_tyc_value;
    }

    public void setS_noticesSafetySigns_tyc_value(EditText s_noticesSafetySigns_tyc_value) {
        this.s_noticesSafetySigns_tyc_value = s_noticesSafetySigns_tyc_value;
    }

    public EditText getS_noticesSafetySigns_sdc_value() {
        return s_noticesSafetySigns_sdc_value;
    }

    public void setS_noticesSafetySigns_sdc_value(EditText s_noticesSafetySigns_sdc_value) {
        this.s_noticesSafetySigns_sdc_value = s_noticesSafetySigns_sdc_value;
    }

    public EditText getS_noticesSafetySigns_sac_value() {
        return s_noticesSafetySigns_sac_value;
    }

    public void setS_noticesSafetySigns_sac_value(EditText s_noticesSafetySigns_sac_value) {
        this.s_noticesSafetySigns_sac_value = s_noticesSafetySigns_sac_value;
    }

    public EditText getS_noticesSafetySigns_sci_value() {
        return s_noticesSafetySigns_sci_value;
    }

    public void setS_noticesSafetySigns_sci_value(EditText s_noticesSafetySigns_sci_value) {
        this.s_noticesSafetySigns_sci_value = s_noticesSafetySigns_sci_value;
    }

    public Spinner getS_noticesSafetySigns_sc_spinner() {
        return s_noticesSafetySigns_sc_spinner;
    }

    public void setS_noticesSafetySigns_sc_spinner(Spinner s_noticesSafetySigns_sc_spinner) {
        this.s_noticesSafetySigns_sc_spinner = s_noticesSafetySigns_sc_spinner;
    }

    public Spinner getS_noticesSafetySigns_tyc_spinner() {
        return s_noticesSafetySigns_tyc_spinner;
    }

    public void setS_noticesSafetySigns_tyc_spinner(Spinner s_noticesSafetySigns_tyc_spinner) {
        this.s_noticesSafetySigns_tyc_spinner = s_noticesSafetySigns_tyc_spinner;
    }

    public Spinner getS_noticesSafetySigns_sdc_spinner() {
        return s_noticesSafetySigns_sdc_spinner;
    }

    public void setS_noticesSafetySigns_sdc_spinner(Spinner s_noticesSafetySigns_sdc_spinner) {
        this.s_noticesSafetySigns_sdc_spinner = s_noticesSafetySigns_sdc_spinner;
    }

    public Spinner getS_noticesSafetySigns_sac_spinner() {
        return s_noticesSafetySigns_sac_spinner;
    }

    public void setS_noticesSafetySigns_sac_spinner(Spinner s_noticesSafetySigns_sac_spinner) {
        this.s_noticesSafetySigns_sac_spinner = s_noticesSafetySigns_sac_spinner;
    }

    public Spinner getS_noticesSafetySigns_sci_spinner() {
        return s_noticesSafetySigns_sci_spinner;
    }

    public void setS_noticesSafetySigns_sci_spinner(Spinner s_noticesSafetySigns_sci_spinner) {
        this.s_noticesSafetySigns_sci_spinner = s_noticesSafetySigns_sci_spinner;
    }

    public EditText getS_noticesSafetySigns_evidence() {
        return s_noticesSafetySigns_evidence;
    }

    public void setS_noticesSafetySigns_evidence(EditText s_noticesSafetySigns_evidence) {
        this.s_noticesSafetySigns_evidence = s_noticesSafetySigns_evidence;
    }

    public EditText getS_materialSafetyDataSheets_sc_value() {
        return s_materialSafetyDataSheets_sc_value;
    }

    public void setS_materialSafetyDataSheets_sc_value(EditText s_materialSafetyDataSheets_sc_value) {
        this.s_materialSafetyDataSheets_sc_value = s_materialSafetyDataSheets_sc_value;
    }

    public EditText getS_materialSafetyDataSheets_tyc_value() {
        return s_materialSafetyDataSheets_tyc_value;
    }

    public void setS_materialSafetyDataSheets_tyc_value(EditText s_materialSafetyDataSheets_tyc_value) {
        this.s_materialSafetyDataSheets_tyc_value = s_materialSafetyDataSheets_tyc_value;
    }

    public EditText getS_materialSafetyDataSheets_sdc_value() {
        return s_materialSafetyDataSheets_sdc_value;
    }

    public void setS_materialSafetyDataSheets_sdc_value(EditText s_materialSafetyDataSheets_sdc_value) {
        this.s_materialSafetyDataSheets_sdc_value = s_materialSafetyDataSheets_sdc_value;
    }

    public EditText getS_materialSafetyDataSheets_sac_value() {
        return s_materialSafetyDataSheets_sac_value;
    }

    public void setS_materialSafetyDataSheets_sac_value(EditText s_materialSafetyDataSheets_sac_value) {
        this.s_materialSafetyDataSheets_sac_value = s_materialSafetyDataSheets_sac_value;
    }

    public EditText getS_materialSafetyDataSheets_sci_value() {
        return s_materialSafetyDataSheets_sci_value;
    }

    public void setS_materialSafetyDataSheets_sci_value(EditText s_materialSafetyDataSheets_sci_value) {
        this.s_materialSafetyDataSheets_sci_value = s_materialSafetyDataSheets_sci_value;
    }

    public Spinner getS_materialSafetyDataSheets_sc_spinner() {
        return s_materialSafetyDataSheets_sc_spinner;
    }

    public void setS_materialSafetyDataSheets_sc_spinner(Spinner s_materialSafetyDataSheets_sc_spinner) {
        this.s_materialSafetyDataSheets_sc_spinner = s_materialSafetyDataSheets_sc_spinner;
    }

    public Spinner getS_materialSafetyDataSheets_tyc_spinner() {
        return s_materialSafetyDataSheets_tyc_spinner;
    }

    public void setS_materialSafetyDataSheets_tyc_spinner(Spinner s_materialSafetyDataSheets_tyc_spinner) {
        this.s_materialSafetyDataSheets_tyc_spinner = s_materialSafetyDataSheets_tyc_spinner;
    }

    public Spinner getS_materialSafetyDataSheets_sdc_spinner() {
        return s_materialSafetyDataSheets_sdc_spinner;
    }

    public void setS_materialSafetyDataSheets_sdc_spinner(Spinner s_materialSafetyDataSheets_sdc_spinner) {
        this.s_materialSafetyDataSheets_sdc_spinner = s_materialSafetyDataSheets_sdc_spinner;
    }

    public Spinner getS_materialSafetyDataSheets_sac_spinner() {
        return s_materialSafetyDataSheets_sac_spinner;
    }

    public void setS_materialSafetyDataSheets_sac_spinner(Spinner s_materialSafetyDataSheets_sac_spinner) {
        this.s_materialSafetyDataSheets_sac_spinner = s_materialSafetyDataSheets_sac_spinner;
    }

    public Spinner getS_materialSafetyDataSheets_sci_spinner() {
        return s_materialSafetyDataSheets_sci_spinner;
    }

    public void setS_materialSafetyDataSheets_sci_spinner(Spinner s_materialSafetyDataSheets_sci_spinner) {
        this.s_materialSafetyDataSheets_sci_spinner = s_materialSafetyDataSheets_sci_spinner;
    }

    public EditText getS_materialSafetyDataSheets_evidence() {
        return s_materialSafetyDataSheets_evidence;
    }

    public void setS_materialSafetyDataSheets_evidence(EditText s_materialSafetyDataSheets_evidence) {
        this.s_materialSafetyDataSheets_evidence = s_materialSafetyDataSheets_evidence;
    }

    public EditText getS_evacuationMap_sc_value() {
        return s_evacuationMap_sc_value;
    }

    public void setS_evacuationMap_sc_value(EditText s_evacuationMap_sc_value) {
        this.s_evacuationMap_sc_value = s_evacuationMap_sc_value;
    }

    public EditText getS_evacuationMap_tyc_value() {
        return s_evacuationMap_tyc_value;
    }

    public void setS_evacuationMap_tyc_value(EditText s_evacuationMap_tyc_value) {
        this.s_evacuationMap_tyc_value = s_evacuationMap_tyc_value;
    }

    public EditText getS_evacuationMap_sdc_value() {
        return s_evacuationMap_sdc_value;
    }

    public void setS_evacuationMap_sdc_value(EditText s_evacuationMap_sdc_value) {
        this.s_evacuationMap_sdc_value = s_evacuationMap_sdc_value;
    }

    public EditText getS_evacuationMap_sac_value() {
        return s_evacuationMap_sac_value;
    }

    public void setS_evacuationMap_sac_value(EditText s_evacuationMap_sac_value) {
        this.s_evacuationMap_sac_value = s_evacuationMap_sac_value;
    }

    public EditText getS_evacuationMap_sci_value() {
        return s_evacuationMap_sci_value;
    }

    public void setS_evacuationMap_sci_value(EditText s_evacuationMap_sci_value) {
        this.s_evacuationMap_sci_value = s_evacuationMap_sci_value;
    }

    public Spinner getS_evacuationMap_sc_spinner() {
        return s_evacuationMap_sc_spinner;
    }

    public void setS_evacuationMap_sc_spinner(Spinner s_evacuationMap_sc_spinner) {
        this.s_evacuationMap_sc_spinner = s_evacuationMap_sc_spinner;
    }

    public Spinner getS_evacuationMap_tyc_spinner() {
        return s_evacuationMap_tyc_spinner;
    }

    public void setS_evacuationMap_tyc_spinner(Spinner s_evacuationMap_tyc_spinner) {
        this.s_evacuationMap_tyc_spinner = s_evacuationMap_tyc_spinner;
    }

    public Spinner getS_evacuationMap_sdc_spinner() {
        return s_evacuationMap_sdc_spinner;
    }

    public void setS_evacuationMap_sdc_spinner(Spinner s_evacuationMap_sdc_spinner) {
        this.s_evacuationMap_sdc_spinner = s_evacuationMap_sdc_spinner;
    }

    public Spinner getS_evacuationMap_sac_spinner() {
        return s_evacuationMap_sac_spinner;
    }

    public void setS_evacuationMap_sac_spinner(Spinner s_evacuationMap_sac_spinner) {
        this.s_evacuationMap_sac_spinner = s_evacuationMap_sac_spinner;
    }

    public Spinner getS_evacuationMap_sci_spinner() {
        return s_evacuationMap_sci_spinner;
    }

    public void setS_evacuationMap_sci_spinner(Spinner s_evacuationMap_sci_spinner) {
        this.s_evacuationMap_sci_spinner = s_evacuationMap_sci_spinner;
    }

    public EditText getS_evacuationMap_evidence() {
        return s_evacuationMap_evidence;
    }

    public void setS_evacuationMap_evidence(EditText s_evacuationMap_evidence) {
        this.s_evacuationMap_evidence = s_evacuationMap_evidence;
    }

    public EditText getS_alarmStation_sc_value() {
        return s_alarmStation_sc_value;
    }

    public void setS_alarmStation_sc_value(EditText s_alarmStation_sc_value) {
        this.s_alarmStation_sc_value = s_alarmStation_sc_value;
    }

    public EditText getS_alarmStation_tyc_value() {
        return s_alarmStation_tyc_value;
    }

    public void setS_alarmStation_tyc_value(EditText s_alarmStation_tyc_value) {
        this.s_alarmStation_tyc_value = s_alarmStation_tyc_value;
    }

    public EditText getS_alarmStation_sdc_value() {
        return s_alarmStation_sdc_value;
    }

    public void setS_alarmStation_sdc_value(EditText s_alarmStation_sdc_value) {
        this.s_alarmStation_sdc_value = s_alarmStation_sdc_value;
    }

    public EditText getS_alarmStation_sac_value() {
        return s_alarmStation_sac_value;
    }

    public void setS_alarmStation_sac_value(EditText s_alarmStation_sac_value) {
        this.s_alarmStation_sac_value = s_alarmStation_sac_value;
    }

    public EditText getS_alarmStation_sci_value() {
        return s_alarmStation_sci_value;
    }

    public void setS_alarmStation_sci_value(EditText s_alarmStation_sci_value) {
        this.s_alarmStation_sci_value = s_alarmStation_sci_value;
    }

    public Spinner getS_alarmStation_sc_spinner() {
        return s_alarmStation_sc_spinner;
    }

    public void setS_alarmStation_sc_spinner(Spinner s_alarmStation_sc_spinner) {
        this.s_alarmStation_sc_spinner = s_alarmStation_sc_spinner;
    }

    public Spinner getS_alarmStation_tyc_spinner() {
        return s_alarmStation_tyc_spinner;
    }

    public void setS_alarmStation_tyc_spinner(Spinner s_alarmStation_tyc_spinner) {
        this.s_alarmStation_tyc_spinner = s_alarmStation_tyc_spinner;
    }

    public Spinner getS_alarmStation_sdc_spinner() {
        return s_alarmStation_sdc_spinner;
    }

    public void setS_alarmStation_sdc_spinner(Spinner s_alarmStation_sdc_spinner) {
        this.s_alarmStation_sdc_spinner = s_alarmStation_sdc_spinner;
    }

    public Spinner getS_alarmStation_sac_spinner() {
        return s_alarmStation_sac_spinner;
    }

    public void setS_alarmStation_sac_spinner(Spinner s_alarmStation_sac_spinner) {
        this.s_alarmStation_sac_spinner = s_alarmStation_sac_spinner;
    }

    public Spinner getS_alarmStation_sci_spinner() {
        return s_alarmStation_sci_spinner;
    }

    public void setS_alarmStation_sci_spinner(Spinner s_alarmStation_sci_spinner) {
        this.s_alarmStation_sci_spinner = s_alarmStation_sci_spinner;
    }

    public EditText getS_alarmStation_evidence() {
        return s_alarmStation_evidence;
    }

    public void setS_alarmStation_evidence(EditText s_alarmStation_evidence) {
        this.s_alarmStation_evidence = s_alarmStation_evidence;
    }

    public EditText getS_corridorConditionsAccessEscapeRoutes_sc_value() {
        return s_corridorConditionsAccessEscapeRoutes_sc_value;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sc_value(EditText s_corridorConditionsAccessEscapeRoutes_sc_value) {
        this.s_corridorConditionsAccessEscapeRoutes_sc_value = s_corridorConditionsAccessEscapeRoutes_sc_value;
    }

    public EditText getS_corridorConditionsAccessEscapeRoutes_tyc_value() {
        return s_corridorConditionsAccessEscapeRoutes_tyc_value;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_tyc_value(EditText s_corridorConditionsAccessEscapeRoutes_tyc_value) {
        this.s_corridorConditionsAccessEscapeRoutes_tyc_value = s_corridorConditionsAccessEscapeRoutes_tyc_value;
    }

    public EditText getS_corridorConditionsAccessEscapeRoutes_sdc_value() {
        return s_corridorConditionsAccessEscapeRoutes_sdc_value;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sdc_value(EditText s_corridorConditionsAccessEscapeRoutes_sdc_value) {
        this.s_corridorConditionsAccessEscapeRoutes_sdc_value = s_corridorConditionsAccessEscapeRoutes_sdc_value;
    }

    public EditText getS_corridorConditionsAccessEscapeRoutes_sac_value() {
        return s_corridorConditionsAccessEscapeRoutes_sac_value;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sac_value(EditText s_corridorConditionsAccessEscapeRoutes_sac_value) {
        this.s_corridorConditionsAccessEscapeRoutes_sac_value = s_corridorConditionsAccessEscapeRoutes_sac_value;
    }

    public EditText getS_corridorConditionsAccessEscapeRoutes_sci_value() {
        return s_corridorConditionsAccessEscapeRoutes_sci_value;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sci_value(EditText s_corridorConditionsAccessEscapeRoutes_sci_value) {
        this.s_corridorConditionsAccessEscapeRoutes_sci_value = s_corridorConditionsAccessEscapeRoutes_sci_value;
    }

    public Spinner getS_corridorConditionsAccessEscapeRoutes_sc_spinner() {
        return s_corridorConditionsAccessEscapeRoutes_sc_spinner;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sc_spinner(Spinner s_corridorConditionsAccessEscapeRoutes_sc_spinner) {
        this.s_corridorConditionsAccessEscapeRoutes_sc_spinner = s_corridorConditionsAccessEscapeRoutes_sc_spinner;
    }

    public Spinner getS_corridorConditionsAccessEscapeRoutes_tyc_spinner() {
        return s_corridorConditionsAccessEscapeRoutes_tyc_spinner;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_tyc_spinner(Spinner s_corridorConditionsAccessEscapeRoutes_tyc_spinner) {
        this.s_corridorConditionsAccessEscapeRoutes_tyc_spinner = s_corridorConditionsAccessEscapeRoutes_tyc_spinner;
    }

    public Spinner getS_corridorConditionsAccessEscapeRoutes_sdc_spinner() {
        return s_corridorConditionsAccessEscapeRoutes_sdc_spinner;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sdc_spinner(Spinner s_corridorConditionsAccessEscapeRoutes_sdc_spinner) {
        this.s_corridorConditionsAccessEscapeRoutes_sdc_spinner = s_corridorConditionsAccessEscapeRoutes_sdc_spinner;
    }

    public Spinner getS_corridorConditionsAccessEscapeRoutes_sac_spinner() {
        return s_corridorConditionsAccessEscapeRoutes_sac_spinner;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sac_spinner(Spinner s_corridorConditionsAccessEscapeRoutes_sac_spinner) {
        this.s_corridorConditionsAccessEscapeRoutes_sac_spinner = s_corridorConditionsAccessEscapeRoutes_sac_spinner;
    }

    public Spinner getS_corridorConditionsAccessEscapeRoutes_sci_spinner() {
        return s_corridorConditionsAccessEscapeRoutes_sci_spinner;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_sci_spinner(Spinner s_corridorConditionsAccessEscapeRoutes_sci_spinner) {
        this.s_corridorConditionsAccessEscapeRoutes_sci_spinner = s_corridorConditionsAccessEscapeRoutes_sci_spinner;
    }

    public EditText getS_corridorConditionsAccessEscapeRoutes_evidence() {
        return s_corridorConditionsAccessEscapeRoutes_evidence;
    }

    public void setS_corridorConditionsAccessEscapeRoutes_evidence(EditText s_corridorConditionsAccessEscapeRoutes_evidence) {
        this.s_corridorConditionsAccessEscapeRoutes_evidence = s_corridorConditionsAccessEscapeRoutes_evidence;
    }

    public EditText getS_installationsContainersHazardousSubstancesMaterialsWaste_sc_value() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sc_value;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sc_value(EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sc_value) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sc_value = s_installationsContainersHazardousSubstancesMaterialsWaste_sc_value;
    }

    public EditText getS_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value(EditText s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value = s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value;
    }

    public EditText getS_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value(EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value = s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value;
    }

    public EditText getS_installationsContainersHazardousSubstancesMaterialsWaste_sac_value() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sac_value;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sac_value(EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sac_value) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sac_value = s_installationsContainersHazardousSubstancesMaterialsWaste_sac_value;
    }

    public EditText getS_installationsContainersHazardousSubstancesMaterialsWaste_sci_value() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sci_value;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sci_value(EditText s_installationsContainersHazardousSubstancesMaterialsWaste_sci_value) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sci_value = s_installationsContainersHazardousSubstancesMaterialsWaste_sci_value;
    }

    public Spinner getS_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner(Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner = s_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner;
    }

    public Spinner getS_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner(Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner = s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner;
    }

    public Spinner getS_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner(Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner = s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner;
    }

    public Spinner getS_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner(Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner = s_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner;
    }

    public Spinner getS_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner(Spinner s_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner = s_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner;
    }

    public EditText getS_installationsContainersHazardousSubstancesMaterialsWaste_evidence() {
        return s_installationsContainersHazardousSubstancesMaterialsWaste_evidence;
    }

    public void setS_installationsContainersHazardousSubstancesMaterialsWaste_evidence(EditText s_installationsContainersHazardousSubstancesMaterialsWaste_evidence) {
        this.s_installationsContainersHazardousSubstancesMaterialsWaste_evidence = s_installationsContainersHazardousSubstancesMaterialsWaste_evidence;
    }

    public EditText getS_managementHazardousWastesSubstancesMaterials_sc_value() {
        return s_managementHazardousWastesSubstancesMaterials_sc_value;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sc_value(EditText s_managementHazardousWastesSubstancesMaterials_sc_value) {
        this.s_managementHazardousWastesSubstancesMaterials_sc_value = s_managementHazardousWastesSubstancesMaterials_sc_value;
    }

    public EditText getS_managementHazardousWastesSubstancesMaterials_tyc_value() {
        return s_managementHazardousWastesSubstancesMaterials_tyc_value;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_tyc_value(EditText s_managementHazardousWastesSubstancesMaterials_tyc_value) {
        this.s_managementHazardousWastesSubstancesMaterials_tyc_value = s_managementHazardousWastesSubstancesMaterials_tyc_value;
    }

    public EditText getS_managementHazardousWastesSubstancesMaterials_sdc_value() {
        return s_managementHazardousWastesSubstancesMaterials_sdc_value;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sdc_value(EditText s_managementHazardousWastesSubstancesMaterials_sdc_value) {
        this.s_managementHazardousWastesSubstancesMaterials_sdc_value = s_managementHazardousWastesSubstancesMaterials_sdc_value;
    }

    public EditText getS_managementHazardousWastesSubstancesMaterials_sac_value() {
        return s_managementHazardousWastesSubstancesMaterials_sac_value;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sac_value(EditText s_managementHazardousWastesSubstancesMaterials_sac_value) {
        this.s_managementHazardousWastesSubstancesMaterials_sac_value = s_managementHazardousWastesSubstancesMaterials_sac_value;
    }

    public EditText getS_managementHazardousWastesSubstancesMaterials_sci_value() {
        return s_managementHazardousWastesSubstancesMaterials_sci_value;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sci_value(EditText s_managementHazardousWastesSubstancesMaterials_sci_value) {
        this.s_managementHazardousWastesSubstancesMaterials_sci_value = s_managementHazardousWastesSubstancesMaterials_sci_value;
    }

    public Spinner getS_managementHazardousWastesSubstancesMaterials_sc_spinner() {
        return s_managementHazardousWastesSubstancesMaterials_sc_spinner;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sc_spinner(Spinner s_managementHazardousWastesSubstancesMaterials_sc_spinner) {
        this.s_managementHazardousWastesSubstancesMaterials_sc_spinner = s_managementHazardousWastesSubstancesMaterials_sc_spinner;
    }

    public Spinner getS_managementHazardousWastesSubstancesMaterials_tyc_spinner() {
        return s_managementHazardousWastesSubstancesMaterials_tyc_spinner;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_tyc_spinner(Spinner s_managementHazardousWastesSubstancesMaterials_tyc_spinner) {
        this.s_managementHazardousWastesSubstancesMaterials_tyc_spinner = s_managementHazardousWastesSubstancesMaterials_tyc_spinner;
    }

    public Spinner getS_managementHazardousWastesSubstancesMaterials_sdc_spinner() {
        return s_managementHazardousWastesSubstancesMaterials_sdc_spinner;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sdc_spinner(Spinner s_managementHazardousWastesSubstancesMaterials_sdc_spinner) {
        this.s_managementHazardousWastesSubstancesMaterials_sdc_spinner = s_managementHazardousWastesSubstancesMaterials_sdc_spinner;
    }

    public Spinner getS_managementHazardousWastesSubstancesMaterials_sac_spinner() {
        return s_managementHazardousWastesSubstancesMaterials_sac_spinner;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sac_spinner(Spinner s_managementHazardousWastesSubstancesMaterials_sac_spinner) {
        this.s_managementHazardousWastesSubstancesMaterials_sac_spinner = s_managementHazardousWastesSubstancesMaterials_sac_spinner;
    }

    public Spinner getS_managementHazardousWastesSubstancesMaterials_sci_spinner() {
        return s_managementHazardousWastesSubstancesMaterials_sci_spinner;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_sci_spinner(Spinner s_managementHazardousWastesSubstancesMaterials_sci_spinner) {
        this.s_managementHazardousWastesSubstancesMaterials_sci_spinner = s_managementHazardousWastesSubstancesMaterials_sci_spinner;
    }

    public EditText getS_managementHazardousWastesSubstancesMaterials_evidence() {
        return s_managementHazardousWastesSubstancesMaterials_evidence;
    }

    public void setS_managementHazardousWastesSubstancesMaterials_evidence(EditText s_managementHazardousWastesSubstancesMaterials_evidence) {
        this.s_managementHazardousWastesSubstancesMaterials_evidence = s_managementHazardousWastesSubstancesMaterials_evidence;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();

        View rootView = inflater.inflate(R.layout.security_fragment, container, false);

        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild, "security");

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
        listDataHeader.add("MAPA DE EVACUACIÓN");
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

        LayoutInflater infalInflater = mainActivity.getLayoutInflater();


        //Maintaining security views
        setS_usePersonalProtectiveEquipmentView(infalInflater.inflate(R.layout.list_item, null));
        setS_complianceBasicSafetyStandardsView(infalInflater.inflate(R.layout.list_item, null));
        setS_conditionsElectricalInstallationsView(infalInflater.inflate(R.layout.list_item, null));
        setS_operatingConditionsSafetyEquipmentView(infalInflater.inflate(R.layout.list_item, null));
        setS_locationExtinguishersHosesView(infalInflater.inflate(R.layout.list_item, null));
        setS_noticesSafetySignsView(infalInflater.inflate(R.layout.list_item, null));
        setS_materialSafetyDataSheetsView(infalInflater.inflate(R.layout.list_item, null));
        setS_evacuationMapView(infalInflater.inflate(R.layout.list_item, null));
        setS_alarmStationView(infalInflater.inflate(R.layout.list_item, null));
        setS_corridorConditionsAccessEscapeRoutesView(infalInflater.inflate(R.layout.list_item, null));
        setS_installationsContainersHazardousSubstancesMaterialsWasteView(infalInflater.inflate(R.layout.list_item, null));
        setS_managementHazardousWastesSubstancesMaterialsView(infalInflater.inflate(R.layout.list_item, null));

        //Operating Conditions Safety Equipment Value field
        s_usePersonalProtectiveEquipment_sc_value = (EditText) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sc_value);
        s_usePersonalProtectiveEquipment_tyc_value = (EditText) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.tyc_value);
        s_usePersonalProtectiveEquipment_sdc_value = (EditText) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sdc_value);
        s_usePersonalProtectiveEquipment_sac_value = (EditText) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sac_value);
        s_usePersonalProtectiveEquipment_sci_value = (EditText) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sci_value);
        //Operating Conditions Safety Equipment Value
        s_usePersonalProtectiveEquipment_sc_spinner = (Spinner) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sc_spinner);
        s_usePersonalProtectiveEquipment_tyc_spinner = (Spinner) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.tyc_spinner);
        s_usePersonalProtectiveEquipment_sdc_spinner = (Spinner) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sdc_spinner);
        s_usePersonalProtectiveEquipment_sac_spinner = (Spinner) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sac_spinner);
        s_usePersonalProtectiveEquipment_sci_spinner = (Spinner) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.sci_spinner);
        //Operating Conditions Safety Equipment Evidence
        s_usePersonalProtectiveEquipment_evidence = (EditText) getS_usePersonalProtectiveEquipmentView().findViewById(R.id.findings_evidence);

        //Compliance Basic Safety Standards Value field
        s_complianceBasicSafetyStandards_sc_value = (EditText) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sc_value);
        s_complianceBasicSafetyStandards_tyc_value = (EditText) getS_complianceBasicSafetyStandardsView().findViewById(R.id.tyc_value);
        s_complianceBasicSafetyStandards_sdc_value = (EditText) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sdc_value);
        s_complianceBasicSafetyStandards_sac_value = (EditText) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sac_value);
        s_complianceBasicSafetyStandards_sci_value = (EditText) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sci_value);
        //Compliance Basic Safety Standards Value
        s_complianceBasicSafetyStandards_sc_spinner = (Spinner) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sc_spinner);
        s_complianceBasicSafetyStandards_tyc_spinner = (Spinner) getS_complianceBasicSafetyStandardsView().findViewById(R.id.tyc_spinner);
        s_complianceBasicSafetyStandards_sdc_spinner = (Spinner) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sdc_spinner);
        s_complianceBasicSafetyStandards_sac_spinner = (Spinner) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sac_spinner);
        s_complianceBasicSafetyStandards_sci_spinner = (Spinner) getS_complianceBasicSafetyStandardsView().findViewById(R.id.sci_spinner);
        //Compliance Basic Safety Standards Evidence
        s_complianceBasicSafetyStandards_evidence = (EditText) getS_complianceBasicSafetyStandardsView().findViewById(R.id.findings_evidence);

        //Conditions Electrical Installations Value field
        s_conditionsElectricalInstallations_sc_value = (EditText) getS_conditionsElectricalInstallationsView().findViewById(R.id.sc_value);
        s_conditionsElectricalInstallations_tyc_value = (EditText) getS_conditionsElectricalInstallationsView().findViewById(R.id.tyc_value);
        s_conditionsElectricalInstallations_sdc_value = (EditText) getS_conditionsElectricalInstallationsView().findViewById(R.id.sdc_value);
        s_conditionsElectricalInstallations_sac_value = (EditText) getS_conditionsElectricalInstallationsView().findViewById(R.id.sac_value);
        s_conditionsElectricalInstallations_sci_value = (EditText) getS_conditionsElectricalInstallationsView().findViewById(R.id.sci_value);
        //Conditions Electrical Installations Value
        s_conditionsElectricalInstallations_sc_spinner = (Spinner) getS_conditionsElectricalInstallationsView().findViewById(R.id.sc_spinner);
        s_conditionsElectricalInstallations_tyc_spinner = (Spinner) getS_conditionsElectricalInstallationsView().findViewById(R.id.tyc_spinner);
        s_conditionsElectricalInstallations_sdc_spinner = (Spinner) getS_conditionsElectricalInstallationsView().findViewById(R.id.sdc_spinner);
        s_conditionsElectricalInstallations_sac_spinner = (Spinner) getS_conditionsElectricalInstallationsView().findViewById(R.id.sac_spinner);
        s_conditionsElectricalInstallations_sci_spinner = (Spinner) getS_conditionsElectricalInstallationsView().findViewById(R.id.sci_spinner);
        //Conditions Electrical Installations Evidence
        s_conditionsElectricalInstallations_evidence = (EditText) getS_conditionsElectricalInstallationsView().findViewById(R.id.findings_evidence);

        //Operating Conditions Safety Equipment Value field
        s_operatingConditionsSafetyEquipment_sc_value = (EditText) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sc_value);
        s_operatingConditionsSafetyEquipment_tyc_value = (EditText) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.tyc_value);
        s_operatingConditionsSafetyEquipment_sdc_value = (EditText) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sdc_value);
        s_operatingConditionsSafetyEquipment_sac_value = (EditText) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sac_value);
        s_operatingConditionsSafetyEquipment_sci_value = (EditText) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sci_value);
        //Operating Conditions Safety Equipment Value
        s_operatingConditionsSafetyEquipment_sc_spinner = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sc_spinner);
        s_operatingConditionsSafetyEquipment_tyc_spinner = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.tyc_spinner);
        s_operatingConditionsSafetyEquipment_sdc_spinner = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sdc_spinner);
        s_operatingConditionsSafetyEquipment_sac_spinner = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sac_spinner);
        s_operatingConditionsSafetyEquipment_sci_spinner = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sci_spinner);
        //Operating Conditions Safety Equipment Evidence
        s_operatingConditionsSafetyEquipment_evidence = (EditText) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.findings_evidence);

        //Location Extinguishers Hoses Value field
        s_locationExtinguishersHoses_sc_value = (EditText) getS_locationExtinguishersHosesView().findViewById(R.id.sc_value);
        s_locationExtinguishersHoses_tyc_value = (EditText) getS_locationExtinguishersHosesView().findViewById(R.id.tyc_value);
        s_locationExtinguishersHoses_sdc_value = (EditText) getS_locationExtinguishersHosesView().findViewById(R.id.sdc_value);
        s_locationExtinguishersHoses_sac_value = (EditText) getS_locationExtinguishersHosesView().findViewById(R.id.sac_value);
        s_locationExtinguishersHoses_sci_value = (EditText) getS_locationExtinguishersHosesView().findViewById(R.id.sci_value);
        //Location Extinguishers Hoses Value
        s_locationExtinguishersHoses_sc_spinner = (Spinner) getS_locationExtinguishersHosesView().findViewById(R.id.sc_spinner);
        s_locationExtinguishersHoses_tyc_spinner = (Spinner) getS_locationExtinguishersHosesView().findViewById(R.id.tyc_spinner);
        s_locationExtinguishersHoses_sdc_spinner = (Spinner) getS_locationExtinguishersHosesView().findViewById(R.id.sdc_spinner);
        s_locationExtinguishersHoses_sac_spinner = (Spinner) getS_locationExtinguishersHosesView().findViewById(R.id.sac_spinner);
        s_locationExtinguishersHoses_sci_spinner = (Spinner) getS_locationExtinguishersHosesView().findViewById(R.id.sci_spinner);
        //Location Extinguishers Hoses Evidence
        s_locationExtinguishersHoses_evidence = (EditText) getS_locationExtinguishersHosesView().findViewById(R.id.findings_evidence);

        //Notices Safety Signs Value field
        s_noticesSafetySigns_sc_value = (EditText) getS_noticesSafetySignsView().findViewById(R.id.sc_value);
        s_noticesSafetySigns_tyc_value = (EditText) getS_noticesSafetySignsView().findViewById(R.id.tyc_value);
        s_noticesSafetySigns_sdc_value = (EditText) getS_noticesSafetySignsView().findViewById(R.id.sdc_value);
        s_noticesSafetySigns_sac_value = (EditText) getS_noticesSafetySignsView().findViewById(R.id.sac_value);
        s_noticesSafetySigns_sci_value = (EditText) getS_noticesSafetySignsView().findViewById(R.id.sci_value);
        //Notices Safety Signs Value
        s_noticesSafetySigns_sc_spinner = (Spinner) getS_noticesSafetySignsView().findViewById(R.id.sc_spinner);
        s_noticesSafetySigns_tyc_spinner = (Spinner) getS_noticesSafetySignsView().findViewById(R.id.tyc_spinner);
        s_noticesSafetySigns_sdc_spinner = (Spinner) getS_noticesSafetySignsView().findViewById(R.id.sdc_spinner);
        s_noticesSafetySigns_sac_spinner = (Spinner) getS_noticesSafetySignsView().findViewById(R.id.sac_spinner);
        s_noticesSafetySigns_sci_spinner = (Spinner) getS_noticesSafetySignsView().findViewById(R.id.sci_spinner);
        //Notices Safety Signs Evidence
        s_noticesSafetySigns_evidence = (EditText) getS_noticesSafetySignsView().findViewById(R.id.findings_evidence);

        //Material Safety DataSheets Value field
        s_materialSafetyDataSheets_sc_value = (EditText) getS_materialSafetyDataSheetsView().findViewById(R.id.sc_value);
        s_materialSafetyDataSheets_tyc_value = (EditText) getS_materialSafetyDataSheetsView().findViewById(R.id.tyc_value);
        s_materialSafetyDataSheets_sdc_value = (EditText) getS_materialSafetyDataSheetsView().findViewById(R.id.sdc_value);
        s_materialSafetyDataSheets_sac_value = (EditText) getS_materialSafetyDataSheetsView().findViewById(R.id.sac_value);
        s_materialSafetyDataSheets_sci_value = (EditText) getS_materialSafetyDataSheetsView().findViewById(R.id.sci_value);
        //Material Safety DataSheets Value
        s_materialSafetyDataSheets_sc_spinner = (Spinner) getS_materialSafetyDataSheetsView().findViewById(R.id.sc_spinner);
        s_materialSafetyDataSheets_tyc_spinner = (Spinner) getS_materialSafetyDataSheetsView().findViewById(R.id.tyc_spinner);
        s_materialSafetyDataSheets_sdc_spinner = (Spinner) getS_materialSafetyDataSheetsView().findViewById(R.id.sdc_spinner);
        s_materialSafetyDataSheets_sac_spinner = (Spinner) getS_materialSafetyDataSheetsView().findViewById(R.id.sac_spinner);
        s_materialSafetyDataSheets_sci_spinner = (Spinner) getS_materialSafetyDataSheetsView().findViewById(R.id.sci_spinner);
        //Material Safety DataSheets Evidence
        s_materialSafetyDataSheets_evidence = (EditText) getS_materialSafetyDataSheetsView().findViewById(R.id.findings_evidence);

        //Evacuation Map Value field
        s_evacuationMap_sc_value = (EditText) getS_evacuationMapView().findViewById(R.id.sc_value);
        s_evacuationMap_tyc_value = (EditText) getS_evacuationMapView().findViewById(R.id.tyc_value);
        s_evacuationMap_sdc_value = (EditText) getS_evacuationMapView().findViewById(R.id.sdc_value);
        s_evacuationMap_sac_value = (EditText) getS_evacuationMapView().findViewById(R.id.sac_value);
        s_evacuationMap_sci_value = (EditText) getS_evacuationMapView().findViewById(R.id.sci_value);
        //Evacuation Map Value
        s_evacuationMap_sc_spinner = (Spinner) getS_evacuationMapView().findViewById(R.id.sc_spinner);
        s_evacuationMap_tyc_spinner = (Spinner) getS_evacuationMapView().findViewById(R.id.tyc_spinner);
        s_evacuationMap_sdc_spinner = (Spinner) getS_evacuationMapView().findViewById(R.id.sdc_spinner);
        s_evacuationMap_sac_spinner = (Spinner) getS_evacuationMapView().findViewById(R.id.sac_spinner);
        s_evacuationMap_sci_spinner = (Spinner) getS_evacuationMapView().findViewById(R.id.sci_spinner);
        //Evacuation Map Evidence
        s_evacuationMap_evidence = (EditText) getS_evacuationMapView().findViewById(R.id.findings_evidence);

        //Alarm Station Value field
        s_alarmStation_sc_value = (EditText) getS_alarmStationView().findViewById(R.id.sc_value);
        s_alarmStation_tyc_value = (EditText) getS_alarmStationView().findViewById(R.id.tyc_value);
        s_alarmStation_sdc_value = (EditText) getS_alarmStationView().findViewById(R.id.sdc_value);
        s_alarmStation_sac_value = (EditText) getS_alarmStationView().findViewById(R.id.sac_value);
        s_alarmStation_sci_value = (EditText) getS_alarmStationView().findViewById(R.id.sci_value);
        //Alarm Station Value
        s_alarmStation_sc_spinner = (Spinner) getS_alarmStationView().findViewById(R.id.sc_spinner);
        s_alarmStation_tyc_spinner = (Spinner) getS_alarmStationView().findViewById(R.id.tyc_spinner);
        s_alarmStation_sdc_spinner = (Spinner) getS_alarmStationView().findViewById(R.id.sdc_spinner);
        s_alarmStation_sac_spinner = (Spinner) getS_alarmStationView().findViewById(R.id.sac_spinner);
        s_alarmStation_sci_spinner = (Spinner) getS_alarmStationView().findViewById(R.id.sci_spinner);
        //Alarm Station Evidence
        s_alarmStation_evidence = (EditText) getS_alarmStationView().findViewById(R.id.findings_evidence);

        //Corridor Conditions Access Escape Routes Value field
        s_corridorConditionsAccessEscapeRoutes_sc_value = (EditText) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sc_value);
        s_corridorConditionsAccessEscapeRoutes_tyc_value = (EditText) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.tyc_value);
        s_corridorConditionsAccessEscapeRoutes_sdc_value = (EditText) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sdc_value);
        s_corridorConditionsAccessEscapeRoutes_sac_value = (EditText) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sac_value);
        s_corridorConditionsAccessEscapeRoutes_sci_value = (EditText) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sci_value);
        //Corridor Conditions Access Escape Routes Value
        s_corridorConditionsAccessEscapeRoutes_sc_spinner = (Spinner) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sc_spinner);
        s_corridorConditionsAccessEscapeRoutes_tyc_spinner = (Spinner) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.tyc_spinner);
        s_corridorConditionsAccessEscapeRoutes_sdc_spinner = (Spinner) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sdc_spinner);
        s_corridorConditionsAccessEscapeRoutes_sac_spinner = (Spinner) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sac_spinner);
        s_corridorConditionsAccessEscapeRoutes_sci_spinner = (Spinner) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.sci_spinner);
        //Corridor Conditions Access Escape Routes Evidence
        s_corridorConditionsAccessEscapeRoutes_evidence = (EditText) getS_corridorConditionsAccessEscapeRoutesView().findViewById(R.id.findings_evidence);

        //Installations Containers Hazardous Substances Materials Waste Value field
        s_installationsContainersHazardousSubstancesMaterialsWaste_sc_value = (EditText) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sc_value);
        s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_value = (EditText) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.tyc_value);
        s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_value = (EditText) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sdc_value);
        s_installationsContainersHazardousSubstancesMaterialsWaste_sac_value = (EditText) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sac_value);
        s_installationsContainersHazardousSubstancesMaterialsWaste_sci_value = (EditText) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sci_value);
        //Installations Containers Hazardous Substances Materials Waste Value
        s_installationsContainersHazardousSubstancesMaterialsWaste_sc_spinner = (Spinner) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sc_spinner);
        s_installationsContainersHazardousSubstancesMaterialsWaste_tyc_spinner = (Spinner) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.tyc_spinner);
        s_installationsContainersHazardousSubstancesMaterialsWaste_sdc_spinner = (Spinner) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sdc_spinner);
        s_installationsContainersHazardousSubstancesMaterialsWaste_sac_spinner = (Spinner) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sac_spinner);
        s_installationsContainersHazardousSubstancesMaterialsWaste_sci_spinner = (Spinner) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.sci_spinner);
        //Installations Containers Hazardous Substances Materials Waste Evidence
        s_installationsContainersHazardousSubstancesMaterialsWaste_evidence = (EditText) getS_installationsContainersHazardousSubstancesMaterialsWasteView().findViewById(R.id.findings_evidence);

        //Management Hazardous Wastes Substances Materials Value field
        s_managementHazardousWastesSubstancesMaterials_sc_value = (EditText) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sc_value);
        s_managementHazardousWastesSubstancesMaterials_tyc_value = (EditText) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.tyc_value);
        s_managementHazardousWastesSubstancesMaterials_sdc_value = (EditText) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sdc_value);
        s_managementHazardousWastesSubstancesMaterials_sac_value = (EditText) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sac_value);
        s_managementHazardousWastesSubstancesMaterials_sci_value = (EditText) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sci_value);
        //Management Hazardous Wastes Substances Materials Value
        s_managementHazardousWastesSubstancesMaterials_sc_spinner = (Spinner) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sc_spinner);
        s_managementHazardousWastesSubstancesMaterials_tyc_spinner = (Spinner) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.tyc_spinner);
        s_managementHazardousWastesSubstancesMaterials_sdc_spinner = (Spinner) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sdc_spinner);
        s_managementHazardousWastesSubstancesMaterials_sac_spinner = (Spinner) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sac_spinner);
        s_managementHazardousWastesSubstancesMaterials_sci_spinner = (Spinner) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.sci_spinner);
        //Management Hazardous Wastes Substances Materials Evidence
        s_managementHazardousWastesSubstancesMaterials_evidence = (EditText) getS_managementHazardousWastesSubstancesMaterialsView().findViewById(R.id.findings_evidence);
    }
}
