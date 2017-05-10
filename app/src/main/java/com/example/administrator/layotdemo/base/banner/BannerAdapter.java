package com.example.administrator.layotdemo.base.banner;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/27 0027.
 */

public class BannerAdapter extends PagerAdapter {

    private List mDataSet = new ArrayList<>();

    public BannerAdapter(List mDataSet) {
        this.mDataSet = mDataSet;
    }

    @Override
    public int getCount() {
        return mDataSet.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        container.addView((View) mDataSet.get(position));


        return mDataSet.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) mDataSet.get(position));
    }
    //protected abstract void bind(ViewHolder holder,T data);

}
