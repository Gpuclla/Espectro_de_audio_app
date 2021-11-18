package com.example.multimedia;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.lespinside.simplepanorama.view.SphericalView;
import com.panoramagl.utils.PLUtils;

public class MainActivity extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web= findViewById(R.id.web);
        String Url= "file://android_asset/index.html";
        web.loadUrl(Url);

    }
}