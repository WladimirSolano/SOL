package wass.com.sol.fragment.checkListFragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class CheckListPagerAdapter extends FragmentPagerAdapter{

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
                return new VisualControl();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
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
        }
        return title;
    }

}
