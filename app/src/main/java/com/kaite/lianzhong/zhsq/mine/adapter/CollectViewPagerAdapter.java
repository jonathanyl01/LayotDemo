package com.kaite.lianzhong.zhsq.mine.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */

public class CollectViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listFragment ;
    List<String> listTitle ;
    public CollectViewPagerAdapter(FragmentManager fm,List<String> listTitle, List<Fragment> listFragment) {
        super(fm);

        this.listTitle = listTitle;
        this.listFragment = listFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position);

    }
}
