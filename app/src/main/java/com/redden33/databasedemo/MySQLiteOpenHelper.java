package com.redden33.databasedemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by 陈志强 on 2018/3/7.
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper {

    public static final String CREATE_BOOK = "create table Book("
            + "id integer primary key autoincrement,"
            + "name text)";
    public static final String CREATE_MATE = "create table Mate("
            +"id integer primary key autoincrement,"
            +"name text)";
    private Context mcontext;

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory ,int version){
        super(context,name,factory,version);
        mcontext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOK);
        db.execSQL(CREATE_MATE);
        Toast.makeText(mcontext, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists Book");
        db.execSQL("drop table if exists Mate");
        onCreate(db);
    }
}
