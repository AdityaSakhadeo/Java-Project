package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    EditText editText1;
    EditText editText2;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = findViewById(R.id.button4);
        editText1 = findViewById(R.id.editTextTextEmailAddress);
        editText2 = findViewById(R.id.editTextTextPassword);

        String username = editText1.getText().toString();
        String password = editText2.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //Check the if the username and the password is valid or not    (Omkar Sawant)
            public void onClick(View view) {
                if(true)
                {
                    page7(view);
                }
                else
                {
                    textView1.setText("Username or Password mismatched");
                }
            }
        });
    }

    public void page7(View v)
    {
        Intent intent7 = new Intent(this,MainActivity7.class);
        startActivity(intent7);
    }
}