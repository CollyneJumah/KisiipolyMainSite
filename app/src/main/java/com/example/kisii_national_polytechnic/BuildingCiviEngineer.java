package com.example.kisii_national_polytechnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class BuildingCiviEngineer extends AppCompatActivity {
 private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_civi_engineer);

        webView= findViewById(R.id.webViewBuildingCivilEngineer);
        webView.loadUrl("http://kisiipoly.ac.ke/building");
        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
