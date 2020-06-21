package com.example.dilkhushmihirsen.pillzapp8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        Button MedS = findViewById(R.id.MedS);
        MedS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_next=new Intent(HomeScreen.this,MedSchedule.class);
                startActivity(intent_next);
                finish();
            }


        });



        Button ReS = findViewById(R.id.ReS);
        ReS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_next=new Intent(HomeScreen.this,HomeScreen.class);
                startActivity(intent_next);
                finish();
            }


        });

    }
}
