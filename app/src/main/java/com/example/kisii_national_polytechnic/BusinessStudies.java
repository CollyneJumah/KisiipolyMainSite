package com.example.kisii_national_polytechnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class BusinessStudies extends AppCompatActivity {
 private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_studies);

        webView= findViewById(R.id.webViewBusinessStudies);
        webView.loadUrl("http://kisiipoly.ac.ke/bs/");
        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
