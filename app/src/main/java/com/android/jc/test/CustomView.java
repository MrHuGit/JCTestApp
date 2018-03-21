package com.android.jc.test;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.android.jc.util.LogUtil;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/1 10:15
 * @describe
 * @update
 */

public class CustomView extends View{
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.i("CustomView,dispatchTouchEvent()",String.valueOf(event.getAction()));
        return super.dispatchTouchEvent(event);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtil.i("CustomView,onTouchEvent()",String.valueOf(event.getAction()));
        return super.onTouchEvent(event);
    }
}
