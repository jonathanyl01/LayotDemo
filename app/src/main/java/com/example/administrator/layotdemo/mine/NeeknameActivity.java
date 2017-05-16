package com.example.administrator.layotdemo.mine;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.base.User;

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
                    //EventBus.getDefault().post(new NeeknameEvent(neeknameEt.getText().toString().trim()));
                    User user = new User();
                    user.setNeekname(neekname);
                    finish();
                }
                break;
            case R.id.neekname_cancel:
                finish();
                break;
        }
    }
}
