package wass.com.sol.activity;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import wass.com.sol.R;
import wass.com.sol.fragment.CalculationFragments.CalculationFragment;
import wass.com.sol.fragment.CheckListFragments.CheckListFragment;
import wass.com.sol.fragment.ConfigurationFragments.ConfigurationFragment;
import wass.com.sol.fragment.ResultsFragment.ResultFragment;
import wass.com.sol.pojo.CheckList;

import static wass.com.sol.R.id.fab;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawer;
    private View navHeader;
    private ImageView imgNavHeaderBg, imgProfile;
    private TextView txtName, txtWebsite;
    private Toolbar toolbar;
    private FloatingActionButton buildResultButton;

    private CheckList checkList = new CheckList();

    
    //Maintaining cleanliness views
    private View c_doorsView = null;
    private View c_floorView = null;
    private View c_extractorsView = null;
    private View c_wallsView = null;
    private View c_windowsVentilationsBlocksView = null;
    private View c_luminairesView = null;
    private View c_sanitationView = null;
    private View c_handWashingStationView = null;
    private View c_drainageView = null;

    //Doors Value field
    private EditText c_door_sc_value;
    private EditText c_door_tyc_value;
    private EditText c_door_sdc_value;
    private EditText c_door_sac_value;
    private EditText c_door_sci_value;
    //Doors Spinner Value
    private Spinner c_door_sc_spinner;
    private Spinner c_door_tyc_spinner;
    private Spinner c_door_sdc_spinner;
    private Spinner c_door_sac_spinner;
    private Spinner c_door_sci_spinner;
    //Doors Evidence
    private EditText c_door_evidence;

    //Drainages Value field
    private EditText c_drainage_sc_value;
    private EditText c_drainage_tyc_value;
    private EditText c_drainage_sdc_value;
    private EditText c_drainage_sac_value;
    private EditText c_drainage_sci_value;
    //Drainages Spinner Value
    private Spinner c_drainage_sc_spinner;
    private Spinner c_drainage_tyc_spinner;
    private Spinner c_drainage_sdc_spinner;
    private Spinner c_drainage_sac_spinner;
    private Spinner c_drainage_sci_spinner;
    //Drainage Evidence
    private EditText c_drainage_evidence;

    //Extractors Value field
    private EditText c_extractor_sc_value;
    private EditText c_extractor_tyc_value;
    private EditText c_extractor_sdc_value;
    private EditText c_extractor_sac_value;
    private EditText c_extractor_sci_value;
    //Extractors Spinner Value
    private Spinner c_extractor_sc_spinner;
    private Spinner c_extractor_tyc_spinner;
    private Spinner c_extractor_sdc_spinner;
    private Spinner c_extractor_sac_spinner;
    private Spinner c_extractor_sci_spinner;
    //Extrantors Evidence
    private EditText c_extractor_evidence;

    //Floors Value field
    private EditText c_floor_sc_value;
    private EditText c_floor_tyc_value;
    private EditText c_floor_sdc_value;
    private EditText c_floor_sac_value;
    private EditText c_floor_sci_value;
    //Floors Spinner Value
    private Spinner c_floor_sc_spinner;
    private Spinner c_floor_tyc_spinner;
    private Spinner c_floor_sdc_spinner;
    private Spinner c_floor_sac_spinner;
    private Spinner c_floor_sci_spinner;
    //Floors Evidence
    private EditText c_floor_evidence;

    //Hand Washing Station Value field
    private EditText c_handWashingStation_sc_value;
    private EditText c_handWashingStation_tyc_value;
    private EditText c_handWashingStation_sdc_value;
    private EditText c_handWashingStation_sac_value;
    private EditText c_handWashingStation_sci_value;
    //Hand Washing Station Spinner Value
    private Spinner c_handWashingStation_sc_spinner;
    private Spinner c_handWashingStation_tyc_spinner;
    private Spinner c_handWashingStation_sdc_spinner;
    private Spinner c_handWashingStation_sac_spinner;
    private Spinner c_handWashingStation_sci_spinner;
    //Hand Washing Station Evidence
    private EditText c_handWashingStation_evidence;

    //Luminaires Value field
    private EditText c_luminaires_sc_value;
    private EditText c_luminaires_tyc_value;
    private EditText c_luminaires_sdc_value;
    private EditText c_luminaires_sac_value;
    private EditText c_luminaires_sci_value;
    //Luminaires Spinner Value
    private Spinner c_luminaires_sc_spinner;
    private Spinner c_luminaires_tyc_spinner;
    private Spinner c_luminaires_sdc_spinner;
    private Spinner c_luminaires_sac_spinner;
    private Spinner c_luminaires_sci_spinner;
    //Luminaires Evidence
    private EditText c_luminaires_evidence;

    //Sanitation Value field
    private EditText c_sanitation_sc_value;
    private EditText c_sanitation_tyc_value;
    private EditText c_sanitation_sdc_value;
    private EditText c_sanitation_sac_value;
    private EditText c_sanitation_sci_value;
    //Sanitation Spinner Value
    private Spinner c_sanitation_sc_spinner;
    private Spinner c_sanitation_tyc_spinner;
    private Spinner c_sanitation_sdc_spinner;
    private Spinner c_sanitation_sac_spinner;
    private Spinner c_sanitation_sci_spinner;
    //Sanitation Evidence
    private EditText c_sanitation_evidence;

    //Walls Value field
    private EditText c_walls_sc_value;
    private EditText c_walls_tyc_value;
    private EditText c_walls_sdc_value;
    private EditText c_walls_sac_value;
    private EditText c_walls_sci_value;
    //Walls Spinner Value
    private Spinner c_walls_sc_spinner;
    private Spinner c_walls_tyc_spinner;
    private Spinner c_walls_sdc_spinner;
    private Spinner c_walls_sac_spinner;
    private Spinner c_walls_sci_spinner;
    //Walls Evidence
    private EditText c_walls_evidence;

    //Windows and Ventilation Blocks Value field
    private EditText c_windowsVentilationsBlocks_sc_value;
    private EditText c_windowsVentilationsBlocks_tyc_value;
    private EditText c_windowsVentilationsBlocks_sdc_value;
    private EditText c_windowsVentilationsBlocks_sac_value;
    private EditText c_windowsVentilationsBlocks_sci_value;
    //Windows and Ventilation Blocks Spinner Value
    private Spinner c_windowsVentilationsBlocks_sc_spinner;
    private Spinner c_windowsVentilationsBlocks_tyc_spinner;
    private Spinner c_windowsVentilationsBlocks_sdc_spinner;
    private Spinner c_windowsVentilationsBlocks_sac_spinner;
    private Spinner c_windowsVentilationsBlocks_sci_spinner;
    //Windows and Ventilation blocks Evidence
    private EditText c_windowsVentilationsBlocks_evidence;

    //Mantaining Order and Organization views
    private View oo_machineryWorkEquipmentView = null;
    private View oo_assignedWorkToolsView = null;
    private View oo_containersWasteScrapView = null;
    private View oo_benchesCountersWorkdesksChairsView = null;
    private View oo_shelvesShopwindowsArchivesLibrariesView = null;
    private View oo_billboardsView = null;

    //Machinery Work Equipment Value field
    private EditText oo_machineryWorkEquipment_sc_value;
    private EditText oo_machineryWorkEquipment_tyc_value;
    private EditText oo_machineryWorkEquipment_sdc_value;
    private EditText oo_machineryWorkEquipment_sac_value;
    private EditText oo_machineryWorkEquipment_sci_value;
    //Machinery Work Equipment Spinner Value
    private Spinner oo_machineryWorkEquipment_sc_spinner;
    private Spinner oo_machineryWorkEquipment_tyc_spinner;
    private Spinner oo_machineryWorkEquipment_sdc_spinner;
    private Spinner oo_machineryWorkEquipment_sac_spinner;
    private Spinner oo_machineryWorkEquipment_sci_spinner;
    //Machinery Work Equipment Evidence
    private EditText oo_machineryWorkEquipment_evidence;

    //Assigned Work Tools Value field
    private EditText oo_assignedWorkTools_sc_value;
    private EditText oo_assignedWorkTools_tyc_value;
    private EditText oo_assignedWorkTools_sdc_value;
    private EditText oo_assignedWorkTools_sac_value;
    private EditText oo_assignedWorkTools_sci_value;
    //Assigned Work Tools Spinner Value
    private Spinner oo_assignedWorkTools_sc_spinner;
    private Spinner oo_assignedWorkTools_tyc_spinner;
    private Spinner oo_assignedWorkTools_sdc_spinner;
    private Spinner oo_assignedWorkTools_sac_spinner;
    private Spinner oo_assignedWorkTools_sci_spinner;
    //Assigned Work Tools Evidence
    private EditText oo_assignedWorkTools_evidence;

    //Containers Waste Scrap Value field
    private EditText oo_containersWasteScrap_sc_value;
    private EditText oo_containersWasteScrap_tyc_value;
    private EditText oo_containersWasteScrap_sdc_value;
    private EditText oo_containersWasteScrap_sac_value;
    private EditText oo_containersWasteScrap_sci_value;
    //Containers Waste Scrap Spinner Value
    private Spinner oo_containersWasteScrap_sc_spinner;
    private Spinner oo_containersWasteScrap_tyc_spinner;
    private Spinner oo_containersWasteScrap_sdc_spinner;
    private Spinner oo_containersWasteScrap_sac_spinner;
    private Spinner oo_containersWasteScrap_sci_spinner;
    //Containers Waste Scrap Evidence
    private EditText oo_containersWasteScrap_evidence;

    //Benches Counters Workdesk chairs Value field
    private EditText oo_benchesCountersWorkdeskChairs_sc_value;
    private EditText oo_benchesCountersWorkdeskChairs_tyc_value;
    private EditText oo_benchesCountersWorkdeskChairs_sdc_value;
    private EditText oo_benchesCountersWorkdeskChairs_sac_value;
    private EditText oo_benchesCountersWorkdeskChairs_sci_value;
    //Benches Counters Workdesk chairs Spinner Value
    private Spinner oo_benchesCountersWorkdeskChairs_sc_spinner;
    private Spinner oo_benchesCountersWorkdeskChairs_tyc_spinner;
    private Spinner oo_benchesCountersWorkdeskChairs_sdc_spinner;
    private Spinner oo_benchesCountersWorkdeskChairs_sac_spinner;
    private Spinner oo_benchesCountersWorkdeskChairs_sci_spinner;
    //Benches Counters Workdesk chairs Evidence
    private EditText oo_benchesCountersWorkdeskChairs_evidence;

    //Shelves Shopwindows Archives Libraries Value field
    private EditText oo_shelvesShopwindowsArchivesLibraries_sc_value;
    private EditText oo_shelvesShopwindowsArchivesLibraries_tyc_value;
    private EditText oo_shelvesShopwindowsArchivesLibraries_sdc_value;
    private EditText oo_shelvesShopwindowsArchivesLibraries_sac_value;
    private EditText oo_shelvesShopwindowsArchivesLibraries_sci_value;
    //Shelves Shopwindows Archives Libraries Spinner Value
    private Spinner oo_shelvesShopwindowsArchivesLibraries_sc_spinner;
    private Spinner oo_shelvesShopwindowsArchivesLibraries_tyc_spinner;
    private Spinner oo_shelvesShopwindowsArchivesLibraries_sdc_spinner;
    private Spinner oo_shelvesShopwindowsArchivesLibraries_sac_spinner;
    private Spinner oo_shelvesShopwindowsArchivesLibraries_sci_spinner;
    //Shelves Shopwindows Archives Libraries Evidence
    private EditText oo_shelvesShopwindowsArchivesLibraries_evidence;

    //Billboards Value field
    private EditText oo_billboards_sc_value;
    private EditText oo_billboards_tyc_value;
    private EditText oo_billboards_sdc_value;
    private EditText oo_billboards_sac_value;
    private EditText oo_billboards_sci_value;
    //Billboards Spinner Value
    private Spinner oo_billboards_sc_spinner;
    private Spinner oo_billboards_tyc_spinner;
    private Spinner oo_billboards_sdc_spinner;
    private Spinner oo_billboards_sac_spinner;
    private Spinner oo_billboards_sci_spinner;
    //Billboards Evidence
    private EditText oo_billboards_evidence;

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

    //Maintaining hygiene and personal presentation views
    private View hpp_personalPresentationView = null;
    private View hpp_personalHygieneView = null;
    private View hpp_healthView = null;

    //Personal Presentation Value field
    private EditText hpp_personalPresentation_sc_value;
    private EditText hpp_personalPresentation_tyc_value;
    private EditText hpp_personalPresentation_sdc_value;
    private EditText hpp_personalPresentation_sac_value;
    private EditText hpp_personalPresentation_sci_value;
    //Personal Presentation Spinner Value
    private Spinner hpp_personalPresentation_sc_spinner;
    private Spinner hpp_personalPresentation_tyc_spinner;
    private Spinner hpp_personalPresentation_sdc_spinner;
    private Spinner hpp_personalPresentation_sac_spinner;
    private Spinner hpp_personalPresentation_sci_spinner;
    //Personal Presentation Evidence
    private EditText hpp_personalPresentation_evidence;

    //Personal Hygiene Value field
    private EditText hpp_personalHygiene_sc_value;
    private EditText hpp_personalHygiene_tyc_value;
    private EditText hpp_personalHygiene_sdc_value;
    private EditText hpp_personalHygiene_sac_value;
    private EditText hpp_personalHygiene_sci_value;
    //Personal Hygiene Spinner Value
    private Spinner hpp_personalHygiene_sc_spinner;
    private Spinner hpp_personalHygiene_tyc_spinner;
    private Spinner hpp_personalHygiene_sdc_spinner;
    private Spinner hpp_personalHygiene_sac_spinner;
    private Spinner hpp_personalHygiene_sci_spinner;
    //Personal Hygiene Evidence
    private EditText hpp_personalHygiene_evidence;

    //Health Value field
    private EditText hpp_health_sc_value;
    private EditText hpp_health_tyc_value;
    private EditText hpp_health_sdc_value;
    private EditText hpp_health_sac_value;
    private EditText hpp_health_sci_value;
    //Health Spinner Value
    private Spinner hpp_health_sc_spinner;
    private Spinner hpp_health_tyc_spinner;
    private Spinner hpp_health_sdc_spinner;
    private Spinner hpp_health_sac_spinner;
    private Spinner hpp_health_sci_spinner;
    //Health Evidence
    private EditText hpp_health_evidence;
    

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

    //Maintaining the environment views
    private View e_classifyHazardousNonhazardousWastesView = null;
    private View e_classifyContainersHazardousNonhazardousWasteView = null;
    private View e_disposalStorageHandlingView = null;
    private View e_controlEmissionsEffluentsView = null;
    private View e_rationalUseWaterView = null;
    private View e_rationalUselightView = null;
    private View e_noiseControlView = null;
    private View e_ProtectionGreenAreasView = null;

    //Classify Hazardous Non Hazardous Wastes Value field
    private EditText e_classifyHazardousNonhazardousWastes_sc_value;
    private EditText e_classifyHazardousNonhazardousWastes_tyc_value;
    private EditText e_classifyHazardousNonhazardousWastes_sdc_value;
    private EditText e_classifyHazardousNonhazardousWastes_sac_value;
    private EditText e_classifyHazardousNonhazardousWastes_sci_value;
    //Classify Hazardous Non Hazardous Wastes Spinner Value
    private Spinner e_classifyHazardousNonhazardousWastes_sc_spinner;
    private Spinner e_classifyHazardousNonhazardousWastes_tyc_spinner;
    private Spinner e_classifyHazardousNonhazardousWastes_sdc_spinner;
    private Spinner e_classifyHazardousNonhazardousWastes_sac_spinner;
    private Spinner e_classifyHazardousNonhazardousWastes_sci_spinner;
    //Classify Hazardous Non Hazardous Wastes Evidence
    private EditText e_classifyHazardousNonhazardousWastes_evidence;

    //Classify Containers Hazardous Non Hazardous Waste Value field
    private EditText e_classifyContainersHazardousNonhazardousWaste_sc_value;
    private EditText e_classifyContainersHazardousNonhazardousWaste_tyc_value;
    private EditText e_classifyContainersHazardousNonhazardousWaste_sdc_value;
    private EditText e_classifyContainersHazardousNonhazardousWaste_sac_value;
    private EditText e_classifyContainersHazardousNonhazardousWaste_sci_value;
    //Classify Containers Hazardous Non Hazardous Waste Spinner Value
    private Spinner e_classifyContainersHazardousNonhazardousWaste_sc_spinner;
    private Spinner e_classifyContainersHazardousNonhazardousWaste_tyc_spinner;
    private Spinner e_classifyContainersHazardousNonhazardousWaste_sdc_spinner;
    private Spinner e_classifyContainersHazardousNonhazardousWaste_sac_spinner;
    private Spinner e_classifyContainersHazardousNonhazardousWaste_sci_spinner;
    //Classify Containers Hazardous Non Hazardous Waste Evidence
    private EditText e_classifyContainersHazardousNonhazardousWaste_evidence;

    //Disposal Storage Handling Value field
    private EditText e_disposalStorageHandling_sc_value;
    private EditText e_disposalStorageHandling_tyc_value;
    private EditText e_disposalStorageHandling_sdc_value;
    private EditText e_disposalStorageHandling_sac_value;
    private EditText e_disposalStorageHandling_sci_value;
    //Disposal Storage Handling Spinner Value
    private Spinner e_disposalStorageHandling_sc_spinner;
    private Spinner e_disposalStorageHandling_tyc_spinner;
    private Spinner e_disposalStorageHandling_sdc_spinner;
    private Spinner e_disposalStorageHandling_sac_spinner;
    private Spinner e_disposalStorageHandling_sci_spinner;
    //Disposal Storage Handling Evidence
    private EditText e_disposalStorageHandling_evidence;

    //Control Emissions Effluents Value field
    private EditText e_controlEmissionsEffluents_sc_value;
    private EditText e_controlEmissionsEffluents_tyc_value;
    private EditText e_controlEmissionsEffluents_sdc_value;
    private EditText e_controlEmissionsEffluents_sac_value;
    private EditText e_controlEmissionsEffluents_sci_value;
    //Control Emissions Effluents Spinner Value
    private Spinner e_controlEmissionsEffluents_sc_spinner;
    private Spinner e_controlEmissionsEffluents_tyc_spinner;
    private Spinner e_controlEmissionsEffluents_sdc_spinner;
    private Spinner e_controlEmissionsEffluents_sac_spinner;
    private Spinner e_controlEmissionsEffluents_sci_spinner;
    //Control Emissions Effluents Evidence
    private EditText e_controlEmissionsEffluents_evidence;

    //Rational Use Water Value field
    private EditText e_rationalUseWater_sc_value;
    private EditText e_rationalUseWater_tyc_value;
    private EditText e_rationalUseWater_sdc_value;
    private EditText e_rationalUseWater_sac_value;
    private EditText e_rationalUseWater_sci_value;
    //Rational Use Water Spinner Value
    private Spinner e_rationalUseWater_sc_spinner;
    private Spinner e_rationalUseWater_tyc_spinner;
    private Spinner e_rationalUseWater_sdc_spinner;
    private Spinner e_rationalUseWater_sac_spinner;
    private Spinner e_rationalUseWater_sci_spinner;
    //Rational Use Water Evidence
    private EditText e_rationalUseWater_evidence;

    //Rational Use light Value field
    private EditText e_rationalUselight_sc_value;
    private EditText e_rationalUselight_tyc_value;
    private EditText e_rationalUselight_sdc_value;
    private EditText e_rationalUselight_sac_value;
    private EditText e_rationalUselight_sci_value;
    //Rational Use light Spinner Value
    private Spinner e_rationalUselight_sc_spinner;
    private Spinner e_rationalUselight_tyc_spinner;
    private Spinner e_rationalUselight_sdc_spinner;
    private Spinner e_rationalUselight_sac_spinner;
    private Spinner e_rationalUselight_sci_spinner;
    //Rational Use light Evidence
    private EditText e_rationalUselight_evidence;

    //Noise Control Value field
    private EditText e_noiseControl_sc_value;
    private EditText e_noiseControl_tyc_value;
    private EditText e_noiseControl_sdc_value;
    private EditText e_noiseControl_sac_value;
    private EditText e_noiseControl_sci_value;
    //Noise Control Spinner Value
    private Spinner e_noiseControl_sc_spinner;
    private Spinner e_noiseControl_tyc_spinner;
    private Spinner e_noiseControl_sdc_spinner;
    private Spinner e_noiseControl_sac_spinner;
    private Spinner e_noiseControl_sci_spinner;
    //Noise Control Evidence
    private EditText e_noiseControl_evidence;

    //Protection Green Areas Value field
    private EditText e_ProtectionGreenAreas_sc_value;
    private EditText e_ProtectionGreenAreas_tyc_value;
    private EditText e_ProtectionGreenAreas_sdc_value;
    private EditText e_ProtectionGreenAreas_sac_value;
    private EditText e_ProtectionGreenAreas_sci_value;
    //Protection Green Areas Spinner Value
    private Spinner e_ProtectionGreenAreas_sc_spinner;
    private Spinner e_ProtectionGreenAreas_tyc_spinner;
    private Spinner e_ProtectionGreenAreas_sdc_spinner;
    private Spinner e_ProtectionGreenAreas_sac_spinner;
    private Spinner e_ProtectionGreenAreas_sci_spinner;
    //Protection Green Areas Evidence
    private EditText e_ProtectionGreenAreas_evidence;

    public EditText getC_door_sc_value() {
        return c_door_sc_value;
    }

    public void setC_door_sc_value(EditText c_door_sc_value) {
        this.c_door_sc_value = c_door_sc_value;
    }

    public EditText getC_door_tyc_value() {
        return c_door_tyc_value;
    }

    public void setC_door_tyc_value(EditText c_door_tyc_value) {
        this.c_door_tyc_value = c_door_tyc_value;
    }

    public EditText getC_door_sdc_value() {
        return c_door_sdc_value;
    }

    public void setC_door_sdc_value(EditText c_door_sdc_value) {
        this.c_door_sdc_value = c_door_sdc_value;
    }

    public EditText getC_door_sac_value() {
        return c_door_sac_value;
    }

    public void setC_door_sac_value(EditText c_door_sac_value) {
        this.c_door_sac_value = c_door_sac_value;
    }

    public EditText getC_door_sci_value() {
        return c_door_sci_value;
    }

    public void setC_door_sci_value(EditText c_door_sci_value) {
        this.c_door_sci_value = c_door_sci_value;
    }

    public Spinner getC_door_sc_spinner() {
        return c_door_sc_spinner;
    }

    public void setC_door_sc_spinner(Spinner c_door_sc_spinner) {
        this.c_door_sc_spinner = c_door_sc_spinner;
    }

    public Spinner getC_door_tyc_spinner() {
        return c_door_tyc_spinner;
    }

    public void setC_door_tyc_spinner(Spinner c_door_tyc_spinner) {
        this.c_door_tyc_spinner = c_door_tyc_spinner;
    }

    public Spinner getC_door_sdc_spinner() {
        return c_door_sdc_spinner;
    }

    public void setC_door_sdc_spinner(Spinner c_door_sdc_spinner) {
        this.c_door_sdc_spinner = c_door_sdc_spinner;
    }

    public Spinner getC_door_sac_spinner() {
        return c_door_sac_spinner;
    }

    public void setC_door_sac_spinner(Spinner c_door_sac_spinner) {
        this.c_door_sac_spinner = c_door_sac_spinner;
    }

    public Spinner getC_door_sci_spinner() {
        return c_door_sci_spinner;
    }

    public void setC_door_sci_spinner(Spinner c_door_sci_spinner) {
        this.c_door_sci_spinner = c_door_sci_spinner;
    }

    public EditText getC_door_evidence() {
        return c_door_evidence;
    }

    public void setC_door_evidence(EditText c_door_evidence) {
        this.c_door_evidence = c_door_evidence;
    }

    public EditText getC_drainage_sc_value() {
        return c_drainage_sc_value;
    }

    public void setC_drainage_sc_value(EditText c_drainage_sc_value) {
        this.c_drainage_sc_value = c_drainage_sc_value;
    }

    public EditText getC_drainage_tyc_value() {
        return c_drainage_tyc_value;
    }

    public void setC_drainage_tyc_value(EditText c_drainage_tyc_value) {
        this.c_drainage_tyc_value = c_drainage_tyc_value;
    }

    public EditText getC_drainage_sdc_value() {
        return c_drainage_sdc_value;
    }

    public void setC_drainage_sdc_value(EditText c_drainage_sdc_value) {
        this.c_drainage_sdc_value = c_drainage_sdc_value;
    }

    public EditText getC_drainage_sac_value() {
        return c_drainage_sac_value;
    }

    public void setC_drainage_sac_value(EditText c_drainage_sac_value) {
        this.c_drainage_sac_value = c_drainage_sac_value;
    }

    public EditText getC_drainage_sci_value() {
        return c_drainage_sci_value;
    }

    public void setC_drainage_sci_value(EditText c_drainage_sci_value) {
        this.c_drainage_sci_value = c_drainage_sci_value;
    }

    public Spinner getC_drainage_sc_spinner() {
        return c_drainage_sc_spinner;
    }

    public void setC_drainage_sc_spinner(Spinner c_drainage_sc_spinner) {
        this.c_drainage_sc_spinner = c_drainage_sc_spinner;
    }

    public Spinner getC_drainage_tyc_spinner() {
        return c_drainage_tyc_spinner;
    }

    public void setC_drainage_tyc_spinner(Spinner c_drainage_tyc_spinner) {
        this.c_drainage_tyc_spinner = c_drainage_tyc_spinner;
    }

    public Spinner getC_drainage_sdc_spinner() {
        return c_drainage_sdc_spinner;
    }

    public void setC_drainage_sdc_spinner(Spinner c_drainage_sdc_spinner) {
        this.c_drainage_sdc_spinner = c_drainage_sdc_spinner;
    }

    public Spinner getC_drainage_sac_spinner() {
        return c_drainage_sac_spinner;
    }

    public void setC_drainage_sac_spinner(Spinner c_drainage_sac_spinner) {
        this.c_drainage_sac_spinner = c_drainage_sac_spinner;
    }

    public Spinner getC_drainage_sci_spinner() {
        return c_drainage_sci_spinner;
    }

    public void setC_drainage_sci_spinner(Spinner c_drainage_sci_spinner) {
        this.c_drainage_sci_spinner = c_drainage_sci_spinner;
    }

    public EditText getC_drainage_evidence() {
        return c_drainage_evidence;
    }

    public void setC_drainage_evidence(EditText c_drainage_evidence) {
        this.c_drainage_evidence = c_drainage_evidence;
    }

    public EditText getC_extractor_sc_value() {
        return c_extractor_sc_value;
    }

    public void setC_extractor_sc_value(EditText c_extractor_sc_value) {
        this.c_extractor_sc_value = c_extractor_sc_value;
    }

    public EditText getC_extractor_tyc_value() {
        return c_extractor_tyc_value;
    }

    public void setC_extractor_tyc_value(EditText c_extractor_tyc_value) {
        this.c_extractor_tyc_value = c_extractor_tyc_value;
    }

    public EditText getC_extractor_sdc_value() {
        return c_extractor_sdc_value;
    }

    public void setC_extractor_sdc_value(EditText c_extractor_sdc_value) {
        this.c_extractor_sdc_value = c_extractor_sdc_value;
    }

    public EditText getC_extractor_sac_value() {
        return c_extractor_sac_value;
    }

    public void setC_extractor_sac_value(EditText c_extractor_sac_value) {
        this.c_extractor_sac_value = c_extractor_sac_value;
    }

    public EditText getC_extractor_sci_value() {
        return c_extractor_sci_value;
    }

    public void setC_extractor_sci_value(EditText c_extractor_sci_value) {
        this.c_extractor_sci_value = c_extractor_sci_value;
    }

    public Spinner getC_extractor_sc_spinner() {
        return c_extractor_sc_spinner;
    }

    public void setC_extractor_sc_spinner(Spinner c_extractor_sc_spinner) {
        this.c_extractor_sc_spinner = c_extractor_sc_spinner;
    }

    public Spinner getC_extractor_tyc_spinner() {
        return c_extractor_tyc_spinner;
    }

    public void setC_extractor_tyc_spinner(Spinner c_extractor_tyc_spinner) {
        this.c_extractor_tyc_spinner = c_extractor_tyc_spinner;
    }

    public Spinner getC_extractor_sdc_spinner() {
        return c_extractor_sdc_spinner;
    }

    public void setC_extractor_sdc_spinner(Spinner c_extractor_sdc_spinner) {
        this.c_extractor_sdc_spinner = c_extractor_sdc_spinner;
    }

    public Spinner getC_extractor_sac_spinner() {
        return c_extractor_sac_spinner;
    }

    public void setC_extractor_sac_spinner(Spinner c_extractor_sac_spinner) {
        this.c_extractor_sac_spinner = c_extractor_sac_spinner;
    }

    public Spinner getC_extractor_sci_spinner() {
        return c_extractor_sci_spinner;
    }

    public void setC_extractor_sci_spinner(Spinner c_extractor_sci_spinner) {
        this.c_extractor_sci_spinner = c_extractor_sci_spinner;
    }

    public EditText getC_extractor_evidence() {
        return c_extractor_evidence;
    }

    public void setC_extractor_evidence(EditText c_extractor_evidence) {
        this.c_extractor_evidence = c_extractor_evidence;
    }

    public EditText getC_floor_sc_value() {
        return c_floor_sc_value;
    }

    public void setC_floor_sc_value(EditText c_floor_sc_value) {
        this.c_floor_sc_value = c_floor_sc_value;
    }

    public EditText getC_floor_tyc_value() {
        return c_floor_tyc_value;
    }

    public void setC_floor_tyc_value(EditText c_floor_tyc_value) {
        this.c_floor_tyc_value = c_floor_tyc_value;
    }

    public EditText getC_floor_sdc_value() {
        return c_floor_sdc_value;
    }

    public void setC_floor_sdc_value(EditText c_floor_sdc_value) {
        this.c_floor_sdc_value = c_floor_sdc_value;
    }

    public EditText getC_floor_sac_value() {
        return c_floor_sac_value;
    }

    public void setC_floor_sac_value(EditText c_floor_sac_value) {
        this.c_floor_sac_value = c_floor_sac_value;
    }

    public EditText getC_floor_sci_value() {
        return c_floor_sci_value;
    }

    public void setC_floor_sci_value(EditText c_floor_sci_value) {
        this.c_floor_sci_value = c_floor_sci_value;
    }

    public Spinner getC_floor_sc_spinner() {
        return c_floor_sc_spinner;
    }

    public void setC_floor_sc_spinner(Spinner c_floor_sc_spinner) {
        this.c_floor_sc_spinner = c_floor_sc_spinner;
    }

    public Spinner getC_floor_tyc_spinner() {
        return c_floor_tyc_spinner;
    }

    public void setC_floor_tyc_spinner(Spinner c_floor_tyc_spinner) {
        this.c_floor_tyc_spinner = c_floor_tyc_spinner;
    }

    public Spinner getC_floor_sdc_spinner() {
        return c_floor_sdc_spinner;
    }

    public void setC_floor_sdc_spinner(Spinner c_floor_sdc_spinner) {
        this.c_floor_sdc_spinner = c_floor_sdc_spinner;
    }

    public Spinner getC_floor_sac_spinner() {
        return c_floor_sac_spinner;
    }

    public void setC_floor_sac_spinner(Spinner c_floor_sac_spinner) {
        this.c_floor_sac_spinner = c_floor_sac_spinner;
    }

    public Spinner getC_floor_sci_spinner() {
        return c_floor_sci_spinner;
    }

    public void setC_floor_sci_spinner(Spinner c_floor_sci_spinner) {
        this.c_floor_sci_spinner = c_floor_sci_spinner;
    }

    public EditText getC_floor_evidence() {
        return c_floor_evidence;
    }

    public void setC_floor_evidence(EditText c_floor_evidence) {
        this.c_floor_evidence = c_floor_evidence;
    }

    public EditText getC_handWashingStation_sc_value() {
        return c_handWashingStation_sc_value;
    }

    public void setC_handWashingStation_sc_value(EditText c_handWashingStation_sc_value) {
        this.c_handWashingStation_sc_value = c_handWashingStation_sc_value;
    }

    public EditText getC_handWashingStation_tyc_value() {
        return c_handWashingStation_tyc_value;
    }

    public void setC_handWashingStation_tyc_value(EditText c_handWashingStation_tyc_value) {
        this.c_handWashingStation_tyc_value = c_handWashingStation_tyc_value;
    }

    public EditText getC_handWashingStation_sdc_value() {
        return c_handWashingStation_sdc_value;
    }

    public void setC_handWashingStation_sdc_value(EditText c_handWashingStation_sdc_value) {
        this.c_handWashingStation_sdc_value = c_handWashingStation_sdc_value;
    }

    public EditText getC_handWashingStation_sac_value() {
        return c_handWashingStation_sac_value;
    }

    public void setC_handWashingStation_sac_value(EditText c_handWashingStation_sac_value) {
        this.c_handWashingStation_sac_value = c_handWashingStation_sac_value;
    }

    public EditText getC_handWashingStation_sci_value() {
        return c_handWashingStation_sci_value;
    }

    public void setC_handWashingStation_sci_value(EditText c_handWashingStation_sci_value) {
        this.c_handWashingStation_sci_value = c_handWashingStation_sci_value;
    }

    public Spinner getC_handWashingStation_sc_spinner() {
        return c_handWashingStation_sc_spinner;
    }

    public void setC_handWashingStation_sc_spinner(Spinner c_handWashingStation_sc_spinner) {
        this.c_handWashingStation_sc_spinner = c_handWashingStation_sc_spinner;
    }

    public Spinner getC_handWashingStation_tyc_spinner() {
        return c_handWashingStation_tyc_spinner;
    }

    public void setC_handWashingStation_tyc_spinner(Spinner c_handWashingStation_tyc_spinner) {
        this.c_handWashingStation_tyc_spinner = c_handWashingStation_tyc_spinner;
    }

    public Spinner getC_handWashingStation_sdc_spinner() {
        return c_handWashingStation_sdc_spinner;
    }

    public void setC_handWashingStation_sdc_spinner(Spinner c_handWashingStation_sdc_spinner) {
        this.c_handWashingStation_sdc_spinner = c_handWashingStation_sdc_spinner;
    }

    public Spinner getC_handWashingStation_sac_spinner() {
        return c_handWashingStation_sac_spinner;
    }

    public void setC_handWashingStation_sac_spinner(Spinner c_handWashingStation_sac_spinner) {
        this.c_handWashingStation_sac_spinner = c_handWashingStation_sac_spinner;
    }

    public Spinner getC_handWashingStation_sci_spinner() {
        return c_handWashingStation_sci_spinner;
    }

    public void setC_handWashingStation_sci_spinner(Spinner c_handWashingStation_sci_spinner) {
        this.c_handWashingStation_sci_spinner = c_handWashingStation_sci_spinner;
    }

    public EditText getC_handWashingStation_evidence() {
        return c_handWashingStation_evidence;
    }

    public void setC_handWashingStation_evidence(EditText c_handWashingStation_evidence) {
        this.c_handWashingStation_evidence = c_handWashingStation_evidence;
    }

    public EditText getC_luminaires_sc_value() {
        return c_luminaires_sc_value;
    }

    public void setC_luminaires_sc_value(EditText c_luminaires_sc_value) {
        this.c_luminaires_sc_value = c_luminaires_sc_value;
    }

    public EditText getC_luminaires_tyc_value() {
        return c_luminaires_tyc_value;
    }

    public void setC_luminaires_tyc_value(EditText c_luminaires_tyc_value) {
        this.c_luminaires_tyc_value = c_luminaires_tyc_value;
    }

    public EditText getC_luminaires_sdc_value() {
        return c_luminaires_sdc_value;
    }

    public void setC_luminaires_sdc_value(EditText c_luminaires_sdc_value) {
        this.c_luminaires_sdc_value = c_luminaires_sdc_value;
    }

    public EditText getC_luminaires_sac_value() {
        return c_luminaires_sac_value;
    }

    public void setC_luminaires_sac_value(EditText c_luminaires_sac_value) {
        this.c_luminaires_sac_value = c_luminaires_sac_value;
    }

    public EditText getC_luminaires_sci_value() {
        return c_luminaires_sci_value;
    }

    public void setC_luminaires_sci_value(EditText c_luminaires_sci_value) {
        this.c_luminaires_sci_value = c_luminaires_sci_value;
    }

    public Spinner getC_luminaires_sc_spinner() {
        return c_luminaires_sc_spinner;
    }

    public void setC_luminaires_sc_spinner(Spinner c_luminaires_sc_spinner) {
        this.c_luminaires_sc_spinner = c_luminaires_sc_spinner;
    }

    public Spinner getC_luminaires_tyc_spinner() {
        return c_luminaires_tyc_spinner;
    }

    public void setC_luminaires_tyc_spinner(Spinner c_luminaires_tyc_spinner) {
        this.c_luminaires_tyc_spinner = c_luminaires_tyc_spinner;
    }

    public Spinner getC_luminaires_sdc_spinner() {
        return c_luminaires_sdc_spinner;
    }

    public void setC_luminaires_sdc_spinner(Spinner c_luminaires_sdc_spinner) {
        this.c_luminaires_sdc_spinner = c_luminaires_sdc_spinner;
    }

    public Spinner getC_luminaires_sac_spinner() {
        return c_luminaires_sac_spinner;
    }

    public void setC_luminaires_sac_spinner(Spinner c_luminaires_sac_spinner) {
        this.c_luminaires_sac_spinner = c_luminaires_sac_spinner;
    }

    public Spinner getC_luminaires_sci_spinner() {
        return c_luminaires_sci_spinner;
    }

    public void setC_luminaires_sci_spinner(Spinner c_luminaires_sci_spinner) {
        this.c_luminaires_sci_spinner = c_luminaires_sci_spinner;
    }

    public EditText getC_luminaires_evidence() {
        return c_luminaires_evidence;
    }

    public void setC_luminaires_evidence(EditText c_luminaires_evidence) {
        this.c_luminaires_evidence = c_luminaires_evidence;
    }

    public EditText getC_sanitation_sc_value() {
        return c_sanitation_sc_value;
    }

    public void setC_sanitation_sc_value(EditText c_sanitation_sc_value) {
        this.c_sanitation_sc_value = c_sanitation_sc_value;
    }

    public EditText getC_sanitation_tyc_value() {
        return c_sanitation_tyc_value;
    }

    public void setC_sanitation_tyc_value(EditText c_sanitation_tyc_value) {
        this.c_sanitation_tyc_value = c_sanitation_tyc_value;
    }

    public EditText getC_sanitation_sdc_value() {
        return c_sanitation_sdc_value;
    }

    public void setC_sanitation_sdc_value(EditText c_sanitation_sdc_value) {
        this.c_sanitation_sdc_value = c_sanitation_sdc_value;
    }

    public EditText getC_sanitation_sac_value() {
        return c_sanitation_sac_value;
    }

    public void setC_sanitation_sac_value(EditText c_sanitation_sac_value) {
        this.c_sanitation_sac_value = c_sanitation_sac_value;
    }

    public EditText getC_sanitation_sci_value() {
        return c_sanitation_sci_value;
    }

    public void setC_sanitation_sci_value(EditText c_sanitation_sci_value) {
        this.c_sanitation_sci_value = c_sanitation_sci_value;
    }

    public Spinner getC_sanitation_sc_spinner() {
        return c_sanitation_sc_spinner;
    }

    public void setC_sanitation_sc_spinner(Spinner c_sanitation_sc_spinner) {
        this.c_sanitation_sc_spinner = c_sanitation_sc_spinner;
    }

    public Spinner getC_sanitation_tyc_spinner() {
        return c_sanitation_tyc_spinner;
    }

    public void setC_sanitation_tyc_spinner(Spinner c_sanitation_tyc_spinner) {
        this.c_sanitation_tyc_spinner = c_sanitation_tyc_spinner;
    }

    public Spinner getC_sanitation_sdc_spinner() {
        return c_sanitation_sdc_spinner;
    }

    public void setC_sanitation_sdc_spinner(Spinner c_sanitation_sdc_spinner) {
        this.c_sanitation_sdc_spinner = c_sanitation_sdc_spinner;
    }

    public Spinner getC_sanitation_sac_spinner() {
        return c_sanitation_sac_spinner;
    }

    public void setC_sanitation_sac_spinner(Spinner c_sanitation_sac_spinner) {
        this.c_sanitation_sac_spinner = c_sanitation_sac_spinner;
    }

    public Spinner getC_sanitation_sci_spinner() {
        return c_sanitation_sci_spinner;
    }

    public void setC_sanitation_sci_spinner(Spinner c_sanitation_sci_spinner) {
        this.c_sanitation_sci_spinner = c_sanitation_sci_spinner;
    }

    public EditText getC_sanitation_evidence() {
        return c_sanitation_evidence;
    }

    public void setC_sanitation_evidence(EditText c_sanitation_evidence) {
        this.c_sanitation_evidence = c_sanitation_evidence;
    }

    public EditText getC_walls_sc_value() {
        return c_walls_sc_value;
    }

    public void setC_walls_sc_value(EditText c_walls_sc_value) {
        this.c_walls_sc_value = c_walls_sc_value;
    }

    public EditText getC_walls_tyc_value() {
        return c_walls_tyc_value;
    }

    public void setC_walls_tyc_value(EditText c_walls_tyc_value) {
        this.c_walls_tyc_value = c_walls_tyc_value;
    }

    public EditText getC_walls_sdc_value() {
        return c_walls_sdc_value;
    }

    public void setC_walls_sdc_value(EditText c_walls_sdc_value) {
        this.c_walls_sdc_value = c_walls_sdc_value;
    }

    public EditText getC_walls_sac_value() {
        return c_walls_sac_value;
    }

    public void setC_walls_sac_value(EditText c_walls_sac_value) {
        this.c_walls_sac_value = c_walls_sac_value;
    }

    public EditText getC_walls_sci_value() {
        return c_walls_sci_value;
    }

    public void setC_walls_sci_value(EditText c_walls_sci_value) {
        this.c_walls_sci_value = c_walls_sci_value;
    }

    public Spinner getC_walls_sc_spinner() {
        return c_walls_sc_spinner;
    }

    public void setC_walls_sc_spinner(Spinner c_walls_sc_spinner) {
        this.c_walls_sc_spinner = c_walls_sc_spinner;
    }

    public Spinner getC_walls_tyc_spinner() {
        return c_walls_tyc_spinner;
    }

    public void setC_walls_tyc_spinner(Spinner c_walls_tyc_spinner) {
        this.c_walls_tyc_spinner = c_walls_tyc_spinner;
    }

    public Spinner getC_walls_sdc_spinner() {
        return c_walls_sdc_spinner;
    }

    public void setC_walls_sdc_spinner(Spinner c_walls_sdc_spinner) {
        this.c_walls_sdc_spinner = c_walls_sdc_spinner;
    }

    public Spinner getC_walls_sac_spinner() {
        return c_walls_sac_spinner;
    }

    public void setC_walls_sac_spinner(Spinner c_walls_sac_spinner) {
        this.c_walls_sac_spinner = c_walls_sac_spinner;
    }

    public Spinner getC_walls_sci_spinner() {
        return c_walls_sci_spinner;
    }

    public void setC_walls_sci_spinner(Spinner c_walls_sci_spinner) {
        this.c_walls_sci_spinner = c_walls_sci_spinner;
    }

    public EditText getC_walls_evidence() {
        return c_walls_evidence;
    }

    public void setC_walls_evidence(EditText c_walls_evidence) {
        this.c_walls_evidence = c_walls_evidence;
    }

    public EditText getC_windowsVentilationsBlocks_sc_value() {
        return c_windowsVentilationsBlocks_sc_value;
    }

    public void setC_windowsVentilationsBlocks_sc_value(EditText c_windowsVentilationsBlocks_sc_value) {
        this.c_windowsVentilationsBlocks_sc_value = c_windowsVentilationsBlocks_sc_value;
    }

    public EditText getC_windowsVentilationsBlocks_tyc_value() {
        return c_windowsVentilationsBlocks_tyc_value;
    }

    public void setC_windowsVentilationsBlocks_tyc_value(EditText c_windowsVentilationsBlocks_tyc_value) {
        this.c_windowsVentilationsBlocks_tyc_value = c_windowsVentilationsBlocks_tyc_value;
    }

    public EditText getC_windowsVentilationsBlocks_sdc_value() {
        return c_windowsVentilationsBlocks_sdc_value;
    }

    public void setC_windowsVentilationsBlocks_sdc_value(EditText c_windowsVentilationsBlocks_sdc_value) {
        this.c_windowsVentilationsBlocks_sdc_value = c_windowsVentilationsBlocks_sdc_value;
    }

    public EditText getC_windowsVentilationsBlocks_sac_value() {
        return c_windowsVentilationsBlocks_sac_value;
    }

    public void setC_windowsVentilationsBlocks_sac_value(EditText c_windowsVentilationsBlocks_sac_value) {
        this.c_windowsVentilationsBlocks_sac_value = c_windowsVentilationsBlocks_sac_value;
    }

    public EditText getC_windowsVentilationsBlocks_sci_value() {
        return c_windowsVentilationsBlocks_sci_value;
    }

    public void setC_windowsVentilationsBlocks_sci_value(EditText c_windowsVentilationsBlocks_sci_value) {
        this.c_windowsVentilationsBlocks_sci_value = c_windowsVentilationsBlocks_sci_value;
    }

    public Spinner getC_windowsVentilationsBlocks_sc_spinner() {
        return c_windowsVentilationsBlocks_sc_spinner;
    }

    public void setC_windowsVentilationsBlocks_sc_spinner(Spinner c_windowsVentilationsBlocks_sc_spinner) {
        this.c_windowsVentilationsBlocks_sc_spinner = c_windowsVentilationsBlocks_sc_spinner;
    }

    public Spinner getC_windowsVentilationsBlocks_tyc_spinner() {
        return c_windowsVentilationsBlocks_tyc_spinner;
    }

    public void setC_windowsVentilationsBlocks_tyc_spinner(Spinner c_windowsVentilationsBlocks_tyc_spinner) {
        this.c_windowsVentilationsBlocks_tyc_spinner = c_windowsVentilationsBlocks_tyc_spinner;
    }

    public Spinner getC_windowsVentilationsBlocks_sdc_spinner() {
        return c_windowsVentilationsBlocks_sdc_spinner;
    }

    public void setC_windowsVentilationsBlocks_sdc_spinner(Spinner c_windowsVentilationsBlocks_sdc_spinner) {
        this.c_windowsVentilationsBlocks_sdc_spinner = c_windowsVentilationsBlocks_sdc_spinner;
    }

    public Spinner getC_windowsVentilationsBlocks_sac_spinner() {
        return c_windowsVentilationsBlocks_sac_spinner;
    }

    public void setC_windowsVentilationsBlocks_sac_spinner(Spinner c_windowsVentilationsBlocks_sac_spinner) {
        this.c_windowsVentilationsBlocks_sac_spinner = c_windowsVentilationsBlocks_sac_spinner;
    }

    public Spinner getC_windowsVentilationsBlocks_sci_spinner() {
        return c_windowsVentilationsBlocks_sci_spinner;
    }

    public void setC_windowsVentilationsBlocks_sci_spinner(Spinner c_windowsVentilationsBlocks_sci_spinner) {
        this.c_windowsVentilationsBlocks_sci_spinner = c_windowsVentilationsBlocks_sci_spinner;
    }

    public EditText getC_windowsVentilationsBlocks_evidence() {
        return c_windowsVentilationsBlocks_evidence;
    }

    public void setC_windowsVentilationsBlocks_evidence(EditText c_windowsVentilationsBlocks_evidence) {
        this.c_windowsVentilationsBlocks_evidence = c_windowsVentilationsBlocks_evidence;
    }

    public EditText getOo_machineryWorkEquipment_sc_value() {
        return oo_machineryWorkEquipment_sc_value;
    }

    public void setOo_machineryWorkEquipment_sc_value(EditText oo_machineryWorkEquipment_sc_value) {
        this.oo_machineryWorkEquipment_sc_value = oo_machineryWorkEquipment_sc_value;
    }

    public EditText getOo_machineryWorkEquipment_tyc_value() {
        return oo_machineryWorkEquipment_tyc_value;
    }

    public void setOo_machineryWorkEquipment_tyc_value(EditText oo_machineryWorkEquipment_tyc_value) {
        this.oo_machineryWorkEquipment_tyc_value = oo_machineryWorkEquipment_tyc_value;
    }

    public EditText getOo_machineryWorkEquipment_sdc_value() {
        return oo_machineryWorkEquipment_sdc_value;
    }

    public void setOo_machineryWorkEquipment_sdc_value(EditText oo_machineryWorkEquipment_sdc_value) {
        this.oo_machineryWorkEquipment_sdc_value = oo_machineryWorkEquipment_sdc_value;
    }

    public EditText getOo_machineryWorkEquipment_sac_value() {
        return oo_machineryWorkEquipment_sac_value;
    }

    public void setOo_machineryWorkEquipment_sac_value(EditText oo_machineryWorkEquipment_sac_value) {
        this.oo_machineryWorkEquipment_sac_value = oo_machineryWorkEquipment_sac_value;
    }

    public EditText getOo_machineryWorkEquipment_sci_value() {
        return oo_machineryWorkEquipment_sci_value;
    }

    public void setOo_machineryWorkEquipment_sci_value(EditText oo_machineryWorkEquipment_sci_value) {
        this.oo_machineryWorkEquipment_sci_value = oo_machineryWorkEquipment_sci_value;
    }

    public Spinner getOo_machineryWorkEquipment_sc_spinner() {
        return oo_machineryWorkEquipment_sc_spinner;
    }

    public void setOo_machineryWorkEquipment_sc_spinner(Spinner oo_machineryWorkEquipment_sc_spinner) {
        this.oo_machineryWorkEquipment_sc_spinner = oo_machineryWorkEquipment_sc_spinner;
    }

    public Spinner getOo_machineryWorkEquipment_tyc_spinner() {
        return oo_machineryWorkEquipment_tyc_spinner;
    }

    public void setOo_machineryWorkEquipment_tyc_spinner(Spinner oo_machineryWorkEquipment_tyc_spinner) {
        this.oo_machineryWorkEquipment_tyc_spinner = oo_machineryWorkEquipment_tyc_spinner;
    }

    public Spinner getOo_machineryWorkEquipment_sdc_spinner() {
        return oo_machineryWorkEquipment_sdc_spinner;
    }

    public void setOo_machineryWorkEquipment_sdc_spinner(Spinner oo_machineryWorkEquipment_sdc_spinner) {
        this.oo_machineryWorkEquipment_sdc_spinner = oo_machineryWorkEquipment_sdc_spinner;
    }

    public Spinner getOo_machineryWorkEquipment_sac_spinner() {
        return oo_machineryWorkEquipment_sac_spinner;
    }

    public void setOo_machineryWorkEquipment_sac_spinner(Spinner oo_machineryWorkEquipment_sac_spinner) {
        this.oo_machineryWorkEquipment_sac_spinner = oo_machineryWorkEquipment_sac_spinner;
    }

    public Spinner getOo_machineryWorkEquipment_sci_spinner() {
        return oo_machineryWorkEquipment_sci_spinner;
    }

    public void setOo_machineryWorkEquipment_sci_spinner(Spinner oo_machineryWorkEquipment_sci_spinner) {
        this.oo_machineryWorkEquipment_sci_spinner = oo_machineryWorkEquipment_sci_spinner;
    }

    public EditText getOo_machineryWorkEquipment_evidence() {
        return oo_machineryWorkEquipment_evidence;
    }

    public void setOo_machineryWorkEquipment_evidence(EditText oo_machineryWorkEquipment_evidence) {
        this.oo_machineryWorkEquipment_evidence = oo_machineryWorkEquipment_evidence;
    }

    public EditText getOo_assignedWorkTools_sc_value() {
        return oo_assignedWorkTools_sc_value;
    }

    public void setOo_assignedWorkTools_sc_value(EditText oo_assignedWorkTools_sc_value) {
        this.oo_assignedWorkTools_sc_value = oo_assignedWorkTools_sc_value;
    }

    public EditText getOo_assignedWorkTools_tyc_value() {
        return oo_assignedWorkTools_tyc_value;
    }

    public void setOo_assignedWorkTools_tyc_value(EditText oo_assignedWorkTools_tyc_value) {
        this.oo_assignedWorkTools_tyc_value = oo_assignedWorkTools_tyc_value;
    }

    public EditText getOo_assignedWorkTools_sdc_value() {
        return oo_assignedWorkTools_sdc_value;
    }

    public void setOo_assignedWorkTools_sdc_value(EditText oo_assignedWorkTools_sdc_value) {
        this.oo_assignedWorkTools_sdc_value = oo_assignedWorkTools_sdc_value;
    }

    public EditText getOo_assignedWorkTools_sac_value() {
        return oo_assignedWorkTools_sac_value;
    }

    public void setOo_assignedWorkTools_sac_value(EditText oo_assignedWorkTools_sac_value) {
        this.oo_assignedWorkTools_sac_value = oo_assignedWorkTools_sac_value;
    }

    public EditText getOo_assignedWorkTools_sci_value() {
        return oo_assignedWorkTools_sci_value;
    }

    public void setOo_assignedWorkTools_sci_value(EditText oo_assignedWorkTools_sci_value) {
        this.oo_assignedWorkTools_sci_value = oo_assignedWorkTools_sci_value;
    }

    public Spinner getOo_assignedWorkTools_sc_spinner() {
        return oo_assignedWorkTools_sc_spinner;
    }

    public void setOo_assignedWorkTools_sc_spinner(Spinner oo_assignedWorkTools_sc_spinner) {
        this.oo_assignedWorkTools_sc_spinner = oo_assignedWorkTools_sc_spinner;
    }

    public Spinner getOo_assignedWorkTools_tyc_spinner() {
        return oo_assignedWorkTools_tyc_spinner;
    }

    public void setOo_assignedWorkTools_tyc_spinner(Spinner oo_assignedWorkTools_tyc_spinner) {
        this.oo_assignedWorkTools_tyc_spinner = oo_assignedWorkTools_tyc_spinner;
    }

    public Spinner getOo_assignedWorkTools_sdc_spinner() {
        return oo_assignedWorkTools_sdc_spinner;
    }

    public void setOo_assignedWorkTools_sdc_spinner(Spinner oo_assignedWorkTools_sdc_spinner) {
        this.oo_assignedWorkTools_sdc_spinner = oo_assignedWorkTools_sdc_spinner;
    }

    public Spinner getOo_assignedWorkTools_sac_spinner() {
        return oo_assignedWorkTools_sac_spinner;
    }

    public void setOo_assignedWorkTools_sac_spinner(Spinner oo_assignedWorkTools_sac_spinner) {
        this.oo_assignedWorkTools_sac_spinner = oo_assignedWorkTools_sac_spinner;
    }

    public Spinner getOo_assignedWorkTools_sci_spinner() {
        return oo_assignedWorkTools_sci_spinner;
    }

    public void setOo_assignedWorkTools_sci_spinner(Spinner oo_assignedWorkTools_sci_spinner) {
        this.oo_assignedWorkTools_sci_spinner = oo_assignedWorkTools_sci_spinner;
    }

    public EditText getOo_assignedWorkTools_evidence() {
        return oo_assignedWorkTools_evidence;
    }

    public void setOo_assignedWorkTools_evidence(EditText oo_assignedWorkTools_evidence) {
        this.oo_assignedWorkTools_evidence = oo_assignedWorkTools_evidence;
    }

    public EditText getOo_containersWasteScrap_sc_value() {
        return oo_containersWasteScrap_sc_value;
    }

    public void setOo_containersWasteScrap_sc_value(EditText oo_containersWasteScrap_sc_value) {
        this.oo_containersWasteScrap_sc_value = oo_containersWasteScrap_sc_value;
    }

    public EditText getOo_containersWasteScrap_tyc_value() {
        return oo_containersWasteScrap_tyc_value;
    }

    public void setOo_containersWasteScrap_tyc_value(EditText oo_containersWasteScrap_tyc_value) {
        this.oo_containersWasteScrap_tyc_value = oo_containersWasteScrap_tyc_value;
    }

    public EditText getOo_containersWasteScrap_sdc_value() {
        return oo_containersWasteScrap_sdc_value;
    }

    public void setOo_containersWasteScrap_sdc_value(EditText oo_containersWasteScrap_sdc_value) {
        this.oo_containersWasteScrap_sdc_value = oo_containersWasteScrap_sdc_value;
    }

    public EditText getOo_containersWasteScrap_sac_value() {
        return oo_containersWasteScrap_sac_value;
    }

    public void setOo_containersWasteScrap_sac_value(EditText oo_containersWasteScrap_sac_value) {
        this.oo_containersWasteScrap_sac_value = oo_containersWasteScrap_sac_value;
    }

    public EditText getOo_containersWasteScrap_sci_value() {
        return oo_containersWasteScrap_sci_value;
    }

    public void setOo_containersWasteScrap_sci_value(EditText oo_containersWasteScrap_sci_value) {
        this.oo_containersWasteScrap_sci_value = oo_containersWasteScrap_sci_value;
    }

    public Spinner getOo_containersWasteScrap_sc_spinner() {
        return oo_containersWasteScrap_sc_spinner;
    }

    public void setOo_containersWasteScrap_sc_spinner(Spinner oo_containersWasteScrap_sc_spinner) {
        this.oo_containersWasteScrap_sc_spinner = oo_containersWasteScrap_sc_spinner;
    }

    public Spinner getOo_containersWasteScrap_tyc_spinner() {
        return oo_containersWasteScrap_tyc_spinner;
    }

    public void setOo_containersWasteScrap_tyc_spinner(Spinner oo_containersWasteScrap_tyc_spinner) {
        this.oo_containersWasteScrap_tyc_spinner = oo_containersWasteScrap_tyc_spinner;
    }

    public Spinner getOo_containersWasteScrap_sdc_spinner() {
        return oo_containersWasteScrap_sdc_spinner;
    }

    public void setOo_containersWasteScrap_sdc_spinner(Spinner oo_containersWasteScrap_sdc_spinner) {
        this.oo_containersWasteScrap_sdc_spinner = oo_containersWasteScrap_sdc_spinner;
    }

    public Spinner getOo_containersWasteScrap_sac_spinner() {
        return oo_containersWasteScrap_sac_spinner;
    }

    public void setOo_containersWasteScrap_sac_spinner(Spinner oo_containersWasteScrap_sac_spinner) {
        this.oo_containersWasteScrap_sac_spinner = oo_containersWasteScrap_sac_spinner;
    }

    public Spinner getOo_containersWasteScrap_sci_spinner() {
        return oo_containersWasteScrap_sci_spinner;
    }

    public void setOo_containersWasteScrap_sci_spinner(Spinner oo_containersWasteScrap_sci_spinner) {
        this.oo_containersWasteScrap_sci_spinner = oo_containersWasteScrap_sci_spinner;
    }

    public EditText getOo_containersWasteScrap_evidence() {
        return oo_containersWasteScrap_evidence;
    }

    public void setOo_containersWasteScrap_evidence(EditText oo_containersWasteScrap_evidence) {
        this.oo_containersWasteScrap_evidence = oo_containersWasteScrap_evidence;
    }

    public EditText getOo_benchesCountersWorkdeskChairs_sc_value() {
        return oo_benchesCountersWorkdeskChairs_sc_value;
    }

    public void setOo_benchesCountersWorkdeskChairs_sc_value(EditText oo_benchesCountersWorkdeskChairs_sc_value) {
        this.oo_benchesCountersWorkdeskChairs_sc_value = oo_benchesCountersWorkdeskChairs_sc_value;
    }

    public EditText getOo_benchesCountersWorkdeskChairs_tyc_value() {
        return oo_benchesCountersWorkdeskChairs_tyc_value;
    }

    public void setOo_benchesCountersWorkdeskChairs_tyc_value(EditText oo_benchesCountersWorkdeskChairs_tyc_value) {
        this.oo_benchesCountersWorkdeskChairs_tyc_value = oo_benchesCountersWorkdeskChairs_tyc_value;
    }

    public EditText getOo_benchesCountersWorkdeskChairs_sdc_value() {
        return oo_benchesCountersWorkdeskChairs_sdc_value;
    }

    public void setOo_benchesCountersWorkdeskChairs_sdc_value(EditText oo_benchesCountersWorkdeskChairs_sdc_value) {
        this.oo_benchesCountersWorkdeskChairs_sdc_value = oo_benchesCountersWorkdeskChairs_sdc_value;
    }

    public EditText getOo_benchesCountersWorkdeskChairs_sac_value() {
        return oo_benchesCountersWorkdeskChairs_sac_value;
    }

    public void setOo_benchesCountersWorkdeskChairs_sac_value(EditText oo_benchesCountersWorkdeskChairs_sac_value) {
        this.oo_benchesCountersWorkdeskChairs_sac_value = oo_benchesCountersWorkdeskChairs_sac_value;
    }

    public EditText getOo_benchesCountersWorkdeskChairs_sci_value() {
        return oo_benchesCountersWorkdeskChairs_sci_value;
    }

    public void setOo_benchesCountersWorkdeskChairs_sci_value(EditText oo_benchesCountersWorkdeskChairs_sci_value) {
        this.oo_benchesCountersWorkdeskChairs_sci_value = oo_benchesCountersWorkdeskChairs_sci_value;
    }

    public Spinner getOo_benchesCountersWorkdeskChairs_sc_spinner() {
        return oo_benchesCountersWorkdeskChairs_sc_spinner;
    }

    public void setOo_benchesCountersWorkdeskChairs_sc_spinner(Spinner oo_benchesCountersWorkdeskChairs_sc_spinner) {
        this.oo_benchesCountersWorkdeskChairs_sc_spinner = oo_benchesCountersWorkdeskChairs_sc_spinner;
    }

    public Spinner getOo_benchesCountersWorkdeskChairs_tyc_spinner() {
        return oo_benchesCountersWorkdeskChairs_tyc_spinner;
    }

    public void setOo_benchesCountersWorkdeskChairs_tyc_spinner(Spinner oo_benchesCountersWorkdeskChairs_tyc_spinner) {
        this.oo_benchesCountersWorkdeskChairs_tyc_spinner = oo_benchesCountersWorkdeskChairs_tyc_spinner;
    }

    public Spinner getOo_benchesCountersWorkdeskChairs_sdc_spinner() {
        return oo_benchesCountersWorkdeskChairs_sdc_spinner;
    }

    public void setOo_benchesCountersWorkdeskChairs_sdc_spinner(Spinner oo_benchesCountersWorkdeskChairs_sdc_spinner) {
        this.oo_benchesCountersWorkdeskChairs_sdc_spinner = oo_benchesCountersWorkdeskChairs_sdc_spinner;
    }

    public Spinner getOo_benchesCountersWorkdeskChairs_sac_spinner() {
        return oo_benchesCountersWorkdeskChairs_sac_spinner;
    }

    public void setOo_benchesCountersWorkdeskChairs_sac_spinner(Spinner oo_benchesCountersWorkdeskChairs_sac_spinner) {
        this.oo_benchesCountersWorkdeskChairs_sac_spinner = oo_benchesCountersWorkdeskChairs_sac_spinner;
    }

    public Spinner getOo_benchesCountersWorkdeskChairs_sci_spinner() {
        return oo_benchesCountersWorkdeskChairs_sci_spinner;
    }

    public void setOo_benchesCountersWorkdeskChairs_sci_spinner(Spinner oo_benchesCountersWorkdeskChairs_sci_spinner) {
        this.oo_benchesCountersWorkdeskChairs_sci_spinner = oo_benchesCountersWorkdeskChairs_sci_spinner;
    }

    public EditText getOo_benchesCountersWorkdeskChairs_evidence() {
        return oo_benchesCountersWorkdeskChairs_evidence;
    }

    public void setOo_benchesCountersWorkdeskChairs_evidence(EditText oo_benchesCountersWorkdeskChairs_evidence) {
        this.oo_benchesCountersWorkdeskChairs_evidence = oo_benchesCountersWorkdeskChairs_evidence;
    }

    public EditText getOo_shelvesShopwindowsArchivesLibraries_sc_value() {
        return oo_shelvesShopwindowsArchivesLibraries_sc_value;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sc_value(EditText oo_shelvesShopwindowsArchivesLibraries_sc_value) {
        this.oo_shelvesShopwindowsArchivesLibraries_sc_value = oo_shelvesShopwindowsArchivesLibraries_sc_value;
    }

    public EditText getOo_shelvesShopwindowsArchivesLibraries_tyc_value() {
        return oo_shelvesShopwindowsArchivesLibraries_tyc_value;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_tyc_value(EditText oo_shelvesShopwindowsArchivesLibraries_tyc_value) {
        this.oo_shelvesShopwindowsArchivesLibraries_tyc_value = oo_shelvesShopwindowsArchivesLibraries_tyc_value;
    }

    public EditText getOo_shelvesShopwindowsArchivesLibraries_sdc_value() {
        return oo_shelvesShopwindowsArchivesLibraries_sdc_value;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sdc_value(EditText oo_shelvesShopwindowsArchivesLibraries_sdc_value) {
        this.oo_shelvesShopwindowsArchivesLibraries_sdc_value = oo_shelvesShopwindowsArchivesLibraries_sdc_value;
    }

    public EditText getOo_shelvesShopwindowsArchivesLibraries_sac_value() {
        return oo_shelvesShopwindowsArchivesLibraries_sac_value;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sac_value(EditText oo_shelvesShopwindowsArchivesLibraries_sac_value) {
        this.oo_shelvesShopwindowsArchivesLibraries_sac_value = oo_shelvesShopwindowsArchivesLibraries_sac_value;
    }

    public EditText getOo_shelvesShopwindowsArchivesLibraries_sci_value() {
        return oo_shelvesShopwindowsArchivesLibraries_sci_value;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sci_value(EditText oo_shelvesShopwindowsArchivesLibraries_sci_value) {
        this.oo_shelvesShopwindowsArchivesLibraries_sci_value = oo_shelvesShopwindowsArchivesLibraries_sci_value;
    }

    public Spinner getOo_shelvesShopwindowsArchivesLibraries_sc_spinner() {
        return oo_shelvesShopwindowsArchivesLibraries_sc_spinner;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sc_spinner(Spinner oo_shelvesShopwindowsArchivesLibraries_sc_spinner) {
        this.oo_shelvesShopwindowsArchivesLibraries_sc_spinner = oo_shelvesShopwindowsArchivesLibraries_sc_spinner;
    }

    public Spinner getOo_shelvesShopwindowsArchivesLibraries_tyc_spinner() {
        return oo_shelvesShopwindowsArchivesLibraries_tyc_spinner;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_tyc_spinner(Spinner oo_shelvesShopwindowsArchivesLibraries_tyc_spinner) {
        this.oo_shelvesShopwindowsArchivesLibraries_tyc_spinner = oo_shelvesShopwindowsArchivesLibraries_tyc_spinner;
    }

    public Spinner getOo_shelvesShopwindowsArchivesLibraries_sdc_spinner() {
        return oo_shelvesShopwindowsArchivesLibraries_sdc_spinner;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sdc_spinner(Spinner oo_shelvesShopwindowsArchivesLibraries_sdc_spinner) {
        this.oo_shelvesShopwindowsArchivesLibraries_sdc_spinner = oo_shelvesShopwindowsArchivesLibraries_sdc_spinner;
    }

    public Spinner getOo_shelvesShopwindowsArchivesLibraries_sac_spinner() {
        return oo_shelvesShopwindowsArchivesLibraries_sac_spinner;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sac_spinner(Spinner oo_shelvesShopwindowsArchivesLibraries_sac_spinner) {
        this.oo_shelvesShopwindowsArchivesLibraries_sac_spinner = oo_shelvesShopwindowsArchivesLibraries_sac_spinner;
    }

    public Spinner getOo_shelvesShopwindowsArchivesLibraries_sci_spinner() {
        return oo_shelvesShopwindowsArchivesLibraries_sci_spinner;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_sci_spinner(Spinner oo_shelvesShopwindowsArchivesLibraries_sci_spinner) {
        this.oo_shelvesShopwindowsArchivesLibraries_sci_spinner = oo_shelvesShopwindowsArchivesLibraries_sci_spinner;
    }

    public EditText getOo_shelvesShopwindowsArchivesLibraries_evidence() {
        return oo_shelvesShopwindowsArchivesLibraries_evidence;
    }

    public void setOo_shelvesShopwindowsArchivesLibraries_evidence(EditText oo_shelvesShopwindowsArchivesLibraries_evidence) {
        this.oo_shelvesShopwindowsArchivesLibraries_evidence = oo_shelvesShopwindowsArchivesLibraries_evidence;
    }

    public EditText getOo_billboards_sc_value() {
        return oo_billboards_sc_value;
    }

    public void setOo_billboards_sc_value(EditText oo_billboards_sc_value) {
        this.oo_billboards_sc_value = oo_billboards_sc_value;
    }

    public EditText getOo_billboards_tyc_value() {
        return oo_billboards_tyc_value;
    }

    public void setOo_billboards_tyc_value(EditText oo_billboards_tyc_value) {
        this.oo_billboards_tyc_value = oo_billboards_tyc_value;
    }

    public EditText getOo_billboards_sdc_value() {
        return oo_billboards_sdc_value;
    }

    public void setOo_billboards_sdc_value(EditText oo_billboards_sdc_value) {
        this.oo_billboards_sdc_value = oo_billboards_sdc_value;
    }

    public EditText getOo_billboards_sac_value() {
        return oo_billboards_sac_value;
    }

    public void setOo_billboards_sac_value(EditText oo_billboards_sac_value) {
        this.oo_billboards_sac_value = oo_billboards_sac_value;
    }

    public EditText getOo_billboards_sci_value() {
        return oo_billboards_sci_value;
    }

    public void setOo_billboards_sci_value(EditText oo_billboards_sci_value) {
        this.oo_billboards_sci_value = oo_billboards_sci_value;
    }

    public Spinner getOo_billboards_sc_spinner() {
        return oo_billboards_sc_spinner;
    }

    public void setOo_billboards_sc_spinner(Spinner oo_billboards_sc_spinner) {
        this.oo_billboards_sc_spinner = oo_billboards_sc_spinner;
    }

    public Spinner getOo_billboards_tyc_spinner() {
        return oo_billboards_tyc_spinner;
    }

    public void setOo_billboards_tyc_spinner(Spinner oo_billboards_tyc_spinner) {
        this.oo_billboards_tyc_spinner = oo_billboards_tyc_spinner;
    }

    public Spinner getOo_billboards_sdc_spinner() {
        return oo_billboards_sdc_spinner;
    }

    public void setOo_billboards_sdc_spinner(Spinner oo_billboards_sdc_spinner) {
        this.oo_billboards_sdc_spinner = oo_billboards_sdc_spinner;
    }

    public Spinner getOo_billboards_sac_spinner() {
        return oo_billboards_sac_spinner;
    }

    public void setOo_billboards_sac_spinner(Spinner oo_billboards_sac_spinner) {
        this.oo_billboards_sac_spinner = oo_billboards_sac_spinner;
    }

    public Spinner getOo_billboards_sci_spinner() {
        return oo_billboards_sci_spinner;
    }

    public void setOo_billboards_sci_spinner(Spinner oo_billboards_sci_spinner) {
        this.oo_billboards_sci_spinner = oo_billboards_sci_spinner;
    }

    public EditText getOo_billboards_evidence() {
        return oo_billboards_evidence;
    }

    public void setOo_billboards_evidence(EditText oo_billboards_evidence) {
        this.oo_billboards_evidence = oo_billboards_evidence;
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

    public EditText   getVc_operationalInformationView_sc_value() {
        return vc_operationalInformation_sc_value;
    }

    public void   setVc_operationalInformationView_sc_value(EditText vc_operationalInformation_sc_value) {
        this.vc_operationalInformation_sc_value = vc_operationalInformation_sc_value;
    }

    public EditText   getVc_operationalInformationView_tyc_value() {
        return vc_operationalInformation_tyc_value;
    }

    public void   setVc_operationalInformationView_tyc_value(EditText vc_operationalInformation_tyc_value) {
        this.vc_operationalInformation_tyc_value = vc_operationalInformation_tyc_value;
    }

    public EditText   getVc_operationalInformationView_sdc_value() {
        return vc_operationalInformation_sdc_value;
    }

    public void   setVc_operationalInformationView_sdc_value(EditText vc_operationalInformation_sdc_value) {
        this.vc_operationalInformation_sdc_value = vc_operationalInformation_sdc_value;
    }

    public EditText   getVc_operationalInformationView_sac_value() {
        return vc_operationalInformation_sac_value;
    }

    public void   setVc_operationalInformationView_sac_value(EditText vc_operationalInformation_sac_value) {
        this.vc_operationalInformation_sac_value = vc_operationalInformation_sac_value;
    }

    public EditText   getVc_operationalInformationView_sci_value() {
        return vc_operationalInformation_sci_value;
    }

    public void   setVc_operationalInformationView_sci_value(EditText vc_operationalInformation_sci_value) {
        this.vc_operationalInformation_sci_value = vc_operationalInformation_sci_value;
    }

    public Spinner   getVc_operationalInformationView_sc_spinner() {
        return vc_operationalInformation_sc_spinner;
    }

    public void   setVc_operationalInformationView_sc_spinner(Spinner vc_operationalInformation_sc_spinner) {
        this.vc_operationalInformation_sc_spinner = vc_operationalInformation_sc_spinner;
    }

    public Spinner   getVc_operationalInformationView_tyc_spinner() {
        return vc_operationalInformation_tyc_spinner;
    }

    public void   setVc_operationalInformationView_tyc_spinner(Spinner vc_operationalInformation_tyc_spinner) {
        this.vc_operationalInformation_tyc_spinner = vc_operationalInformation_tyc_spinner;
    }

    public Spinner   getVc_operationalInformationView_sdc_spinner() {
        return vc_operationalInformation_sdc_spinner;
    }

    public void   setVc_operationalInformationView_sdc_spinner(Spinner vc_operationalInformation_sdc_spinner) {
        this.vc_operationalInformation_sdc_spinner = vc_operationalInformation_sdc_spinner;
    }

    public Spinner   getVc_operationalInformationView_sac_spinner() {
        return vc_operationalInformation_sac_spinner;
    }

    public void   setVc_operationalInformationView_sac_spinner(Spinner vc_operationalInformation_sac_spinner) {
        this.vc_operationalInformation_sac_spinner = vc_operationalInformation_sac_spinner;
    }

    public Spinner   getVc_operationalInformationView_sci_spinner() {
        return vc_operationalInformation_sci_spinner;
    }

    public void   setVc_operationalInformationView_sci_spinner(Spinner vc_operationalInformation_sci_spinner) {
        this.vc_operationalInformation_sci_spinner = vc_operationalInformation_sci_spinner;
    }

    public EditText   getVc_operationalInformationView_evidence() {
        return vc_operationalInformation_evidence;
    }

    public void   setVc_operationalInformationView_evidence(EditText vc_operationalInformation_evidence) {
        this.vc_operationalInformation_evidence = vc_operationalInformation_evidence;
    }

    public EditText getHpp_personalPresentation_sc_value() {
        return hpp_personalPresentation_sc_value;
    }

    public void setHpp_personalPresentation_sc_value(EditText hpp_personalPresentation_sc_value) {
        this.hpp_personalPresentation_sc_value = hpp_personalPresentation_sc_value;
    }

    public EditText getHpp_personalPresentation_tyc_value() {
        return hpp_personalPresentation_tyc_value;
    }

    public void setHpp_personalPresentation_tyc_value(EditText hpp_personalPresentation_tyc_value) {
        this.hpp_personalPresentation_tyc_value = hpp_personalPresentation_tyc_value;
    }

    public EditText getHpp_personalPresentation_sdc_value() {
        return hpp_personalPresentation_sdc_value;
    }

    public void setHpp_personalPresentation_sdc_value(EditText hpp_personalPresentation_sdc_value) {
        this.hpp_personalPresentation_sdc_value = hpp_personalPresentation_sdc_value;
    }

    public EditText getHpp_personalPresentation_sac_value() {
        return hpp_personalPresentation_sac_value;
    }

    public void setHpp_personalPresentation_sac_value(EditText hpp_personalPresentation_sac_value) {
        this.hpp_personalPresentation_sac_value = hpp_personalPresentation_sac_value;
    }

    public EditText getHpp_personalPresentation_sci_value() {
        return hpp_personalPresentation_sci_value;
    }

    public void setHpp_personalPresentation_sci_value(EditText hpp_personalPresentation_sci_value) {
        this.hpp_personalPresentation_sci_value = hpp_personalPresentation_sci_value;
    }

    public Spinner getHpp_personalPresentation_sc_spinner() {
        return hpp_personalPresentation_sc_spinner;
    }

    public void setHpp_personalPresentation_sc_spinner(Spinner hpp_personalPresentation_sc_spinner) {
        this.hpp_personalPresentation_sc_spinner = hpp_personalPresentation_sc_spinner;
    }

    public Spinner getHpp_personalPresentation_tyc_spinner() {
        return hpp_personalPresentation_tyc_spinner;
    }

    public void setHpp_personalPresentation_tyc_spinner(Spinner hpp_personalPresentation_tyc_spinner) {
        this.hpp_personalPresentation_tyc_spinner = hpp_personalPresentation_tyc_spinner;
    }

    public Spinner getHpp_personalPresentation_sdc_spinner() {
        return hpp_personalPresentation_sdc_spinner;
    }

    public void setHpp_personalPresentation_sdc_spinner(Spinner hpp_personalPresentation_sdc_spinner) {
        this.hpp_personalPresentation_sdc_spinner = hpp_personalPresentation_sdc_spinner;
    }

    public Spinner getHpp_personalPresentation_sac_spinner() {
        return hpp_personalPresentation_sac_spinner;
    }

    public void setHpp_personalPresentation_sac_spinner(Spinner hpp_personalPresentation_sac_spinner) {
        this.hpp_personalPresentation_sac_spinner = hpp_personalPresentation_sac_spinner;
    }

    public Spinner getHpp_personalPresentation_sci_spinner() {
        return hpp_personalPresentation_sci_spinner;
    }

    public void setHpp_personalPresentation_sci_spinner(Spinner hpp_personalPresentation_sci_spinner) {
        this.hpp_personalPresentation_sci_spinner = hpp_personalPresentation_sci_spinner;
    }

    public EditText getHpp_personalPresentation_evidence() {
        return hpp_personalPresentation_evidence;
    }

    public void setHpp_personalPresentation_evidence(EditText hpp_personalPresentation_evidence) {
        this.hpp_personalPresentation_evidence = hpp_personalPresentation_evidence;
    }

    public EditText getHpp_personalHygiene_sc_value() {
        return hpp_personalHygiene_sc_value;
    }

    public void setHpp_personalHygiene_sc_value(EditText hpp_personalHygiene_sc_value) {
        this.hpp_personalHygiene_sc_value = hpp_personalHygiene_sc_value;
    }

    public EditText getHpp_personalHygiene_tyc_value() {
        return hpp_personalHygiene_tyc_value;
    }

    public void setHpp_personalHygiene_tyc_value(EditText hpp_personalHygiene_tyc_value) {
        this.hpp_personalHygiene_tyc_value = hpp_personalHygiene_tyc_value;
    }

    public EditText getHpp_personalHygiene_sdc_value() {
        return hpp_personalHygiene_sdc_value;
    }

    public void setHpp_personalHygiene_sdc_value(EditText hpp_personalHygiene_sdc_value) {
        this.hpp_personalHygiene_sdc_value = hpp_personalHygiene_sdc_value;
    }

    public EditText getHpp_personalHygiene_sac_value() {
        return hpp_personalHygiene_sac_value;
    }

    public void setHpp_personalHygiene_sac_value(EditText hpp_personalHygiene_sac_value) {
        this.hpp_personalHygiene_sac_value = hpp_personalHygiene_sac_value;
    }

    public EditText getHpp_personalHygiene_sci_value() {
        return hpp_personalHygiene_sci_value;
    }

    public void setHpp_personalHygiene_sci_value(EditText hpp_personalHygiene_sci_value) {
        this.hpp_personalHygiene_sci_value = hpp_personalHygiene_sci_value;
    }

    public Spinner getHpp_personalHygiene_sc_spinner() {
        return hpp_personalHygiene_sc_spinner;
    }

    public void setHpp_personalHygiene_sc_spinner(Spinner hpp_personalHygiene_sc_spinner) {
        this.hpp_personalHygiene_sc_spinner = hpp_personalHygiene_sc_spinner;
    }

    public Spinner getHpp_personalHygiene_tyc_spinner() {
        return hpp_personalHygiene_tyc_spinner;
    }

    public void setHpp_personalHygiene_tyc_spinner(Spinner hpp_personalHygiene_tyc_spinner) {
        this.hpp_personalHygiene_tyc_spinner = hpp_personalHygiene_tyc_spinner;
    }

    public Spinner getHpp_personalHygiene_sdc_spinner() {
        return hpp_personalHygiene_sdc_spinner;
    }

    public void setHpp_personalHygiene_sdc_spinner(Spinner hpp_personalHygiene_sdc_spinner) {
        this.hpp_personalHygiene_sdc_spinner = hpp_personalHygiene_sdc_spinner;
    }

    public Spinner getHpp_personalHygiene_sac_spinner() {
        return hpp_personalHygiene_sac_spinner;
    }

    public void setHpp_personalHygiene_sac_spinner(Spinner hpp_personalHygiene_sac_spinner) {
        this.hpp_personalHygiene_sac_spinner = hpp_personalHygiene_sac_spinner;
    }

    public Spinner getHpp_personalHygiene_sci_spinner() {
        return hpp_personalHygiene_sci_spinner;
    }

    public void setHpp_personalHygiene_sci_spinner(Spinner hpp_personalHygiene_sci_spinner) {
        this.hpp_personalHygiene_sci_spinner = hpp_personalHygiene_sci_spinner;
    }

    public EditText getHpp_personalHygiene_evidence() {
        return hpp_personalHygiene_evidence;
    }

    public void setHpp_personalHygiene_evidence(EditText hpp_personalHygiene_evidence) {
        this.hpp_personalHygiene_evidence = hpp_personalHygiene_evidence;
    }

    public EditText getHpp_health_sc_value() {
        return hpp_health_sc_value;
    }

    public void setHpp_health_sc_value(EditText hpp_health_sc_value) {
        this.hpp_health_sc_value = hpp_health_sc_value;
    }

    public EditText getHpp_health_tyc_value() {
        return hpp_health_tyc_value;
    }

    public void setHpp_health_tyc_value(EditText hpp_health_tyc_value) {
        this.hpp_health_tyc_value = hpp_health_tyc_value;
    }

    public EditText getHpp_health_sdc_value() {
        return hpp_health_sdc_value;
    }

    public void setHpp_health_sdc_value(EditText hpp_health_sdc_value) {
        this.hpp_health_sdc_value = hpp_health_sdc_value;
    }

    public EditText getHpp_health_sac_value() {
        return hpp_health_sac_value;
    }

    public void setHpp_health_sac_value(EditText hpp_health_sac_value) {
        this.hpp_health_sac_value = hpp_health_sac_value;
    }

    public EditText getHpp_health_sci_value() {
        return hpp_health_sci_value;
    }

    public void setHpp_health_sci_value(EditText hpp_health_sci_value) {
        this.hpp_health_sci_value = hpp_health_sci_value;
    }

    public Spinner getHpp_health_sc_spinner() {
        return hpp_health_sc_spinner;
    }

    public void setHpp_health_sc_spinner(Spinner hpp_health_sc_spinner) {
        this.hpp_health_sc_spinner = hpp_health_sc_spinner;
    }

    public Spinner getHpp_health_tyc_spinner() {
        return hpp_health_tyc_spinner;
    }

    public void setHpp_health_tyc_spinner(Spinner hpp_health_tyc_spinner) {
        this.hpp_health_tyc_spinner = hpp_health_tyc_spinner;
    }

    public Spinner getHpp_health_sdc_spinner() {
        return hpp_health_sdc_spinner;
    }

    public void setHpp_health_sdc_spinner(Spinner hpp_health_sdc_spinner) {
        this.hpp_health_sdc_spinner = hpp_health_sdc_spinner;
    }

    public Spinner getHpp_health_sac_spinner() {
        return hpp_health_sac_spinner;
    }

    public void setHpp_health_sac_spinner(Spinner hpp_health_sac_spinner) {
        this.hpp_health_sac_spinner = hpp_health_sac_spinner;
    }

    public Spinner getHpp_health_sci_spinner() {
        return hpp_health_sci_spinner;
    }

    public void setHpp_health_sci_spinner(Spinner hpp_health_sci_spinner) {
        this.hpp_health_sci_spinner = hpp_health_sci_spinner;
    }

    public EditText getHpp_health_evidence() {
        return hpp_health_evidence;
    }

    public void setHpp_health_evidence(EditText hpp_health_evidence) {
        this.hpp_health_evidence = hpp_health_evidence;
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

    public EditText getE_classifyHazardousNonhazardousWastes_sc_value() {
        return e_classifyHazardousNonhazardousWastes_sc_value;
    }

    public void setE_classifyHazardousNonhazardousWastes_sc_value(EditText e_classifyHazardousNonhazardousWastes_sc_value) {
        this.e_classifyHazardousNonhazardousWastes_sc_value = e_classifyHazardousNonhazardousWastes_sc_value;
    }

    public EditText getE_classifyHazardousNonhazardousWastes_tyc_value() {
        return e_classifyHazardousNonhazardousWastes_tyc_value;
    }

    public void setE_classifyHazardousNonhazardousWastes_tyc_value(EditText e_classifyHazardousNonhazardousWastes_tyc_value) {
        this.e_classifyHazardousNonhazardousWastes_tyc_value = e_classifyHazardousNonhazardousWastes_tyc_value;
    }

    public EditText getE_classifyHazardousNonhazardousWastes_sdc_value() {
        return e_classifyHazardousNonhazardousWastes_sdc_value;
    }

    public void setE_classifyHazardousNonhazardousWastes_sdc_value(EditText e_classifyHazardousNonhazardousWastes_sdc_value) {
        this.e_classifyHazardousNonhazardousWastes_sdc_value = e_classifyHazardousNonhazardousWastes_sdc_value;
    }

    public EditText getE_classifyHazardousNonhazardousWastes_sac_value() {
        return e_classifyHazardousNonhazardousWastes_sac_value;
    }

    public void setE_classifyHazardousNonhazardousWastes_sac_value(EditText e_classifyHazardousNonhazardousWastes_sac_value) {
        this.e_classifyHazardousNonhazardousWastes_sac_value = e_classifyHazardousNonhazardousWastes_sac_value;
    }

    public EditText getE_classifyHazardousNonhazardousWastes_sci_value() {
        return e_classifyHazardousNonhazardousWastes_sci_value;
    }

    public void setE_classifyHazardousNonhazardousWastes_sci_value(EditText e_classifyHazardousNonhazardousWastes_sci_value) {
        this.e_classifyHazardousNonhazardousWastes_sci_value = e_classifyHazardousNonhazardousWastes_sci_value;
    }

    public Spinner getE_classifyHazardousNonhazardousWastes_sc_spinner() {
        return e_classifyHazardousNonhazardousWastes_sc_spinner;
    }

    public void setE_classifyHazardousNonhazardousWastes_sc_spinner(Spinner e_classifyHazardousNonhazardousWastes_sc_spinner) {
        this.e_classifyHazardousNonhazardousWastes_sc_spinner = e_classifyHazardousNonhazardousWastes_sc_spinner;
    }

    public Spinner getE_classifyHazardousNonhazardousWastes_tyc_spinner() {
        return e_classifyHazardousNonhazardousWastes_tyc_spinner;
    }

    public void setE_classifyHazardousNonhazardousWastes_tyc_spinner(Spinner e_classifyHazardousNonhazardousWastes_tyc_spinner) {
        this.e_classifyHazardousNonhazardousWastes_tyc_spinner = e_classifyHazardousNonhazardousWastes_tyc_spinner;
    }

    public Spinner getE_classifyHazardousNonhazardousWastes_sdc_spinner() {
        return e_classifyHazardousNonhazardousWastes_sdc_spinner;
    }

    public void setE_classifyHazardousNonhazardousWastes_sdc_spinner(Spinner e_classifyHazardousNonhazardousWastes_sdc_spinner) {
        this.e_classifyHazardousNonhazardousWastes_sdc_spinner = e_classifyHazardousNonhazardousWastes_sdc_spinner;
    }

    public Spinner getE_classifyHazardousNonhazardousWastes_sac_spinner() {
        return e_classifyHazardousNonhazardousWastes_sac_spinner;
    }

    public void setE_classifyHazardousNonhazardousWastes_sac_spinner(Spinner e_classifyHazardousNonhazardousWastes_sac_spinner) {
        this.e_classifyHazardousNonhazardousWastes_sac_spinner = e_classifyHazardousNonhazardousWastes_sac_spinner;
    }

    public Spinner getE_classifyHazardousNonhazardousWastes_sci_spinner() {
        return e_classifyHazardousNonhazardousWastes_sci_spinner;
    }

    public void setE_classifyHazardousNonhazardousWastes_sci_spinner(Spinner e_classifyHazardousNonhazardousWastes_sci_spinner) {
        this.e_classifyHazardousNonhazardousWastes_sci_spinner = e_classifyHazardousNonhazardousWastes_sci_spinner;
    }

    public EditText getE_classifyHazardousNonhazardousWastes_evidence() {
        return e_classifyHazardousNonhazardousWastes_evidence;
    }

    public void setE_classifyHazardousNonhazardousWastes_evidence(EditText e_classifyHazardousNonhazardousWastes_evidence) {
        this.e_classifyHazardousNonhazardousWastes_evidence = e_classifyHazardousNonhazardousWastes_evidence;
    }

    public EditText getE_classifyContainersHazardousNonhazardousWaste_sc_value() {
        return e_classifyContainersHazardousNonhazardousWaste_sc_value;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sc_value(EditText e_classifyContainersHazardousNonhazardousWaste_sc_value) {
        this.e_classifyContainersHazardousNonhazardousWaste_sc_value = e_classifyContainersHazardousNonhazardousWaste_sc_value;
    }

    public EditText getE_classifyContainersHazardousNonhazardousWaste_tyc_value() {
        return e_classifyContainersHazardousNonhazardousWaste_tyc_value;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_tyc_value(EditText e_classifyContainersHazardousNonhazardousWaste_tyc_value) {
        this.e_classifyContainersHazardousNonhazardousWaste_tyc_value = e_classifyContainersHazardousNonhazardousWaste_tyc_value;
    }

    public EditText getE_classifyContainersHazardousNonhazardousWaste_sdc_value() {
        return e_classifyContainersHazardousNonhazardousWaste_sdc_value;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sdc_value(EditText e_classifyContainersHazardousNonhazardousWaste_sdc_value) {
        this.e_classifyContainersHazardousNonhazardousWaste_sdc_value = e_classifyContainersHazardousNonhazardousWaste_sdc_value;
    }

    public EditText getE_classifyContainersHazardousNonhazardousWaste_sac_value() {
        return e_classifyContainersHazardousNonhazardousWaste_sac_value;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sac_value(EditText e_classifyContainersHazardousNonhazardousWaste_sac_value) {
        this.e_classifyContainersHazardousNonhazardousWaste_sac_value = e_classifyContainersHazardousNonhazardousWaste_sac_value;
    }

    public EditText getE_classifyContainersHazardousNonhazardousWaste_sci_value() {
        return e_classifyContainersHazardousNonhazardousWaste_sci_value;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sci_value(EditText e_classifyContainersHazardousNonhazardousWaste_sci_value) {
        this.e_classifyContainersHazardousNonhazardousWaste_sci_value = e_classifyContainersHazardousNonhazardousWaste_sci_value;
    }

    public Spinner getE_classifyContainersHazardousNonhazardousWaste_sc_spinner() {
        return e_classifyContainersHazardousNonhazardousWaste_sc_spinner;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sc_spinner(Spinner e_classifyContainersHazardousNonhazardousWaste_sc_spinner) {
        this.e_classifyContainersHazardousNonhazardousWaste_sc_spinner = e_classifyContainersHazardousNonhazardousWaste_sc_spinner;
    }

    public Spinner getE_classifyContainersHazardousNonhazardousWaste_tyc_spinner() {
        return e_classifyContainersHazardousNonhazardousWaste_tyc_spinner;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_tyc_spinner(Spinner e_classifyContainersHazardousNonhazardousWaste_tyc_spinner) {
        this.e_classifyContainersHazardousNonhazardousWaste_tyc_spinner = e_classifyContainersHazardousNonhazardousWaste_tyc_spinner;
    }

    public Spinner getE_classifyContainersHazardousNonhazardousWaste_sdc_spinner() {
        return e_classifyContainersHazardousNonhazardousWaste_sdc_spinner;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sdc_spinner(Spinner e_classifyContainersHazardousNonhazardousWaste_sdc_spinner) {
        this.e_classifyContainersHazardousNonhazardousWaste_sdc_spinner = e_classifyContainersHazardousNonhazardousWaste_sdc_spinner;
    }

    public Spinner getE_classifyContainersHazardousNonhazardousWaste_sac_spinner() {
        return e_classifyContainersHazardousNonhazardousWaste_sac_spinner;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sac_spinner(Spinner e_classifyContainersHazardousNonhazardousWaste_sac_spinner) {
        this.e_classifyContainersHazardousNonhazardousWaste_sac_spinner = e_classifyContainersHazardousNonhazardousWaste_sac_spinner;
    }

    public Spinner getE_classifyContainersHazardousNonhazardousWaste_sci_spinner() {
        return e_classifyContainersHazardousNonhazardousWaste_sci_spinner;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_sci_spinner(Spinner e_classifyContainersHazardousNonhazardousWaste_sci_spinner) {
        this.e_classifyContainersHazardousNonhazardousWaste_sci_spinner = e_classifyContainersHazardousNonhazardousWaste_sci_spinner;
    }

    public EditText getE_classifyContainersHazardousNonhazardousWaste_evidence() {
        return e_classifyContainersHazardousNonhazardousWaste_evidence;
    }

    public void setE_classifyContainersHazardousNonhazardousWaste_evidence(EditText e_classifyContainersHazardousNonhazardousWaste_evidence) {
        this.e_classifyContainersHazardousNonhazardousWaste_evidence = e_classifyContainersHazardousNonhazardousWaste_evidence;
    }

    public EditText getE_disposalStorageHandling_sc_value() {
        return e_disposalStorageHandling_sc_value;
    }

    public void setE_disposalStorageHandling_sc_value(EditText e_disposalStorageHandling_sc_value) {
        this.e_disposalStorageHandling_sc_value = e_disposalStorageHandling_sc_value;
    }

    public EditText getE_disposalStorageHandling_tyc_value() {
        return e_disposalStorageHandling_tyc_value;
    }

    public void setE_disposalStorageHandling_tyc_value(EditText e_disposalStorageHandling_tyc_value) {
        this.e_disposalStorageHandling_tyc_value = e_disposalStorageHandling_tyc_value;
    }

    public EditText getE_disposalStorageHandling_sdc_value() {
        return e_disposalStorageHandling_sdc_value;
    }

    public void setE_disposalStorageHandling_sdc_value(EditText e_disposalStorageHandling_sdc_value) {
        this.e_disposalStorageHandling_sdc_value = e_disposalStorageHandling_sdc_value;
    }

    public EditText getE_disposalStorageHandling_sac_value() {
        return e_disposalStorageHandling_sac_value;
    }

    public void setE_disposalStorageHandling_sac_value(EditText e_disposalStorageHandling_sac_value) {
        this.e_disposalStorageHandling_sac_value = e_disposalStorageHandling_sac_value;
    }

    public EditText getE_disposalStorageHandling_sci_value() {
        return e_disposalStorageHandling_sci_value;
    }

    public void setE_disposalStorageHandling_sci_value(EditText e_disposalStorageHandling_sci_value) {
        this.e_disposalStorageHandling_sci_value = e_disposalStorageHandling_sci_value;
    }

    public Spinner getE_disposalStorageHandling_sc_spinner() {
        return e_disposalStorageHandling_sc_spinner;
    }

    public void setE_disposalStorageHandling_sc_spinner(Spinner e_disposalStorageHandling_sc_spinner) {
        this.e_disposalStorageHandling_sc_spinner = e_disposalStorageHandling_sc_spinner;
    }

    public Spinner getE_disposalStorageHandling_tyc_spinner() {
        return e_disposalStorageHandling_tyc_spinner;
    }

    public void setE_disposalStorageHandling_tyc_spinner(Spinner e_disposalStorageHandling_tyc_spinner) {
        this.e_disposalStorageHandling_tyc_spinner = e_disposalStorageHandling_tyc_spinner;
    }

    public Spinner getE_disposalStorageHandling_sdc_spinner() {
        return e_disposalStorageHandling_sdc_spinner;
    }

    public void setE_disposalStorageHandling_sdc_spinner(Spinner e_disposalStorageHandling_sdc_spinner) {
        this.e_disposalStorageHandling_sdc_spinner = e_disposalStorageHandling_sdc_spinner;
    }

    public Spinner getE_disposalStorageHandling_sac_spinner() {
        return e_disposalStorageHandling_sac_spinner;
    }

    public void setE_disposalStorageHandling_sac_spinner(Spinner e_disposalStorageHandling_sac_spinner) {
        this.e_disposalStorageHandling_sac_spinner = e_disposalStorageHandling_sac_spinner;
    }

    public Spinner getE_disposalStorageHandling_sci_spinner() {
        return e_disposalStorageHandling_sci_spinner;
    }

    public void setE_disposalStorageHandling_sci_spinner(Spinner e_disposalStorageHandling_sci_spinner) {
        this.e_disposalStorageHandling_sci_spinner = e_disposalStorageHandling_sci_spinner;
    }

    public EditText getE_disposalStorageHandling_evidence() {
        return e_disposalStorageHandling_evidence;
    }

    public void setE_disposalStorageHandling_evidence(EditText e_disposalStorageHandling_evidence) {
        this.e_disposalStorageHandling_evidence = e_disposalStorageHandling_evidence;
    }

    public EditText getE_controlEmissionsEffluents_sc_value() {
        return e_controlEmissionsEffluents_sc_value;
    }

    public void setE_controlEmissionsEffluents_sc_value(EditText e_controlEmissionsEffluents_sc_value) {
        this.e_controlEmissionsEffluents_sc_value = e_controlEmissionsEffluents_sc_value;
    }

    public EditText getE_controlEmissionsEffluents_tyc_value() {
        return e_controlEmissionsEffluents_tyc_value;
    }

    public void setE_controlEmissionsEffluents_tyc_value(EditText e_controlEmissionsEffluents_tyc_value) {
        this.e_controlEmissionsEffluents_tyc_value = e_controlEmissionsEffluents_tyc_value;
    }

    public EditText getE_controlEmissionsEffluents_sdc_value() {
        return e_controlEmissionsEffluents_sdc_value;
    }

    public void setE_controlEmissionsEffluents_sdc_value(EditText e_controlEmissionsEffluents_sdc_value) {
        this.e_controlEmissionsEffluents_sdc_value = e_controlEmissionsEffluents_sdc_value;
    }

    public EditText getE_controlEmissionsEffluents_sac_value() {
        return e_controlEmissionsEffluents_sac_value;
    }

    public void setE_controlEmissionsEffluents_sac_value(EditText e_controlEmissionsEffluents_sac_value) {
        this.e_controlEmissionsEffluents_sac_value = e_controlEmissionsEffluents_sac_value;
    }

    public EditText getE_controlEmissionsEffluents_sci_value() {
        return e_controlEmissionsEffluents_sci_value;
    }

    public void setE_controlEmissionsEffluents_sci_value(EditText e_controlEmissionsEffluents_sci_value) {
        this.e_controlEmissionsEffluents_sci_value = e_controlEmissionsEffluents_sci_value;
    }

    public Spinner getE_controlEmissionsEffluents_sc_spinner() {
        return e_controlEmissionsEffluents_sc_spinner;
    }

    public void setE_controlEmissionsEffluents_sc_spinner(Spinner e_controlEmissionsEffluents_sc_spinner) {
        this.e_controlEmissionsEffluents_sc_spinner = e_controlEmissionsEffluents_sc_spinner;
    }

    public Spinner getE_controlEmissionsEffluents_tyc_spinner() {
        return e_controlEmissionsEffluents_tyc_spinner;
    }

    public void setE_controlEmissionsEffluents_tyc_spinner(Spinner e_controlEmissionsEffluents_tyc_spinner) {
        this.e_controlEmissionsEffluents_tyc_spinner = e_controlEmissionsEffluents_tyc_spinner;
    }

    public Spinner getE_controlEmissionsEffluents_sdc_spinner() {
        return e_controlEmissionsEffluents_sdc_spinner;
    }

    public void setE_controlEmissionsEffluents_sdc_spinner(Spinner e_controlEmissionsEffluents_sdc_spinner) {
        this.e_controlEmissionsEffluents_sdc_spinner = e_controlEmissionsEffluents_sdc_spinner;
    }

    public Spinner getE_controlEmissionsEffluents_sac_spinner() {
        return e_controlEmissionsEffluents_sac_spinner;
    }

    public void setE_controlEmissionsEffluents_sac_spinner(Spinner e_controlEmissionsEffluents_sac_spinner) {
        this.e_controlEmissionsEffluents_sac_spinner = e_controlEmissionsEffluents_sac_spinner;
    }

    public Spinner getE_controlEmissionsEffluents_sci_spinner() {
        return e_controlEmissionsEffluents_sci_spinner;
    }

    public void setE_controlEmissionsEffluents_sci_spinner(Spinner e_controlEmissionsEffluents_sci_spinner) {
        this.e_controlEmissionsEffluents_sci_spinner = e_controlEmissionsEffluents_sci_spinner;
    }

    public EditText getE_controlEmissionsEffluents_evidence() {
        return e_controlEmissionsEffluents_evidence;
    }

    public void setE_controlEmissionsEffluents_evidence(EditText e_controlEmissionsEffluents_evidence) {
        this.e_controlEmissionsEffluents_evidence = e_controlEmissionsEffluents_evidence;
    }

    public EditText getE_rationalUseWater_sc_value() {
        return e_rationalUseWater_sc_value;
    }

    public void setE_rationalUseWater_sc_value(EditText e_rationalUseWater_sc_value) {
        this.e_rationalUseWater_sc_value = e_rationalUseWater_sc_value;
    }

    public EditText getE_rationalUseWater_tyc_value() {
        return e_rationalUseWater_tyc_value;
    }

    public void setE_rationalUseWater_tyc_value(EditText e_rationalUseWater_tyc_value) {
        this.e_rationalUseWater_tyc_value = e_rationalUseWater_tyc_value;
    }

    public EditText getE_rationalUseWater_sdc_value() {
        return e_rationalUseWater_sdc_value;
    }

    public void setE_rationalUseWater_sdc_value(EditText e_rationalUseWater_sdc_value) {
        this.e_rationalUseWater_sdc_value = e_rationalUseWater_sdc_value;
    }

    public EditText getE_rationalUseWater_sac_value() {
        return e_rationalUseWater_sac_value;
    }

    public void setE_rationalUseWater_sac_value(EditText e_rationalUseWater_sac_value) {
        this.e_rationalUseWater_sac_value = e_rationalUseWater_sac_value;
    }

    public EditText getE_rationalUseWater_sci_value() {
        return e_rationalUseWater_sci_value;
    }

    public void setE_rationalUseWater_sci_value(EditText e_rationalUseWater_sci_value) {
        this.e_rationalUseWater_sci_value = e_rationalUseWater_sci_value;
    }

    public Spinner getE_rationalUseWater_sc_spinner() {
        return e_rationalUseWater_sc_spinner;
    }

    public void setE_rationalUseWater_sc_spinner(Spinner e_rationalUseWater_sc_spinner) {
        this.e_rationalUseWater_sc_spinner = e_rationalUseWater_sc_spinner;
    }

    public Spinner getE_rationalUseWater_tyc_spinner() {
        return e_rationalUseWater_tyc_spinner;
    }

    public void setE_rationalUseWater_tyc_spinner(Spinner e_rationalUseWater_tyc_spinner) {
        this.e_rationalUseWater_tyc_spinner = e_rationalUseWater_tyc_spinner;
    }

    public Spinner getE_rationalUseWater_sdc_spinner() {
        return e_rationalUseWater_sdc_spinner;
    }

    public void setE_rationalUseWater_sdc_spinner(Spinner e_rationalUseWater_sdc_spinner) {
        this.e_rationalUseWater_sdc_spinner = e_rationalUseWater_sdc_spinner;
    }

    public Spinner getE_rationalUseWater_sac_spinner() {
        return e_rationalUseWater_sac_spinner;
    }

    public void setE_rationalUseWater_sac_spinner(Spinner e_rationalUseWater_sac_spinner) {
        this.e_rationalUseWater_sac_spinner = e_rationalUseWater_sac_spinner;
    }

    public Spinner getE_rationalUseWater_sci_spinner() {
        return e_rationalUseWater_sci_spinner;
    }

    public void setE_rationalUseWater_sci_spinner(Spinner e_rationalUseWater_sci_spinner) {
        this.e_rationalUseWater_sci_spinner = e_rationalUseWater_sci_spinner;
    }

    public EditText getE_rationalUseWater_evidence() {
        return e_rationalUseWater_evidence;
    }

    public void setE_rationalUseWater_evidence(EditText e_rationalUseWater_evidence) {
        this.e_rationalUseWater_evidence = e_rationalUseWater_evidence;
    }

    public EditText getE_rationalUselight_sc_value() {
        return e_rationalUselight_sc_value;
    }

    public void setE_rationalUselight_sc_value(EditText e_rationalUselight_sc_value) {
        this.e_rationalUselight_sc_value = e_rationalUselight_sc_value;
    }

    public EditText getE_rationalUselight_tyc_value() {
        return e_rationalUselight_tyc_value;
    }

    public void setE_rationalUselight_tyc_value(EditText e_rationalUselight_tyc_value) {
        this.e_rationalUselight_tyc_value = e_rationalUselight_tyc_value;
    }

    public EditText getE_rationalUselight_sdc_value() {
        return e_rationalUselight_sdc_value;
    }

    public void setE_rationalUselight_sdc_value(EditText e_rationalUselight_sdc_value) {
        this.e_rationalUselight_sdc_value = e_rationalUselight_sdc_value;
    }

    public EditText getE_rationalUselight_sac_value() {
        return e_rationalUselight_sac_value;
    }

    public void setE_rationalUselight_sac_value(EditText e_rationalUselight_sac_value) {
        this.e_rationalUselight_sac_value = e_rationalUselight_sac_value;
    }

    public EditText getE_rationalUselight_sci_value() {
        return e_rationalUselight_sci_value;
    }

    public void setE_rationalUselight_sci_value(EditText e_rationalUselight_sci_value) {
        this.e_rationalUselight_sci_value = e_rationalUselight_sci_value;
    }

    public Spinner getE_rationalUselight_sc_spinner() {
        return e_rationalUselight_sc_spinner;
    }

    public void setE_rationalUselight_sc_spinner(Spinner e_rationalUselight_sc_spinner) {
        this.e_rationalUselight_sc_spinner = e_rationalUselight_sc_spinner;
    }

    public Spinner getE_rationalUselight_tyc_spinner() {
        return e_rationalUselight_tyc_spinner;
    }

    public void setE_rationalUselight_tyc_spinner(Spinner e_rationalUselight_tyc_spinner) {
        this.e_rationalUselight_tyc_spinner = e_rationalUselight_tyc_spinner;
    }

    public Spinner getE_rationalUselight_sdc_spinner() {
        return e_rationalUselight_sdc_spinner;
    }

    public void setE_rationalUselight_sdc_spinner(Spinner e_rationalUselight_sdc_spinner) {
        this.e_rationalUselight_sdc_spinner = e_rationalUselight_sdc_spinner;
    }

    public Spinner getE_rationalUselight_sac_spinner() {
        return e_rationalUselight_sac_spinner;
    }

    public void setE_rationalUselight_sac_spinner(Spinner e_rationalUselight_sac_spinner) {
        this.e_rationalUselight_sac_spinner = e_rationalUselight_sac_spinner;
    }

    public Spinner getE_rationalUselight_sci_spinner() {
        return e_rationalUselight_sci_spinner;
    }

    public void setE_rationalUselight_sci_spinner(Spinner e_rationalUselight_sci_spinner) {
        this.e_rationalUselight_sci_spinner = e_rationalUselight_sci_spinner;
    }

    public EditText getE_rationalUselight_evidence() {
        return e_rationalUselight_evidence;
    }

    public void setE_rationalUselight_evidence(EditText e_rationalUselight_evidence) {
        this.e_rationalUselight_evidence = e_rationalUselight_evidence;
    }

    public EditText getE_noiseControl_sc_value() {
        return e_noiseControl_sc_value;
    }

    public void setE_noiseControl_sc_value(EditText e_noiseControl_sc_value) {
        this.e_noiseControl_sc_value = e_noiseControl_sc_value;
    }

    public EditText getE_noiseControl_tyc_value() {
        return e_noiseControl_tyc_value;
    }

    public void setE_noiseControl_tyc_value(EditText e_noiseControl_tyc_value) {
        this.e_noiseControl_tyc_value = e_noiseControl_tyc_value;
    }

    public EditText getE_noiseControl_sdc_value() {
        return e_noiseControl_sdc_value;
    }

    public void setE_noiseControl_sdc_value(EditText e_noiseControl_sdc_value) {
        this.e_noiseControl_sdc_value = e_noiseControl_sdc_value;
    }

    public EditText getE_noiseControl_sac_value() {
        return e_noiseControl_sac_value;
    }

    public void setE_noiseControl_sac_value(EditText e_noiseControl_sac_value) {
        this.e_noiseControl_sac_value = e_noiseControl_sac_value;
    }

    public EditText getE_noiseControl_sci_value() {
        return e_noiseControl_sci_value;
    }

    public void setE_noiseControl_sci_value(EditText e_noiseControl_sci_value) {
        this.e_noiseControl_sci_value = e_noiseControl_sci_value;
    }

    public Spinner getE_noiseControl_sc_spinner() {
        return e_noiseControl_sc_spinner;
    }

    public void setE_noiseControl_sc_spinner(Spinner e_noiseControl_sc_spinner) {
        this.e_noiseControl_sc_spinner = e_noiseControl_sc_spinner;
    }

    public Spinner getE_noiseControl_tyc_spinner() {
        return e_noiseControl_tyc_spinner;
    }

    public void setE_noiseControl_tyc_spinner(Spinner e_noiseControl_tyc_spinner) {
        this.e_noiseControl_tyc_spinner = e_noiseControl_tyc_spinner;
    }

    public Spinner getE_noiseControl_sdc_spinner() {
        return e_noiseControl_sdc_spinner;
    }

    public void setE_noiseControl_sdc_spinner(Spinner e_noiseControl_sdc_spinner) {
        this.e_noiseControl_sdc_spinner = e_noiseControl_sdc_spinner;
    }

    public Spinner getE_noiseControl_sac_spinner() {
        return e_noiseControl_sac_spinner;
    }

    public void setE_noiseControl_sac_spinner(Spinner e_noiseControl_sac_spinner) {
        this.e_noiseControl_sac_spinner = e_noiseControl_sac_spinner;
    }

    public Spinner getE_noiseControl_sci_spinner() {
        return e_noiseControl_sci_spinner;
    }

    public void setE_noiseControl_sci_spinner(Spinner e_noiseControl_sci_spinner) {
        this.e_noiseControl_sci_spinner = e_noiseControl_sci_spinner;
    }

    public EditText getE_noiseControl_evidence() {
        return e_noiseControl_evidence;
    }

    public void setE_noiseControl_evidence(EditText e_noiseControl_evidence) {
        this.e_noiseControl_evidence = e_noiseControl_evidence;
    }

    public EditText getE_ProtectionGreenAreas_sc_value() {
        return e_ProtectionGreenAreas_sc_value;
    }

    public void setE_ProtectionGreenAreas_sc_value(EditText e_ProtectionGreenAreas_sc_value) {
        this.e_ProtectionGreenAreas_sc_value = e_ProtectionGreenAreas_sc_value;
    }

    public EditText getE_ProtectionGreenAreas_tyc_value() {
        return e_ProtectionGreenAreas_tyc_value;
    }

    public void setE_ProtectionGreenAreas_tyc_value(EditText e_ProtectionGreenAreas_tyc_value) {
        this.e_ProtectionGreenAreas_tyc_value = e_ProtectionGreenAreas_tyc_value;
    }

    public EditText getE_ProtectionGreenAreas_sdc_value() {
        return e_ProtectionGreenAreas_sdc_value;
    }

    public void setE_ProtectionGreenAreas_sdc_value(EditText e_ProtectionGreenAreas_sdc_value) {
        this.e_ProtectionGreenAreas_sdc_value = e_ProtectionGreenAreas_sdc_value;
    }

    public EditText getE_ProtectionGreenAreas_sac_value() {
        return e_ProtectionGreenAreas_sac_value;
    }

    public void setE_ProtectionGreenAreas_sac_value(EditText e_ProtectionGreenAreas_sac_value) {
        this.e_ProtectionGreenAreas_sac_value = e_ProtectionGreenAreas_sac_value;
    }

    public EditText getE_ProtectionGreenAreas_sci_value() {
        return e_ProtectionGreenAreas_sci_value;
    }

    public void setE_ProtectionGreenAreas_sci_value(EditText e_ProtectionGreenAreas_sci_value) {
        this.e_ProtectionGreenAreas_sci_value = e_ProtectionGreenAreas_sci_value;
    }

    public Spinner getE_ProtectionGreenAreas_sc_spinner() {
        return e_ProtectionGreenAreas_sc_spinner;
    }

    public void setE_ProtectionGreenAreas_sc_spinner(Spinner e_ProtectionGreenAreas_sc_spinner) {
        this.e_ProtectionGreenAreas_sc_spinner = e_ProtectionGreenAreas_sc_spinner;
    }

    public Spinner getE_ProtectionGreenAreas_tyc_spinner() {
        return e_ProtectionGreenAreas_tyc_spinner;
    }

    public void setE_ProtectionGreenAreas_tyc_spinner(Spinner e_ProtectionGreenAreas_tyc_spinner) {
        this.e_ProtectionGreenAreas_tyc_spinner = e_ProtectionGreenAreas_tyc_spinner;
    }

    public Spinner getE_ProtectionGreenAreas_sdc_spinner() {
        return e_ProtectionGreenAreas_sdc_spinner;
    }

    public void setE_ProtectionGreenAreas_sdc_spinner(Spinner e_ProtectionGreenAreas_sdc_spinner) {
        this.e_ProtectionGreenAreas_sdc_spinner = e_ProtectionGreenAreas_sdc_spinner;
    }

    public Spinner getE_ProtectionGreenAreas_sac_spinner() {
        return e_ProtectionGreenAreas_sac_spinner;
    }

    public void setE_ProtectionGreenAreas_sac_spinner(Spinner e_ProtectionGreenAreas_sac_spinner) {
        this.e_ProtectionGreenAreas_sac_spinner = e_ProtectionGreenAreas_sac_spinner;
    }

    public Spinner getE_ProtectionGreenAreas_sci_spinner() {
        return e_ProtectionGreenAreas_sci_spinner;
    }

    public void setE_ProtectionGreenAreas_sci_spinner(Spinner e_ProtectionGreenAreas_sci_spinner) {
        this.e_ProtectionGreenAreas_sci_spinner = e_ProtectionGreenAreas_sci_spinner;
    }

    public EditText getE_ProtectionGreenAreas_evidence() {
        return e_ProtectionGreenAreas_evidence;
    }

    public void setE_ProtectionGreenAreas_evidence(EditText e_ProtectionGreenAreas_evidence) {
        this.e_ProtectionGreenAreas_evidence = e_ProtectionGreenAreas_evidence;
    }

    public View getC_doorsView() {
        return c_doorsView;
    }

    public void setC_doorsView(View c_doorsView) {
        this.c_doorsView = c_doorsView;
    }

    public View getC_floorView() {
        return c_floorView;
    }

    public void setC_floorView(View c_floorView) {
        this.c_floorView = c_floorView;
    }

    public View getC_extractorsView() {
        return c_extractorsView;
    }

    public void setC_extractorsView(View c_extractorsView) {
        this.c_extractorsView = c_extractorsView;
    }

    public View getC_wallsView() {
        return c_wallsView;
    }

    public void setC_wallsView(View c_wallsView) {
        this.c_wallsView = c_wallsView;
    }

    public View getC_windowsVentilationsBlocksView() {
        return c_windowsVentilationsBlocksView;
    }

    public void setC_windowsVentilationsBlocksView(View c_windowsVentilationsBlocksView) {
        this.c_windowsVentilationsBlocksView = c_windowsVentilationsBlocksView;
    }

    public View getC_luminairesView() {
        return c_luminairesView;
    }

    public void setC_luminairesView(View c_luminairesView) {
        this.c_luminairesView = c_luminairesView;
    }

    public View getC_sanitationView() {
        return c_sanitationView;
    }

    public void setC_sanitationView(View c_sanitationPersonalPresentationView) {
        this.c_sanitationView = c_sanitationPersonalPresentationView;
    }

    public View getC_handWashingStationView() {
        return c_handWashingStationView;
    }

    public void setC_handWashingStationView(View c_handWashingStationView) {
        this.c_handWashingStationView = c_handWashingStationView;
    }

    public View getC_drainageView() {
        return c_drainageView;
    }

    public void setC_drainageView(View c_drainageView) {
        this.c_drainageView = c_drainageView;
    }

    public View getOo_machineryWorkEquipmentView() {
        return oo_machineryWorkEquipmentView;
    }

    public void setOo_machineryWorkEquipmentView(View oo_machineryWorkEquipmentView) {
        this.oo_machineryWorkEquipmentView = oo_machineryWorkEquipmentView;
    }

    public View getOo_assignedWorkToolsView() {
        return oo_assignedWorkToolsView;
    }

    public void setOo_assignedWorkToolsView(View oo_assignedWorkToolsView) {
        this.oo_assignedWorkToolsView = oo_assignedWorkToolsView;
    }

    public View getOo_containersWasteScrapView() {
        return oo_containersWasteScrapView;
    }

    public void setOo_containersWasteScrapView(View oo_containersWasteScrapView) {
        this.oo_containersWasteScrapView = oo_containersWasteScrapView;
    }

    public View getOo_benchesCountersWorkdesksChairsView() {
        return oo_benchesCountersWorkdesksChairsView;
    }

    public void setOo_benchesCountersWorkdesksChairsView(View oo_benchesCountersWorkdesksChairsView) {
        this.oo_benchesCountersWorkdesksChairsView = oo_benchesCountersWorkdesksChairsView;
    }

    public View getOo_shelvesShopwindowsArchivesLibrariesView() {
        return oo_shelvesShopwindowsArchivesLibrariesView;
    }

    public void setOo_shelvesShopwindowsArchivesLibrariesView(View oo_shelvesShopwindowsArchivesLibrariesView) {
        this.oo_shelvesShopwindowsArchivesLibrariesView = oo_shelvesShopwindowsArchivesLibrariesView;
    }

    public View getOo_billboardsView() {
        return oo_billboardsView;
    }

    public void setOo_billboardsView(View oo_billboardsView) {
        this.oo_billboardsView = oo_billboardsView;
    }

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

    public View   getVc_operationalInformationView() {
        return vc_operationalInformationView;
    }

    public void   setVc_operationalInformationView(View vc_operationalInformationView) {
        this.vc_operationalInformationView = vc_operationalInformationView;
    }

    public View getHpp_personalPresentationView() {
        return hpp_personalPresentationView;
    }

    public void setHpp_personalPresentationView(View hpp_personalPresentationView) {
        this.hpp_personalPresentationView = hpp_personalPresentationView;
    }

    public View getHpp_personalHygieneView() {
        return hpp_personalHygieneView;
    }

    public void setHpp_personalHygieneView(View hpp_personalHygieneView) {
        this.hpp_personalHygieneView = hpp_personalHygieneView;
    }

    public View getHpp_healthView() {
        return hpp_healthView;
    }

    public void setHpp_healthView(View hpp_healthView) {
        this.hpp_healthView = hpp_healthView;
    }

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

    public void setS_evacuationMapView(View s_evaluationMapView) {
        this.s_evacuationMapView = s_evaluationMapView;
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

    public View getE_classifyHazardousNonhazardousWastesView() {
        return e_classifyHazardousNonhazardousWastesView;
    }

    public void setE_classifyHazardousNonhazardousWastesView(View e_classifyHazardousNonhazardousWastesView) {
        this.e_classifyHazardousNonhazardousWastesView = e_classifyHazardousNonhazardousWastesView;
    }

    public View getE_classifyContainersHazardousNonhazardousWasteView() {
        return e_classifyContainersHazardousNonhazardousWasteView;
    }

    public void setE_classifyContainersHazardousNonhazardousWasteView(View e_classifyContainersHazardousNonhazardousWasteView) {
        this.e_classifyContainersHazardousNonhazardousWasteView = e_classifyContainersHazardousNonhazardousWasteView;
    }

    public View getE_disposalStorageHandlingView() {
        return e_disposalStorageHandlingView;
    }

    public void setE_disposalStorageHandlingView(View e_disposalStorageHandlingView) {
        this.e_disposalStorageHandlingView = e_disposalStorageHandlingView;
    }

    public View getE_controlEmissionsEffluentsView() {
        return e_controlEmissionsEffluentsView;
    }

    public void setE_controlEmissionsEffluentsView(View e_controlEmissionsEffluentsView) {
        this.e_controlEmissionsEffluentsView = e_controlEmissionsEffluentsView;
    }

    public View getE_rationalUseWaterView() {
        return e_rationalUseWaterView;
    }

    public void setE_rationalUseWaterView(View e_rationalUseWaterView) {
        this.e_rationalUseWaterView = e_rationalUseWaterView;
    }

    public View getE_rationalUselightView() {
        return e_rationalUselightView;
    }

    public void setE_rationalUselightView(View e_rationalUselightView) {
        this.e_rationalUselightView = e_rationalUselightView;
    }

    public View getE_noiseControlView() {
        return e_noiseControlView;
    }

    public void setE_noiseControlView(View e_noiseControlView) {
        this.e_noiseControlView = e_noiseControlView;
    }

    public View getE_ProtectionGreenAreasView() {
        return e_ProtectionGreenAreasView;
    }

    public void setE_ProtectionGreenAreasView(View e_ProtectionGreenAreasView) {
        this.e_ProtectionGreenAreasView = e_ProtectionGreenAreasView;
    }

    // urls to load navigation header background image
    // and profile image
    private static final String urlNavHeaderBg = "http://api.androidhive.info/images/nav-menu-header-bg.jpg";
    private static final String urlProfileImg = "https://lh3.googleusercontent.com/eCtE_G34M9ygdkmOpYvCag1vBARCmZwnVS6rS5t4JLzJ6QgQSBquM0nuTsCpLhYbKljoyS-txg";

    // index to identify current nav menu item
    public static int navItemIndex = 0;

    // tags used to attach the fragments
    private static final String TAG_CHECK_LIST = "Lista de Chequeo";
    private static final String TAG_CALCULATION = "Cálculos";
    private static final String TAG_RESULTS = "Resultados";
    private static final String TAG_CONFIGURATION = "Configuración";
    public static String CURRENT_TAG = TAG_CHECK_LIST;

    // toolbar titles respected to selected nav menu item
    private String[] activityTitles;

    // flag to load home fragment when user presses back key
    private boolean shouldLoadHomeFragOnBackPress = true;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LayoutInflater infalInflater = getLayoutInflater();

        setC_doorsView(infalInflater.inflate(R.layout.list_item, null));
        setC_drainageView(infalInflater.inflate(R.layout.list_item, null));
        setC_extractorsView(infalInflater.inflate(R.layout.list_item, null));
        setC_floorView(infalInflater.inflate(R.layout.list_item, null));
        setC_handWashingStationView(infalInflater.inflate(R.layout.list_item, null));
        setC_luminairesView(infalInflater.inflate(R.layout.list_item, null));
        setC_sanitationView(infalInflater.inflate(R.layout.list_item, null));
        setC_wallsView(infalInflater.inflate(R.layout.list_item, null));
        setC_windowsVentilationsBlocksView(infalInflater.inflate(R.layout.list_item, null));

        //Doors Value field
        c_door_sc_value = (EditText) getC_doorsView().findViewById(R.id.sc_value);
        c_door_tyc_value = (EditText) getC_doorsView().findViewById(R.id.tyc_value);
        c_door_sdc_value = (EditText) getC_doorsView().findViewById(R.id.sdc_value);
        c_door_sac_value = (EditText) getC_doorsView().findViewById(R.id.sac_value);
        c_door_sci_value = (EditText) getC_doorsView().findViewById(R.id.sci_value);
        //Doors Spinner Value
        c_door_sc_spinner = (Spinner) getC_doorsView().findViewById(R.id.sc_spinner);
        c_door_tyc_spinner = (Spinner) getC_doorsView().findViewById(R.id.tyc_spinner);
        c_door_sdc_spinner = (Spinner) getC_doorsView().findViewById(R.id.sdc_spinner);
        c_door_sac_spinner = (Spinner) getC_doorsView().findViewById(R.id.sac_spinner);
        c_door_sci_spinner = (Spinner) getC_doorsView().findViewById(R.id.sci_spinner);
        //Doors Value field
        c_door_evidence = (EditText) getC_doorsView().findViewById(R.id.findings_evidence);

        //Drainages Value field
        c_drainage_sc_value = (EditText) getC_drainageView().findViewById(R.id.sc_value);
        c_drainage_tyc_value = (EditText) getC_drainageView().findViewById(R.id.tyc_value);
        c_drainage_sdc_value = (EditText) getC_drainageView().findViewById(R.id.sdc_value);
        c_drainage_sac_value = (EditText) getC_drainageView().findViewById(R.id.sac_value);
        c_drainage_sci_value = (EditText) getC_drainageView().findViewById(R.id.sci_value);
        //Drainages Spinner Value
        c_drainage_sc_spinner = (Spinner) getC_drainageView().findViewById(R.id.sc_spinner);
        c_drainage_tyc_spinner = (Spinner) getC_drainageView().findViewById(R.id.tyc_spinner);
        c_drainage_sdc_spinner = (Spinner) getC_drainageView().findViewById(R.id.sdc_spinner);
        c_drainage_sac_spinner = (Spinner) getC_drainageView().findViewById(R.id.sac_spinner);
        c_drainage_sci_spinner = (Spinner) getC_drainageView().findViewById(R.id.sci_spinner);
        //Drainage Value field
        c_drainage_evidence = (EditText) getC_drainageView().findViewById(R.id.findings_evidence);

        //Extractors Value field
        c_extractor_sc_value = (EditText) getC_extractorsView().findViewById(R.id.sc_value);
        c_extractor_tyc_value = (EditText) getC_extractorsView().findViewById(R.id.tyc_value);
        c_extractor_sdc_value = (EditText) getC_extractorsView().findViewById(R.id.sdc_value);
        c_extractor_sac_value = (EditText) getC_extractorsView().findViewById(R.id.sac_value);
        c_extractor_sci_value = (EditText) getC_extractorsView().findViewById(R.id.sci_value);
        //Extractors Spinner Value
        c_extractor_sc_spinner = (Spinner) getC_extractorsView().findViewById(R.id.sc_spinner);
        c_extractor_tyc_spinner = (Spinner) getC_extractorsView().findViewById(R.id.tyc_spinner);
        c_extractor_sdc_spinner = (Spinner) getC_extractorsView().findViewById(R.id.sdc_spinner);
        c_extractor_sac_spinner = (Spinner) getC_extractorsView().findViewById(R.id.sac_spinner);
        c_extractor_sci_spinner = (Spinner) getC_extractorsView().findViewById(R.id.sci_spinner);
        //Extractors Value field
        c_extractor_evidence = (EditText) getC_extractorsView().findViewById(R.id.findings_evidence);

        //Floors Value field
        c_floor_sc_value = (EditText) getC_floorView().findViewById(R.id.sc_value);
        c_floor_tyc_value = (EditText) getC_floorView().findViewById(R.id.tyc_value);
        c_floor_sdc_value = (EditText) getC_floorView().findViewById(R.id.sdc_value);
        c_floor_sac_value = (EditText) getC_floorView().findViewById(R.id.sac_value);
        c_floor_sci_value = (EditText) getC_floorView().findViewById(R.id.sci_value);
        //Floors Spinner Value
        c_floor_sc_spinner = (Spinner) getC_floorView().findViewById(R.id.sc_spinner);
        c_floor_tyc_spinner = (Spinner) getC_floorView().findViewById(R.id.tyc_spinner);
        c_floor_sdc_spinner = (Spinner) getC_floorView().findViewById(R.id.sdc_spinner);
        c_floor_sac_spinner = (Spinner) getC_floorView().findViewById(R.id.sac_spinner);
        c_floor_sci_spinner = (Spinner) getC_floorView().findViewById(R.id.sci_spinner);
        //Floors Value field
        c_floor_evidence = (EditText) getC_floorView().findViewById(R.id.findings_evidence);

        //Hand Washing Station Value field
        c_handWashingStation_sc_value = (EditText) getC_handWashingStationView().findViewById(R.id.sc_value);
        c_handWashingStation_tyc_value = (EditText) getC_handWashingStationView().findViewById(R.id.tyc_value);
        c_handWashingStation_sdc_value = (EditText) getC_handWashingStationView().findViewById(R.id.sdc_value);
        c_handWashingStation_sac_value = (EditText) getC_handWashingStationView().findViewById(R.id.sac_value);
        c_handWashingStation_sci_value = (EditText) getC_handWashingStationView().findViewById(R.id.sci_value);
        //Hand Washing Station Spinner Value
        c_handWashingStation_sc_spinner = (Spinner) getC_handWashingStationView().findViewById(R.id.sc_spinner);
        c_handWashingStation_tyc_spinner = (Spinner) getC_handWashingStationView().findViewById(R.id.tyc_spinner);
        c_handWashingStation_sdc_spinner = (Spinner) getC_handWashingStationView().findViewById(R.id.sdc_spinner);
        c_handWashingStation_sac_spinner = (Spinner) getC_handWashingStationView().findViewById(R.id.sac_spinner);
        c_handWashingStation_sci_spinner = (Spinner) getC_handWashingStationView().findViewById(R.id.sci_spinner);
        //Hand Washing Station Value field
        c_handWashingStation_evidence = (EditText) getC_handWashingStationView().findViewById(R.id.findings_evidence);

        //Luminaires Value field
        c_luminaires_sc_value = (EditText) getC_luminairesView().findViewById(R.id.sc_value);
        c_luminaires_tyc_value = (EditText) getC_luminairesView().findViewById(R.id.tyc_value);
        c_luminaires_sdc_value = (EditText) getC_luminairesView().findViewById(R.id.sdc_value);
        c_luminaires_sac_value = (EditText) getC_luminairesView().findViewById(R.id.sac_value);
        c_luminaires_sci_value = (EditText) getC_luminairesView().findViewById(R.id.sci_value);
        //Luminaires Spinner Value
        c_luminaires_sc_spinner = (Spinner) getC_luminairesView().findViewById(R.id.sc_spinner);
        c_luminaires_tyc_spinner = (Spinner) getC_luminairesView().findViewById(R.id.tyc_spinner);
        c_luminaires_sdc_spinner = (Spinner) getC_luminairesView().findViewById(R.id.sdc_spinner);
        c_luminaires_sac_spinner = (Spinner) getC_luminairesView().findViewById(R.id.sac_spinner);
        c_luminaires_sci_spinner = (Spinner) getC_luminairesView().findViewById(R.id.sci_spinner);
        //Luminaires Value field
        c_luminaires_evidence = (EditText) getC_luminairesView().findViewById(R.id.findings_evidence);

        //Sanitation Value field
        c_sanitation_sc_value = (EditText) getC_sanitationView().findViewById(R.id.sc_value);
        c_sanitation_tyc_value = (EditText) getC_sanitationView().findViewById(R.id.tyc_value);
        c_sanitation_sdc_value = (EditText) getC_sanitationView().findViewById(R.id.sdc_value);
        c_sanitation_sac_value = (EditText) getC_sanitationView().findViewById(R.id.sac_value);
        c_sanitation_sci_value = (EditText) getC_sanitationView().findViewById(R.id.sci_value);
        //Sanitation Spinner Value
        c_sanitation_sc_spinner = (Spinner) getC_sanitationView().findViewById(R.id.sc_spinner);
        c_sanitation_tyc_spinner = (Spinner) getC_sanitationView().findViewById(R.id.tyc_spinner);
        c_sanitation_sdc_spinner = (Spinner) getC_sanitationView().findViewById(R.id.sdc_spinner);
        c_sanitation_sac_spinner = (Spinner) getC_sanitationView().findViewById(R.id.sac_spinner);
        c_sanitation_sci_spinner = (Spinner) getC_sanitationView().findViewById(R.id.sci_spinner);
        //Sanitation Value field
        c_sanitation_evidence = (EditText) getC_sanitationView().findViewById(R.id.findings_evidence);

        //Walls Value field
        c_walls_sc_value = (EditText) getC_wallsView().findViewById(R.id.sc_value);
        c_walls_tyc_value = (EditText) getC_wallsView().findViewById(R.id.tyc_value);
        c_walls_sdc_value = (EditText) getC_wallsView().findViewById(R.id.sdc_value);
        c_walls_sac_value = (EditText) getC_wallsView().findViewById(R.id.sac_value);
        c_walls_sci_value = (EditText) getC_wallsView().findViewById(R.id.sci_value);
        //Walls Spinner Value
        c_walls_sc_spinner = (Spinner) getC_wallsView().findViewById(R.id.sc_spinner);
        c_walls_tyc_spinner = (Spinner) getC_wallsView().findViewById(R.id.tyc_spinner);
        c_walls_sdc_spinner = (Spinner) getC_wallsView().findViewById(R.id.sdc_spinner);
        c_walls_sac_spinner = (Spinner) getC_wallsView().findViewById(R.id.sac_spinner);
        c_walls_sci_spinner = (Spinner) getC_wallsView().findViewById(R.id.sci_spinner);
        //Walls Value field
        c_walls_evidence = (EditText) getC_wallsView().findViewById(R.id.findings_evidence);

        //Windows and Ventilation Blocks Value field
        c_windowsVentilationsBlocks_sc_value = (EditText) getC_windowsVentilationsBlocksView().findViewById(R.id.sc_value);
        c_windowsVentilationsBlocks_tyc_value = (EditText) getC_windowsVentilationsBlocksView().findViewById(R.id.tyc_value);
        c_windowsVentilationsBlocks_sdc_value = (EditText) getC_windowsVentilationsBlocksView().findViewById(R.id.sdc_value);
        c_windowsVentilationsBlocks_sac_value = (EditText) getC_windowsVentilationsBlocksView().findViewById(R.id.sac_value);
        c_windowsVentilationsBlocks_sci_value = (EditText) getC_windowsVentilationsBlocksView().findViewById(R.id.sci_value);
        //Windows and Ventilation Blocks Spinner Value
        c_windowsVentilationsBlocks_sc_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sc_spinner);
        c_windowsVentilationsBlocks_tyc_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.tyc_spinner);
        c_windowsVentilationsBlocks_sdc_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sdc_spinner);
        c_windowsVentilationsBlocks_sac_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sac_spinner);
        c_windowsVentilationsBlocks_sci_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sci_spinner);
        //Windows and Ventilation Blocks Value field
        c_windowsVentilationsBlocks_evidence = (EditText) getC_windowsVentilationsBlocksView().findViewById(R.id.findings_evidence);

        //Mantaining Order and Organization view
        setOo_machineryWorkEquipmentView(infalInflater.inflate(R.layout.list_item, null));
        setOo_assignedWorkToolsView(infalInflater.inflate(R.layout.list_item, null));
        setOo_containersWasteScrapView(infalInflater.inflate(R.layout.list_item, null));
        setOo_benchesCountersWorkdesksChairsView(infalInflater.inflate(R.layout.list_item, null));
        setOo_shelvesShopwindowsArchivesLibrariesView(infalInflater.inflate(R.layout.list_item, null));
        setOo_billboardsView(infalInflater.inflate(R.layout.list_item, null));

        //Machinery Work Equipment Value field
        oo_machineryWorkEquipment_sc_value = (EditText) getOo_machineryWorkEquipmentView().findViewById(R.id.sc_value);
        oo_machineryWorkEquipment_tyc_value = (EditText) getOo_machineryWorkEquipmentView().findViewById(R.id.tyc_value);
        oo_machineryWorkEquipment_sdc_value = (EditText) getOo_machineryWorkEquipmentView().findViewById(R.id.sdc_value);
        oo_machineryWorkEquipment_sac_value = (EditText) getOo_machineryWorkEquipmentView().findViewById(R.id.sac_value);
        oo_machineryWorkEquipment_sci_value = (EditText) getOo_machineryWorkEquipmentView().findViewById(R.id.sci_value);
        //Machinery Work Equipment Spinner Value
        oo_machineryWorkEquipment_sc_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sc_spinner);
        oo_machineryWorkEquipment_tyc_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.tyc_spinner);
        oo_machineryWorkEquipment_sdc_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sdc_spinner);
        oo_machineryWorkEquipment_sac_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sac_spinner);
        oo_machineryWorkEquipment_sci_spinner = (Spinner) getC_windowsVentilationsBlocksView().findViewById(R.id.sci_spinner);
        //Machinery Work Equipment Evidence
        oo_machineryWorkEquipment_evidence = (EditText) getOo_machineryWorkEquipmentView().findViewById(R.id.findings_evidence);

        //Assigned Work Tools Value field
        oo_assignedWorkTools_sc_value = (EditText) getOo_assignedWorkToolsView().findViewById(R.id.sc_value);
        oo_assignedWorkTools_tyc_value = (EditText) getOo_assignedWorkToolsView().findViewById(R.id.tyc_value);
        oo_assignedWorkTools_sdc_value = (EditText) getOo_assignedWorkToolsView().findViewById(R.id.sdc_value);
        oo_assignedWorkTools_sac_value = (EditText) getOo_assignedWorkToolsView().findViewById(R.id.sac_value);
        oo_assignedWorkTools_sci_value = (EditText) getOo_assignedWorkToolsView().findViewById(R.id.sci_value);
        //Assigned Work Tools Spinner Value
        oo_assignedWorkTools_sc_spinner = (Spinner) getOo_assignedWorkToolsView().findViewById(R.id.sc_spinner);
        oo_assignedWorkTools_tyc_spinner = (Spinner) getOo_assignedWorkToolsView().findViewById(R.id.tyc_spinner);
        oo_assignedWorkTools_sdc_spinner = (Spinner) getOo_assignedWorkToolsView().findViewById(R.id.sdc_spinner);
        oo_assignedWorkTools_sac_spinner = (Spinner) getOo_assignedWorkToolsView().findViewById(R.id.sac_spinner);
        oo_assignedWorkTools_sci_spinner = (Spinner) getOo_assignedWorkToolsView().findViewById(R.id.sci_spinner);
        //Assigned Work Tools Evidence
        oo_assignedWorkTools_evidence = (EditText) getOo_assignedWorkToolsView().findViewById(R.id.findings_evidence);

        //Containers Waste Scrap Value field
        oo_containersWasteScrap_sc_value = (EditText) getOo_containersWasteScrapView().findViewById(R.id.sc_value);
        oo_containersWasteScrap_tyc_value = (EditText) getOo_containersWasteScrapView().findViewById(R.id.tyc_value);
        oo_containersWasteScrap_sdc_value = (EditText) getOo_containersWasteScrapView().findViewById(R.id.sdc_value);
        oo_containersWasteScrap_sac_value = (EditText) getOo_containersWasteScrapView().findViewById(R.id.sac_value);
        oo_containersWasteScrap_sci_value = (EditText) getOo_containersWasteScrapView().findViewById(R.id.sci_value);
        //Containers Waste Scrap Value
        oo_containersWasteScrap_sc_spinner = (Spinner) getOo_containersWasteScrapView().findViewById(R.id.sc_spinner);
        oo_containersWasteScrap_tyc_spinner = (Spinner) getOo_containersWasteScrapView().findViewById(R.id.tyc_spinner);
        oo_containersWasteScrap_sdc_spinner = (Spinner) getOo_containersWasteScrapView().findViewById(R.id.sdc_spinner);
        oo_containersWasteScrap_sac_spinner = (Spinner) getOo_containersWasteScrapView().findViewById(R.id.sac_spinner);
        oo_containersWasteScrap_sci_spinner = (Spinner) getOo_containersWasteScrapView().findViewById(R.id.sci_spinner);
        //Containers Waste Scrap Evidence
        oo_containersWasteScrap_evidence = (EditText) getOo_containersWasteScrapView().findViewById(R.id.findings_evidence);

        //Benches Counters Workdesk chairs Value field
        oo_benchesCountersWorkdeskChairs_sc_value = (EditText) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sc_value);
        oo_benchesCountersWorkdeskChairs_tyc_value = (EditText) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.tyc_value);
        oo_benchesCountersWorkdeskChairs_sdc_value = (EditText) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sdc_value);
        oo_benchesCountersWorkdeskChairs_sac_value = (EditText) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sac_value);
        oo_benchesCountersWorkdeskChairs_sci_value = (EditText) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sci_value);
        //Benches Counters Workdesk chairs Value
        oo_benchesCountersWorkdeskChairs_sc_spinner = (Spinner) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sc_spinner);
        oo_benchesCountersWorkdeskChairs_tyc_spinner = (Spinner) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.tyc_spinner);
        oo_benchesCountersWorkdeskChairs_sdc_spinner = (Spinner) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sdc_spinner);
        oo_benchesCountersWorkdeskChairs_sac_spinner = (Spinner) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sac_spinner);
        oo_benchesCountersWorkdeskChairs_sci_spinner = (Spinner) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.sci_spinner);
        //Benches Counters Workdesk chairs Evidence
        oo_benchesCountersWorkdeskChairs_evidence = (EditText) getOo_benchesCountersWorkdesksChairsView().findViewById(R.id.findings_evidence);

        //Shelves Shopwindows Archives Libraries Value field
        oo_shelvesShopwindowsArchivesLibraries_sc_value = (EditText) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sc_value);
        oo_shelvesShopwindowsArchivesLibraries_tyc_value = (EditText) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.tyc_value);
        oo_shelvesShopwindowsArchivesLibraries_sdc_value = (EditText) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sdc_value);
        oo_shelvesShopwindowsArchivesLibraries_sac_value = (EditText) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sac_value);
        oo_shelvesShopwindowsArchivesLibraries_sci_value = (EditText) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sci_value);
        //Shelves Shopwindows Archives Libraries Value
        oo_shelvesShopwindowsArchivesLibraries_sc_spinner = (Spinner) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sc_spinner);
        oo_shelvesShopwindowsArchivesLibraries_tyc_spinner = (Spinner) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.tyc_spinner);
        oo_shelvesShopwindowsArchivesLibraries_sdc_spinner = (Spinner) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sdc_spinner);
        oo_shelvesShopwindowsArchivesLibraries_sac_spinner = (Spinner) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sac_spinner);
        oo_shelvesShopwindowsArchivesLibraries_sci_spinner = (Spinner) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.sci_spinner);
        //Shelves Shopwindows Archives Libraries Evidence
        oo_shelvesShopwindowsArchivesLibraries_evidence = (EditText) getOo_shelvesShopwindowsArchivesLibrariesView().findViewById(R.id.findings_evidence);

        //Billboards Value field
        oo_billboards_sc_value = (EditText) getOo_billboardsView().findViewById(R.id.sc_value);
        oo_billboards_tyc_value = (EditText) getOo_billboardsView().findViewById(R.id.tyc_value);
        oo_billboards_sdc_value = (EditText) getOo_billboardsView().findViewById(R.id.sdc_value);
        oo_billboards_sac_value = (EditText) getOo_billboardsView().findViewById(R.id.sac_value);
        oo_billboards_sci_value = (EditText) getOo_billboardsView().findViewById(R.id.sci_value);
        //Billboards Value
        oo_billboards_sc_spinner = (Spinner) getOo_billboardsView().findViewById(R.id.sc_spinner);
        oo_billboards_tyc_spinner = (Spinner) getOo_billboardsView().findViewById(R.id.tyc_spinner);
        oo_billboards_sdc_spinner = (Spinner) getOo_billboardsView().findViewById(R.id.sdc_spinner);
        oo_billboards_sac_spinner = (Spinner) getOo_billboardsView().findViewById(R.id.sac_spinner);
        oo_billboards_sci_spinner = (Spinner) getOo_billboardsView().findViewById(R.id.sci_spinner);
        //Billboards Evidence
        oo_billboards_evidence = (EditText) getOo_billboardsView().findViewById(R.id.findings_evidence);

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
        vc_operationalInformation_evidence = (EditText)   getVc_operationalInformationView().findViewById(R.id.findings_evidence);

        //Maintaining hygiene and personal presentation views
        //Personal Presentation Value field
        hpp_personalPresentation_sc_value = (EditText) getHpp_personalPresentationView().findViewById(R.id.sc_value);
        hpp_personalPresentation_tyc_value = (EditText) getHpp_personalPresentationView().findViewById(R.id.tyc_value);
        hpp_personalPresentation_sdc_value = (EditText) getHpp_personalPresentationView().findViewById(R.id.sdc_value);
        hpp_personalPresentation_sac_value = (EditText) getHpp_personalPresentationView().findViewById(R.id.sac_value);
        hpp_personalPresentation_sci_value = (EditText) getHpp_personalPresentationView().findViewById(R.id.sci_value);
        //Personal Presentation Value
        hpp_personalPresentation_sc_spinner = (Spinner) getHpp_personalPresentationView().findViewById(R.id.sc_spinner);
        hpp_personalPresentation_tyc_spinner = (Spinner) getHpp_personalPresentationView().findViewById(R.id.tyc_spinner);
        hpp_personalPresentation_sdc_spinner = (Spinner) getHpp_personalPresentationView().findViewById(R.id.sdc_spinner);
        hpp_personalPresentation_sac_spinner = (Spinner) getHpp_personalPresentationView().findViewById(R.id.sac_spinner);
        hpp_personalPresentation_sci_spinner = (Spinner) getHpp_personalPresentationView().findViewById(R.id.sci_spinner);
        //Personal Presentation Evidence
        hpp_personalPresentation_evidence = (EditText) getHpp_personalPresentationView().findViewById(R.id.findings_evidence);

        //Personal Hygiene Value field
        hpp_personalHygiene_sc_value = (EditText) getHpp_personalHygieneView().findViewById(R.id.sc_value);
        hpp_personalHygiene_tyc_value = (EditText) getHpp_personalHygieneView().findViewById(R.id.tyc_value);
        hpp_personalHygiene_sdc_value = (EditText) getHpp_personalHygieneView().findViewById(R.id.sdc_value);
        hpp_personalHygiene_sac_value = (EditText) getHpp_personalHygieneView().findViewById(R.id.sac_value);
        hpp_personalHygiene_sci_value = (EditText) getHpp_personalHygieneView().findViewById(R.id.sci_value);
        //Personal Hygiene Value
        hpp_personalHygiene_sc_spinner = (Spinner) getHpp_personalHygieneView().findViewById(R.id.sc_spinner);
        hpp_personalHygiene_tyc_spinner = (Spinner) getHpp_personalHygieneView().findViewById(R.id.tyc_spinner);
        hpp_personalHygiene_sdc_spinner = (Spinner) getHpp_personalHygieneView().findViewById(R.id.sdc_spinner);
        hpp_personalHygiene_sac_spinner = (Spinner) getHpp_personalHygieneView().findViewById(R.id.sac_spinner);
        hpp_personalHygiene_sci_spinner = (Spinner) getHpp_personalHygieneView().findViewById(R.id.sci_spinner);
        //Personal Hygiene Evidence
        hpp_personalHygiene_evidence = (EditText) getHpp_personalHygieneView().findViewById(R.id.findings_evidence);

        //Health Value field
        hpp_health_sc_value = (EditText) getHpp_healthView().findViewById(R.id.sc_value);
        hpp_health_tyc_value = (EditText) getHpp_healthView().findViewById(R.id.tyc_value);
        hpp_health_sdc_value = (EditText) getHpp_healthView().findViewById(R.id.sdc_value);
        hpp_health_sac_value = (EditText) getHpp_healthView().findViewById(R.id.sac_value);
        hpp_health_sci_value = (EditText) getHpp_healthView().findViewById(R.id.sci_value);
        //Health Value
        hpp_health_sc_spinner = (Spinner) getHpp_healthView().findViewById(R.id.sc_spinner);
        hpp_health_tyc_spinner = (Spinner) getHpp_healthView().findViewById(R.id.tyc_spinner);
        hpp_health_sdc_spinner = (Spinner) getHpp_healthView().findViewById(R.id.sdc_spinner);
        hpp_health_sac_spinner = (Spinner) getHpp_healthView().findViewById(R.id.sac_spinner);
        hpp_health_sci_spinner = (Spinner) getHpp_healthView().findViewById(R.id.sci_spinner);
        //Health Evidence
        hpp_health_evidence = (EditText) getHpp_healthView().findViewById(R.id.findings_evidence);


        //Maintaining security views
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
        s_operatingConditionsSafetyEquipment_sc_spinner  = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sc_spinner);
        s_operatingConditionsSafetyEquipment_tyc_spinner  = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.tyc_spinner);
        s_operatingConditionsSafetyEquipment_sdc_spinner  = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sdc_spinner);
        s_operatingConditionsSafetyEquipment_sac_spinner  = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sac_spinner);
        s_operatingConditionsSafetyEquipment_sci_spinner  = (Spinner) getS_operatingConditionsSafetyEquipmentView().findViewById(R.id.sci_spinner);
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

        //Maintaining the environment views
        //Classify Hazardous Non Hazardous Wastes Value field
        e_classifyHazardousNonhazardousWastes_sc_value = (EditText) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sc_value);
        e_classifyHazardousNonhazardousWastes_tyc_value = (EditText) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.tyc_value);
        e_classifyHazardousNonhazardousWastes_sdc_value = (EditText) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sdc_value);
        e_classifyHazardousNonhazardousWastes_sac_value = (EditText) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sac_value);
        e_classifyHazardousNonhazardousWastes_sci_value = (EditText) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sci_value);
        //Classify Hazardous Non Hazardous Wastes Value
        e_classifyHazardousNonhazardousWastes_sc_spinner = (Spinner) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sc_spinner);
        e_classifyHazardousNonhazardousWastes_tyc_spinner = (Spinner) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.tyc_spinner);
        e_classifyHazardousNonhazardousWastes_sdc_spinner = (Spinner) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sdc_spinner);
        e_classifyHazardousNonhazardousWastes_sac_spinner = (Spinner) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sac_spinner);
        e_classifyHazardousNonhazardousWastes_sci_spinner = (Spinner) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.sci_spinner);
        //Classify Hazardous Non Hazardous Wastes Evidence
        e_classifyHazardousNonhazardousWastes_evidence = (EditText) getE_classifyHazardousNonhazardousWastesView().findViewById(R.id.findings_evidence);

        //Classify Containers Hazardous Non Hazardous Waste Value field
        e_classifyContainersHazardousNonhazardousWaste_sc_value = (EditText) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sc_value);
        e_classifyContainersHazardousNonhazardousWaste_tyc_value = (EditText) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.tyc_value);
        e_classifyContainersHazardousNonhazardousWaste_sdc_value = (EditText) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sdc_value);
        e_classifyContainersHazardousNonhazardousWaste_sac_value = (EditText) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sac_value);
        e_classifyContainersHazardousNonhazardousWaste_sci_value = (EditText) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sci_value);
        //Classify Containers Hazardous Non Hazardous Waste Value
        e_classifyContainersHazardousNonhazardousWaste_sc_spinner = (Spinner) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sc_spinner);
        e_classifyContainersHazardousNonhazardousWaste_tyc_spinner = (Spinner) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.tyc_spinner);
        e_classifyContainersHazardousNonhazardousWaste_sdc_spinner = (Spinner) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sdc_spinner);
        e_classifyContainersHazardousNonhazardousWaste_sac_spinner = (Spinner) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sac_spinner);
        e_classifyContainersHazardousNonhazardousWaste_sci_spinner = (Spinner) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.sci_spinner);
        //Classify Containers Hazardous Non Hazardous Waste Evidence
        e_classifyContainersHazardousNonhazardousWaste_evidence = (EditText) getE_classifyContainersHazardousNonhazardousWasteView().findViewById(R.id.findings_evidence);

        //Disposal Storage Handling Value field
        e_disposalStorageHandling_sc_value = (EditText) getE_disposalStorageHandlingView().findViewById(R.id.sc_value);
        e_disposalStorageHandling_tyc_value = (EditText) getE_disposalStorageHandlingView().findViewById(R.id.tyc_value);
        e_disposalStorageHandling_sdc_value = (EditText) getE_disposalStorageHandlingView().findViewById(R.id.sdc_value);
        e_disposalStorageHandling_sac_value = (EditText) getE_disposalStorageHandlingView().findViewById(R.id.sac_value);
        e_disposalStorageHandling_sci_value = (EditText) getE_disposalStorageHandlingView().findViewById(R.id.sci_value);
        //Disposal Storage Handling Value
        e_disposalStorageHandling_sc_spinner = (Spinner) getE_disposalStorageHandlingView().findViewById(R.id.sc_spinner);
        e_disposalStorageHandling_tyc_spinner = (Spinner) getE_disposalStorageHandlingView().findViewById(R.id.tyc_spinner);
        e_disposalStorageHandling_sdc_spinner = (Spinner) getE_disposalStorageHandlingView().findViewById(R.id.sdc_spinner);
        e_disposalStorageHandling_sac_spinner = (Spinner) getE_disposalStorageHandlingView().findViewById(R.id.sac_spinner);
        e_disposalStorageHandling_sci_spinner = (Spinner) getE_disposalStorageHandlingView().findViewById(R.id.sci_spinner);
        //Disposal Storage Handling Evidence
        e_disposalStorageHandling_evidence = (EditText) getE_disposalStorageHandlingView().findViewById(R.id.findings_evidence);

        //Control Emissions Effluents Value field
        e_controlEmissionsEffluents_sc_value = (EditText) getE_controlEmissionsEffluentsView().findViewById(R.id.sc_value);
        e_controlEmissionsEffluents_tyc_value = (EditText) getE_controlEmissionsEffluentsView().findViewById(R.id.tyc_value);
        e_controlEmissionsEffluents_sdc_value = (EditText) getE_controlEmissionsEffluentsView().findViewById(R.id.sdc_value);
        e_controlEmissionsEffluents_sac_value = (EditText) getE_controlEmissionsEffluentsView().findViewById(R.id.sac_value);
        e_controlEmissionsEffluents_sci_value = (EditText) getE_controlEmissionsEffluentsView().findViewById(R.id.sci_value);
        //Control Emissions Effluents Value
        e_controlEmissionsEffluents_sc_spinner = (Spinner) getE_controlEmissionsEffluentsView().findViewById(R.id.sc_spinner);
        e_controlEmissionsEffluents_tyc_spinner = (Spinner) getE_controlEmissionsEffluentsView().findViewById(R.id.tyc_spinner);
        e_controlEmissionsEffluents_sdc_spinner = (Spinner) getE_controlEmissionsEffluentsView().findViewById(R.id.sdc_spinner);
        e_controlEmissionsEffluents_sac_spinner = (Spinner) getE_controlEmissionsEffluentsView().findViewById(R.id.sac_spinner);
        e_controlEmissionsEffluents_sci_spinner = (Spinner) getE_controlEmissionsEffluentsView().findViewById(R.id.sci_spinner);
        //Control Emissions Effluents Evidence
        e_controlEmissionsEffluents_evidence = (EditText) getE_controlEmissionsEffluentsView().findViewById(R.id.findings_evidence);

        //Rational Use Water Value field
        e_rationalUseWater_sc_value = (EditText) getE_rationalUseWaterView().findViewById(R.id.sc_value);
        e_rationalUseWater_tyc_value = (EditText) getE_rationalUseWaterView().findViewById(R.id.tyc_value);
        e_rationalUseWater_sdc_value = (EditText) getE_rationalUseWaterView().findViewById(R.id.sdc_value);
        e_rationalUseWater_sac_value = (EditText) getE_rationalUseWaterView().findViewById(R.id.sac_value);
        e_rationalUseWater_sci_value = (EditText) getE_rationalUseWaterView().findViewById(R.id.sci_value);
        //Rational Use Water Value
        e_rationalUseWater_sc_spinner = (Spinner) getE_rationalUseWaterView().findViewById(R.id.sc_spinner);
        e_rationalUseWater_tyc_spinner = (Spinner) getE_rationalUseWaterView().findViewById(R.id.tyc_spinner);
        e_rationalUseWater_sdc_spinner = (Spinner) getE_rationalUseWaterView().findViewById(R.id.sdc_spinner);
        e_rationalUseWater_sac_spinner = (Spinner) getE_rationalUseWaterView().findViewById(R.id.sac_spinner);
        e_rationalUseWater_sci_spinner = (Spinner) getE_rationalUseWaterView().findViewById(R.id.sci_spinner);
        //Rational Use Water Evidence
        e_rationalUseWater_evidence = (EditText) getE_rationalUseWaterView().findViewById(R.id.findings_evidence);

        //Rational Use light Value field
        e_rationalUselight_sc_value = (EditText) getE_rationalUselightView().findViewById(R.id.sc_value);
        e_rationalUselight_tyc_value = (EditText) getE_rationalUselightView().findViewById(R.id.tyc_value);
        e_rationalUselight_sdc_value = (EditText) getE_rationalUselightView().findViewById(R.id.sdc_value);
        e_rationalUselight_sac_value = (EditText) getE_rationalUselightView().findViewById(R.id.sac_value);
        e_rationalUselight_sci_value = (EditText) getE_rationalUselightView().findViewById(R.id.sci_value);
        //Rational Use light Value
        e_rationalUselight_sc_spinner = (Spinner) getE_rationalUselightView().findViewById(R.id.sc_spinner);
        e_rationalUselight_tyc_spinner = (Spinner) getE_rationalUselightView().findViewById(R.id.tyc_spinner);
        e_rationalUselight_sdc_spinner = (Spinner) getE_rationalUselightView().findViewById(R.id.sdc_spinner);
        e_rationalUselight_sac_spinner = (Spinner) getE_rationalUselightView().findViewById(R.id.sac_spinner);
        e_rationalUselight_sci_spinner = (Spinner) getE_rationalUselightView().findViewById(R.id.sci_spinner);
        //Rational Use light Evidence
        e_rationalUselight_evidence = (EditText) getE_rationalUselightView().findViewById(R.id.findings_evidence);

        //Noise Control Value field
        e_noiseControl_sc_value = (EditText) getE_noiseControlView().findViewById(R.id.sc_value);
        e_noiseControl_tyc_value = (EditText) getE_noiseControlView().findViewById(R.id.tyc_value);
        e_noiseControl_sdc_value = (EditText) getE_noiseControlView().findViewById(R.id.sdc_value);
        e_noiseControl_sac_value = (EditText) getE_noiseControlView().findViewById(R.id.sac_value);
        e_noiseControl_sci_value = (EditText) getE_noiseControlView().findViewById(R.id.sci_value);
        //Noise Control Value
        e_noiseControl_sc_spinner = (Spinner) getE_noiseControlView().findViewById(R.id.sc_spinner);
        e_noiseControl_tyc_spinner = (Spinner) getE_noiseControlView().findViewById(R.id.tyc_spinner);
        e_noiseControl_sdc_spinner = (Spinner) getE_noiseControlView().findViewById(R.id.sdc_spinner);
        e_noiseControl_sac_spinner = (Spinner) getE_noiseControlView().findViewById(R.id.sac_spinner);
        e_noiseControl_sci_spinner = (Spinner) getE_noiseControlView().findViewById(R.id.sci_spinner);
        //Noise Control Evidence
        e_noiseControl_evidence = (EditText) getE_noiseControlView().findViewById(R.id.findings_evidence);

        //Protection Green Areas Value field
        e_ProtectionGreenAreas_sc_value = (EditText) getE_ProtectionGreenAreasView().findViewById(R.id.sc_value);
        e_ProtectionGreenAreas_tyc_value = (EditText) getE_ProtectionGreenAreasView().findViewById(R.id.tyc_value);
        e_ProtectionGreenAreas_sdc_value = (EditText) getE_ProtectionGreenAreasView().findViewById(R.id.sdc_value);
        e_ProtectionGreenAreas_sac_value = (EditText) getE_ProtectionGreenAreasView().findViewById(R.id.sac_value);
        e_ProtectionGreenAreas_sci_value = (EditText) getE_ProtectionGreenAreasView().findViewById(R.id.sci_value);
        //Protection Green Areas Value
        e_ProtectionGreenAreas_sc_spinner = (Spinner) getE_ProtectionGreenAreasView().findViewById(R.id.sc_spinner);
        e_ProtectionGreenAreas_tyc_spinner = (Spinner) getE_ProtectionGreenAreasView().findViewById(R.id.tyc_spinner);
        e_ProtectionGreenAreas_sdc_spinner = (Spinner) getE_ProtectionGreenAreasView().findViewById(R.id.sdc_spinner);
        e_ProtectionGreenAreas_sac_spinner = (Spinner) getE_ProtectionGreenAreasView().findViewById(R.id.sac_spinner);
        e_ProtectionGreenAreas_sci_spinner = (Spinner) getE_ProtectionGreenAreasView().findViewById(R.id.sci_spinner);
        //Protection Green Areas Evidence
        e_ProtectionGreenAreas_evidence = (EditText) getE_ProtectionGreenAreasView().findViewById(R.id.findings_evidence);
        
        
        mHandler = new Handler();

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        buildResultButton = (FloatingActionButton) findViewById(fab);

        // Navigation view header
        navHeader = navigationView.getHeaderView(0);
        txtName = (TextView) navHeader.findViewById(R.id.header_name);

        // load toolbar titles from string resources
        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);

        buildResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buildResult();
                Snackbar.make(view, "Calculating Results", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // load nav menu header data
        loadNavHeader();

        // initializing navigation menu
        setUpNavigationView();

        if (savedInstanceState == null) {
            navItemIndex = 0;
            CURRENT_TAG = TAG_CHECK_LIST;
            loadHomeFragment();
        }
    }

    public void buildResult() {

        if (!c_door_sc_value.getText().toString().equals("")) {
            checkList.getDoors().setScValue(Integer.parseInt(c_door_sc_value.getText().toString()));
            checkList.getDoors().setScSpinnerValue(c_door_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Puertas", "SC");
            return;
        }

        if (!c_door_tyc_value.getText().toString().equals("")) {
            checkList.getDoors().setTycValue(Integer.parseInt(c_door_tyc_value.getText().toString()));
            checkList.getDoors().setTycSpinnerValue(c_door_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Puertas", "TYC");
            return;
        }

        if (!c_door_sdc_value.getText().toString().equals("")) {
            checkList.getDoors().setSdcValue(Integer.parseInt(c_door_sdc_value.getText().toString()));
            checkList.getDoors().setSdcSpinnerValue(c_door_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Puertas", "SDC");
            return;
        }

        if (!c_door_sac_value.getText().toString().equals("")) {
            checkList.getDoors().setSacValue(Integer.parseInt(c_door_sac_value.getText().toString()));
            checkList.getDoors().setSacSpinnerValue(c_door_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Puertas", "SAC");
            return;
        }

        if (!c_door_sci_value.getText().toString().equals("")) {
            checkList.getDoors().setSciValue(Integer.parseInt(c_door_sci_value.getText().toString()));
            checkList.getDoors().setSciSpinnerValue(c_door_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Puertas", "SCI");
            return;
        }

        System.out.println("Door SC Value " + checkList.getDoors().getScValue());
        System.out.println("Door TYC Value " + checkList.getDoors().getTycValue());
        System.out.println("Door SDC Value " + checkList.getDoors().getSdcValue());
        System.out.println("Door SAC Value " + checkList.getDoors().getSacValue());
        System.out.println("Door SCI Value " + checkList.getDoors().getSciValue());
        System.out.println("Door SC Spinner " + checkList.getDoors().getScSpinnerValue());
        System.out.println("Door TYC Spinner " + checkList.getDoors().getTycSpinnerValue());
        System.out.println("Door SDC Spinner " + checkList.getDoors().getSdcSpinnerValue());
        System.out.println("Door SAC Spinner " + checkList.getDoors().getSacSpinnerValue());
        System.out.println("Door SCI Spinner " + checkList.getDoors().getSciSpinnerValue());

        if (!c_drainage_sc_value.getText().toString().equals("")) {
            checkList.getDrainage().setScValue(Integer.parseInt(c_drainage_sc_value.getText().toString()));
            checkList.getDrainage().setScSpinnerValue(c_drainage_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Drenajes", "SC");
            return;
        }

        if (!c_drainage_tyc_value.getText().toString().equals("")) {
            checkList.getDrainage().setTycValue(Integer.parseInt(c_drainage_tyc_value.getText().toString()));
            checkList.getDrainage().setTycSpinnerValue(c_drainage_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Drenajes", "TYC");
            return;
        }

        if (!c_drainage_sdc_value.getText().toString().equals("")) {
            checkList.getDrainage().setSdcValue(Integer.parseInt(c_drainage_sdc_value.getText().toString()));
            checkList.getDrainage().setSdcSpinnerValue(c_drainage_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Drenajes", "SDC");
            return;
        }

        if (!c_drainage_sac_value.getText().toString().equals("")) {
            checkList.getDrainage().setSacValue(Integer.parseInt(c_drainage_sac_value.getText().toString()));
            checkList.getDrainage().setSacSpinnerValue(c_drainage_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Drenajes", "SAC");
            return;
        }

        if (!c_drainage_sci_value.getText().toString().equals("")) {
            checkList.getDrainage().setSciValue(Integer.parseInt(c_drainage_sci_value.getText().toString()));
            checkList.getDrainage().setSciSpinnerValue(c_drainage_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Drenajes", "SCI");
            return;
        }

        System.out.println("Drainage SC Value " + checkList.getDrainage().getScValue());
        System.out.println("Drainage TYC Value " + checkList.getDrainage().getTycValue());
        System.out.println("Drainage SDC Value " + checkList.getDrainage().getSdcValue());
        System.out.println("Drainage SAC Value " + checkList.getDrainage().getSacValue());
        System.out.println("Drainage SCI Value " + checkList.getDrainage().getSciValue());
        System.out.println("Drainage SC Spinner " + checkList.getDrainage().getScSpinnerValue());
        System.out.println("Drainage TYC Spinner " + checkList.getDrainage().getTycSpinnerValue());
        System.out.println("Drainage SDC Spinner " + checkList.getDrainage().getSdcSpinnerValue());
        System.out.println("Drainage SAC Spinner " + checkList.getDrainage().getSacSpinnerValue());
        System.out.println("Drainage SCI Spinner " + checkList.getDrainage().getSciSpinnerValue());

        if (!c_extractor_sc_value.getText().toString().equals("")) {
            checkList.getExtractors().setScValue(Integer.parseInt(c_extractor_sc_value.getText().toString()));
            checkList.getExtractors().setScSpinnerValue(c_extractor_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Extractores", "SC");
            return;
        }

        if (!c_extractor_tyc_value.getText().toString().equals("")) {
            checkList.getExtractors().setTycValue(Integer.parseInt(c_extractor_tyc_value.getText().toString()));
            checkList.getExtractors().setTycSpinnerValue(c_extractor_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Extractores", "TYC");
            return;
        }

        if (!c_extractor_sdc_value.getText().toString().equals("")) {
            checkList.getExtractors().setSdcValue(Integer.parseInt(c_extractor_sdc_value.getText().toString()));
            checkList.getExtractors().setSdcSpinnerValue(c_extractor_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Extractores", "SDC");
            return;
        }

        if (!c_extractor_sac_value.getText().toString().equals("")) {
            checkList.getExtractors().setSacValue(Integer.parseInt(c_extractor_sac_value.getText().toString()));
            checkList.getExtractors().setSacSpinnerValue(c_extractor_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Extractores", "SAC");
            return;
        }

        if (!c_extractor_sci_value.getText().toString().equals("")) {
            checkList.getExtractors().setSciValue(Integer.parseInt(c_extractor_sci_value.getText().toString()));
            checkList.getExtractors().setSciSpinnerValue(c_extractor_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Extractores", "SCI");
            return;
        }

        System.out.println("Extractor SC Value " + checkList.getExtractors().getScValue());
        System.out.println("Extractor TYC Value " + checkList.getExtractors().getTycValue());
        System.out.println("Extractor SDC Value " + checkList.getExtractors().getSdcValue());
        System.out.println("Extractor SAC Value " + checkList.getExtractors().getSacValue());
        System.out.println("Extractor SCI Value " + checkList.getExtractors().getSciValue());
        System.out.println("Extractor SC Spinner " + checkList.getExtractors().getScSpinnerValue());
        System.out.println("Extractor TYC Spinner " + checkList.getExtractors().getTycSpinnerValue());
        System.out.println("Extractor SDC Spinner " + checkList.getExtractors().getSdcSpinnerValue());
        System.out.println("Extractor SAC Spinner " + checkList.getExtractors().getSacSpinnerValue());
        System.out.println("Extractor SCI Spinner " + checkList.getExtractors().getSciSpinnerValue());

        if (!c_floor_sc_value.getText().toString().equals("")) {
            checkList.getFloors().setScValue(Integer.parseInt(c_floor_sc_value.getText().toString()));
            checkList.getFloors().setScSpinnerValue(c_floor_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Pisos", "SC");
            return;
        }

        if (!c_floor_tyc_value.getText().toString().equals("")) {
            checkList.getFloors().setTycValue(Integer.parseInt(c_floor_tyc_value.getText().toString()));
            checkList.getFloors().setTycSpinnerValue(c_floor_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Pisos", "TYC");
            return;
        }

        if (!c_floor_sdc_value.getText().toString().equals("")) {
            checkList.getFloors().setSdcValue(Integer.parseInt(c_floor_sdc_value.getText().toString()));
            checkList.getFloors().setSdcSpinnerValue(c_floor_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Pisos", "SDC");
            return;
        }

        if (!c_floor_sac_value.getText().toString().equals("")) {
            checkList.getFloors().setSacValue(Integer.parseInt(c_floor_sac_value.getText().toString()));
            checkList.getFloors().setSacSpinnerValue(c_floor_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Pisos", "SAC");
            return;
        }

        if (!c_floor_sci_value.getText().toString().equals("")) {
            checkList.getFloors().setSciValue(Integer.parseInt(c_floor_sci_value.getText().toString()));
            checkList.getFloors().setSciSpinnerValue(c_floor_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Pisos", "SCI");
            return;
        }

        System.out.println("Floor SC Value " + checkList.getFloors().getScValue());
        System.out.println("Floor TYC Value " + checkList.getFloors().getTycValue());
        System.out.println("Floor SDC Value " + checkList.getFloors().getSdcValue());
        System.out.println("Floor SAC Value " + checkList.getFloors().getSacValue());
        System.out.println("Floor SCI Value " + checkList.getFloors().getSciValue());
        System.out.println("Floor SC Spinner " + checkList.getFloors().getScSpinnerValue());
        System.out.println("Floor TYC Spinner " + checkList.getFloors().getTycSpinnerValue());
        System.out.println("Floor SDC Spinner " + checkList.getFloors().getSdcSpinnerValue());
        System.out.println("Floor SAC Spinner " + checkList.getFloors().getSacSpinnerValue());
        System.out.println("Floor SCI Spinner " + checkList.getFloors().getSciSpinnerValue());

        if (!c_handWashingStation_sc_value.getText().toString().equals("")) {
            checkList.getHandWashingStation().setScValue(Integer.parseInt(c_handWashingStation_sc_value.getText().toString()));
            checkList.getHandWashingStation().setScSpinnerValue(c_handWashingStation_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Estación de lavado de manos", "SC");
            return;
        }

        if (!c_handWashingStation_tyc_value.getText().toString().equals("")) {
            checkList.getHandWashingStation().setTycValue(Integer.parseInt(c_handWashingStation_tyc_value.getText().toString()));
            checkList.getHandWashingStation().setTycSpinnerValue(c_handWashingStation_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Estación de lavado de manos", "TYC");
            return;
        }

        if (!c_handWashingStation_sdc_value.getText().toString().equals("")) {
            checkList.getHandWashingStation().setSdcValue(Integer.parseInt(c_handWashingStation_sdc_value.getText().toString()));
            checkList.getHandWashingStation().setSdcSpinnerValue(c_handWashingStation_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Estación de lavado de manos", "SDC");
            return;
        }

        if (!c_handWashingStation_sac_value.getText().toString().equals("")) {
            checkList.getHandWashingStation().setSacValue(Integer.parseInt(c_handWashingStation_sac_value.getText().toString()));
            checkList.getHandWashingStation().setSacSpinnerValue(c_handWashingStation_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Estación de lavado de manos", "SAC");
            return;
        }

        if (!c_handWashingStation_sci_value.getText().toString().equals("")) {
            checkList.getHandWashingStation().setSciValue(Integer.parseInt(c_handWashingStation_sci_value.getText().toString()));
            checkList.getHandWashingStation().setSciSpinnerValue(c_handWashingStation_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Estación de lavado de manos", "SCI");
            return;
        }

        System.out.println("HandWashingStation SC Value " + checkList.getHandWashingStation().getScValue());
        System.out.println("HandWashingStation TYC Value " + checkList.getHandWashingStation().getTycValue());
        System.out.println("HandWashingStation SDC Value " + checkList.getHandWashingStation().getSdcValue());
        System.out.println("HandWashingStation SAC Value " + checkList.getHandWashingStation().getSacValue());
        System.out.println("HandWashingStation SCI Value " + checkList.getHandWashingStation().getSciValue());
        System.out.println("HandWashingStation SC Spinner " + checkList.getHandWashingStation().getScSpinnerValue());
        System.out.println("HandWashingStation TYC Spinner " + checkList.getHandWashingStation().getTycSpinnerValue());
        System.out.println("HandWashingStation SDC Spinner " + checkList.getHandWashingStation().getSdcSpinnerValue());
        System.out.println("HandWashingStation SAC Spinner " + checkList.getHandWashingStation().getSacSpinnerValue());
        System.out.println("HandWashingStation SCI Spinner " + checkList.getHandWashingStation().getSciSpinnerValue());

        if (!c_luminaires_sc_value.getText().toString().equals("")) {
            checkList.getLuminaires().setScValue(Integer.parseInt(c_luminaires_sc_value.getText().toString()));
            checkList.getLuminaires().setScSpinnerValue(c_luminaires_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Luminarias", "SC");
            return;
        }

        if (!c_luminaires_tyc_value.getText().toString().equals("")) {
            checkList.getLuminaires().setTycValue(Integer.parseInt(c_luminaires_tyc_value.getText().toString()));
            checkList.getLuminaires().setTycSpinnerValue(c_luminaires_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Luminarias", "TYC");
            return;
        }

        if (!c_luminaires_sdc_value.getText().toString().equals("")) {
            checkList.getLuminaires().setSdcValue(Integer.parseInt(c_luminaires_sdc_value.getText().toString()));
            checkList.getLuminaires().setSdcSpinnerValue(c_luminaires_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Luminarias", "SDC");
            return;
        }

        if (!c_luminaires_sac_value.getText().toString().equals("")) {
            checkList.getLuminaires().setSacValue(Integer.parseInt(c_luminaires_sac_value.getText().toString()));
            checkList.getLuminaires().setSacSpinnerValue(c_luminaires_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Luminarias", "SAC");
            return;
        }

        if (!c_luminaires_sci_value.getText().toString().equals("")) {
            checkList.getLuminaires().setSciValue(Integer.parseInt(c_luminaires_sci_value.getText().toString()));
            checkList.getLuminaires().setSciSpinnerValue(c_luminaires_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Luminarias", "SCI");
            return;
        }

        System.out.println("Luminaires SC Value " + checkList.getLuminaires().getScValue());
        System.out.println("Luminaires TYC Value " + checkList.getLuminaires().getTycValue());
        System.out.println("Luminaires SDC Value " + checkList.getLuminaires().getSdcValue());
        System.out.println("Luminaires SAC Value " + checkList.getLuminaires().getSacValue());
        System.out.println("Luminaires SCI Value " + checkList.getLuminaires().getSciValue());
        System.out.println("Luminaires SC Spinner " + checkList.getLuminaires().getScSpinnerValue());
        System.out.println("Luminaires TYC Spinner " + checkList.getLuminaires().getTycSpinnerValue());
        System.out.println("Luminaires SDC Spinner " + checkList.getLuminaires().getSdcSpinnerValue());
        System.out.println("Luminaires SAC Spinner " + checkList.getLuminaires().getSacSpinnerValue());
        System.out.println("Luminaires SCI Spinner " + checkList.getLuminaires().getSciSpinnerValue());

        if (!c_sanitation_sc_value.getText().toString().equals("")) {
            checkList.getSanitation().setScValue(Integer.parseInt(c_sanitation_sc_value.getText().toString()));
            checkList.getSanitation().setScSpinnerValue(c_sanitation_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Instalaciones sanitarias", "SC");
            return;
        }

        if (!c_sanitation_tyc_value.getText().toString().equals("")) {
            checkList.getSanitation().setTycValue(Integer.parseInt(c_sanitation_tyc_value.getText().toString()));
            checkList.getSanitation().setTycSpinnerValue(c_sanitation_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Instalaciones sanitarias", "TYC");
            return;
        }

        if (!c_sanitation_sdc_value.getText().toString().equals("")) {
            checkList.getSanitation().setSdcValue(Integer.parseInt(c_sanitation_sdc_value.getText().toString()));
            checkList.getSanitation().setSdcSpinnerValue(c_sanitation_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Instalaciones sanitarias", "SDC");
            return;
        }

        if (!c_sanitation_sac_value.getText().toString().equals("")) {
            checkList.getSanitation().setSacValue(Integer.parseInt(c_sanitation_sac_value.getText().toString()));
            checkList.getSanitation().setSacSpinnerValue(c_sanitation_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Instalaciones sanitarias", "SAC");
            return;
        }

        if (!c_sanitation_sci_value.getText().toString().equals("")) {
            checkList.getSanitation().setSciValue(Integer.parseInt(c_sanitation_sci_value.getText().toString()));
            checkList.getSanitation().setSciSpinnerValue(c_sanitation_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Instalaciones sanitarias", "SCI");
            return;
        }

        System.out.println("Sanitation SC Value " + checkList.getSanitation().getScValue());
        System.out.println("Sanitation TYC Value " + checkList.getSanitation().getTycValue());
        System.out.println("Sanitation SDC Value " + checkList.getSanitation().getSdcValue());
        System.out.println("Sanitation SAC Value " + checkList.getSanitation().getSacValue());
        System.out.println("Sanitation SCI Value " + checkList.getSanitation().getSciValue());
        System.out.println("Sanitation SC Spinner " + checkList.getSanitation().getScSpinnerValue());
        System.out.println("Sanitation TYC Spinner " + checkList.getSanitation().getTycSpinnerValue());
        System.out.println("Sanitation SDC Spinner " + checkList.getSanitation().getSdcSpinnerValue());
        System.out.println("Sanitation SAC Spinner " + checkList.getSanitation().getSacSpinnerValue());
        System.out.println("Sanitation SCI Spinner " + checkList.getSanitation().getSciSpinnerValue());

        if (!c_walls_sc_value.getText().toString().equals("")) {
            checkList.getWalls().setScValue(Integer.parseInt(c_walls_sc_value.getText().toString()));
            checkList.getWalls().setScSpinnerValue(c_walls_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Paredes", "SC");
            return;
        }

        if (!c_walls_tyc_value.getText().toString().equals("")) {
            checkList.getWalls().setTycValue(Integer.parseInt(c_walls_tyc_value.getText().toString()));
            checkList.getWalls().setTycSpinnerValue(c_walls_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Paredes", "TYC");
            return;
        }

        if (!c_walls_sdc_value.getText().toString().equals("")) {
            checkList.getWalls().setSdcValue(Integer.parseInt(c_walls_sdc_value.getText().toString()));
            checkList.getWalls().setSdcSpinnerValue(c_walls_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Paredes", "SDC");
            return;
        }

        if (!c_walls_sac_value.getText().toString().equals("")) {
            checkList.getWalls().setSacValue(Integer.parseInt(c_walls_sac_value.getText().toString()));
            checkList.getWalls().setSacSpinnerValue(c_walls_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Paredes", "SAC");
            return;
        }

        if (!c_walls_sci_value.getText().toString().equals("")) {
            checkList.getWalls().setSciValue(Integer.parseInt(c_walls_sci_value.getText().toString()));
            checkList.getWalls().setSciSpinnerValue(c_walls_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Paredes", "SCI");
            return;
        }

        System.out.println("Walls SC Value " + checkList.getWalls().getScValue());
        System.out.println("Walls TYC Value " + checkList.getWalls().getTycValue());
        System.out.println("Walls SDC Value " + checkList.getWalls().getSdcValue());
        System.out.println("Walls SAC Value " + checkList.getWalls().getSacValue());
        System.out.println("Walls SCI Value " + checkList.getWalls().getSciValue());
        System.out.println("Walls SC Spinner " + checkList.getWalls().getScSpinnerValue());
        System.out.println("Walls TYC Spinner " + checkList.getWalls().getTycSpinnerValue());
        System.out.println("Walls SDC Spinner " + checkList.getWalls().getSdcSpinnerValue());
        System.out.println("Walls SAC Spinner " + checkList.getWalls().getSacSpinnerValue());
        System.out.println("Walls SCI Spinner " + checkList.getWalls().getSciSpinnerValue());

        if (!c_windowsVentilationsBlocks_sc_value.getText().toString().equals("")) {
            checkList.getWindowsVentilationBlocks().setScValue(Integer.parseInt(c_windowsVentilationsBlocks_sc_value.getText().toString()));
            checkList.getWindowsVentilationBlocks().setScSpinnerValue(c_windowsVentilationsBlocks_sc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Ventanas y bloques de ventilación", "SC");
            return;
        }

        if (!c_windowsVentilationsBlocks_tyc_value.getText().toString().equals("")) {
            checkList.getWindowsVentilationBlocks().setTycValue(Integer.parseInt(c_windowsVentilationsBlocks_tyc_value.getText().toString()));
            checkList.getWindowsVentilationBlocks().setTycSpinnerValue(c_windowsVentilationsBlocks_tyc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Ventanas y bloques de ventilación", "TYC");
            return;
        }

        if (!c_windowsVentilationsBlocks_sdc_value.getText().toString().equals("")) {
            checkList.getWindowsVentilationBlocks().setSdcValue(Integer.parseInt(c_windowsVentilationsBlocks_sdc_value.getText().toString()));
            checkList.getWindowsVentilationBlocks().setSdcSpinnerValue(c_windowsVentilationsBlocks_sdc_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Ventanas y bloques de ventilación", "SDC");
            return;
        }

        if (!c_windowsVentilationsBlocks_sac_value.getText().toString().equals("")) {
            checkList.getWindowsVentilationBlocks().setSacValue(Integer.parseInt(c_windowsVentilationsBlocks_sac_value.getText().toString()));
            checkList.getWindowsVentilationBlocks().setSacSpinnerValue(c_windowsVentilationsBlocks_sac_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Ventanas y bloques de ventilación", "SAC");
            return;
        }

        if (!c_windowsVentilationsBlocks_sci_value.getText().toString().equals("")) {
            checkList.getWindowsVentilationBlocks().setSciValue(Integer.parseInt(c_windowsVentilationsBlocks_sci_value.getText().toString()));
            checkList.getWindowsVentilationBlocks().setSciSpinnerValue(c_windowsVentilationsBlocks_sci_spinner.getSelectedItem().toString());
        } else {
            showEmptyFieldDialog("Limpieza", "Ventanas y bloques de ventilación", "SCI");
            return;
        }

        System.out.println("WindowsVentilationsBlocks SC Value " + checkList.getWindowsVentilationBlocks().getScValue());
        System.out.println("WindowsVentilationsBlocks TYC Value " + checkList.getWindowsVentilationBlocks().getTycValue());
        System.out.println("WindowsVentilationsBlocks SDC Value " + checkList.getWindowsVentilationBlocks().getSdcValue());
        System.out.println("WindowsVentilationsBlocks SAC Value " + checkList.getWindowsVentilationBlocks().getSacValue());
        System.out.println("WindowsVentilationsBlocks SCI Value " + checkList.getWindowsVentilationBlocks().getSciValue());
        System.out.println("WindowsVentilationsBlocks SC Spinner " + checkList.getWindowsVentilationBlocks().getScSpinnerValue());
        System.out.println("WindowsVentilationsBlocks TYC Spinner " + checkList.getWindowsVentilationBlocks().getTycSpinnerValue());
        System.out.println("WindowsVentilationsBlocks SDC Spinner " + checkList.getWindowsVentilationBlocks().getSdcSpinnerValue());
        System.out.println("WindowsVentilationsBlocks SAC Spinner " + checkList.getWindowsVentilationBlocks().getSacSpinnerValue());
        System.out.println("WindowsVentilationsBlocks SCI Spinner " + checkList.getWindowsVentilationBlocks().getSciSpinnerValue());
    }


    public void showEmptyFieldDialog(String categoryName, String subCategoryName, String fieldName) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(true);
        builder.setTitle("Error");
        builder.setMessage("El campo valor del campo " + categoryName + "-" + subCategoryName
                + "-" + fieldName + " No puede ser vacio");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });


        final AlertDialog dialog = builder.create();
        dialog.show(); //show() should be called before dialog.getButton().


        final Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        LinearLayout.LayoutParams positiveButtonLL = (LinearLayout.LayoutParams) positiveButton.getLayoutParams();
        positiveButtonLL.gravity = Gravity.CENTER;
        positiveButton.setLayoutParams(positiveButtonLL);
    }
    /***
     * Load navigation menu header information
     * like background image, profile image
     * name, website, notifications action view (dot)
     */
    private void loadNavHeader() {
        // name
        txtName.setText("S.O.L.");
    }

    /***
     * Returns respected fragment that user
     * selected from navigation menu
     */
    private void loadHomeFragment() {
        // selecting appropriate nav menu item
        selectNavMenu();

        // set toolbar title
        setToolbarTitle();

        // if user select the current navigation menu again, don't do anything
        // just close the navigation drawer
        if (getSupportFragmentManager().findFragmentByTag(CURRENT_TAG) != null) {
            drawer.closeDrawers();

            // show or hide the fab button
            toggleFab();
            return;
        }

        // Sometimes, when fragment has huge data, screen seems hanging
        // when switching between navigation menus
        // So using runnable, the fragment is loaded with cross fade effect
        // This effect can be seen in GMail app
        Runnable mPendingRunnable = new Runnable() {
            @Override
            public void run() {
                // update the main content by replacing fragments
                Fragment fragment = getHomeFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                        android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.frame, fragment, CURRENT_TAG);
                fragmentTransaction.commitAllowingStateLoss();
            }
        };

        // If mPendingRunnable is not null, then add to the message queue
        if (mPendingRunnable != null) {
            mHandler.post(mPendingRunnable);
        }

        // show or hide the fab button
        toggleFab();

        //Closing drawer on item click
        drawer.closeDrawers();

        // refresh toolbar menu
        invalidateOptionsMenu();
    }

    private Fragment getHomeFragment() {
        switch (navItemIndex) {
            case 0:
                // Check List Fragment
                CheckListFragment checkListFragment = new CheckListFragment();
                return checkListFragment;
            case 1:
                // Calculation fragment
                CalculationFragment calculationFragment = new CalculationFragment();
                return calculationFragment;
            case 2:
                // Result fragment
                ResultFragment resultFragment = new ResultFragment();
                return resultFragment;
            case 3:
                // Configuration fragment
                ConfigurationFragment configurationFragment = new ConfigurationFragment();
                return configurationFragment;
            default:
                return new CheckListFragment();
        }
    }

    private void setToolbarTitle() {
        getSupportActionBar().setTitle(activityTitles[navItemIndex]);
    }

    private void selectNavMenu() {
        navigationView.getMenu().getItem(navItemIndex).setChecked(true);
    }

    private void setUpNavigationView() {
        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {
                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.nav_check_list:
                        navItemIndex = 0;
                        CURRENT_TAG = TAG_CHECK_LIST;
                        break;
                    case R.id.nav_calculation:
                        navItemIndex = 1;
                        CURRENT_TAG = TAG_CALCULATION;
                        break;
                    case R.id.nav_results:
                        navItemIndex = 2;
                        CURRENT_TAG = TAG_RESULTS;
                        break;
                    case R.id.nav_manage:
                        navItemIndex = 3;
                        CURRENT_TAG = TAG_CONFIGURATION;
                        break;
                    default:
                        navItemIndex = 0;
                }

                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) {
                    menuItem.setChecked(false);
                } else {
                    menuItem.setChecked(true);
                }
                menuItem.setChecked(true);

                loadHomeFragment();

                return true;
            }
        });


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawer.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessary or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawers();
            return;
        }

        // This code loads home fragment when back key is pressed
        // when user is in other fragment than home
        if (shouldLoadHomeFragOnBackPress) {
            // checking if user is on other navigation menu
            // rather than home
            if (navItemIndex != 0) {
                navItemIndex = 0;
                CURRENT_TAG = TAG_CHECK_LIST;
                loadHomeFragment();
                return;
            }
        }

        super.onBackPressed();
    }

    // show or hide the fab
    private void toggleFab() {
        if (navItemIndex == 0) {
            buildResultButton.show();
        } else {
            buildResultButton.hide();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            System.out.println("Landscape");
        } else {
            System.out.println("portrait");
        }
    }

}
