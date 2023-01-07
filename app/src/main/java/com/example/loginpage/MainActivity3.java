package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    public Button button;
    public EditText editText1;
    public EditText editText2;
    public TextView textView1;

    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = findViewById(R.id.button4);
        editText1 = findViewById(R.id.editTextTextEmailAddress);
        editText2 = findViewById(R.id.editTextTextPassword);
        textView1 = findViewById(R.id.errorMessage);
        db = new DBHelper(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //Check the if the username and the password is valid or not    (Omkar Sawant)
            public void onClick(View view) {
                String usernameTXT=editText1.getText().toString();
                String passwordTXT=editText2.getText().toString();


                if(usernameTXT.equals("")||passwordTXT.equals("")){
                    textView1.setText("Enter all the fields");
                }
                else{
                    Boolean checkuserpass = db.checkusernamepassword(usernameTXT, passwordTXT);
                    if(checkuserpass==true){
                        Toast.makeText(MainActivity3.this, "Login Succesful", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(),MainActivity5.class);

                        startActivity(intent);

                        Intent intent7 = new Intent(MainActivity3.this,MainActivity7.class);
                        intent7.putExtra("name",usernameTXT);
                        startActivity(intent7);
                    }else{
                        textView1.setText("Invalid Credentials");
                    }
                }
            }
        });
    }

    public void page7(View v)
    {
        Intent intent7 = new Intent(MainActivity3.this,MainActivity7.class);

        startActivity(intent7);
    }
}