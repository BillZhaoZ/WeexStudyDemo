package com.bill.weexstudydemo;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * @author bill
 * @Date on 2019-11-08
 * @Desc:
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        InitConfig config = new InitConfig.Builder()
                //图片库接口
                //.setImgAdapter(new FrescoImageAdapter())
                //网络库接口
                //.setHttpAdapter(new InterceptWXHttpAdapter())
                .build();

        WXSDKEngine.initialize(this, config);
    }
}
