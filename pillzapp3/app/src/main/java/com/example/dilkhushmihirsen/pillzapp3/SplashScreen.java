package com.example.dilkhushmihirsen.pillzapp3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spashscreen);
        int SPLASH_DISPLAY_LENGTH = 2500;

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent_next=new Intent(SplashScreen.this,HomeScreen.class);
                overridePendingTransition(R.layout.slide_in_right,R.layout.slide_out_right);
                startActivity(intent_next);
                finish();
                Intent mainIntent = new Intent(SplashScreen.this,Menu.class);

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
