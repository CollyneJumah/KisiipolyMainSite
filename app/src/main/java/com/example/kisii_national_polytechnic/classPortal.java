package com.example.kisii_national_polytechnic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class classPortal extends Fragment {
    private WebView mWebView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//       return inflater.inflate(R.layout.fragment_portal, container, false);

        View v = inflater.inflate(R.layout.fragment_portal, container, false);
        mWebView = (WebView) v.findViewById(R.id.webViewPortal);
        mWebView.loadUrl("https://portal.kisiiuniversity.ac.ke/");
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());
        return v;

    }
}
