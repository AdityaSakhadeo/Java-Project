package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity19 extends AppCompatActivity {

    public EditText editText1;
    public EditText editText2;
    DBHelper db;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        editText1 = findViewById(R.id.Name);
        editText2 = findViewById(R.id.feedback);
        db = new DBHelper(this);

        String name = editText1.getText().toString();
        String feedback = editText2.getText().toString();

        db.feedback(name,feedback);
    }
}