package com.android.jc.test;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import com.android.jc.R;
import com.android.jc.util.LogUtil;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/1 10:17
 * @describe
 * @update
 */

public class TestTouchActivity extends AppCompatActivity{
    private CustomView mCustomView;
    private CustomViewGroup mCustomViewGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_touch);
        mCustomView=findViewById(R.id.customView);
        mCustomViewGroup=findViewById(R.id.customViewGroup);
        mCustomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtil.i("CustomView onClick");
                mCustomView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        });
       mCustomViewGroup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               LogUtil.i("CustomViewGroup onClick");
           }
       });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.i("TestTouchActivity,dispatchTouchEvent()",String.valueOf(event.getAction()));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtil.i("TestTouchActivity,onTouchEvent()",String.valueOf(event.getAction()));
        return super.onTouchEvent(event);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
