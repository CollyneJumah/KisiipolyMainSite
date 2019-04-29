package com.example.kisii_national_polytechnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class HealthScience extends AppCompatActivity {
 private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_science);

        webView =findViewById(R.id.webViewHealthScience);
        webView.loadUrl("http://kisiipoly.ac.ke/health.sciences/");
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
