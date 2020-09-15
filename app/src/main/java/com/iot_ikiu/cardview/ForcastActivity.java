package com.iot_ikiu.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ForcastActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forcast);
        webView =findViewById(R.id.wb_forcast);
        webView.loadUrl("https://www.weather-forecast.com/locations/Tehran/forecasts/latest");
    }
}
