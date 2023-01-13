package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity19 extends AppCompatActivity {

    public Button button1;
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
        button1 = findViewById(R.id.submit);
        db = new DBHelper(this);



         //int ad_id = id.getColumnIndex("Ad_id");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText1.getText().toString();
                String feedback = editText2.getText().toString();
                int ad_id= db.GetId(name);
               // Toast.makeText(MainActivity19.this, name, Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity19.this, feedback, Toast.LENGTH_SHORT).show();
                boolean check =  db.insert_feedback(ad_id,name,feedback);
               if(check==true)
               {
                   Toast.makeText(MainActivity19.this, "Feedback is submitted", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(MainActivity19.this, "Feedback is not submitted", Toast.LENGTH_SHORT).show();
               }
            }
        });

    }
}