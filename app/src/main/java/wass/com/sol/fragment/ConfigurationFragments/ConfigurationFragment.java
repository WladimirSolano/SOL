package wass.com.sol.fragment.configurationFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wass.com.sol.R;

/**
 * Created by Lasar-Soporte on 27/11/2016.
 */

public class ConfigurationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        return inflater.inflate(R.layout.configuration, container, false);
    }

}
