package com.example.administrator.layotdemo.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.layotdemo.BaseFragment;
import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.banner.BannerAdapter;
import com.example.administrator.layotdemo.base.banner.BannerLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.example.administrator.layotdemo.R.id.bannerlayout;
import static com.example.administrator.layotdemo.R.id.tv_weather;


/**
 * Created by Administrator on 2017/4/24 0024.
 */

public class HomeFragment extends BaseFragment {

    @BindView(R.id.list_home_goods)
    ListView listHomeGoods;
    private Unbinder unbinder;
    private List list;
    private BannerLayout bannerLayout;
    private HomeListAdapter adapter;
    private TextView tvWeather;
    private BannerAdapter mBannerAdapter;
    private View view;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {

        view = LayoutInflater.from(getContext()).inflate(R.layout.list_header, listHomeGoods, false);

        initList();


    }

    private void initList() {


        bannerLayout = ButterKnife.findById(view, bannerlayout);
        tvWeather = ButterKnife.findById(view, tv_weather);

        tvWeather.setText("1111111111111111111111162167521879198729581275786479452966574672958297529827958952979");
        tvWeather.setSelected(true);

        list = new ArrayList();
        View v1 = LayoutInflater.from(getContext()).inflate(R.layout.view1, null);
        View v2 = LayoutInflater.from(getContext()).inflate(R.layout.view2, null);
        View v3 = LayoutInflater.from(getContext()).inflate(R.layout.view3, null);
        list.add(v1);
        list.add(v2);
        list.add(v3);

        mBannerAdapter = new BannerAdapter(list);
        bannerLayout.setAdapter(list);

        List listData = new ArrayList();
        for (int i = 0; i < 3; i++) {
            listData.add(i + "  ");
        }
        adapter = new HomeListAdapter();
        listHomeGoods.addHeaderView(view);
        adapter.addAll(listData);
        listHomeGoods.setAdapter(adapter);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        unbinder = null;
    }


}
