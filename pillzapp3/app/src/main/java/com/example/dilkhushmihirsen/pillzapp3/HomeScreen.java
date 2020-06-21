package com.example.dilkhushmihirsen.pillzapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;




public class HomeScreen extends AppCompatActivity {
    public Button MedScreen;
    /**
     *
     */
    public Button ReportScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        MedScreen = (Button) this.findViewById(R.id.MedScreen);
        Button ASButton = (Button) findViewById(R.id.asButton);
        ASButton.setOnClickListener(new View.onClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent(this, ASLevelActivity.class);
                                            startActivity(intent);
                                        }
        this.MedScreen.setOnClickListener(this.backButtonClickListener);
        ReportScreen = (Button) this.findViewById(R.id.ReportScreen);
        ReportScreen.setOnClickListener(this.backButtonClickListener);
    }
    //this.btnAddFriedtoFacebook.setOnClickListener(this.backButtonClickListener);}


    public OnClickListener backButtonClickListener = new OnClickListener() {
        public void onClick(final View v) {
            if (v == MatchInfoActivity.this.MedScreen) {
                Intent intent_1 = new Intent(HomeScreen.this, MedScheduleScreen.class);
                startActivity(intent_1);
                finish();
            }
            if (v == ReportScreen) {
                Intent intent_2 = new Intent(HomeScreen.this, ReportScreen.class);
                startActivity(intent_2);
                finish();
            }
        }
};}




       /*switch (view.getId()) {
               case R.id.MedScreen:
               Intent intent_1 = new Intent(HomeScreen.this, MedScheduleScreen.class);
        startActivity(intent_1);
        finish();
        break;
        case R.id.ReportScreen:
        Intent intent_2 = new Intent(HomeScreen.this, ReportScreen.class);
        startActivity(intent_2);
        finish();
        break;
        }*/