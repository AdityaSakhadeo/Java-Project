package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity7 extends MainActivity3 {
    public TextView newUsername;
    public Button button;
    public static final String EXTRA_TEXT = "name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        newUsername= findViewById(R.id.usernameMain);
        button  = findViewById(R.id.productManagement);


        String username=getIntent().getStringExtra("name");
         newUsername.setText(username.toUpperCase());

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent8 = new Intent(MainActivity7.this,MainActivity8.class);
                 intent8.putExtra("name2",username);
                 startActivity(intent8);
             }
         });

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