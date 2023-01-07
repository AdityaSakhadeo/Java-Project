package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {

    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        db = new DBHelper(this);

    }
        public void onClickAdd(View v)
        {
            Toast.makeText(this, "Product Added Sucessfully", Toast.LENGTH_LONG).show();
        }

}