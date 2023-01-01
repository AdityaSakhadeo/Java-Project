package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button1 = findViewById(R.id.button4);
        loadingScreen loadingScreen1 = new loadingScreen(MainActivity4.this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                page14(view);
                loadingScreen1.startLoadingScreen();
            }
        });
        //Do the same thing that is in the MainActivity3 just check the username and password (Omkar Sawant)
    }

    public void page14(View v) {
        Intent intent14 = new Intent(this, MainActivity14.class);
        startActivity(intent14);


    }

}