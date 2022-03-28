package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Music Stuff
        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.start();

        // Views
        TextView welcomeTitle = findViewById(R.id.welcome);
        Button suicideHotline = findViewById(R.id.hotline);
        ImageView musicButton = findViewById(R.id.musicButton);
        RelativeLayout articlesWidget = findViewById(R.id.article);
        RelativeLayout calendarWidget = findViewById(R.id.calendar);
        RelativeLayout illnessWidget  = findViewById(R.id.common);
        RelativeLayout parentsWidget  = findViewById(R.id.parents);
        RelativeLayout therapyWidget  = findViewById(R.id.extra);

        // Hotline Feature
        suicideHotline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "+96599603997";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        // Music Feature
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                } else {
                    mediaPlayer.start();
                }
            }
        });

        // Mentapy Airport
        articlesWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArticlesActivity.class);
                startActivity(intent);
            }
        });

        calendarWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        illnessWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CommonIllnessesActivity.class);
                startActivity(intent);
            }
        });

        parentsWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        therapyWidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SomeThingsActivity.class);
                startActivity(intent);
            }
        });
    }
}