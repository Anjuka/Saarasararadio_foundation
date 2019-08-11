package com.anjukakoralage.saarasaradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView wV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV = (WebView) findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.loadUrl("http://www.saarasaradio.com");

    }
}
