package com.example.administrator.layotdemo.mine;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.utils.ActivityUtils;

import org.hybridsquad.android.library.CropHandler;
import org.hybridsquad.android.library.CropHelper;
import org.hybridsquad.android.library.CropParams;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;

public class UserInfoActivity extends BaseActivity implements AccountView {


    @BindView(R.id.userinfo_toolbar)
    Toolbar userinfoToolbar;
    @BindView(R.id.re_photo)
    RelativeLayout rePhoto;
    @BindView(R.id.re_qrcode)
    RelativeLayout reQrcode;
    @BindView(R.id.re_address)
    RelativeLayout reAddress;
    @BindView(R.id.re_birthday)
    RelativeLayout reBirthday;
    @BindView(R.id.re_name)
    RelativeLayout reName;
    @BindView(R.id.re_neekname)
    RelativeLayout reNeekname;
    @BindView(R.id.re_sex)
    RelativeLayout reSex;
    @BindView(R.id.re_sign)
    RelativeLayout reSign;
    private IconSelectWindow mSelectWindow;
    private QrCodeWindow qrCodeWindow;
    private ActivityUtils activityUtils;


    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_user_info;
    }

    @Override
    protected void initView() {
        initToolBar();

    }

    private void initToolBar() {
        setSupportActionBar(userinfoToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

    }




    @OnClick({R.id.re_photo, R.id.re_qrcode, R.id.re_address, R.id.re_birthday, R.id.re_name, R.id.re_neekname, R.id.re_sex, R.id.re_sign})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.re_photo:
                if (mSelectWindow == null) {
                    mSelectWindow = new IconSelectWindow(this, mListener);
                }
                if (mSelectWindow.isShowing()) {
                    mSelectWindow.dismiss();
                    return;
                }
                mSelectWindow.show();
                break;
            case R.id.re_qrcode:
                if (qrCodeWindow == null){
                    qrCodeWindow = new QrCodeWindow(UserInfoActivity.this);

                }
                qrCodeWindow.show();
                break;
            case R.id.re_address:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this,AddressActivity.class);
                break;
            case R.id.re_birthday:
                break;
            case R.id.re_name:
                break;
            case R.id.re_neekname:
                break;
            case R.id.re_sex:
                break;
            case R.id.re_sign:
                break;
        }
    }

    // 跳转的监听
    private IconSelectWindow.Listener mListener = new IconSelectWindow.Listener() {
        // 到相册
        @Override
        public void toGallery() {
            // 清除缓存
            CropHelper.clearCachedCropFile(mCropHandler.getCropParams().uri);

            Intent intent = CropHelper.buildCropFromGalleryIntent(mCropHandler.getCropParams());
            startActivityForResult(intent, CropHelper.REQUEST_CROP);
        }

        // 到相机
        @Override
        public void toCamera() {
            // 清除之前剪切的图片的缓存
            CropHelper.clearCachedCropFile(mCropHandler.getCropParams().uri);

            // 跳转
            Intent intent = CropHelper.buildCaptureIntent(mCropHandler.getCropParams().uri);
            startActivityForResult(intent, CropHelper.REQUEST_CAMERA);
        }
    };

    // 图片处理
    private CropHandler mCropHandler = new CropHandler() {
        // 图片剪切之后：参数Uri代表剪切后的图片
        @Override
        public void onPhotoCropped(Uri uri) {
            // 拿到剪切之后的图片
            File file = new File(uri.getPath());
            //进行网络请求将图片上传
            // new AccountPresenter(AccountActivity.this).uploadPhoto(file);

        }

        // 取消
        @Override
        public void onCropCancel() {

        }

        // 剪切失败
        @Override
        public void onCropFailed(String message) {

        }

        // 剪切的参数设置：Uri(图片剪切之后保存的路径)
        @Override
        public CropParams getCropParams() {
            // 默认的剪切设置
            CropParams cropParams = new CropParams();
            return cropParams;
        }

        // 上下文
        @Override
        public Activity getContext() {
            return UserInfoActivity.this;
        }
    };

    // 处理图片剪切的结果
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        CropHelper.handleResult(mCropHandler, requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        if (mCropHandler.getCropParams() != null)
            CropHelper.clearCachedCropFile(mCropHandler.getCropParams().uri);
        super.onDestroy();
    }

    // 返回箭头的处理
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }

    // -----------------------头像的视图方法-----------------------------
    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void updatePhoto(String photoUrl) {

    }





}


