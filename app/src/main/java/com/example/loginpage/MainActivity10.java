package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
    private CheckBox checkBox1;
    private EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        checkBox1 = findViewById(R.id.checkBox);
        editText1 = findViewById(R.id.editTextTextPersonName6);
    }
    public void onClickRemove(View v)
    {
        Toast.makeText(this, "The products are removed sucessfully", Toast.LENGTH_SHORT).show();
    }
    public void onClickAll(View v)
    {
        editText1.setText("100");
    }

}