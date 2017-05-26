package com.kaite.lianzhong.zhsq.mine.acyivity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;
import com.kaite.lianzhong.zhsq.mine.view.SwitchButton;

import butterknife.BindView;

public class MessageRemindActivity extends BaseActivity {


    @BindView(R.id.messageremind_toolbar)
    Toolbar messageremindToolbar;
    @BindView(R.id.iv_remind)
    SwitchButton ivRemind;
    @BindView(R.id.iv_sound)
    SwitchButton ivSound;
    @BindView(R.id.iv_shake)
    SwitchButton ivShake;

    @Override
    protected void initView() {
        initToolBar();

    }

    private void initToolBar() {
        setSupportActionBar(messageremindToolbar);
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
        return R.layout.activity_message_remind;
    }


}
