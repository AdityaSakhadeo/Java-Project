package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    public Button button;
    TextView newUsername;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        newUsername = findViewById(R.id.userMain2);
        button = findViewById(R.id.addProduct);
        Intent intent = getIntent();
        String username=getIntent().getStringExtra("name2");
        newUsername.setText(username.toUpperCase());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(MainActivity8.this,MainActivity9.class);
                intent9.putExtra("name",username);
                startActivity(intent9);
            }
        });

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