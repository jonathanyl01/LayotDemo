package com.kaite.lianzhong.zhsq.serve.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;
import com.kaite.lianzhong.zhsq.serve.adapter.InformAdapter;
import com.kaite.lianzhong.zhsq.serve.fragment.CountryInformFragment;
import com.kaite.lianzhong.zhsq.serve.fragment.CultureFragment;
import com.kaite.lianzhong.zhsq.serve.fragment.EconomyFragment;
import com.kaite.lianzhong.zhsq.serve.fragment.HousingInformFragment;
import com.kaite.lianzhong.zhsq.serve.fragment.InlandInformFragment;
import com.kaite.lianzhong.zhsq.serve.fragment.InlandMessagFragment;
import com.kaite.lianzhong.zhsq.serve.fragment.InternationNewsFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class InformActivity extends BaseActivity {


    @BindView(R.id.inform_toolbar)
    Toolbar informToolbar;
    @BindView(R.id.inform_tab)
    TabLayout informTab;
    @BindView(R.id.inform_viewpager)
    ViewPager informViewpager;
    private List<String> listTitle;
    private List<Fragment> listFragment;

    @Override
    protected void initView() {
        initTab();
        initToolbar();

    }

    private void initToolbar() {

        setSupportActionBar(informToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initTab() {
        listTitle = new ArrayList<>();
        listFragment = new ArrayList<>();
        HousingInformFragment housingInformFragment = new HousingInformFragment();
        CountryInformFragment countryInformFragment = new CountryInformFragment();
        InlandInformFragment inlandInformFragment = new InlandInformFragment();
        InlandMessagFragment inlandMessagFragment = new InlandMessagFragment();
        InternationNewsFragment internationNewsFragment = new InternationNewsFragment();
        CultureFragment cultureFragment = new CultureFragment();
        EconomyFragment economyFragment = new EconomyFragment();
        listFragment.add(housingInformFragment);
        listFragment.add(countryInformFragment);
        listFragment.add(inlandInformFragment);
        listFragment.add(inlandMessagFragment);
        listFragment.add(internationNewsFragment);
        listFragment.add(cultureFragment);
        listFragment.add(economyFragment);

        listTitle.add("社区公告");
        listTitle.add("国家公告");
        listTitle.add("国内公告");
        listTitle.add("国内咨询");
        listTitle.add("国际新闻");
        listTitle.add("科普文化");
        listTitle.add("经济动态");

        informTab.addTab(informTab.newTab().setText(listTitle.get(0)));
        informTab.addTab(informTab.newTab().setText(listTitle.get(1)));
        informTab.addTab(informTab.newTab().setText(listTitle.get(2)));
        informTab.addTab(informTab.newTab().setText(listTitle.get(3)));
        informTab.addTab(informTab.newTab().setText(listTitle.get(4)));
        informTab.addTab(informTab.newTab().setText(listTitle.get(5)));
        informTab.addTab(informTab.newTab().setText(listTitle.get(6)));

        FragmentManager manager = this.getSupportFragmentManager();
        InformAdapter adapter = new InformAdapter(manager,listFragment,listTitle);
        informViewpager.setAdapter(adapter);
        informTab.setupWithViewPager(informViewpager);

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_inform;
    }

}
