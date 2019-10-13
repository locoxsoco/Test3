package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        myWebView.loadUrl("https://developerplatform.typeform.com/to/FwnRyS");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //myWebView.loadUrl("https://valeriaurbina.typeform.com/to/GMWAZp");

    }
}
