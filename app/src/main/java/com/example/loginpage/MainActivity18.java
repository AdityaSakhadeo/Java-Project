package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity18 extends AppCompatActivity {
    public TextView textView3;
    public TextView textView2;
    public Button button1;
    public TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        button1 = findViewById(R.id.placeOrder);
        textView = findViewById(R.id.textView58);
        textView2 = findViewById(R.id.givefeedback);
        textView3= findViewById(R.id.textView50);
        int totalbill = getIntent().getIntExtra("totalbill",100);
        textView3.setText("Your total bill is ₹"+totalbill);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Order is placed and delivered shortly by the delivery client");
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(MainActivity18.this,MainActivity19.class);
                startActivity(intent19);
            }
        });
    }
}