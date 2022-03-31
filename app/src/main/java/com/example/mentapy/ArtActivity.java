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

        // RecyclerView stuff
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.artRecyclerView);
        recyclerView.setLayoutManager(layoutManager);

        // Adding to array
        Art art1 = new Art("Capturing the Moment", R.drawable.capturingthemoment);
        Art art2 = new Art("Meules", R.drawable.meules);
        Art art3 = new Art("Moonrise Over the Sea", R.drawable.moonrise);
        Art art4 = new Art("River of Light", R.drawable.riveroflight);
        Art art5 = new Art("Sky Blue", R.drawable.skyblue);
        Art art6 = new Art("Starry Night", R.drawable.starrynight);
        arts.add(art1);
        arts.add(art2);
        arts.add(art3);
        arts.add(art4);
        arts.add(art5);
        arts.add(art6);

        ArtAdapter adapter = new ArtAdapter(arts, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}