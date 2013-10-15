package com.example.geekmoodclient.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.geekmoodclient.R;

public class SplashActivity extends Activity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.splash);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        
        finish();
    }

}
