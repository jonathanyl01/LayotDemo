package com.example.administrator.layotdemo.mine;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class SignActivity extends BaseActivity {


    @BindView(R.id.sign_toolbar)
    Toolbar signToolbar;
    @BindView(R.id.sign_et)
    EditText signEt;
    @BindView(R.id.sign_word)
    TextView signWord;
    @BindView(R.id.sign_save)
    TextView signSave;

    @Override
    protected void initView() {
        initToolBar();

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }


    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_sign;
    }

    private void initToolBar() {
        setSupportActionBar(signToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }
    }

    @OnClick(R.id.sign_save)
    public void onViewClicked() {
        String sign = signEt.getText().toString();
        if (TextUtils.isEmpty(sign)) {
            Toast.makeText(this, "不能为空", Toast.LENGTH_SHORT).show();
        } else if (sign.length() > 200) {
            Toast.makeText(this, "最多只能输入200字", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent();
            intent.putExtra("sign",sign.trim());
            setResult(3000,intent);
            finish();
        }

    }

}
