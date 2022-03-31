package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class PicsActivity extends AppCompatActivity {

    ArrayList<Integer> pics = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pics);

        // RecyclerView stuff
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.picsRecyclerView);
        recyclerView.setLayoutManager(layoutManager);

        // Adding the pics
        pics.add(R.drawable.picone);
        pics.add(R.drawable.pictwo);
        pics.add(R.drawable.picthree);
        pics.add(R.drawable.picfour);
        pics.add(R.drawable.picfive);

        PicsAdapter adapter = new PicsAdapter(pics, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}