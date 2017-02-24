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
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import wass.com.sol.R;
import wass.com.sol.fragment.calculationFragments.CalculationFragment;
import wass.com.sol.fragment.checkListFragments.CheckListFragment;
import wass.com.sol.fragment.checkListFragments.cleaning.CleaningFragment;
import wass.com.sol.fragment.checkListFragments.environment.EnvironmentFragment;
import wass.com.sol.fragment.checkListFragments.orderOrganization.OrderOrganizationFragment;
import wass.com.sol.fragment.checkListFragments.sanitationPersonalPresentation.SanitationPersonalPresentationFragment;
import wass.com.sol.fragment.checkListFragments.security.SecurityFragment;
import wass.com.sol.fragment.checkListFragments.visualControl.VisualControlFragment;
import wass.com.sol.fragment.configurationFragments.ConfigurationFragment;
import wass.com.sol.fragment.resultsFragment.ResultFragment;
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

    private CleaningFragment cleaningFragment;
    private EnvironmentFragment environmentFragment;
    private OrderOrganizationFragment orderOrganizationFragment;
    private SanitationPersonalPresentationFragment sanitationPersonalPresentationFragment;
    private SecurityFragment securityFragment;
    private VisualControlFragment visualControlFragment;

    public CleaningFragment getCleaningFragment() {
        return cleaningFragment;
    }

    public void setCleaningFragment(CleaningFragment cleaningFragment) {
        this.cleaningFragment = cleaningFragment;
    }

    public EnvironmentFragment getEnvironmentFragment() {
        return environmentFragment;
    }

    public void setEnvironmentFragment(EnvironmentFragment environmentFragment) {
        this.environmentFragment = environmentFragment;
    }

    public OrderOrganizationFragment getOrderOrganizationFragment() {
        return orderOrganizationFragment;
    }

    public void setOrderOrganizationFragment(OrderOrganizationFragment orderOrganizationFragment) {
        this.orderOrganizationFragment = orderOrganizationFragment;
    }

    public SanitationPersonalPresentationFragment getSanitationPersonalPresentationFragment() {
        return sanitationPersonalPresentationFragment;
    }

    public void setSanitationPersonalPresentationFragment(SanitationPersonalPresentationFragment sanitationPersonalPresentationFragment) {
        this.sanitationPersonalPresentationFragment = sanitationPersonalPresentationFragment;
    }

    public SecurityFragment getSecurityFragment() {
        return securityFragment;
    }

    public void setSecurityFragment(SecurityFragment securityFragment) {
        this.securityFragment = securityFragment;
    }

    public VisualControlFragment getVisualControlFragment() {
        return visualControlFragment;
    }

    public void setVisualControlFragment(VisualControlFragment visualControlFragment) {
        this.visualControlFragment = visualControlFragment;
    }


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
        buildResultButton = (FloatingActionButton) findViewById(fab);

        // Navigation view header
        navHeader = navigationView.getHeaderView(0);
        txtName = (TextView) navHeader.findViewById(R.id.header_name);

        // load toolbar titles from string resources
        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);

        buildResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //buildResult();
                cleaningFragment.buildResultData();
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
    /*
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
    }*/


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
