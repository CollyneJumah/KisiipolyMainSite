package com.example.kisii_national_polytechnic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ElectricalAndEe extends AppCompatActivity {
 private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_and_ee);

        webView= (WebView) findViewById(R.id.webViewElectricalEe);
        webView.loadUrl("http://kisiipoly.ac.ke/electrical/");
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
