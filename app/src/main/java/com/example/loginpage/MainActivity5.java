package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity5 extends AppCompatActivity {
    public EditText username;
    public EditText password;
    public Button button1;
    public Button button2;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    username = findViewById(R.id.editTextTextEmailAddress2);
    password = findViewById(R.id.editTextTextPassword2);
    button1 = findViewById(R.id.button8);
    button2 = findViewById(R.id.button15);
    DB = new DBHelper(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer Ad_id=1;
                String usernameTXT=username.getText().toString();
                String passwordTXT=password.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(Ad_id,usernameTXT,passwordTXT);

                if(checkinsertdata==true){
                    Toast.makeText(MainActivity5.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity5.this, "New Entry not inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer Cu_id=1;
                String usernameTXT=username.getText().toString();
                String passwordTXT=password.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata1(Cu_id,usernameTXT,passwordTXT);

                if(checkinsertdata==true){
                    Toast.makeText(MainActivity5.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity5.this, "New Entry not inserted", Toast.LENGTH_SHORT).show();
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