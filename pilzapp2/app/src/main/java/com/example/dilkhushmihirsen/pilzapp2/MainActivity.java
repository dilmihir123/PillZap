package com.example.dilkhushmihirsen.pilzapp2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int SPLASH_DISPLAY_LENGTH = 5000;

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent_next=new Intent(MainActivity.this,Main2Activity.class);
                overridePendingTransition(R.layout.slide_in_right,R.layout.slide_out_right);
                startActivity(intent_next);
                finish();
                //Intent mainIntent = new Intent(Splash.this,Menu.class);

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
