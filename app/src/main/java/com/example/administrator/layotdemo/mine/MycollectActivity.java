package com.example.administrator.layotdemo.mine;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.mine.adapter.CollectViewPagerAdapter;
import com.example.administrator.layotdemo.mine.fragment.collect.CommunityActivityFragment;
import com.example.administrator.layotdemo.mine.fragment.collect.FleaMarketFragment;
import com.example.administrator.layotdemo.mine.fragment.collect.HouseInfoFragment;
import com.example.administrator.layotdemo.mine.fragment.collect.MerchantInfoFragment;
import com.example.administrator.layotdemo.mine.fragment.collect.ProductFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MycollectActivity extends BaseActivity {


    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.collect_viewpager)
    ViewPager collectViewpager;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private List<String> title;
    private List<Fragment> listFragment;
    private CommunityActivityFragment communityActivityFragment;
    private FleaMarketFragment fleaMarketFragment;
    private HouseInfoFragment houseInfoFragment;
    private MerchantInfoFragment merchantInfoFragment;
    private ProductFragment productFragment;

    @Override
    protected void initView() {

        initToolbar();
        initTab();

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_mycollect;
    }


    private void initToolbar() {

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");

        }


    }

    private void initTab() {
        communityActivityFragment = new CommunityActivityFragment();
        fleaMarketFragment = new FleaMarketFragment();
        houseInfoFragment = new HouseInfoFragment();
        merchantInfoFragment = new MerchantInfoFragment();
        productFragment = new ProductFragment();
        title = new ArrayList<>();
        listFragment = new ArrayList<>();


        listFragment.add(merchantInfoFragment);
        listFragment.add(productFragment);
        listFragment.add(houseInfoFragment);
        listFragment.add(communityActivityFragment);
        listFragment.add(fleaMarketFragment);

        title.add("商家信息");
        title.add("商品详情");
        title.add("房产信息");
        title.add("社区活动");
        title.add("跳蚤市场");


        tab.addTab(tab.newTab().setText(title.get(0)));
        tab.addTab(tab.newTab().setText(title.get(1)));
        tab.addTab(tab.newTab().setText(title.get(2)));
        tab.addTab(tab.newTab().setText(title.get(3)));
        tab.addTab(tab.newTab().setText(title.get(4)));


        CollectViewPagerAdapter adapter = new CollectViewPagerAdapter(getSupportFragmentManager(), title, listFragment);
        tab.setupWithViewPager(collectViewpager);
        collectViewpager.setAdapter(adapter);


    }


}
