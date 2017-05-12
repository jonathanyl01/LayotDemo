package com.example.administrator.layotdemo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.layotdemo.home.HomeFragment;
import com.example.administrator.layotdemo.market.MarketFragment;
import com.example.administrator.layotdemo.mine.MineFragment;
import com.example.administrator.layotdemo.neighbor.NeighborFragment;
import com.example.administrator.layotdemo.serve.ServeFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements OnTabSelectListener {


    @BindView(R.id.main_bottombar)
    BottomBar mBottombar;
    /*@BindView(R.id.main_viewpager)
    ViewPager mainViewpager;*/
    private Unbinder unbinder;
    private HomeFragment homeFragment;
    private ServeFragment serveFragment;
    private NeighborFragment neighborFragment;
    private MarketFragment marketFragment;
    private MineFragment mineFragment;
    private Fragment mCurrentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        /*mainViewpager.setAdapter(adapter);
        mainViewpager.addOnPageChangeListener(this);*/
        //retrieveFragment();
        mBottombar.setOnTabSelectListener(this);
       /* homeFragment = new HomeFragment();
        serveFragment = new ServeFragment();
        neighborFragment = new NeighborFragment();
        marketFragment = new MarketFragment();
        mineFragment = new MineFragment();*/


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        unbinder = null;
    }


    @Override
    public void onTabSelected(@IdRes int tabId) {
        switch (tabId) {
            case R.id.tab_home:
                if (homeFragment == null) {

                    homeFragment = new HomeFragment();
                }
                switchfragment(homeFragment);
                break;
            case R.id.tab_serve:
                if (serveFragment == null) {
                    serveFragment = new ServeFragment();
                }
                switchfragment(serveFragment);
                break;
            case R.id.tab_neighbor:
                if (neighborFragment == null) {
                    neighborFragment = new NeighborFragment();
                }
                switchfragment(neighborFragment);
                break;
            case R.id.tab_shopping:
                if (marketFragment == null) {
                    marketFragment = new MarketFragment();
                }
                switchfragment(marketFragment);
                break;
            case R.id.tab_mine:
                if (mineFragment == null) {
                    mineFragment = new MineFragment();
                }
                switchfragment(mineFragment);
                break;


        }

    }
    // 恢复因为系统重启造成的Fragmentmanager里面恢复的Fragment
  /*  private void retrieveFragment() {
        FragmentManager manager = getSupportFragmentManager();
        homeFragment = (HomeFragment) manager.findFragmentByTag(HomeFragment.class.getName());
        serveFragment = (ServeFragment) manager.findFragmentByTag(ServeFragment.class.getName());
        neighborFragment = (NeighborFragment) manager.findFragmentByTag(NeighborFragment.class.getName());
        marketFragment = (MarketFragment) manager.findFragmentByTag(MarketFragment.class.getName());
        mineFragment = (MineFragment) manager.findFragmentByTag(MineFragment.class.getName());
    }*/

    // 作用：切换Fragment
    private void switchfragment(Fragment target) {
        // add show hide的方式
        if (mCurrentFragment == target) return;

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (mCurrentFragment != null) {
            transaction.hide(mCurrentFragment);
        }
        if (target.isAdded()) {
            // 如果已经添加到FragmentManager里面，就展示
            transaction.show(target);
        } else {
            // 为了方便找到Fragment，我们是可以设置Tag
            String tag;


            // 把类名作为tag
            tag = target.getClass().getName();


            // 添加Fragment并设置Tag
            transaction.add(R.id.layout_container, target, tag);
        }

        transaction.commit();
        mCurrentFragment = target;
    }


}
