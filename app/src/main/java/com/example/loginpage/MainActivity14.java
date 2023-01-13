package com.example.loginpage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginpage.databinding.ActivityMain14Binding;
import com.google.firebase.storage.StorageReference;

public class MainActivity14 extends AppCompatActivity {

    public ImageView imageView;
    ActivityMain14Binding binding;
    StorageReference storageReference,storageReference2;
    ProgressDialog progressDialog;
    public TextView textView2;
     public GridView gridView;
    public TextView textView;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain14Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        textView = findViewById(R.id.textView41);
      //  textView2 = findViewById(R.id.textView60);
        DBHelper db = new DBHelper(this);
       String username = getIntent().getStringExtra("customer");
       textView.setText(username.toUpperCase());



       Cursor cursor = db.getproduct();
     //  StringBuilder price = new StringBuilder();
       StringBuilder products = new StringBuilder();
       String[] productsList=null;

       while(cursor.moveToNext())
       {


            products.append(cursor.getString(2));

            products.append(" ");

       }
       String proString =products.toString();


        productsList = proString.split(" ");





        // Toast.makeText(this, products.get(0), Toast.LENGTH_SHORT).show();
        String[] productName = {"NesCafe","Biscuits","Ice-Cream","Jam","milk","apples",productsList[0],productsList[1]};
        int[] images = {R.drawable.coffe,R.drawable.biscuitslight,R.drawable.icecreamlight,R.drawable.jamlight,R.drawable.milk,R.drawable.appleslight,R.drawable.bag2,R.drawable.cap};
        int[] prices = {250,100,80,200,300,100,100,60};


        GridAdapter gridAdapter = new GridAdapter(MainActivity14.this,productName,images,prices);
        binding.gridView.setAdapter(gridAdapter);


        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intentCart = new Intent(MainActivity14.this,MainActivity15.class);

                intentCart.putExtra("product",productName[i]);
                intentCart.putExtra("price",prices[i]);
                intentCart.putExtra("image",images[i]);


                intentCart.putExtra("product2",productName[i+1]);
                intentCart.putExtra("price2",prices[i+1]);
                intentCart.putExtra("image2",images[i+1]);
                startActivity(intentCart);

                Toast.makeText(MainActivity14.this, "Product added to cart", Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void page15(View v)
    {
        Intent intent15 = new Intent(this,MainActivity15.class);
        startActivity(intent15);
    }



}