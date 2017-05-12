package com.example.administrator.layotdemo.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseFragment;
import com.example.administrator.layotdemo.base.banner.BannerLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by Administrator on 2017/4/24 0024.
 */

public class HomeFragment extends BaseFragment implements MonitorScrollView.OnScrollChangedListener {

    @BindView(R.id.home_toolbar)
    Toolbar homeToolbar;
    @BindView(R.id.bannerlayout)
    BannerLayout bannerlayout;
    @BindView(R.id.tv_weather)
    TextView tvWeather;
    @BindView(R.id.home_scroll)
    MonitorScrollView homeScroll;
    Unbinder unbinder1;

    private List list;


    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {

        initToolBar();
        initBannerLayout();
        initScroll();

    }

    private void initScroll() {
        homeScroll.setOnScrollChangedListener(this);
    }

    private void initBannerLayout() {
        tvWeather.setText("1111111111111111111111162167521879198729581275786479452966574672958297529827958952979");
        tvWeather.setSelected(true);

        list = new ArrayList();
        View v1 = LayoutInflater.from(getContext()).inflate(R.layout.view1, null);
        View v2 = LayoutInflater.from(getContext()).inflate(R.layout.view2, null);
        View v3 = LayoutInflater.from(getContext()).inflate(R.layout.view3, null);
        list.add(v1);
        list.add(v2);
        list.add(v3);

        //mBannerAdapter = new BannerAdapter(list);
        bannerlayout.setAdapter(list);

    }


    private void initToolBar() {

        homeToolbar.getBackground().setAlpha(0);
        homeToolbar.setTitle("");
        ((AppCompatActivity) getActivity()).setSupportActionBar(homeToolbar);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }

    @Override
    public void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt) {
        float height = bannerlayout.getHeight();  //获取图片的高度
        if (oldt < height) {
            int i = Float.valueOf(oldt / height * 255).intValue();    //i 有可能小于 0
            homeToolbar.getBackground().setAlpha(Math.max(i, 0));   // 0~255 透明度
        } else {
            homeToolbar.getBackground().setAlpha(255);
        }
    }

}




