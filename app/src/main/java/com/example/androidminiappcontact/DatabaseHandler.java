package com.example.androidminiappcontact;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler  extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "DBcontactsFavoris";

    private static final String TABLE_NAME = "contact";

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_NUMBER = "number";

    private SQLiteDatabase mdb;

    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(" + KEY_ID + " " +
                "INTEGER PRIMARY KEY AUTOINCREMENT," +
                KEY_NAME + " TEXT," + KEY_NUMBER + " TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(db);
    }

    public long addContact(Contact c){
        mdb=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(KEY_NAME,c.getNom());
        cv.put(KEY_NUMBER,c.getNumber());
        long x= mdb.insert(TABLE_NAME,null,cv);
        mdb.close();
        return x;
    }




}
