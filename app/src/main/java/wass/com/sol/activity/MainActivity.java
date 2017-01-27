package wass.com.sol.activity;


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
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import wass.com.sol.R;
import wass.com.sol.fragment.CalculationFragments.CalculationFragment;
import wass.com.sol.fragment.CheckListFragments.CheckListFragment;
import wass.com.sol.fragment.ConfigurationFragments.ConfigurationFragment;
import wass.com.sol.fragment.ResultsFragment.ResultFragment;

public class MainActivity extends AppCompatActivity  {

    private NavigationView navigationView;
    private DrawerLayout drawer;
    private View navHeader;
    private ImageView imgNavHeaderBg, imgProfile;
    private TextView txtName, txtWebsite;
    private Toolbar toolbar;
    private FloatingActionButton fab;

    //Maintaining cleanliness views
    private View c_doorsView = null;
    private View c_floorView = null;
    private View c_extractorsView = null;
    private View c_wallsView = null;
    private View c_windowsVentilationsBlocksView = null;
    private View c_luminairesView = null;
    private View c_sanitationPersonalPresentationView = null;
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
    private View s_evaluationMapView = null;
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

    public View getC_sanitationPersonalPresentationView() {
        return c_sanitationPersonalPresentationView;
    }

    public void setC_sanitationPersonalPresentationView(View c_sanitationPersonalPresentationView) {
        this.c_sanitationPersonalPresentationView = c_sanitationPersonalPresentationView;
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

    public View getS_evaluationMapView() {
        return s_evaluationMapView;
    }

    public void setS_evaluationMapView(View s_evaluationMapView) {
        this.s_evaluationMapView = s_evaluationMapView;
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

        mHandler = new Handler();

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        // Navigation view header
        navHeader = navigationView.getHeaderView(0);
        txtName = (TextView) navHeader.findViewById(R.id.header_name);

        // load toolbar titles from string resources
        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText floor_sc_value = (EditText) getC_doorsView().findViewById(R.id.sc_value);
                Snackbar.make(view, "Test String" + floor_sc_value.getText(), Snackbar.LENGTH_LONG)
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
        if (navItemIndex == 0)
            fab.show();
        else
            fab.hide();
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
