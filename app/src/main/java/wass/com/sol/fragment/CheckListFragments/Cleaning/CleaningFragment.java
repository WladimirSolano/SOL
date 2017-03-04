package wass.com.sol.fragment.checkListFragments.cleaning;

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

import wass.com.sol.R;
import wass.com.sol.activity.MainActivity;
import wass.com.sol.pojo.cleaning.Doors;
import wass.com.sol.pojo.cleaning.Drainage;
import wass.com.sol.pojo.cleaning.Extractors;
import wass.com.sol.pojo.cleaning.Floors;
import wass.com.sol.pojo.cleaning.HandWashingStation;
import wass.com.sol.pojo.cleaning.Luminaires;
import wass.com.sol.pojo.cleaning.Sanitation;
import wass.com.sol.pojo.cleaning.Walls;
import wass.com.sol.pojo.cleaning.WindowsVentilationBlocks;
import wass.com.sol.utils.ExpandableListAdapter;

/**
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class CleaningFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private MainActivity mainActivity;

    private View rootView;

    private Doors doors;
    private Drainage drainage;
    private Extractors extractors;
    private Floors floors;
    private HandWashingStation handWashingStation;
    private Luminaires luminaires;
    private Sanitation sanitation;
    private Walls walls;
    private WindowsVentilationBlocks windowsVentilationBlocks;

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

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public Drainage getDrainage() {
        return drainage;
    }

    public void setDrainage(Drainage drainage) {
        this.drainage = drainage;
    }

    public Extractors getExtractors() {
        return extractors;
    }

    public void setExtractors(Extractors extractors) {
        this.extractors = extractors;
    }

    public Floors getFloors() {
        return floors;
    }

    public void setFloors(Floors floors) {
        this.floors = floors;
    }

    public HandWashingStation getHandWashingStation() {
        return handWashingStation;
    }

    public void setHandWashingStation(HandWashingStation handWashingStation) {
        this.handWashingStation = handWashingStation;
    }

    public Luminaires getLuminaires() {
        return luminaires;
    }

    public void setLuminaires(Luminaires luminaires) {
        this.luminaires = luminaires;
    }

    public Sanitation getSanitation() {
        return sanitation;
    }

    public void setSanitation(Sanitation sanitation) {
        this.sanitation = sanitation;
    }

    public Walls getWalls() {
        return walls;
    }

    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public WindowsVentilationBlocks getWindowsVentilationBlocks() {
        return windowsVentilationBlocks;
    }

    public void setWindowsVentilationBlocks(WindowsVentilationBlocks windowsVentilationBlocks) {
        this.windowsVentilationBlocks = windowsVentilationBlocks;
    }

    public EditText getC_windowsVentilationsBlocks_evidence() {
        return c_windowsVentilationsBlocks_evidence;
    }

    public void setC_windowsVentilationsBlocks_evidence(EditText c_windowsVentilationsBlocks_evidence) {
        this.c_windowsVentilationsBlocks_evidence = c_windowsVentilationsBlocks_evidence;
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

    public void setC_sanitationView(View c_sanitationView) {
        this.c_sanitationView = c_sanitationView;
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

    public ExpandableListAdapter getListAdapter() {

        return listAdapter;
    }

    public void setListAdapter(ExpandableListAdapter listAdapter) {
        this.listAdapter = listAdapter;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            //Restore the fragment's state here
            System.out.println("Se restaura una instancia");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("Se creo una instancia");
        //Save the fragment's state here
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        System.out.println("Se inicializa la vista");
        mainActivity = (MainActivity) getActivity();

        if (rootView == null){
            rootView = inflater.inflate(R.layout.cleaning_fragment, container, false);

            // get the listview
            expListView = (ExpandableListView) rootView.findViewById(R.id.cleaning_expandable_list);

            // preparing list data
            prepareListData(rootView);

            listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild, "cleaning");

            // setting list adapter
            expListView.setAdapter(listAdapter);

            setRetainInstance(true);
        }

        return rootView;
    }

    private void prepareListData(View view) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<LinearLayout>>();

        // Adding child data
        listDataHeader.add("PISOS");
        listDataHeader.add("PAREDES");
        listDataHeader.add("PUERTAS");
        listDataHeader.add("EXTRACTORES");
        listDataHeader.add("VENTANAS Y BLOQUES DE VENTILACIÓN");
        listDataHeader.add("LUMINARIAS");
        listDataHeader.add("INSTALACIONES SANITARIAS");
        listDataHeader.add("ESTACIONES DE LAVADO DE MANOS");
        listDataHeader.add("DRENAJES");

        // Adding child data
        List<LinearLayout> floors = new ArrayList<>();
        floors.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> walls = new ArrayList<>();
        walls.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> doors = new ArrayList<>();
        doors.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> extractors = new ArrayList<>();
        extractors.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> WindowsVentilationBlocks = new ArrayList<>();
        WindowsVentilationBlocks.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> illuminations = new ArrayList<>();
        illuminations.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> sanitation = new ArrayList<>();
        sanitation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> handwashingStations = new ArrayList<>();
        handwashingStations.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> drainage = new ArrayList<>();
        drainage.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), floors); // Header, Child data
        listDataChild.put(listDataHeader.get(1), walls); // Header, Child data
        listDataChild.put(listDataHeader.get(2), doors); // Header, Child data
        listDataChild.put(listDataHeader.get(3), extractors); // Header, Child data
        listDataChild.put(listDataHeader.get(4), WindowsVentilationBlocks); // Header, Child data
        listDataChild.put(listDataHeader.get(5), illuminations); // Header, Child data
        listDataChild.put(listDataHeader.get(6), sanitation); // Header, Child data
        listDataChild.put(listDataHeader.get(7), handwashingStations); // Header, Child data
        listDataChild.put(listDataHeader.get(8), drainage); // Header, Child data

        LayoutInflater infalInflater = mainActivity.getLayoutInflater();

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
        c_door_sc_value = ((EditText) getC_doorsView().findViewById(R.id.sc_value));
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

        mainActivity.setCleaningFragment(this);
    }

    public void buildResultData() {
        setDoors(new Doors());

        doors.setScValue(Integer.parseInt(c_door_sc_value.getText().toString()));
        System.out.println("Doors sc value " + doors.getScValue());
        setDrainage(new Drainage());
    }
}
