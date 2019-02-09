package com.example.service_admin.gridrecycleviewexample;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabsFragmentsAdpter extends FragmentPagerAdapter {


    List<Fragment> fragmentList = new ArrayList<>();
    List<String> titles =new ArrayList<>();


    public TabsFragmentsAdpter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable

    public CharSequence getPageTitle (int position ){
        return  this.titles.get(position);

    }


    public void addFragment(Fragment fragment ,String title ){
        this.fragmentList.add(fragment);
        this.titles.add(title);


    }
}
