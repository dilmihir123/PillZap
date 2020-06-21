package com.example.dilkhushmihirsen.pillzapp8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.*;
import android.content.*;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        int SPLASH_DISPLAY_LENGTH = 5000;

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent_next=new Intent(SplashScreen.this,HomeScreen.class);
                startActivity(intent_next);
                finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
