package com.dameiren.app.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dameiren.app.R;
import com.dameiren.app.callback.NetCallBack;
import com.dameiren.app.core.MyConstants;
import com.dameiren.app.net.AccountNet;
import com.dameiren.app.ui.base.BaseActivity;
import com.dameiren.app.ui.login.presenter.LoginPresenter;
import com.dameiren.app.ui.login.view.LoginView;
import com.dameiren.app.ui.main.MainActivity;
import com.lzy.okhttputils.model.HttpParams;

/**
 * 作者:liujiacheng.
 * 日期: 2016/5/31 0031 17:06.
 * 描述：
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener, LoginView,NetCallBack {

    Button btn_login;
    private LoginPresenter loginPresenter;
    private static final int WHAT_LOFIN = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        initIble(this);
//        loginPresenter = new LoginPresenter(this);
    }

    private void initViews() {
        btn_login = (Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch ( view.getId() ) {
            case R.id.btn_login:
//                loginPresenter.login("13255187325","111111");
                startTask(MyConstants.Action.ACTION_ACCOUNT_LOGIN,WHAT_LOFIN,NET_METHOD_POST,false);
                break;
            default:
                break;
        }
    }

    @Override
    public void moveToIndex() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public String getName() {
        return btn_login.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return btn_login.getText().toString().trim();
    }

    public HttpParams onStart(int what){
        return AccountNet.getInstance().login(mContext,"13255187325","111111");
    }
    public void onSuccess(int what, String result, boolean hashCache){
        Toast.makeText(mActivity,result,Toast.LENGTH_SHORT).show();

    }
    public void onError(int what, int code, String message){
        Toast.makeText(mActivity,message,Toast.LENGTH_SHORT).show();

    }
}
