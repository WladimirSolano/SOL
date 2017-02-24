package wass.com.sol.Adapter.CheckList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import wass.com.sol.fragment.checkListFragments.cleaning.CleaningFragment;
import wass.com.sol.fragment.checkListFragments.environment.EnvironmentFragment;
import wass.com.sol.fragment.checkListFragments.orderOrganization.OrderOrganizationFragment;
import wass.com.sol.fragment.checkListFragments.sanitationPersonalPresentation.SanitationPersonalPresentationFragment;
import wass.com.sol.fragment.checkListFragments.security.SecurityFragment;
import wass.com.sol.fragment.checkListFragments.visualControl.VisualControlFragment;

/**
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class CheckListPagerAdapter extends FragmentPagerAdapter {

    public CheckListPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new CleaningFragment();
            case 1:
                return new OrderOrganizationFragment();
            case 2:
                return new VisualControlFragment();
            case 3:
                return new SanitationPersonalPresentationFragment();
            case 4:
                return new SecurityFragment();
            case 5:
                return new EnvironmentFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 6;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // TODO Auto-generated method stub
        String title = new String();
        if (position == 0) {
            title = "Limpieza";
        } else if (position == 1) {
            title = "Orden y Organización";
        } else if (position == 2) {
            title = "Control Visual";
        } else if (position == 3) {
            title = "Higiéne y Presentación personal";
        } else if (position == 4) {
            title = "Seguridad";
        } else if (position == 5) {
            title = "Ambiente";
        }
        return title;
    }

}
