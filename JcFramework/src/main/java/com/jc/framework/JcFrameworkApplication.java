package com.jc.framework;

import android.app.Application;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 10:20
 * @describe
 * @update
 */

public class JcFrameworkApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        JcFrameworkInitialize.getInstance().initialize(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        JcFrameworkInitialize.getInstance().onTerminate();
    }
}
