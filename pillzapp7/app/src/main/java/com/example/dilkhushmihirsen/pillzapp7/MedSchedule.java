package com.example.dilkhushmihirsen.pillzapp7;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.database.Cursor;


import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;


public class MedSchedule extends AppCompatActivity {
    private List<Med> medList = new ArrayList<>();
    private RecyclerView recyclerView;
    RecycleAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_schedule);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.adddata);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedSchedule.this, AddData.class);
                startActivity(intent);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new RecycleAdapter(medList);

        recyclerView.setHasFixedSize(true);

        // vertical RecyclerView

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        // horizontal RecyclerView
        // keep movie_list_row.xml width to `wrap_content`
        // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(mLayoutManager);

        // adding inbuilt divider line
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));


        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(mAdapter);


        SQLiteDatabase db = openOrCreateDatabase("db", Context.MODE_PRIVATE, null);


        Med medList = new Med();
        try {
            Cursor cursor = db.rawQuery("select * from  PILLZAPP ", null);
            //StringBuffer stringBuffer = new StringBuffer();
            while (cursor.moveToNext()) {
                medList = new Med();
                int sno = cursor.getInt(cursor.getColumnIndexOrThrow("sno"));
                String name = cursor.getString(cursor.getColumnIndexOrThrow("med"));
                String descrip = cursor.getString(cursor.getColumnIndexOrThrow("descrip"));
                String cdate = cursor.getString(cursor.getColumnIndexOrThrow("cdate"));
                String sdate = cursor.getString(cursor.getColumnIndexOrThrow("sdate"));
                String edate = cursor.getString(cursor.getColumnIndexOrThrow("edate"));
                String status = cursor.getString(cursor.getColumnIndexOrThrow("status"));


                medList.setId(sno);
                medList.setMed(name);
                medList.setDesc(descrip);
                medList.setStart(sdate);
                medList.setEnd(edate);
                medList.setStatus(status);
                medList.setCreate(cdate);


                mAdapter.notifyDataSetChanged();

                //prepareMedData();
            }
        }
        catch (Exception e)
        {
            FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.adddata);
            fab1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MedSchedule.this, AddData.class);
                    startActivity(intent);
                }
            });

        }
    }
}



    /**
     * Prepares sample data to provide data set to adapter
     */
    /*private void prepareMedData() {


        SQLiteDatabase db = SQLiteDatabase.openDatabase("data/data/package com.example.dilkhushmihirsen.pillzapp7/databases/Pillzapp.db",null, 0, null);
        db.enableWriteAheadLogging();



        Med medList = new Med();
        Cursor cursor = db.rawQuery("select * from  medRecord ;", null);
        StringBuffer stringBuffer = new StringBuffer();
        while (cursor.moveToNext()) {
            medList = new Med();
            int sno = cursor.getInt(cursor.getColumnIndexOrThrow("sno"));
            String name = cursor.getString(cursor.getColumnIndexOrThrow("med"));
            String descrip = cursor.getString(cursor.getColumnIndexOrThrow("descrip"));
            String cdate = cursor.getString(cursor.getColumnIndexOrThrow("cdate"));
            String sdate = cursor.getString(cursor.getColumnIndexOrThrow("sdate"));
            String edate = cursor.getString(cursor.getColumnIndexOrThrow("edate"));
            String status = cursor.getString(cursor.getColumnIndexOrThrow("status"));


            medList.setId(sno);
            medList.setMed(name);
            medList.setDesc(descrip);
            medList.setStart(sdate);
            medList.setEnd(edate);
            medList.setStatus(status);
            medList.setCreate(cdate);



            mAdapter.notifyDataSetChanged();
        }


}*/
