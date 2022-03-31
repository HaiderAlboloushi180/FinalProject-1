package com.example.mentapy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PoemActivity extends AppCompatActivity {

    ArrayList<Poems> poems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        // RecyclerView stuff
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.poemRecyclerView);
        recyclerView.setLayoutManager(layoutManager);

        // adding to array
        Poems poem1 = new Poems("The Calm", R.drawable.poemone);
        Poems poem2 = new Poems("Calm was the Even, and Clear was the Sky", R.drawable.poemtwo);
        Poems poem3 = new Poems("Retirement", R.drawable.poemthree);
        Poems poem4 = new Poems("It is a Beauteous Evening, Calm and Free", R.drawable.poemfour);
        Poems poem5 = new Poems("Ye gentle visitations of calm thought", R.drawable.poemfive);
        Poems poem6 = new Poems("Twilight Calm", R.drawable.poemsix);
        poems.add(poem1);
        poems.add(poem2);
        poems.add(poem3);
        poems.add(poem4);
        poems.add(poem5);
        poems.add(poem6);

        PoemsAdapter adapter = new PoemsAdapter(poems, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}