package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    public void page8(View v)
    {
        Intent intent8 = new Intent(this,MainActivity8.class);
        startActivity(intent8);
    }

    public void page13(View v)
    {
        Intent intent13 = new Intent(this,MainActivity13.class);
        startActivity(intent13);
    }

    public void page12(View v)
    {
        Intent intent12 = new Intent(this,MainActivity12.class);
        startActivity(intent12);
    }



}