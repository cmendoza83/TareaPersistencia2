package com.example.cynthia.patagramtarea.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import java.util.ArrayList;

/**
 * Created by Cesar on 10-10-16.
 */

public class PageAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;


    public PageAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }


    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    public int getCount() {
        return fragments.size();
    }




}
