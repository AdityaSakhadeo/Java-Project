package com.example.loginpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Userdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table adminDetails(id integer primary key autoincrement ,Username TEXT ,Password TEXT)");
        DB.execSQL("create table customerDetails(id integer primary key autoincrement,Username TEXT primary key,Password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists adminDetails");
    }

    public Boolean insertuserdata(Integer id,String Username, String Password) {
        int a = 1;
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id",a);
        contentValues.put("Username", Username);
        contentValues.put("password", Password);
        a = a+1;

        long result = DB.insert("adminDetails", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean updateuserdata(String Username,String Password) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Username", Username);
        contentValues.put("Password", Password);
        Cursor cursor = DB.rawQuery("Select * from Userdetails where Username = ?", new String[]{Username});

        if (cursor.getCount() > 0) {
            long result = DB.update("Userdetails", contentValues, "Username=?", new String[]{Username});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    public Boolean deleteuserdata(String Username) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        Cursor cursor = DB.rawQuery("Select * from Userdetails where Username = ?", new String[]{Username});

        if (cursor.getCount() > 0) {
            long result = DB.delete("Userdetails", "Username=?", new String[]{Username});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    public Cursor getdata() {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        Cursor cursor = DB.rawQuery("Select * from Userdetails",null);

        return cursor;

    }
}
