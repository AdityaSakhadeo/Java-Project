package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void page3(View v) {
        Intent intent2 = new Intent(this, MainActivity3.class);
        startActivity(intent2);
    }
    public void page4(View v)
    {
        Intent intent3 = new Intent(this,MainActivity4.class);
        startActivity(intent3);
    }
    public void page5(View v)
    {
        Intent intent4 = new Intent(this,MainActivity5.class);
        startActivity(intent4);
    }

}