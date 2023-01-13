package com.example.loginpage;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity13 extends AppCompatActivity {

    public Button button;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        button = findViewById(R.id.button6);
        DB = new DBHelper(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getFeedback();
                if (res.getCount() == 0) {
                    Toast.makeText(MainActivity13.this, "No feedback", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    StringBuffer buffer = new StringBuffer();
                    while (res.moveToNext()) {

                        buffer.append("Name     :" + res.getString(1) + "\n");
                        buffer.append("Feedback     :" + res.getString(2) + "\n");

                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity13.this);
                    builder.setCancelable(true);
                    builder.setTitle("Product Entries");
                    builder.setMessage(buffer.toString());
                    builder.show();
                }
            }

        });

    }
}









