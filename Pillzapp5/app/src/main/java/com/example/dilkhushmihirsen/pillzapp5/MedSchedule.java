package com.example.dilkhushmihirsen.pillzapp5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import java.util.*;
import android.support.v7.widget.*;
import android.support.design.widget.FloatingActionButton;
import android.view.*;
import android.content.Intent;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.format.*;
import java.text.SimpleDateFormat;
import java.text.*;





public class MedSchedule extends AppCompatActivity {

    private static int count=0;
    List<MedSched> medList = new ArrayList<MedSched>();
    RecyclerView recyclerView;
    MedAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_schedule);


         recyclerView = (RecyclerView) findViewById(R.id.recycler_view);





        mAdapter = new MedAdapter(medList);
        recyclerView.setHasFixedSize(true);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.adddata);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Click action
                Intent intent = new Intent(MedSchedule.this, AddData.class);
                startActivity(intent);
            }
        });


        //Bundle extras = getIntent().getExtras();


        /*if(extras!=null)
        {
            String mednam = getIntent().getExtras().getString("mednam").toString();
            String desc = getIntent().getExtras().getString("desc").toString();
            String start = getIntent().getExtras().getString("start").toString();
            String end = getIntent().getExtras().getString("end").toString();

            Toast.makeText(getApplicationContext(),mednam,Toast.LENGTH_LONG).show();

            int id;
            String  status;

            id=++count;


            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            String create = dateFormat.format(date);





            medList.add(new MedSched(id,mednam, desc,"active",create,start,end));


            mAdapter.notifyDataSetChanged();


        }*/


        //Intent i = getIntent();
        // Receiving the Data

        /*String desc = i.getStringExtra("desc");
        String start = i.getStringExtra("start");
        String end = i.getStringExtra("end");*/
        //Toast.makeText(getApplicationContext(),mednam,Toast.LENGTH_LONG).show();

        /*int id;
        String  status;

        id=++count;


        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String create = dateFormat.format(date);




        MedSched m = new MedSched(id,mednam,desc,"Active",create,start,end);
        medList.add(m);
        mAdapter.notifyDataSetChanged();*/


        prepareMedData();
    }


    private void prepareMedData(){

        int id;
        String  status;

        id=++count;


        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String create = dateFormat.format(date);





        //medList.add(new MedSched(id, nam, des,"active",create,start,end));





        MedSched m = new MedSched(001,"Para","Fever","Active","17-05-2019","17-05-2019","19-05-2019");
        medList.add(m);
        m = new MedSched(001,"Para","Fever","Active","17-05-2019","17-05-2019","19-05-2019");
        medList.add(m);
        m = new MedSched(001,"Para","Fever","Active","17-05-2019","17-05-2019","19-05-2019");
        medList.add(m);
        m = new MedSched(001,"Para","Fever","Active","17-05-2019","17-05-2019","19-05-2019");
        medList.add(m);
        m = new MedSched(001,"Para","Fever","Active","17-05-2019","17-05-2019","19-05-2019");
        medList.add(m);

        mAdapter.notifyDataSetChanged();
    }
}
