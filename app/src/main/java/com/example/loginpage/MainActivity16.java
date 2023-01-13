package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity16 extends AppCompatActivity {
    public TextView textView;
    public Button button1;
    public Button button2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        textView = findViewById(R.id.textView34);
        button1= findViewById(R.id.Pay);
        button2 = findViewById(R.id.Order);
        int ToatalBill = getIntent().getIntExtra("totalbill",100);
        textView.setText("Your total bill is ₹"+ ToatalBill);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent17 = new Intent(MainActivity16.this,MainActivity17.class);
                intent17.putExtra("totalbill",ToatalBill);
                startActivity(intent17);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(MainActivity16.this,MainActivity18.class);
                intent18.putExtra("totalbill",ToatalBill);
                startActivity(intent18);
            }
        });
    }




}