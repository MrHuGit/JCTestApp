package com.jc.framework;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import com.jc.framework.configuration.ConfigurationManager;
import com.jc.framework.exception.RepeatInitializeException;
import com.jc.framework.utils.AppUtils;
import com.jc.framework.utils.UtilManager;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/9 14:04
 * @describe
 * @update
 */

public class JcFrameworkInitialize {
    private boolean hasInitialize = false;
    private Application mApplication;
    private Activity mTopActivity;
    private JcFrameworkBroadcastReceiver mJcBroadcastReceiver;

    private JcFrameworkInitialize() {
    }

    /**
     * 获取单例
     *
     * @return
     */
    public static JcFrameworkInitialize getInstance() {
        return Holder.sInstance;
    }


    /**
     * 初始化
     *
     * @param application
     */
    public void initialize(Application application) {
        if (AppUtils.checkMainProcess(application)) {
            if (hasInitialize) {
                throw new RepeatInitializeException(JcFrameworkInitialize.class);
            }
            hasInitialize = true;
            mApplication = application;
            ConfigurationManager.getInstance().parserXml(mApplication);
            String showLog=ConfigurationManager.getInstance().getValue("logShow");
            if ("true".equals(showLog)){
                UtilManager.setLoginShow(true);
            }
            mApplication.registerActivityLifecycleCallbacks(new LifecycleCallBack());
            IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
            mJcBroadcastReceiver = new JcFrameworkBroadcastReceiver();
            registerReceiver(mJcBroadcastReceiver,filter);


        }
    }

    public void onTerminate() {
        mApplication.unregisterReceiver(mJcBroadcastReceiver);
    }

    /**
     * 获取全局Application
     *
     * @return
     */
    public Application getApplication() {
        return mApplication;
    }

    /**
     * 获取当前显示的Activity
     *
     * @return
     */
    public Activity getTopActivity() {
        return mTopActivity;
    }


    private void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        mApplication.registerReceiver(broadcastReceiver, intentFilter);
    }

    /**
     * 内部类单例创建
     */
    private static class Holder {
        private static JcFrameworkInitialize sInstance = new JcFrameworkInitialize();
    }


    private  class LifecycleCallBack implements Application.ActivityLifecycleCallbacks{

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

        }

        @Override
        public void onActivityStarted(Activity activity) {

        }

        @Override
        public void onActivityResumed(Activity activity) {
            mTopActivity = activity;
        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {
//                    if (runBackgroundTips) {
//                        boolean runInBackground = AppUtils.checkAppRunInBackground(activity);
//                        if (!runInBackground) {
//                            Toast.makeText(activity, AppUtils.getAppName(activity) + "应用在后台运行，请注意！", Toast.LENGTH_LONG).show();
//                        }
//                    }
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

        }

        @Override
        public void onActivityDestroyed(Activity activity) {

        }
    }

}
