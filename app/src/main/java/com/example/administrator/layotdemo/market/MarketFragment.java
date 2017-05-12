package com.example.administrator.layotdemo.market;

import android.view.LayoutInflater;
import android.view.View;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseFragment;
import com.example.administrator.layotdemo.base.banner.BannerLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class MarketFragment extends BaseFragment {
    @BindView(R.id.market_bannerlayout)
    BannerLayout marketBannerlayout;
    private List list;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_market;
    }

    @Override
    protected void initView() {

        initBanner();

    }

    private void initBanner() {
        list = new ArrayList();
        View v1 = LayoutInflater.from(getContext()).inflate(R.layout.view1, null);
        View v2 = LayoutInflater.from(getContext()).inflate(R.layout.view2, null);
        View v3 = LayoutInflater.from(getContext()).inflate(R.layout.view3, null);
        list.add(v1);
        list.add(v2);
        list.add(v3);

        //mBannerAdapter = new BannerAdapter(list);
        marketBannerlayout.setAdapter(list);
    }


}
