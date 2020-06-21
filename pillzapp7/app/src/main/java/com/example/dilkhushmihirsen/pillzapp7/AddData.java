package com.example.dilkhushmihirsen.pillzapp7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.*;
import android.view.*;
import android.app.*;

import java.text.ParseException;
import java.util.*;
import android.database.sqlite.*;
import android.content.*;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.*;
import java.lang.String;
import android.text.Editable;
import java.text.SimpleDateFormat;


public class AddData extends AppCompatActivity implements OnItemSelectedListener  {

    public  static int count=0;

    SQLiteDatabase db;

    public TextView textView8,textView9, textView10, textView19, textView20,textView21,textView22,textView26,textView27,textView23,textView24,textView28,textView30;
    public EditText mednam,desc,start,end,time,phonum,sno;
    public CheckBox sun,mon,tue,wed,thur,fri,sat,afood,bfood,phone,sms,inapp;
    public Spinner before,snooze,phocode;
    public int ssun,smon,stue,swed,sthur,sfri,ssat,safood,sbfood,ssms,sinapp,sphone,id;
    public String stime,btime,code;
    DBHandler dbh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);






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

        //sno = (EditText) findViewById(R.id.sno) ;
          mednam = (EditText) findViewById(R.id.medname);
          desc = (EditText) findViewById(R.id.desc);
          phonum = (EditText) findViewById(R.id.phonum);
         start = (EditText) findViewById(R.id.start);
         end = (EditText) findViewById(R.id.end);
         time = (EditText) findViewById(R.id.time);




        sun = (CheckBox) findViewById(R.id.sun);
        mon = (CheckBox) findViewById(R.id.mon);
        tue = (CheckBox) findViewById(R.id.tue);
        wed = (CheckBox) findViewById(R.id.wed);
        thur = (CheckBox) findViewById(R.id.thur);
        fri = (CheckBox) findViewById(R.id.fri);
        sat = (CheckBox) findViewById(R.id.sat);
        afood = (CheckBox) findViewById(R.id.checkBox9);
        bfood = (CheckBox) findViewById(R.id.checkBox10);
        sms = (CheckBox) findViewById(R.id.sms);
        phone = (CheckBox) findViewById(R.id.phone);
        inapp = (CheckBox) findViewById(R.id.app);

        before = (Spinner) findViewById(R.id.before);
        snooze = (Spinner) findViewById(R.id.after);
        phocode = (Spinner) findViewById(R.id.phocode);






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



        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                final int mYear = c.get(Calendar.YEAR);
                final int mMonth = c.get(Calendar.MONTH);
                final int mDay = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(end.getContext(),
                        new DatePickerDialog.OnDateSetListener() {

                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onDateSet(DatePicker view, int dayOfMonth,
                                                  int monthOfYear, int year) {

                                end.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mDay, mMonth, mYear);
                datePickerDialog.show();
            }
        });


        //Checkbox status
        if (sun.isChecked()) {
             ssun = 1;
        } else {
             ssun = 0;
        }

        if (mon.isChecked()) {
             smon = 1;
        } else {
             smon = 0;
        }

        if (tue.isChecked()) {
             stue = 1;
        } else {
             stue = 0;
        }

        if (wed.isChecked()) {
             swed = 1;
        } else {
             swed = 0;
        }

        if (thur.isChecked()) {
             sthur = 1;
        } else {
             sthur = 0;
        }

        if (fri.isChecked()) {
             sfri = 1;
        } else {
             sfri = 0;
        }

        if (sat.isChecked()) {
             ssat = 1;
        } else {
             ssat = 0;
        }

        if (afood.isChecked()) {
             safood = 1;
        } else {
             safood = 0;
        }

        if (bfood.isChecked()) {
             sbfood = 1;
        } else {
             sbfood = 0;
        }

        if (sms.isChecked()) {
             ssms = 1;
        } else {
             ssms = 0;
        }

        if (phone.isChecked()) {
             sphone = 1;
        } else {
             sphone = 0;
        }

        if (inapp.isChecked()) {
             sinapp = 1;
        } else {
             sinapp = 0;
        }





        // Spinner click listener

        before.setOnItemSelectedListener(this);
        {
            // Spinner Drop down elements
            List<String> blist = new ArrayList<String>();
            blist.add("15 Minutes");
            blist.add("30 Minutes");
            blist.add("45 Minutes");
            blist.add("1 hour");

            before.setPrompt("Select a time");
            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, blist);

            // Drop down layout style - list view with radio button
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            before.setAdapter(dataAdapter);
        }





        // Spinner click listener
        snooze.setOnItemSelectedListener(this);
        {
            // Spinner Drop down elements
            List<String> slist = new ArrayList<String>();
            slist.add("15 Minutes");
            slist.add("30 Minutes");
            slist.add("45 Minutes");
            slist.add("1 hour");

            snooze.setPrompt("Select a time");


            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, slist);

            // Drop down layout style - list view with radio button
            dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            snooze.setAdapter(dataAdapter1);


        }



        phocode.setOnItemSelectedListener(this);
        {
            // Spinner Drop down elements
            List<String> sphocode = new ArrayList<String>();
            sphocode.add("+91");
            sphocode.add("+33");

            phocode.setPrompt("Select a code");


            // Creating adapter for spinner
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sphocode);

            // Drop down layout style - list view with radio button
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            phocode.setAdapter(dataAdapter2);


        }






        Button create = findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                id=++count;
                String lmednam=mednam.getText().toString().trim();
                if(TextUtils.isEmpty(lmednam)){mednam.setError("Empty");}
                String ldesc=desc.getText().toString();
                String lstart=start.getText().toString();
                String lend=end.getText().toString();
                String ltime=time.getText().toString();
                String lphonum=phonum.getText().toString();

                dbh = new DBHandler(getApplicationContext());
                //dbh.insert(id,lmednam,ldesc ,"12-09-12",lstart ,lend ,"Active",ltime, ssun,  smon, stue, swed, sthur,  sfri, ssat, safood,  sbfood, sphone,  ssms,  sinapp, btime, stime, code, lphonum );
                //public void insert(int sno, String mednam, String desc, String cdate, String sdate, String edate, String status,String atime, int sun, int mon, int tue,int wed,int thur, int fri,int sat,int afood, int bfood,int inphone, int insms, int inapp,String btime,String stime,String phocode, String phonum){
                String SQLiteQuery = "INSERT INTO PILLZAPP( sno, mednam, desc, cdate, sdate, edate, status, atime, sun, mon, tue, wed, thur, fri, sat, afood, bfood, inphone, insms, inapp, btime, stime, phocode, phonum) VALUES("+id+",'"+lmednam+"','"+ldesc+"' ,'12-09-12','"+lstart+"' ,'"+lend+"' ,'Active','"+ltime+"', ssun,  smon, stue, swed, sthur,  sfri, ssat, safood,  sbfood, sphone,  ssms,  sinapp, btime, stime, code, lphonum ););";
                db.execSQL(SQLiteQuery);







                /*String dmednam = (String) mednam.getText().toString();
                String ddesc = (String) desc.getText().toString();
                String dstart = (String) start.getText().toString();
                String dend = (String) end.getText().toString();
                String dphonum = (String) phonum.getText().toString();*/




                //db.execSQL("INSERT INTO medRecord VALUES('"+id+"','"+String.valueOf(mednam.getText())+"','"+String.valueOf(desc.getText())+"','datetime('now', 'localtime')','"+String.valueOf(start.getText())+"','"+String.valueOf(end.getText())+"','Active','"+String.valueOf(time.getText())+"','ssun','smon',stue,'swed','sthur','sfri','ssat','safood','sbfood','sphone','ssms','sinapp','btime','stime','code','"+String.valueOf(phonum.getText())+"')");
                Intent intent_next = new Intent(AddData.this,MedSchedule.class);
                startActivity(intent_next);




            }



        });







    }





        //spinner
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if(parent.getId() == R.id.before)
            {
                btime = parent.getItemAtPosition(position).toString();



                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Selected: " + btime, Toast.LENGTH_LONG).show();
            }
            else if(parent.getId() == R.id.after)
            {
                stime = parent.getItemAtPosition(position).toString();



                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Selected: " + stime, Toast.LENGTH_LONG).show();
            }
            else if(parent.getId()==R.id.phocode){
                code = parent.getItemAtPosition(position).toString();



                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Selected: " + phocode, Toast.LENGTH_LONG).show();
            }


        }
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub
        }








            }






