package com.example.dilkhushmihirsen.pillzapp5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;
import java.util.*;



public class AddData extends AppCompatActivity {

    public TextView textView8,textView9, textView10, textView19, textView20,textView21,textView22,textView26,textView27,textView23,textView24,textView28,textView30;
    public EditText mednam,desc,start,end,time,phonum;
    private static final String DB_NAME = "db";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "PILLZAPP";
    private static final String SNO_COL = "sno";
    private static final String MED_COL = "med";
    private static final String DESCRIP_COL = "descrip";
    private static final String CDATE_COL = "cdate";
    private static final String SDATE_COL = "sdate";
    private static final String EDATE_COL = "edate";
    private static final String STATUS_COL = "status";
    private static final String ATIME_COL = "atime";
    private static final String SSUN_COL = "ssun";
    private static final String SMON_COL = "smon";
    private static final String STUE_COL = "stue";
    private static final String SWED_COL = "swed";
    private static final String STHUR_COL = "sthur";
    private static final String SFRI_COL = "sfri";
    private static final String SSAT_COL = "ssat";
    private static final String SAFOOD_COL = "safood";
    private static final String SBFOOD_COL = "sbfood";
    private static final String SPHONE_COL = "sphone";
    private static final String SSMS_COL = "ssms";
    private static final String SINAPP_COL = "sinapp";
    private static final String SBTIME_COL = "sbtime";
    private static final String SSTIME_COL = "sstime";
    private static final String SPHOCODE_COL = "sphocode";
    private static final String SPHONUMBER_COL = "sphonumber";
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);


         //final int mYear,mMonth,mDay;

        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView20 = (TextView) findViewById(R.id.textView20);
        textView21 = (TextView) findViewById(R.id.textView21);
        textView22 = (TextView) findViewById(R.id.textView22);
        textView26 = (TextView) findViewById(R.id.textView26);
        textView27 = (TextView) findViewById(R.id.textView27);
        textView23 = (TextView) findViewById(R.id.textView23);
        textView24 = (TextView) findViewById(R.id.textView24);
        textView28 = (TextView) findViewById(R.id.textView28);
        textView30 = (TextView) findViewById(R.id.textView30);





        mednam = (EditText) findViewById(R.id.mednam);
        desc = (EditText) findViewById(R.id.desc);
        phonum = (EditText) findViewById(R.id.phonum);
        start = (EditText) findViewById(R.id.start);
        end = (EditText) findViewById(R.id.end);
        time =(EditText)findViewById(R.id.time);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                  final int mYear = c.get(Calendar.YEAR);
                  final int mMonth = c.get(Calendar.MONTH);
                  final int mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(start.getContext(),
                        new DatePickerDialog.OnDateSetListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onDateSet(DatePicker view, int dayOfMonth,
                                                  int monthOfYear, int year) {

                                start.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mDay, mMonth, mYear);
                datePickerDialog.show();
            }
        });
        end.setOnClickListener((View.OnClickListener) new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                final int mYear = c.get(Calendar.YEAR);
                final int mMonth = c.get(Calendar.MONTH);
                final int mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(end.getContext(),
                        new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int dayOfMonth,
                                          int monthOfYear, int year) {

                        start.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                    }
                }, mDay, mMonth, mYear);
                datePickerDialog.show();
            }
        });






        Button create = findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String query = "CREATE TABLE IF NOT EXISTS" + TABLE_NAME + "(" + SNO_COL + " INTEGER," + MED_COL + " TEXT," + DESCRIP_COL + " TEXT," + CDATE_COL + " DATE," + SDATE_COL + " DATE," + EDATE_COL + " DATE," + STATUS_COL + " TEXT," + ATIME_COL + " TIME," + SSUN_COL + " NUMBER," + SMON_COL + " NUMBER, " + STUE_COL + " NUMBER, " + SWED_COL + " NUMBER, " + STHUR_COL + " NUMBER," + SFRI_COL + " NUMBER," + SSAT_COL + " NUMBER, " + SAFOOD_COL + " NUMBER," + SBFOOD_COL + " NUMBER," + SPHONE_COL + " NUMBER," + SSMS_COL + " NUMBER," + SINAPP_COL + " NUMBER," + SBTIME_COL + " TIME, " + SSTIME_COL + " TIME, " + SPHOCODE_COL + " NUMBER, " + SPHONUMBER_COL + " NUMBER)";
                db.execSQL(query);
                /*Bundle bundle = new Bundle();

                //bundle.putString(“”, getrec);

                bundle.putString("mednam", mednam.getText().toString());
                bundle.putString("desc", desc.getText().toString());
                bundle.putString("start", start.getText().toString());
                bundle.putString("end", end.getText().toString());
                //finish();

                Intent intent_next=new Intent(AddData.this,MedSchedule.class);
                startActivity(intent_next);
                intent_next.putExtras(bundle);*/
            }


        });

    }
}
