package com.example.pizzareciper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ArrayList<SingleItem> singleItems = new ArrayList<>();

        singleItems.add(new SingleItem(R.drawable.p1, getString(R.string.pizza1), getString(R.string.pizzarecipe1), getString(R.string.pizzadesc1)));
        singleItems.add(new SingleItem(R.drawable.p2, getString(R.string.pizza2), getString(R.string.pizzarecipe2), getString(R.string.pizzadesc2)));
        singleItems.add(new SingleItem(R.drawable.p3, getString(R.string.pizza3), getString(R.string.pizzarecipe3), getString(R.string.pizzadesc3)));
        singleItems.add(new SingleItem(R.drawable.p4, getString(R.string.pizza4), getString(R.string.pizzarecipe4), getString(R.string.pizzadesc4)));
        singleItems.add(new SingleItem(R.drawable.p5, getString(R.string.pizza5), getString(R.string.pizzarecipe5), getString(R.string.pizzadesc5)));

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        adapter = new RecyclerViewAdapter(singleItems, this);
        layoutManager = new LinearLayoutManager(this);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
