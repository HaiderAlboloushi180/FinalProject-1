package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class SomeThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_things);

        // Views
        RelativeLayout artButton  = findViewById(R.id.art);
        RelativeLayout vidsButton = findViewById(R.id.vids);
        RelativeLayout poemButton = findViewById(R.id.poems);
        RelativeLayout picsButton = findViewById(R.id.pics);
        Button clickMeButton = findViewById(R.id.clickme);

        // Click Me!
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SomeThingsActivity.this, "You matter!", Toast.LENGTH_SHORT).show();
            }
        });

        // More airports
        artButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        vidsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        poemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        picsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}