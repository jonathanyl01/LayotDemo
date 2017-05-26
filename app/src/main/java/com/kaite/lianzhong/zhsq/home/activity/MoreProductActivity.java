package com.kaite.lianzhong.zhsq.home.activity;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;
import com.kaite.lianzhong.zhsq.home.adpter.MorePrtoductAdapter;
import com.kaite.lianzhong.zhsq.home.view.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MoreProductActivity extends BaseActivity {


    @BindView(R.id.more_product_toolbar)
    Toolbar moreProductToolbar;
    @BindView(R.id.more_recycler)
    RecyclerView moreRecycler;

    @Override
    protected void initView() {
        initToolBar();
        initRecycler();

    }

    private void initRecycler() {

        List<Integer> list = new ArrayList<>();
        list.add(R.drawable.ic_commodity1);
        list.add(R.drawable.ic_commodity2);
        list.add(R.drawable.ic_commodity3);
        MorePrtoductAdapter adapter = new MorePrtoductAdapter(this, list);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        moreRecycler.setLayoutManager(manager);
        moreRecycler.addItemDecoration(new DividerGridItemDecoration(this, 2));
        moreRecycler.setAdapter(adapter);
    }

    private void initToolBar() {
        setSupportActionBar(moreProductToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_more_product;
    }


}
