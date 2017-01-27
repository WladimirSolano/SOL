package wass.com.sol.fragment.CheckListFragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wass.com.sol.Adapter.CheckList.CheckListPagerAdapter;
import wass.com.sol.R;

/**
 * Created by Lasar-Soporte on 27/11/2016.
 */

public class CheckListFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.check_list, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        viewPager = (ViewPager)view.findViewById(R.id.pager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(Color.WHITE, getResources().getColor(R.color.colorAccent));
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        FragmentManager manager = getChildFragmentManager();
        viewPager.setAdapter(new CheckListPagerAdapter(manager));

        setRetainInstance(true);

        return view;
    }
}
