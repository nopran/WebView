package com.example.razor.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView wb; //inisiasi nama Webview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wb = (WebView) findViewById(R.id.wb); //insialisasi webview pada layout
        WebSettings webSettings = wb.getSettings(); //insiasi untuk menggunakan websettings
        webSettings.setJavaScriptEnabled(true); // fungsi mengaktifkan javascript
        wb.loadUrl("file:///android_asset/index.html");//fungsi yang digunakan untuk meload sebuah halaman web
    }
}
