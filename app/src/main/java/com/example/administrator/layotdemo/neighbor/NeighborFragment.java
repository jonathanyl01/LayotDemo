package com.example.administrator.layotdemo.neighbor;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.layotdemo.base.BaseFragment;
import com.example.administrator.layotdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class NeighborFragment extends BaseFragment {
    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.neighbor_viewpager)
    ViewPager neighborViewpager;
    private List<Fragment> listFragment;
    private List<String> listTitle;
    private HousingFragment housingFragment;
    private SquareFragment squareFragment;
    private MyFragment myFragment;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_neibor;
    }

    @Override
    protected void initView() {


        housingFragment = new HousingFragment();
        squareFragment = new SquareFragment();
        myFragment = new MyFragment();
        listFragment = new ArrayList<>();
        listTitle = new ArrayList<>();

        listFragment.add(housingFragment);
        listFragment.add(squareFragment);
        listFragment.add(myFragment);

        listTitle.add("小区动态");
        listTitle.add("广场");
        listTitle.add("与我相关");

        tab.addTab(tab.newTab().setText(listTitle.get(0)));
        tab.addTab(tab.newTab().setText(listTitle.get(1)));
        tab.addTab(tab.newTab().setText(listTitle.get(2)));
        FragmentManager manager = getActivity().getSupportFragmentManager();
        NeighborAdapter adapter = new NeighborAdapter(manager,listFragment,listTitle);
        neighborViewpager.setAdapter(adapter);
        tab.setupWithViewPager(neighborViewpager);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
