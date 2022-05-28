package com.example.androidminiappcontact;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="DBContactFavoris.db";
    private static final String TABLE_NAME="Contact";
    private static final String KEY_ID="id";
    private static final String KEY_NAME="nom";
    private static final String KEY_NUMBER="num";

    private static final String CREATE_TABLE= "Create table " + TABLE_NAME + " (" +
            KEY_ID+" "+ "INTEGER PRIMARY KEY autoincrement, " +
            KEY_NAME+ " TEXT, "+ "KEY_NUMBER"+ "TEXT);";


    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table " +TABLE_NAME);
        onCreate(db);

    }
}
