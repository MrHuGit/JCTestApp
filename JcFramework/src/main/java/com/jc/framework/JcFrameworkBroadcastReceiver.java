package com.jc.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 10:16
 * @describe
 * @update
 */

public class JcFrameworkBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(action)) {

        }
    }
}
