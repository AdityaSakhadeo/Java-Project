package com.example.loginpage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity {
    private CheckBox checkBox1;
    private EditText editText1;
    public TextView textView;
    public Button button;
    DBHelper DB ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        textView = findViewById(R.id.userMain4);
        button = findViewById(R.id.button14);
        DB = new DBHelper(this);
        editText1 = findViewById(R.id.editTextTextPersonName5);
        Intent intent = getIntent();
        String username=getIntent().getStringExtra("name");
        textView.setText(username.toUpperCase());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NameTXT = editText1.getText().toString();


                Boolean checkdeleteuserdata = DB.deleteproductdata(NameTXT );

                if(checkdeleteuserdata==true){
                    Toast.makeText(MainActivity10.this, "Product deleted", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity10.this, "Pro not deleted", Toast.LENGTH_SHORT).show();
                }
            }




        });



    }
    public void onClickRemove(View v)
    {
        Toast.makeText(this, "The products are removed sucessfully", Toast.LENGTH_SHORT).show();
    }
    public void onClickAll(View v)
    {
        editText1.setText("100");
    }

}