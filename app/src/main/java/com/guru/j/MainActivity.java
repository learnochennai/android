package com.guru.j;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);



        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("file:///android_asset/index.html");
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }

    private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

}