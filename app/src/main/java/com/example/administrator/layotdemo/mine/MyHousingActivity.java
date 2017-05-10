package com.example.administrator.layotdemo.mine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.administrator.layotdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyHousingActivity extends AppCompatActivity {


    @BindView(R.id.housing_toolbar)
    Toolbar housingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_housing);
        ButterKnife.bind(this);
        initToolBar();


    }

    private void initToolBar() {

        setSupportActionBar(housingToolbar);

        if (getSupportActionBar() != null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

        housingToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
