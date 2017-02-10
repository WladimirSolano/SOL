package wass.com.sol.Adapter.CheckList;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import wass.com.sol.R;
import wass.com.sol.activity.MainActivity;

/**
 * Created by wsolano on 12/4/2016.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<LinearLayout>> _listDataChild;
    private String fragmentName;

    public ExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<LinearLayout>> listChildData, String fragmentName) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
        this.fragmentName = fragmentName;
    }

    public Context get_context() {
        return _context;
    }

    public void set_context(Context _context) {
        this._context = _context;
    }

    public List<String> get_listDataHeader() {
        return _listDataHeader;
    }

    public void set_listDataHeader(List<String> _listDataHeader) {
        this._listDataHeader = _listDataHeader;
    }

    public HashMap<String, List<LinearLayout>> get_listDataChild() {
        return _listDataChild;
    }

    public void set_listDataChild(HashMap<String, List<LinearLayout>> _listDataChild) {
        this._listDataChild = _listDataChild;
    }

    public String getFragmentName() {
        return fragmentName;
    }

    public void setFragmentName(String fragmentName) {
        this.fragmentName = fragmentName;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).get(childPosititon);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        String category = getFragmentName();
        LayoutInflater infalInflater = (LayoutInflater) this._context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        switch (category) {
            //Cleaning
            case ("cleaning"):
                switch (groupPosition) {
                    //Maintaining cleanliness views
                    case (0):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_doorsView() == null) {
                                ((MainActivity) _context).setC_doorsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_doorsView();
                        }
                    case (1):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_floorView() == null) {
                                ((MainActivity) _context).setC_floorView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_floorView();
                        }
                    case (2):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_wallsView() == null) {
                                ((MainActivity) _context).setC_wallsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_wallsView();
                        }
                    case (3):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_extractorsView() == null) {
                                ((MainActivity) _context).setC_extractorsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_extractorsView();
                        }
                    case (4):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_windowsVentilationsBlocksView() == null) {
                                ((MainActivity) _context).setC_windowsVentilationsBlocksView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_windowsVentilationsBlocksView();
                        }
                    case (5):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_luminairesView() == null) {
                                ((MainActivity) _context).setC_luminairesView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_luminairesView();
                        }
                    case (6):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_sanitationView() == null) {
                                ((MainActivity) _context).setC_sanitationView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_sanitationView();
                        }
                    case (7):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_handWashingStationView() == null) {
                                ((MainActivity) _context).setC_handWashingStationView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_handWashingStationView();
                        }
                    case (8):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getC_drainageView() == null) {
                                ((MainActivity) _context).setC_drainageView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getC_drainageView();
                        }
                }
            case ("environment"):
                switch (groupPosition) {
                    //Mantaining Environment views
                    case (0):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_classifyHazardousNonhazardousWastesView() == null) {
                                ((MainActivity) _context).setE_classifyHazardousNonhazardousWastesView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_classifyHazardousNonhazardousWastesView();
                        }
                    case (1):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_classifyContainersHazardousNonhazardousWasteView() == null) {
                                ((MainActivity) _context).setE_classifyContainersHazardousNonhazardousWasteView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_classifyContainersHazardousNonhazardousWasteView();
                        }
                    case (2):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_disposalStorageHandlingView() == null) {
                                ((MainActivity) _context).setE_disposalStorageHandlingView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_disposalStorageHandlingView();
                        }
                    case (3):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_controlEmissionsEffluentsView() == null) {
                                ((MainActivity) _context).setE_controlEmissionsEffluentsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_controlEmissionsEffluentsView();
                        }
                    case (4):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_rationalUseWaterView() == null) {
                                ((MainActivity) _context).setE_rationalUseWaterView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_rationalUseWaterView();
                        }
                    case (5):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_rationalUselightView() == null) {
                                ((MainActivity) _context).setE_rationalUselightView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_rationalUselightView();
                        }
                    case (6):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_noiseControlView() == null) {
                                ((MainActivity) _context).setE_noiseControlView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_noiseControlView();
                        }
                    case (7):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getE_ProtectionGreenAreasView() == null) {
                                ((MainActivity) _context).setE_ProtectionGreenAreasView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getE_ProtectionGreenAreasView();
                        }
                }
            case ("orderOrganization"):
                switch (groupPosition) {
                    //Mantaining Order and Organization views
                    case (0):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getOo_machineryWorkEquipmentView() == null) {
                                ((MainActivity) _context).setOo_machineryWorkEquipmentView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getOo_machineryWorkEquipmentView();
                        }
                    case (1):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getOo_assignedWorkToolsView() == null) {
                                ((MainActivity) _context).setOo_assignedWorkToolsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getOo_assignedWorkToolsView();
                        }
                    case (2):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getOo_containersWasteScrapView() == null) {
                                ((MainActivity) _context).setOo_containersWasteScrapView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getOo_containersWasteScrapView();
                        }
                    case (3):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getOo_benchesCountersWorkdesksChairsView() == null) {
                                ((MainActivity) _context).setOo_benchesCountersWorkdesksChairsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getOo_benchesCountersWorkdesksChairsView();
                        }
                    case (4):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getOo_shelvesShopwindowsArchivesLibrariesView() == null) {
                                ((MainActivity) _context).setOo_shelvesShopwindowsArchivesLibrariesView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getOo_shelvesShopwindowsArchivesLibrariesView();
                        }
                    case (5):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getOo_billboardsView() == null) {
                                ((MainActivity) _context).setOo_billboardsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getOo_billboardsView();
                        }
                }
            case ("sanitationPersonalPresentation"):
                switch (groupPosition) {
                    //Mantaining Sanitation and personal presentation views
                    case (0):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getHpp_personalPresentationView() == null) {
                                ((MainActivity) _context).setHpp_personalPresentationView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getHpp_personalPresentationView();
                        }
                    case (1):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getHpp_personalHygieneView() == null) {
                                ((MainActivity) _context).setHpp_personalHygieneView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getHpp_personalHygieneView();
                        }
                    case (2):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getHpp_healthView() == null) {
                                ((MainActivity) _context).setHpp_healthView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getHpp_healthView();
                        }
                }
            case ("security"):
                switch (groupPosition) {
                    //Mantaining Security views
                    case (0):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_usePersonalProtectiveEquipmentView() == null) {
                                ((MainActivity) _context).setS_usePersonalProtectiveEquipmentView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_usePersonalProtectiveEquipmentView();
                        }
                    case (1):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_complianceBasicSafetyStandardsView() == null) {
                                ((MainActivity) _context).setS_complianceBasicSafetyStandardsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_complianceBasicSafetyStandardsView();
                        }
                    case (2):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_conditionsElectricalInstallationsView() == null) {
                                ((MainActivity) _context).setS_conditionsElectricalInstallationsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_conditionsElectricalInstallationsView();
                        }
                    case (3):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_operatingConditionsSafetyEquipmentView() == null) {
                                ((MainActivity) _context).setS_operatingConditionsSafetyEquipmentView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_operatingConditionsSafetyEquipmentView();
                        }
                    case (4):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_locationExtinguishersHosesView() == null) {
                                ((MainActivity) _context).setS_locationExtinguishersHosesView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_locationExtinguishersHosesView();
                        }
                    case (5):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_noticesSafetySignsView() == null) {
                                ((MainActivity) _context).setS_noticesSafetySignsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_noticesSafetySignsView();
                        }
                    case (6):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_materialSafetyDataSheetsView() == null) {
                                ((MainActivity) _context).setS_materialSafetyDataSheetsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_materialSafetyDataSheetsView();
                        }
                    case (7):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_evacuationMapView() == null) {
                                ((MainActivity) _context).setS_evacuationMapView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_evacuationMapView();
                        }
                    case (8):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_alarmStationView() == null) {
                                ((MainActivity) _context).setS_alarmStationView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_alarmStationView();
                        }
                    case (9):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_corridorConditionsAccessEscapeRoutesView() == null) {
                                ((MainActivity) _context).setS_corridorConditionsAccessEscapeRoutesView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_corridorConditionsAccessEscapeRoutesView();
                        }
                    case (10):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_installationsContainersHazardousSubstancesMaterialsWasteView() == null) {
                                ((MainActivity) _context).setS_installationsContainersHazardousSubstancesMaterialsWasteView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_installationsContainersHazardousSubstancesMaterialsWasteView();
                        }
                    case (11):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getS_managementHazardousWastesSubstancesMaterialsView() == null) {
                                ((MainActivity) _context).setS_managementHazardousWastesSubstancesMaterialsView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getS_managementHazardousWastesSubstancesMaterialsView();
                        }
                }
            case ("visualControl"):
                switch (groupPosition) {
                    //Mantaining Visual control views
                    case (0):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getVc_assignedMachineryWorkEquipmentView() == null) {
                                ((MainActivity) _context).setVc_assignedMachineryWorkEquipmentView(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getVc_assignedMachineryWorkEquipmentView();
                        }
                    case (1):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getVc_containersWasteScrap() == null) {
                                ((MainActivity) _context).setVc_containersWasteScrap(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getVc_containersWasteScrap();
                        }
                    case (2):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getVc_areas() == null) {
                                ((MainActivity) _context).setVc_areas(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getVc_areas();
                        }
                    case (3):
                        if (_context instanceof MainActivity) {
                            if (((MainActivity) _context).getVc_operationalInformation() == null) {
                                ((MainActivity) _context).setVc_operationalInformation(infalInflater.inflate(R.layout.list_item, null));
                            }
                            return ((MainActivity) _context).getVc_operationalInformation();
                        }
                }
        }

        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }

        TextView lblListHeader = (TextView) convertView.findViewById(R.id.listTitle);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

}
