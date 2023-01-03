package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity5 extends AppCompatActivity {
    public EditText editText1;
    public EditText editText2;
    public Button button1;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    editText1 = findViewById(R.id.editTextTextEmailAddress2);
    editText2 = findViewById(R.id.editTextTextPassword2);
    button1 = findViewById(R.id.button8);
    db = new DBHelper(this);
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String Uname = editText1.getText().toString();
            String Pass = editText2.getText().toString();
            int a = 1;

            boolean checkinsertdata = db.insertuserdata(a,Uname,Pass);

            if (checkinsertdata==true)
            {
                Toast.makeText(MainActivity5.this, "Data inserted", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity5.this, "Data not inserted", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }
    public void page2(View v)
    {
        Intent intent6 = new Intent(this, MainActivity2.class);
        startActivity(intent6);

    }


}