package com.example.sean.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Sean on 4/26/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        // TODO Auto-generated method stub
        return new CrimeListFragment();
    }

}