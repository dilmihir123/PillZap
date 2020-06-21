package com.example.dilkhushmihirsen.pillzapp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DisplayDet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_det);

        //ImageButton Del,Edit,Copy;

        ImageButton del =(ImageButton) findViewById(R.id.del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //delete data in db using the id

            }
        });




        ImageButton edit =(ImageButton) findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //retrieve from db

            }
        });


        ImageButton copy =(ImageButton) findViewById(R.id.copy);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //retrieve from db and create a copy

            }
        });



    }
}
