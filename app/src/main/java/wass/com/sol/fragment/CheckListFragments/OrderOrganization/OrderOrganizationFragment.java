package wass.com.sol.fragment.checkListFragments.orderOrganization;

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

public class OrderOrganizationFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;
    private MainActivity mainActivity;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();

        View rootView = inflater.inflate(R.layout.order_organization_fragment, container, false);

        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild, "orderOrganization");

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
        listDataHeader.add("MAQUINARIAS Y EQUIPOS DE TRABAJO");
        listDataHeader.add("UTENSILIOS DE TRABAJO (HERRAMIENTAS/IMPLEMENTO DE LIMPIEZA) ASIGNADAS ");
        listDataHeader.add("RECIPIENTES PARA RESIDUOS Y DESECHOS ");
        listDataHeader.add("BANCOS,MESONES, ESCRITORIOS DE TRABAJO Y SILLAS ");
        listDataHeader.add("ESTANTES, ESCAPARATES, ARCHIVOS, BIBLIOTECAS ");
        listDataHeader.add("CARTELERAS");

        // Adding child data
        List<LinearLayout> machineryEquipment = new ArrayList<>();
        machineryEquipment.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> assignedWorksTools = new ArrayList<>();
        assignedWorksTools.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> wasteContainers = new ArrayList<>();
        wasteContainers.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> banksDestopks = new ArrayList<>();
        banksDestopks.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> archivesLibraries = new ArrayList<>();
        archivesLibraries.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> postCards = new ArrayList<>();
        postCards.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), machineryEquipment); // Header, Child data
        listDataChild.put(listDataHeader.get(1), assignedWorksTools); // Header, Child data
        listDataChild.put(listDataHeader.get(2), wasteContainers); // Header, Child data
        listDataChild.put(listDataHeader.get(3), banksDestopks); // Header, Child data
        listDataChild.put(listDataHeader.get(4), archivesLibraries); // Header, Child data
        listDataChild.put(listDataHeader.get(5), postCards); // Header, Child data

        LayoutInflater infalInflater = mainActivity.getLayoutInflater();

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
        oo_machineryWorkEquipment_sc_spinner = (Spinner) getOo_machineryWorkEquipmentView().findViewById(R.id.sc_spinner);
        oo_machineryWorkEquipment_tyc_spinner = (Spinner) getOo_machineryWorkEquipmentView().findViewById(R.id.tyc_spinner);
        oo_machineryWorkEquipment_sdc_spinner = (Spinner) getOo_machineryWorkEquipmentView().findViewById(R.id.sdc_spinner);
        oo_machineryWorkEquipment_sac_spinner = (Spinner) getOo_machineryWorkEquipmentView().findViewById(R.id.sac_spinner);
        oo_machineryWorkEquipment_sci_spinner = (Spinner) getOo_machineryWorkEquipmentView().findViewById(R.id.sci_spinner);
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
    }

}
