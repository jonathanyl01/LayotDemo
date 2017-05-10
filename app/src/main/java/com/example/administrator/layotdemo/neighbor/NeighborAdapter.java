package com.example.administrator.layotdemo.neighbor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/2 0002.
 */

public class NeighborAdapter extends FragmentPagerAdapter {


    List<String> listTitle = new ArrayList<>();
    List<Fragment> listFragment = new ArrayList<>();
    public NeighborAdapter(FragmentManager fm, List<Fragment> listFragment, List<String> listTitle) {
        super(fm);
        this.listFragment = listFragment;
        this.listTitle = listTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position%listTitle.size());
    }
}
