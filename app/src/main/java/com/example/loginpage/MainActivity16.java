package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity16 extends AppCompatActivity {

    public Button button1;
    public Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        button1= findViewById(R.id.Pay);
        button2 = findViewById(R.id.Order);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(MainActivity16.this,MainActivity17.class);
                startActivity(intent17);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(MainActivity16.this,MainActivity18.class);
                startActivity(intent18);
            }
        });
    }




}