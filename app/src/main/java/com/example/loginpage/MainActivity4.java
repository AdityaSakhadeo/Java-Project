package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity4 extends AppCompatActivity {

    Button button1;
    EditText username;
    EditText password;
    TextView errorMessage;
    TextView tip;
    DBHelper db;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button1 = findViewById(R.id.button4);
        username = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        errorMessage = findViewById(R.id.errorMessage2);
        tip = findViewById(R.id.Tip);
        db = new DBHelper(this);
        loadingScreen loadingScreen1 = new loadingScreen(MainActivity4.this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameTXT = username.getText().toString();
                String passwordTXT = password.getText().toString();

                if (usernameTXT.equals("") || passwordTXT.equals("")) {
                    errorMessage.setText("Enter all the fields");
                } else {
                    Boolean checkuserpass = db.checkusernamepassword1(usernameTXT, passwordTXT);
                    if (checkuserpass == true) {
                        Toast.makeText(MainActivity4.this, "Login Succesful", Toast.LENGTH_SHORT).show();
                        Intent intent14 = new Intent(getApplicationContext(), MainActivity5.class);
                       // intent14.putExtra("customer",usernameTXT);
                        startActivity(intent14);
                        loadingScreen1.startLoadingScreen();
                        Intent intent14a = new Intent(MainActivity4.this,MainActivity14.class);
                        intent14a.putExtra("customer",usernameTXT);
                        startActivity(intent14a);

                    } else {
                        errorMessage.setText("Invalid Credentials");
                        tip.setText("*If dont hava an account\nPlease consider creating one");
                    }
                }

            }
        });
        //Do the same thing that is in the MainActivity3 just check the username and password (Omkar Sawant)
    }

    public void page14(View v) {
        Intent intent14 = new Intent(this, MainActivity14.class);
        startActivity(intent14);


    }

}