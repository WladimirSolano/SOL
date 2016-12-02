package wass.com.sol.fragment.checkListFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wass.com.sol.R;

/**
 * Created by Lasar-Soporte on 28/11/2016.
 */

public class CleaningFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cleaning_fragment, container, false);

        return rootView;
    }
}
