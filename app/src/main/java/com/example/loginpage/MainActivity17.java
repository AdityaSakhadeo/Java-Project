package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity17 extends AppCompatActivity {
    public TextView textView1;
    public TextView cost;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        textView1 = findViewById(R.id.totalbill);
        cost = findViewById(R.id.textView49);

    }
}