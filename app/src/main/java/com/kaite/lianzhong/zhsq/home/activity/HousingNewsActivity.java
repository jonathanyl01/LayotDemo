package com.kaite.lianzhong.zhsq.home.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;
import com.kaite.lianzhong.zhsq.home.adpter.HousingNewsAdapter;
import com.kaite.lianzhong.zhsq.home.fragment.AdvertiseFragment;
import com.kaite.lianzhong.zhsq.home.fragment.AnnouncementFragment;
import com.kaite.lianzhong.zhsq.home.fragment.EconomyDynamicsFragment;
import com.kaite.lianzhong.zhsq.home.fragment.HousingFunFragment;
import com.kaite.lianzhong.zhsq.home.fragment.ScienceCultureFragment;
import com.kaite.lianzhong.zhsq.home.fragment.SoliderFragment;
import com.kaite.lianzhong.zhsq.home.fragment.SportFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HousingNewsActivity extends BaseActivity {

    @BindView(R.id.housingnews_toolbar)
    Toolbar housingNewsToolbar;
    @BindView(R.id.housingnews_tab)
    TabLayout housingnewsTab;
    @BindView(R.id.housingnews__viewpager)
    ViewPager housingnewsViewPager;
    private List<Fragment> listFragment;
    private List<String> listTitle;

    @Override
    protected void initView() {
        initToolBar();
        initTab();

    }

    private void initTab() {
        HousingFunFragment housingFunFragment = new HousingFunFragment();
        SoliderFragment soliderFragment = new SoliderFragment();
        EconomyDynamicsFragment economyDynamicsFragment = new EconomyDynamicsFragment();
        ScienceCultureFragment scienceCultureFragment = new ScienceCultureFragment();
        SportFragment sportFragment = new SportFragment();
        AnnouncementFragment announcementFragment = new AnnouncementFragment();
        AdvertiseFragment advertiseFragment = new AdvertiseFragment();
        listFragment = new ArrayList<>();
        listTitle = new ArrayList<>();

        listFragment.add(housingFunFragment);
        listFragment.add(soliderFragment);
        listFragment.add(economyDynamicsFragment);
        listFragment.add(scienceCultureFragment);
        listFragment.add(sportFragment);
        listFragment.add(announcementFragment);
        listFragment.add(advertiseFragment);

        listTitle.add("小区趣事");
        listTitle.add("时政军事");
        listTitle.add("经济动态");
        listTitle.add("科普文化");
        listTitle.add("体育娱乐");
        listTitle.add("政府公告");
        listTitle.add("政府宣传");

        housingnewsTab.addTab(housingnewsTab.newTab().setText(listTitle.get(0)));
        housingnewsTab.addTab(housingnewsTab.newTab().setText(listTitle.get(1)));
        housingnewsTab.addTab(housingnewsTab.newTab().setText(listTitle.get(2)));
        housingnewsTab.addTab(housingnewsTab.newTab().setText(listTitle.get(3)));
        housingnewsTab.addTab(housingnewsTab.newTab().setText(listTitle.get(4)));
        housingnewsTab.addTab(housingnewsTab.newTab().setText(listTitle.get(5)));
        housingnewsTab.addTab(housingnewsTab.newTab().setText(listTitle.get(6)));

        FragmentManager manager = this.getSupportFragmentManager();
        HousingNewsAdapter adapter = new HousingNewsAdapter(manager,listFragment,listTitle);
        housingnewsViewPager.setAdapter(adapter);
        housingnewsTab.setupWithViewPager(housingnewsViewPager);
    }

    private void initToolBar() {
        setSupportActionBar(housingNewsToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_housing_news;
    }
}
