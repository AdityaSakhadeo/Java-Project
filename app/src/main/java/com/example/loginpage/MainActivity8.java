package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
        public void page9(View v)
        {
            Intent intent9 = new Intent(this,MainActivity9.class);
            startActivity(intent9);
        }
        public void page10(View v)
        {
            Intent intent10 = new Intent(this,MainActivity10.class);
            startActivity(intent10);
        }
        public void page11(View v)
        {
            Intent intent11 = new Intent(this,MainActivity11.class);
            startActivity(intent11);
        }





}