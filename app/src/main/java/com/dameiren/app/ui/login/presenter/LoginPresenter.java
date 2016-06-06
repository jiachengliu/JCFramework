package com.dameiren.app.ui.login.presenter;


import android.support.annotation.Nullable;

import com.dameiren.app.callback.CommonCallback;
import com.dameiren.app.core.MyConstants;
import com.dameiren.app.ui.login.view.LoginView;
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.request.BaseRequest;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Description: 主导器处理model的view
 * Author:
 * Date:
 * Time: 11:39
 */
public class LoginPresenter {

    private LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
    }

    public void login(String name, String password ) {
        OkHttpUtils.post(MyConstants.Action.ACTION_ACCOUNT_LOGIN)//
                .tag(this)//
                .headers("account", "13255187325")//
                .params("account", "13255187325")//
                .params("password", "111111")//
                .execute(new HttpsCallBack());
    }
    private class HttpsCallBack extends CommonCallback<String> {

        @Override
        public String parseNetworkResponse(Response response) throws Exception {
            return response.body().string();
        }
        @Override
        public void onResponse(boolean isFromCache, String data, Request request, Response response) {
//            handleResponse(isFromCache, data, request, response);
//            Toast.makeText(LoginActivity.this, data, Toast.LENGTH_SHORT).show();
        }


        @Override
        public void onError(boolean isFromCache, Call call, @Nullable Response response, @Nullable Exception e) {
            super.onError(isFromCache, call, response, e);
//            handleError(isFromCache, call, response);
//            Toast.makeText(LoginActivity.this,response.message().trim(),Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onBefore(BaseRequest request) {
            super.onBefore(request);
        }
    }
}
