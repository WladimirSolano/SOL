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

    private CheckListFragment checkListFragment = null;
    private ConfigurationFragment configurationFragment = null;
    private CalculationFragment calculationFragment = null;
    private ResultFragment resultFragment = null;

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
                fragmentTransaction.addToBackStack(CURRENT_TAG);
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
                if (checkListFragment == null) {
                    checkListFragment = new CheckListFragment();
                }
                return checkListFragment;
            case 1:
                // Calculation fragment
                calculationFragment = new CalculationFragment();
                return calculationFragment;
            case 2:
                // Result fragment
                resultFragment = new ResultFragment();
                return resultFragment;
            case 3:
                // Configuration fragment
                configurationFragment = new ConfigurationFragment();
                return configurationFragment;
        }
        return null;
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
