package com.example.facebook;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.facebook.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        aa = findViewById(R.id.web);
        WebSettings webSettings  = aa.getSettings();
        webSettings.setJavaScriptEnabled(true);
        aa.loadUrl("https://www.facebook.com");
        aa.setWebViewClient(new WebViewClient());
        aa.setScrollBarStyle(View.SCROLLBARS_INSIDE_INSET);
    }

    public void onBarPressed(){
        if(aa.canGoBack()){
            aa.goBack();
        }
        else{
            super.onBackPressed();
        }
    }

}