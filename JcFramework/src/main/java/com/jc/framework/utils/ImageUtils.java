package com.jc.framework.utils;

import android.app.Activity;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 16:05
 * @describe
 * @update
 */

public class ImageUtils {
    private ImageUtils() {

    }

    public static void load(Activity activity, ImageView imageView, String url) {
        if (activity == null || imageView == null || activity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 && activity.isDestroyed()) {
            return;
        }
        Glide.with(activity).load(url).into(imageView);
    }

    public static void load(Activity activity, ImageView imageView, String url, int resourceId) {
        if (activity == null || imageView == null || activity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 && activity.isDestroyed()) {
            return;
        }
        Glide.with(activity).load(url).placeholder(resourceId).into(imageView);
    }

    public static void load(Fragment fragment, ImageView imageView, String url) {
        if (fragment == null || imageView == null || fragment.getActivity().isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 && fragment.getActivity().isDestroyed()) {
            return;
        }
        Glide.with(fragment).load(url).into(imageView);
    }
    public static void load(Fragment fragment, ImageView imageView, String url, int resourceId) {
        if (fragment == null || imageView == null || fragment.getActivity().isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1 && fragment.getActivity().isDestroyed()) {
            return;
        }
        Glide.with(fragment).load(url).placeholder(resourceId).into(imageView);
    }
}
