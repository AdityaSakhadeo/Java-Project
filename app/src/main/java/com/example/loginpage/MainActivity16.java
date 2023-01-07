package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

    }

    public void page17(View v)
    {
        Intent intent17 = new Intent(this,MainActivity17.class);
        startActivity(intent17);
    }

    public void page18(View v)
    {
        Intent intent18 = new Intent(this,MainActivity18.class);
    }


}