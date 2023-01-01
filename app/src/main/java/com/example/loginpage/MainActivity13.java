package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity13 extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        initData();
        initRecyclerView();

    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass("Aditya:-","Thanks for the good product"));
        userList.add(new ModelClass("Sumit:-","Not so good packing quality"));
        userList.add(new ModelClass("Pranav:-","Late delivery"));
        userList.add(new ModelClass("Omkar:-","Nice"));
        userList.add(new ModelClass("Omkar:-","Taking too long to arrive"));
        userList.add(new ModelClass("Girish:-","Don't buy"));
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(recyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    }



