package com.redden33.databasedemo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.litepal.tablemanager.Connector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Connector.getDatabase();
        Man man = new Man();
        man.setLength(30);
        man.setName("yingzhong");
        man.save();

//        SQLiteOpenHelper helper = new SQLiteOpenHelper(this,"data_3",null,1) {
//            public static final String CREATE_BOOK = "create table Book("+
//                    "id integer primay key autoincrement,"+
//                    "name text)";
//            @Override
//            public void onCreate(SQLiteDatabase db) {
//                db.execSQL(CREATE_BOOK);
//            }
//
//            @Override
//            public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//            }
//        };
//        MySQLiteOpenHelper helper = new MySQLiteOpenHelper(this,"data_2.db",null,4);
//        SQLiteDatabase database = helper.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put("name","MY HOOK LIFE");
//        database.insert("Book",null,values);
//        values.clear();
//        values.put("name","cant find the reason to correct");
//        database.insert("Book",null,values);
//        values.clear();
//        values.put("name","cant find the reason to correct");
//        values.clear();
//        database.update("Book",values,"name=?",new String[]{"我的妓女生涯"});
//        database.delete("Book","name=?",new String[]{"cant find the reason to correct"});
//        Cursor cursor = database.query("Book",new String[]{"name"},null,null,null,null,null);
//        if(cursor.moveToFirst()){
//            String name = cursor.getString(cursor.getColumnIndex("name"));
//            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
//        }

    }
}
