package com.example.dilkhushmihirsen.pillazapp4;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         View view;
        setContentView(R.layout.activity_home_screen);



        Button MedScreen = findViewById(R.id.MedScreen);
        MedScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //function

            }


        });



        Button ReportScreen = findViewById(R.id.ReportScreen);
        ReportScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //function

            }


        });



        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton);
        ReportScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //function
                Intent i=new Intent(HomeScreen.this,spa)
                        i.putExtra();

                


            }


        });






    }


}
