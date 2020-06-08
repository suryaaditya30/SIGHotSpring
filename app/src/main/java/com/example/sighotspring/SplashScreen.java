package com.example.sighotspring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private final int panjang_splash = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent tampil = new Intent(SplashScreen.this,MainActivity.class);
                SplashScreen.this.startActivity(tampil);
                SplashScreen.this.finish();
            }
        }, panjang_splash);
    }
}
