package com.example.administrator.layotdemo.mine;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.mine.adapter.MyFamilyViewPagerAdapter;
import com.example.administrator.layotdemo.mine.fragment.family.FamilyFragment;
import com.example.administrator.layotdemo.mine.fragment.family.QRcodeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MyFamilyActivity extends BaseActivity {

    @BindView(R.id.family_toolbar)
    Toolbar familyToolbar;
    @BindView(R.id.family_tab)
    TabLayout familyTab;
    @BindView(R.id.family_viewpager)
    ViewPager familyViewpager;
    private List<String> listTitle;
    private List<Fragment> listFragment;
    private FamilyFragment familyFragment;
    private QRcodeFragment qRcodeFragment;

    @Override
    protected void initView() {

        initToolBar();
        initTab();

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_my_family;
    }


    private void initTab() {

        listTitle = new ArrayList<>();
        listFragment = new ArrayList<>();

        familyFragment = new FamilyFragment();

        qRcodeFragment = new QRcodeFragment();
        listTitle.add("邀请注册码");
        listTitle.add("应用下载");


        familyTab.addTab(familyTab.newTab().setText(listTitle.get(0)));
        familyTab.addTab(familyTab.newTab().setText(listTitle.get(1)));


        listFragment.add(familyFragment);
        listFragment.add(qRcodeFragment);


        MyFamilyViewPagerAdapter adapter = new MyFamilyViewPagerAdapter(getSupportFragmentManager(), listTitle, listFragment);

        familyViewpager.setAdapter(adapter);
        familyTab.setupWithViewPager(familyViewpager);


    }

    private void initToolBar() {

        setSupportActionBar(familyToolbar);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            getSupportActionBar().setTitle("");
        }


    }


}
