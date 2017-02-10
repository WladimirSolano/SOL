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

    //Mantaining Order and Organization views
    private View oo_machineryWorkEquipmentView = null;
    private View oo_assignedWorkToolsView = null;
    private View oo_containersWasteScrapView = null;
    private View oo_benchesCountersWorkdesksChairsView = null;
    private View oo_shelvesShopwindowsArchivesLibrariesView = null;
    private View oo_billboardsView = null;

    //Maintaining visual control views
    private View vc_assignedMachineryWorkEquipmentView = null;
    private View vc_containersWasteScrap = null;
    private View vc_areas = null;
    private View vc_operationalInformation = null;

    //Maintaining hygiene and personal presentation views
    private View hpp_personalPresentationView = null;
    private View hpp_personalHygieneView = null;
    private View hpp_healthView = null;

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

    //Maintaining the environment views
    private View e_classifyHazardousNonhazardousWastesView = null;
    private View e_classifyContainersHazardousNonhazardousWasteView = null;
    private View e_disposalStorageHandlingView = null;
    private View e_controlEmissionsEffluentsView = null;
    private View e_rationalUseWaterView = null;
    private View e_rationalUselightView = null;
    private View e_noiseControlView = null;
    private View e_ProtectionGreenAreasView = null;

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

    public View getVc_containersWasteScrap() {
        return vc_containersWasteScrap;
    }

    public void setVc_containersWasteScrap(View vc_containersWasteScrap) {
        this.vc_containersWasteScrap = vc_containersWasteScrap;
    }

    public View getVc_areas() {
        return vc_areas;
    }

    public void setVc_areas(View vc_areas) {
        this.vc_areas = vc_areas;
    }

    public View getVc_operationalInformation() {
        return vc_operationalInformation;
    }

    public void setVc_operationalInformation(View vc_operationalInformation) {
        this.vc_operationalInformation = vc_operationalInformation;
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
