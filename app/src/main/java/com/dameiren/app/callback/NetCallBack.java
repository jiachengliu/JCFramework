package com.dameiren.app.callback;

import android.os.Handler;
import android.os.Message;

import com.jingchen.pulltorefresh.PullToRefreshLayout;
import com.lzy.okhttputils.model.HttpParams;

import java.util.Map;

/**
 * 作者:liujiacheng.
 * 日期: 2016/6/1 0001 18:15.
 * 描述：
 */
public interface NetCallBack {

    /**
     * Method_启动处理回调
     *
     * @param what_操作码
     * @return 请求参数
     */
    public HttpParams onStart(int what);
    /**
     * Method_成功处理回调
     *
     * @param what_操作码
     * @param result_请求结果字符串
     */
    public void onSuccess(int what, String result, boolean hashCache);
    /**
     * Method_错误处理回调
     *
     * @param what_操作码
     * @param e_错误码
     * @param message_错误信息
     */
    public void onError(int what, int e, String message);


}
