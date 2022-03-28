package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CommonIllnessesActivity extends AppCompatActivity {

    ArrayList<MentalDisorder> disorders = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_illnesses);

        // Objects
        MentalDisorder depression = new MentalDisorder(
                getString(R.string.depression),
                getString(R.string.depressionDesc),
                getString(R.string.depressionSymptom1) +
                        getString(R.string.depressionSymptom2) +
                        getString(R.string.depressionSymptom3) +
                        getString(R.string.depressionSymptom4) +
                        getString(R.string.depressionSymptom5) ,
                getString(R.string.depressionTip1) +
                        getString(R.string.depressionTip2) +
                        getString(R.string.depressionTip3) +
                        getString(R.string.depressionTip4),
                R.drawable.depression
        );
        MentalDisorder ptsd = new MentalDisorder(
                getString(R.string.ptsd),
                getString(R.string.ptsdDesc),
                getString(R.string.ptsdSymptom1) +
                        getString(R.string.ptsdSymptom2) +
                        getString(R.string.ptsdSymptom3) +
                        getString(R.string.ptsdSymptom4) ,
                getString(R.string.ptsdTip1) +
                        getString(R.string.ptsdTip2) +
                        getString(R.string.ptsdTip3),
                R.drawable.ptsd
        );
        MentalDisorder ocd = new MentalDisorder(
                getString(R.string.ocd),
                getString(R.string.ocdDesc),
                getString(R.string.ocdSymptom1) +
                        getString(R.string.ocdSymptom2) +
                        getString(R.string.ocdSymptom3) +
                        getString(R.string.ocdSymptom4) +
                        getString(R.string.ocdSymptom5) ,
                getString(R.string.ocdTip1) +
                        getString(R.string.ocdTip2) +
                        getString(R.string.ocdTip3),
                R.drawable.ocd
        );
        MentalDisorder bipolar = new MentalDisorder(
                getString(R.string.bipolar),
                getString(R.string.bipolarDesc),
                getString(R.string.bipolarSymptom1) +
                        getString(R.string.bipolarSymptom2) +
                        getString(R.string.bipolarSymptom3) +
                        getString(R.string.bipolarSymptom4) +
                        getString(R.string.bipolarSymptom5) ,
                getString(R.string.bipolarTip1) +
                        getString(R.string.bipolarTip2) +
                        getString(R.string.bipolarTip3),
                R.drawable.bipolar
        );
        MentalDisorder schizophrenia = new MentalDisorder(
                getString(R.string.schizo),
                getString(R.string.schizoDesc),
                getString(R.string.schizoSymptom1) +
                        getString(R.string.schizoSymptom2) +
                        getString(R.string.schizoSymptom3) +
                        getString(R.string.schizoSymptom4) +
                        getString(R.string.schizoSymptom5) ,
                getString(R.string.schizoTip1) +
                        getString(R.string.schizoTip2) +
                        getString(R.string.schizoTip3),
                R.drawable.schizo
        );
        MentalDisorder addiction = new MentalDisorder(
                getString(R.string.addiction),
                getString(R.string.addiction),
                getString(R.string.addictionSymptom1) +
                        getString(R.string.addictionSymptom2) +
                        getString(R.string.addictionSymptom3) +
                        getString(R.string.addictionSymptom4) +
                        getString(R.string.addictionSymptom5) ,
                getString(R.string.addictionTip1) +
                        getString(R.string.addictionTip2) +
                        getString(R.string.addictionTip3),
                R.drawable.addiction
        );

        // Adding to array
        disorders.add(depression);
        disorders.add(ptsd);
        disorders.add(ocd);
        disorders.add(bipolar);
        disorders.add(schizophrenia);
        disorders.add(addiction);

        // ListView and Adapter stuff
        ListView disordersListView = findViewById(R.id.disordersListView);

        MentalDisorderAdapter disorderAdapter = new MentalDisorderAdapter(this, 0, disorders);
        disordersListView.setAdapter(disorderAdapter);

        disordersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MentalDisorder currentItem = disorders.get(i);
                Intent intent = new Intent(CommonIllnessesActivity.this, CommonIllnessesDetails.class);
                intent.putExtra("DISORDER", currentItem);
                startActivity(intent);
            }
        });

    }
}