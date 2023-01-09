package com.example.loginpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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
        initData();
        initRecyclerView();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent16 = new Intent(MainActivity15.this,MainActivity16.class);
                startActivity(intent16);
            }
        });


    }



    private void initData() {
        userList2 = new ArrayList<>();
        userList2.add(new ModelClass2("Cofee","200",R.drawable.coffe));
        userList2.add(new ModelClass2("Biscuits","70",R.drawable.biscuits));
        userList2.add(new ModelClass2("jam","120",R.drawable.jam));
        userList2.add(new ModelClass2("milk","62",R.drawable.milk));
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