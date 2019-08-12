package com.example.navigation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent i=new Intent(SplashActivity.this,MainActivity.class);
        startActivity(i);
        finish();
    }
},3000);
    }
}
