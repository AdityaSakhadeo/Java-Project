package com.example.loginpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.view.ContextThemeWrapper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Userdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table Admindetails(Ad_id integer primary key autoincrement,Username TEXT,Password TEXT)");
        DB.execSQL("create table Customerdetails(Cu_id integer primary key autoincrement,Username TEXT,Password TEXT)");
        DB.execSQL("create table productDetails(p_id integer primary key autoincrement,p_name TEXT,p_cost integer,p_quantity integer)");
    }



    @Override
    public void onUpgrade(SQLiteDatabase DB,int i1,int i2) {
        DB.execSQL("drop Table if exists Admindetails");
        DB.execSQL("drop Table if exists Customerdetails");
    }

    public boolean checkusernamepassword(String Username,String Password){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Admindetails where Username= ? and Password=?", new String[]{Username,Password});
        if(cursor.getCount()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkusernamepassword1(String Username,String Password){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Customerdetails where Username= ? and Password=?", new String[]{Username,Password});
        if(cursor.getCount()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public Boolean insertuserdata(Integer Ad_id,String Username, String Password) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Username", Username);
        contentValues.put("Password", Password);
        long result = DB.insert("Admindetails", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean insertuserdata1(Integer Cu_id,String Username, String Password) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Username", Username);
        contentValues.put("Password", Password);
        long result = DB.insert("Customerdetails", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean insertProduct(Integer p_id,String name,Integer cost,Integer quantity)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("p_id",p_id);
        contentValues.put("p_name",name);
        contentValues.put("p_cost",cost);
        contentValues.put("p_quantity",quantity);
        long result = DB.insert("productDetails",null,contentValues);
        if (result==-1){
            return false;
        }
        else
        {
            return true;
        }
    }


    public Boolean updateuserdata(String name, String contact, String dob) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact", contact);
        contentValues.put("dob", dob);
        Cursor cursor = DB.rawQuery("Select * from Userdetails where name = ?", new String[]{name});

        if (cursor.getCount() > 0) {
            long result = DB.update("Userdetails", contentValues, "name=?", new String[]{name});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    public Boolean deleteuserdata(String name) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        Cursor cursor = DB.rawQuery("Select * from Userdetails where name = ?", new String[]{name});

        if (cursor.getCount() > 0) {
            long result = DB.delete("Userdetails", "name=?", new String[]{name});
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

        Cursor cursor = DB.rawQuery("Select Username from AdminDetails",null);

        return cursor;

    }

}
