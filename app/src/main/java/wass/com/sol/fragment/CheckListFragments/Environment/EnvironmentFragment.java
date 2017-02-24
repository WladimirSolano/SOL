package wass.com.sol.fragment.checkListFragments.environment;

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

public class EnvironmentFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;
    private MainActivity mainActivity;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();

        View rootView = inflater.inflate(R.layout.environment_fragment, container, false);

        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild, "environment");

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
        listDataHeader.add("CLASIFICAR LOS DESECHOS Y RESIDUOS PELIGROSOS Y NO PELIGROSOS " );
        listDataHeader.add("IDENTIFICAR LOS RECIPIENTES SEGÚN EL TIPO DE DESECHO Y/O RESIDUO PELIGROSO Y NO PELIGROSO");
        listDataHeader.add("DISPOSICIÓN, ALMACENAMIENTO Y MANEJO");
        listDataHeader.add("CONTROL DE EMISIONES Y EFLUENTES");
        listDataHeader.add("USO RACIONAL DEL AGUA");
        listDataHeader.add("USO RACIONAL DE LA LUZ");
        listDataHeader.add("CONTROL DE RUIDO");
        listDataHeader.add("PROTECCIÓN DE LAS AREAS VERDES");

        // Adding child data
        List<LinearLayout> classifyngHazardousNonHazardousWastes = new ArrayList<>();
        classifyngHazardousNonHazardousWastes.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> identifyContainersTypeOfWaste = new ArrayList<>();
        identifyContainersTypeOfWaste.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> storageHandling = new ArrayList<>();
        storageHandling.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> controlEmissionsEffluents = new ArrayList<>();
        controlEmissionsEffluents.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> rationalUseOfWater = new ArrayList<>();
        rationalUseOfWater.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> rationalUseOflight = new ArrayList<>();
        rationalUseOflight.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> noiseControl = new ArrayList<>();
        noiseControl.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> protectionOfGreenAreas = new ArrayList<>();
        protectionOfGreenAreas.add((LinearLayout) view.findViewById(R.id.expandedListItem));


        listDataChild.put(listDataHeader.get(0), classifyngHazardousNonHazardousWastes); // Header, Child data
        listDataChild.put(listDataHeader.get(1), identifyContainersTypeOfWaste); // Header, Child data
        listDataChild.put(listDataHeader.get(2), storageHandling); // Header, Child data
        listDataChild.put(listDataHeader.get(3), controlEmissionsEffluents); // Header, Child data
        listDataChild.put(listDataHeader.get(4), rationalUseOfWater); // Header, Child data
        listDataChild.put(listDataHeader.get(5), rationalUseOflight); // Header, Child data
        listDataChild.put(listDataHeader.get(6), noiseControl); // Header, Child data
        listDataChild.put(listDataHeader.get(7), protectionOfGreenAreas); // Header, Child data

        LayoutInflater infalInflater = mainActivity.getLayoutInflater();

        //Maintaining the environment views
        setE_classifyHazardousNonhazardousWastesView(infalInflater.inflate(R.layout.list_item, null));
        setE_classifyContainersHazardousNonhazardousWasteView(infalInflater.inflate(R.layout.list_item, null));
        setE_disposalStorageHandlingView(infalInflater.inflate(R.layout.list_item, null));
        setE_controlEmissionsEffluentsView(infalInflater.inflate(R.layout.list_item, null));
        setE_rationalUseWaterView(infalInflater.inflate(R.layout.list_item, null));
        setE_rationalUselightView(infalInflater.inflate(R.layout.list_item, null));
        setE_noiseControlView(infalInflater.inflate(R.layout.list_item, null));
        setE_ProtectionGreenAreasView(infalInflater.inflate(R.layout.list_item, null));

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

    }

}
