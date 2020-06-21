package com.example.dilkhushmihirsen.m2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void joshua(View view){

        Toast.makeText(getApplicationContext(),"dilkush",Toast.LENGTH_LONG).show();
    }}
