package com.example.administrator.layotdemo.mine;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class NeeknameActivity extends BaseActivity {


    @BindView(R.id.neekname_et)
    EditText neeknameEt;
    @BindView(R.id.neekname_save)
    TextView neeknameSave;
    @BindView(R.id.neekname_cancel)
    TextView neeknameCancel;

    @Override
    protected void initView() {

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_neek_name;
    }



    @OnClick({R.id.neekname_save, R.id.neekname_cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.neekname_save:
                String neekname = neeknameEt.getText().toString();
                if (neekname.isEmpty()){
                    Toast.makeText(this,"不能为空",Toast.LENGTH_SHORT).show();
                }else {


                    Intent intent = new Intent();
                    intent.putExtra("neekname",neekname.trim());
                    setResult(2000,intent);
                    finish();
                }
                break;
            case R.id.neekname_cancel:
                finish();
                break;
        }
    }
}
