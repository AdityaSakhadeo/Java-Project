package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity15 extends AppCompatActivity {
    RecyclerView recyclerView2;
    public Button button1;
    LinearLayoutManager layoutManager2;
    List<ModelClass2> userList2;
    Adapter2 adapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        button1 = findViewById(R.id.button17);
        String item = getIntent().getStringExtra("product");
        String item2 = getIntent().getStringExtra("product2");
        int price = getIntent().getIntExtra("price",100);
        int price2 = getIntent().getIntExtra("price2",100);
        String priceFinal = Integer.toString(price);
        String priceFinal2 = Integer.toString(price2);
        int image = getIntent().getIntExtra("image",R.drawable.bag2);
        int image2 = getIntent().getIntExtra("image2",R.drawable.bag2);
        userList2 = new ArrayList<>();
        initData(item,priceFinal,image);
        initData(item2,priceFinal2,image2);

        int TotalBill = price+price2;
        initRecyclerView();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(MainActivity15.this,MainActivity16.class);
                intent16.putExtra("totalbill",TotalBill);
                startActivity(intent16);
            }
        });


    }


        public void initData(String item,String priceFinal,int image)
        {
            userList2.add(new ModelClass2(item,priceFinal,image));
        }


    private void initRecyclerView() {
        recyclerView2 = findViewById(R.id.recyclerView2);
        layoutManager2 = new LinearLayoutManager(this);
        layoutManager2.setOrientation(recyclerView2.VERTICAL);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2= new Adapter2(userList2);
        recyclerView2.setAdapter(adapter2);
        adapter2.notifyDataSetChanged();
    }

    public void Calculate()
    {


    }
}