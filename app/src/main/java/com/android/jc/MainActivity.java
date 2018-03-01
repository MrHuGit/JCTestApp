package com.android.jc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * 作   者：胡先生
 * 公   司：深圳市思迪信息技术股份有限公司
 * 日   期： 2017/12/4 星期一 15:01
 * 版   本：1.0.0
 * 说   明：
 * 修   改：
 */

public class MainActivity extends AppCompatActivity {
final String path="file:///android_asset/gz_test.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView=findViewById(R.id.webview);
        WebSettings settings = webView.getSettings();
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setBuiltInZoomControls(false); //选择内置缩放机制与单独缩放控件；
        settings.setDisplayZoomControls(false); //是否显示缩放控件
        settings.setSupportZoom(false);  //是否支持缩放
//        webView.setInitialScale(145); //第一次显示的缩放比例，例子是120%;
        //注释掉 wb_img.setInitialScale(145); 使用下面代码，则自适应屏幕居中显示
                settings.setUseWideViewPort(true);
                 settings.setLoadWithOverviewMode(true);
//        webView.getSettings().setJavaScriptEnabled(true);//启用js
        webView.getSettings().setBlockNetworkImage(false);//解决图片不显示
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
//            settings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
//        }
        webView.loadUrl(path);
//        webView.loadDataWithBaseURL("file:///storage/emulated/0/Android/data/zhexian.learn.cnblogs/files/zCache/",
//                htmlContent, "text/html", "utf-8", null);
//        CachePathTest.showAllPath(this);
//        ThreadCreate.create();
    }
}
