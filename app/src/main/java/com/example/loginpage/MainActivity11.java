package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity11 extends AppCompatActivity {
    private ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        myListView = findViewById(R.id.myListView);
        ArrayList<String> registeredProducts = new ArrayList<String>();
        registeredProducts.add("1.Milk");
        registeredProducts.add("2.Biscuits");
        registeredProducts.add("3.Bread");
        registeredProducts.add("4.Coffee");

        ArrayAdapter<String> showProducts = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,registeredProducts);
        myListView.setAdapter(showProducts);
    }
}