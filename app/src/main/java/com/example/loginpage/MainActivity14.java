package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.loginpage.databinding.ActivityMain14Binding;
import com.example.loginpage.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity14 extends AppCompatActivity {

     public GridView gridView;

    ActivityMain14Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain14Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] productName = {"NesCafe","Biscuits","Ice-Cream","Jam","milk","apples"};
        int[] images = {R.drawable.coffe,R.drawable.biscuits,R.drawable.icecream,R.drawable.jam,R.drawable.milk,R.drawable.apple};
        int[] prices = {250,100,80,200,300,100,60};

        GridAdapter gridAdapter = new GridAdapter(MainActivity14.this,productName,images,prices);
        binding.gridView.setAdapter(gridAdapter);






    }
    public void page15(View v)
    {
        Intent intent15 = new Intent(this,MainActivity15.class);
        startActivity(intent15);
    }
    public void toast15(View v)
    {
        Toast.makeText(this, "Product Added To Cart", Toast.LENGTH_SHORT).show();
    }


}