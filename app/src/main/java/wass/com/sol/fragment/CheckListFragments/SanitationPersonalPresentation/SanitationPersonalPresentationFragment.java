package wass.com.sol.fragment.checkListFragments.sanitationPersonalPresentation;

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

public class SanitationPersonalPresentationFragment extends Fragment {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<LinearLayout>> listDataChild;
    private HashMap<String, List<LinearLayout>> listDataChildAux;
    private MainActivity mainActivity;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mainActivity = (MainActivity) getActivity();

        View rootView = inflater.inflate(R.layout.sanitation_personal_presentation, container, false);

        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.expandable_list);

        // preparing list data
        prepareListData(rootView);

        listAdapter = new ExpandableListAdapter(rootView.getContext(), listDataHeader, listDataChild, "sanitationPersonalPresentation");

        // setting list adapter
        expListView.setAdapter(listAdapter);

        setRetainInstance(true);

        return rootView;

    }

    private void prepareListData(View view) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<LinearLayout>>();

        // Adding child data
        listDataHeader.add("PRESENTACIÓN PERSONAL");
        listDataHeader.add("HIGIÉNE PERSONAL");
        listDataHeader.add("SALUD ");

        // Adding child data
        List<LinearLayout> personalPresentation = new ArrayList<>();
        personalPresentation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> personalSanitation = new ArrayList<>();
        personalSanitation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> health = new ArrayList<>();
        health.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        List<LinearLayout> operationalInformation = new ArrayList<>();
        operationalInformation.add((LinearLayout) view.findViewById(R.id.expandedListItem));

        listDataChild.put(listDataHeader.get(0), personalPresentation); // Header, Child data
        listDataChild.put(listDataHeader.get(1), personalSanitation); // Header, Child data
        listDataChild.put(listDataHeader.get(2), health); // Header, Child data

        LayoutInflater infalInflater = mainActivity.getLayoutInflater();

        //Maintaining hygiene and personal presentation views
        setHpp_personalPresentationView(infalInflater.inflate(R.layout.list_item, null));
        setHpp_personalHygieneView(infalInflater.inflate(R.layout.list_item, null));
        setHpp_healthView(infalInflater.inflate(R.layout.list_item, null));

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


    }

}
