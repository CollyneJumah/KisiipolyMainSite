package com.example.kisii_national_polytechnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class InstitutionManagement extends AppCompatActivity {
 private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institution_management);

        webView= findViewById(R.id.webViewInstitutionManagement);
        webView.loadUrl("http://kisiipoly.ac.ke/institutional/");
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
