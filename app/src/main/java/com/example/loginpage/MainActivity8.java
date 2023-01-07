package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    TextView newUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        newUsername = findViewById(R.id.userMain2);
        Intent intent = getIntent();
        String username=getIntent().getStringExtra("name2");
        newUsername.setText(username.toUpperCase());
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