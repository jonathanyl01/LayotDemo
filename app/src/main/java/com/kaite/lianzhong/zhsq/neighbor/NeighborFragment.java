package com.kaite.lianzhong.zhsq.neighbor;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class NeighborFragment extends BaseFragment {
    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.neighbor_viewpager)
    ViewPager neighborViewpager;
    @BindView(R.id.neighbor_toolbar)
    Toolbar neighborToolbar;
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

        initTab();
        initToolBar();



    }

    private void initToolBar() {

    }

    private void initTab() {


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
        NeighborAdapter adapter = new NeighborAdapter(manager, listFragment, listTitle);
        neighborViewpager.setAdapter(adapter);
        tab.setupWithViewPager(neighborViewpager);
    }


}
