package com.example.dilkhushmihirsen.pillzapp7;

/**
 * Created by dilkhushmihirsen on 22/05/19.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Spinner;

import java.util.ArrayList;

public  class DBHandler extends SQLiteOpenHelper {


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


    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }





    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE IF NOT EXISTS" + TABLE_NAME + "(" + SNO_COL + " INTEGER," + MED_COL + " TEXT," + DESCRIP_COL + " TEXT," + CDATE_COL + " DATE," + SDATE_COL + " DATE," + EDATE_COL + " DATE," + STATUS_COL + " TEXT," + ATIME_COL + " TIME," + SSUN_COL + " NUMBER," + SMON_COL + " NUMBER, " + STUE_COL + " NUMBER, " + SWED_COL + " NUMBER, " + STHUR_COL + " NUMBER," + SFRI_COL + " NUMBER," + SSAT_COL + " NUMBER, " + SAFOOD_COL + " NUMBER," + SBFOOD_COL + " NUMBER," + SPHONE_COL + " NUMBER," + SSMS_COL + " NUMBER," + SINAPP_COL + " NUMBER," + SBTIME_COL + " TIME, " + SSTIME_COL + " TIME, " + SPHOCODE_COL + " NUMBER, " + SPHONUMBER_COL + " NUMBER)";
        db.execSQL(query);

    }

    /*public void insert(int sno, String mednam, String desc, String cdate, String sdate, String edate, String status, String atime, int sun, int mon, int tue, int wed, int thur, int fri, int sat, int afood, int bfood, int inphone, int insms, int inapp, String btime, String stime, String phocode, String phonum){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(SNO_COL,sno);
        values.put(MED_COL,mednam);
        values.put(DESCRIP_COL,desc);
        values.put(CDATE_COL,cdate);
        values.put(EDATE_COL,edate);
        values.put(SDATE_COL,sdate);
        values.put(STATUS_COL,status);
        values.put(ATIME_COL,atime);
        values.put(SSUN_COL,sun);
        values.put(SMON_COL,mon);
        values.put(STUE_COL,tue);
        values.put(SWED_COL,wed);
        values.put(STHUR_COL,thur);
        values.put(SFRI_COL,fri);
        values.put(SSAT_COL,sat);
        values.put(SAFOOD_COL,afood);
        values.put(SBFOOD_COL,bfood);
        values.put(SPHONE_COL,inphone);
        values.put(SSMS_COL,insms);
        values.put(SINAPP_COL,inapp);
        values.put(SBTIME_COL,btime);
        values.put(SSTIME_COL,stime);
        values.put(SPHOCODE_COL,phocode);
        values.put(SPHONUMBER_COL,phonum);

        db.insert(TABLE_NAME,null,values);
        db.close();

    }*/

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
