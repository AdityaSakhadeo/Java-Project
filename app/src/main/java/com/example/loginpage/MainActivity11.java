package com.example.loginpage;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity11 extends AppCompatActivity {
    DBHelper DB;
    private ListView myListView;
    public TextView textView;
    public Button button1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
     //   myListView = findViewById(R.id.myListView);
        textView = findViewById(R.id.textView37);
        button1 = findViewById(R.id.button10);
        DB =new DBHelper(this);
        String username=getIntent().getStringExtra("name");
        textView.setText(username.toUpperCase());

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if (res.getCount() == 0) {
                    Toast.makeText(MainActivity11.this, "No Entry Exist", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    StringBuffer buffer = new StringBuffer();
                    while (res.moveToNext()) {

                        buffer.append("Name     :" + res.getString(2) + "\n");
                        buffer.append("Cost     :" + res.getString(3) + "\n");
                        buffer.append("Quantity :" + res.getString(4) + "\n\n");
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity11.this);
                    builder.setCancelable(true);
                    builder.setTitle("Product Entries");
                    builder.setMessage(buffer.toString());
                    builder.show();
                }
            }
        });
      /*  ArrayList<String> registeredProducts = new ArrayList<String>();
        registeredProducts.add("1.Milk");
        registeredProducts.add("2.Biscuits");
        registeredProducts.add("3.Bread");
        registeredProducts.add("4.Coffee");
*/
       // ArrayAdapter<String> showProducts = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,registeredProducts);
        //myListView.setAdapter(showProducts);
    }
}