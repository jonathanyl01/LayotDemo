package com.kaite.lianzhong.zhsq.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseFragment;
import com.kaite.lianzhong.zhsq.base.banner.BannerLayout;
import com.kaite.lianzhong.zhsq.home.activity.HousingNewsActivity;
import com.kaite.lianzhong.zhsq.home.activity.MoreProductActivity;
import com.kaite.lianzhong.zhsq.utils.ActivityUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
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
    @BindView(R.id.iv_scan)
    ImageView ivScan;
    @BindView(R.id.re_housingnews)
    RelativeLayout reHousingnews;
    @BindView(R.id.re_hotshop)
    RelativeLayout reHotshop;
    Unbinder unbinder;

    private List list;
    private ActivityUtils activityUtils;



    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {

        initToolBar();
        initBannerLayout();
        initScroll();
        ivScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (activityUtils == null) {
                    activityUtils = new ActivityUtils();

                }
                activityUtils.openActivity(getContext(), ScannerActivity.class);
            }
        });

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

        homeToolbar.getBackground().setAlpha(110);
        homeToolbar.setTitle("");
        ((AppCompatActivity) getActivity()).setSupportActionBar(homeToolbar);


    }

    @Override
    public void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt) {
        float height = bannerlayout.getHeight();  //获取图片的高度
        if (oldt < height) {
            int i = Float.valueOf(oldt / height * 255).intValue();    //i 有可能小于 0
            homeToolbar.getBackground().setAlpha(Math.max(i, 110));   // 0~255 透明度
        } else {
            homeToolbar.getBackground().setAlpha(255);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.re_housingnews, R.id.re_hotshop})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.re_housingnews:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(getContext(), HousingNewsActivity.class);
                break;
            case R.id.re_hotshop:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(getContext(), MoreProductActivity.class);
                break;
        }
    }
}




