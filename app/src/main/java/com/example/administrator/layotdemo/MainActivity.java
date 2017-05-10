package com.example.administrator.layotdemo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
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

public class MainActivity extends AppCompatActivity implements  ViewPager.OnPageChangeListener, OnTabSelectListener {


    @BindView(R.id.main_bottombar)
    BottomBar mBottombar;
    @BindView(R.id.main_viewpager)
    ViewPager mainViewpager;
    private Unbinder unbinder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        unbinder = ButterKnife.bind(this);

        mainViewpager.setAdapter(adapter);
        mainViewpager.addOnPageChangeListener(this);

        mBottombar.setOnTabSelectListener(this);

    }

    private FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {

            switch (position) {

                case 0:
                    return new HomeFragment();
                case 1:
                    return new ServeFragment();
                case 2:
                    return new NeighborFragment();
                case 3:
                    return new MarketFragment();
                case 4:
                    return new MineFragment();
                default:
                    throw new RuntimeException("未知错误");
            }

        }

        @Override
        public int getCount() {
            return 5;
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        unbinder = null;
    }




    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        mBottombar.selectTabAtPosition(position,true);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabSelected(@IdRes int tabId) {

        switch (tabId) {

            case R.id.tab_home:

                mainViewpager.setCurrentItem(0, false);

                break;
            case R.id.tab_serve:
                mainViewpager.setCurrentItem(1, false);


                break;

            case R.id.tab_neighbor:
                mainViewpager.setCurrentItem(2, false);

                break;

            case R.id.tab_shopping:
                mainViewpager.setCurrentItem(3, false);


                break;

            case R.id.tab_mine:
                mainViewpager.setCurrentItem(4, false);

                break;


        }

    }



}
