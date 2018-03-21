package com.android.jc.test;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import com.android.jc.util.LogUtil;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/1 10:16
 * @describe
 * @update
 */

public class CustomViewGroup extends LinearLayout{
    public CustomViewGroup(Context context) {
        super(context);
    }

    public CustomViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomViewGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.i("CustomViewGroup,dispatchTouchEvent()",String.valueOf(event.getAction()));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        LogUtil.i("CustomViewGroup,onInterceptTouchEvent()",String.valueOf(event.getAction()));
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtil.i("CustomViewGroup,onTouchEvent()",String.valueOf(event.getAction()));
        return super.onTouchEvent(event);
    }
}
