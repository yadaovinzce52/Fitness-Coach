package com.example.fitnesscoach;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class LoadWeb extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_web);

        webView = (WebView) findViewById(R.id.webViewId);
        String url = getIntent().getExtras().getString("URL");
        webView.loadUrl(url);
    }
}