package com.example.androidminiappcontact;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler  extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION=1;
    private static final String DATABASENAME="DBContactFavoris.db";
    private static final String TABLE_NAME="Contact";
    private static final String KEY_ID="id";
    private static final String KEY_NAME="Nom";
    private static final String KEY_NUMBER="Num";
    private SQLiteDatabase mdb;

    private static final String CREATE_TABLE= "create table " +TABLE_NAME+ "( "+
            KEY_ID+ " "+ "INTEGER PRIMARY KEY autoincrement,"
             + KEY_NAME+ "TEXT," +KEY_NUMBER+ "TEXT);";

    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASENAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table "+TABLE_NAME);
        onCreate(db);

    }

    public long addContact(Contact c){
        mdb=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(KEY_NAME,c.getNom());
        cv.put(KEY_NUMBER,c.getNum());
        long x= mdb.insert(TABLE_NAME,null,cv);
        mdb.close();
        return x;
    }
}
