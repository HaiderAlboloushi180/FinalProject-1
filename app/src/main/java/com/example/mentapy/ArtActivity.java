package com.example.mentapy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArtActivity extends AppCompatActivity {

    ArrayList<Art> arts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.artRecyclerView);
        recyclerView.setLayoutManager(layoutManager);

        Art monaLisa = new Art("Mona Lisa", R.drawable.addiction);
        arts.add(monaLisa);

        ArtAdapter adapter = new ArtAdapter(arts, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}