package com.orm.myalarm;


import androidx.fragment.app.Fragment;

public class AlarmActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return AlarmFragment.newInstance();
    }
}

