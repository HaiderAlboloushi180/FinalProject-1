package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private ArrayList<HomePageWidget> widgets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // WORK ON SCROLLABLE VIEW
//        // HomePageWidgets
//        HomePageWidget articles  = new HomePageWidget("ARTICLES & STUDIES", R.drawable.articles);
//        HomePageWidget calendar  = new HomePageWidget("RELAPSE CALENDAR"  , R.drawable.calendar);
//        HomePageWidget illnesses = new HomePageWidget("COMMON MENTAL ILLNESSES", R.drawable.common);
//        HomePageWidget guardians = new HomePageWidget("CAREGIVERS & PARENTS", R.drawable.parents);
//        HomePageWidget stuffTodo = new HomePageWidget("EXTRA STUFF TO ENJOY", R.drawable.therapeutic);
//        widgets.add(articles);
//        widgets.add(calendar);
//        widgets.add(illnesses);
//        widgets.add(guardians);
//        widgets.add(stuffTodo);
//
//        // ListView & Adapter
//        ListView listView = findViewById(R.id.listView);
//        HomePageWidgetAdapter adapter = new HomePageWidgetAdapter(this, 0, widgets);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });

    }
}