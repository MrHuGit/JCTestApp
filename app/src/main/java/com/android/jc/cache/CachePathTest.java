package com.android.jc.cache;

import android.content.Context;
import android.os.Environment;

import com.android.jc.util.LogUtils;


/**
 * 作    者：胡结才
 * 公    司：深圳市思迪信息技术股份有限公司
 * 创建日期：2017/9/19 11:14
 * 版    本：1.0.0
 * 说    明：
 * 修    改：
 */

public class CachePathTest {

    public static void showAllPath(Context context) {
        String packageResourcePath = context.getPackageResourcePath();
        LogUtils.i("packageResourcePath:" ,packageResourcePath);
        if (context.getExternalCacheDir() != null) {
//            String externalCacheDir = context.getExternalCacheDir().getAbsolutePath();
            String externalCacheDirPath=context.getExternalCacheDir().getPath();
//            LogUtils.i("externalCacheDir,AbsolutePath:" + externalCacheDir);
            LogUtils.i("externalCacheDirPath:" + externalCacheDirPath);
        }
        String cacheDir=context.getCacheDir().getPath();
//        String cacheDirAbsolutePath=context.getCacheDir().getAbsolutePath();
//        LogUtils.i("cacheDir,AbsolutePath:" + cacheDirAbsolutePath);
        LogUtils.i("cacheDirPath:" + cacheDir);
        /**
         * /data/data/com.android.jc/files
         */
        String filesDir=context.getFilesDir().getPath();
        LogUtils.i("filesDirPath:" + filesDir);
        String dataDir= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            dataDir = context.getDataDir().getPath();
        }
        LogUtils.i("dataDirPath:" + dataDir);
        String codeCacheDir= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            codeCacheDir = context.getCodeCacheDir().getPath();
        }
        LogUtils.i("codeCacheDirPath:" + codeCacheDir);

        Environment.getDataDirectory().getPath();
//        获得根目录/data 内部存储路径
        Environment.getDownloadCacheDirectory().getPath();
//        获得缓存目录/cache
        Environment.getExternalStorageDirectory().getPath();
//        获得SD卡目录/mnt/sdcard（获取的是手机外置sd卡的路径）
        Environment.getRootDirectory().getPath();
//        获得系统目录/system

    }
}
