package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.test3.ui.login.StartMenu;

public class Formulario extends AppCompatActivity {
    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        // Definimos el webView
        browser=(WebView) findViewById(R.id.webview);

        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // Cargamos la web
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("https://developerplatform.typeform.com/to/FwnRyS");

        //WebView myWebView = new WebView(this);
        //setContentView(myWebView);
        //myWebView.loadUrl("https://developerplatform.typeform.com/to/FwnRyS");
        //WebSettings webSettings = myWebView.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        //setContentView(R.layout.activity_formulario);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (browser.canGoBack()) {
                        browser.goBack();
                    } else {
                        Intent sgt = new Intent(this, TheMainOne.class);
                        startActivity(sgt);
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}
