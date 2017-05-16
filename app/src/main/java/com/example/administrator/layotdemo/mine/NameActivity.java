package com.example.administrator.layotdemo.mine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.User;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class NameActivity extends AppCompatActivity {

    @BindView(R.id.name_toolbar)
    Toolbar nameToolbar;
    @BindView(R.id.name_et)
    EditText nameEt;
    @BindView(R.id.name_cancel)
    TextView nameCancel;
    @BindView(R.id.name_save)
    TextView nameSave;
    Editable name;
    private Unbinder unBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        unBinder = ButterKnife.bind(this);
        initToolBar();
        name = nameEt.getText();
    }

    private void initToolBar() {
        setSupportActionBar(nameToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
        }


        nameToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        setTransitionAnimation(true);
    }

    @Override
    public void finish() {
        super.finish();
        setTransitionAnimation(false);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unBinder.unbind();
        unBinder = null;

    }

    private void setTransitionAnimation(boolean isNewActivity) {
        if (isNewActivity) {
            // 新页面从右边进入
            overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
        } else {
            // 回到上个页面
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        }
    }

    @OnClick({R.id.name_save, R.id.name_cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.name_save:
                String name = nameEt.getText().toString();
                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(this, "不能为空", Toast.LENGTH_SHORT).show();
                }else{
                    User user = new User();
                    user.setName(name);
                    finish();
                }

                break;
            case R.id.name_cancel:
                finish();
                break;
        }
    }
}
