package com.elmoselhy.ahmed.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    String [] filmsNames = {"film1","film1","film1","film1","film1","film1","film1","film1","film1"};
    String [] filmsRate = {"7.5","5.5","8","9","7","6.5","7.5","8.5","4.5"};
    RecyclerView movieRecyclerView;
    RecyclerAdapter movieRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        movieRecyclerAdapter = new RecyclerAdapter(MainActivity.this,filmsNames,filmsRate);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        movieRecyclerView.setLayoutManager(layoutManager);
        movieRecyclerView.setHasFixedSize(true);
        movieRecyclerView.setAdapter(movieRecyclerAdapter);

    }
}
