package com.android.jc.thread;

import com.android.jc.util.LogUtil;

/**
 * 作   者：胡先生（
 * 公   司：深圳市思迪信息技术股份有限公司
 * 日   期： 2017/12/7 星期四 10:06
 * 版   本：1.0.0
 * 说   明：
 * 修   改：
 */

public class ThreadCreate {

    public static void create() {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        thread1.start();
        thread2.run();
        Thread thread3 = new MyThread(new Runnable() {
            @Override
            public void run() {
                LogUtil.i("ThreadCreate3：",  ",thread run");
            }
        });
        thread3.start();
    }

    public static class MyThread extends Thread {
        public MyThread() {
            super();
        }

        public MyThread(Runnable runnable) {
            super(runnable);
        }

        @Override
        public void run() {
            super.run();
            LogUtil.i("ThreadCreate：", getName(), ",thread run");
        }
    }


}
