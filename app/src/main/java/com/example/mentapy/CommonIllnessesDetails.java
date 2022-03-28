package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CommonIllnessesDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_illnesses_details);

        // Views
        TextView disorderName  = findViewById(R.id.disorderName);
        TextView disorderDesc  = findViewById(R.id.disorderDesc);
        TextView disorderSymps = findViewById(R.id.disorderSymps);
        TextView disorderTreat = findViewById(R.id.disorderTreat);
        Button learnMoreButton = findViewById(R.id.learn_more);

        // Airplane Arrives
        Bundle bundle = getIntent().getExtras();
        final MentalDisorder disorderSelected = (MentalDisorder) bundle.getSerializable("DISORDER");

        // Unpacking my goods
        String selectedDisorderName = disorderSelected.getDisorderName();
        String selectedDisorderDesc = disorderSelected.getDisorderDesc();
        String selectedDisorderSymp = disorderSelected.getDisorderSymptoms();
        String selectedDisorderTips = disorderSelected.getDisorderTips();
        String selectedDisorderURL  = disorderSelected.getDisorderURL();

        disorderName.setText(selectedDisorderName);
        disorderDesc.setText(selectedDisorderDesc);
        disorderSymps.setText(selectedDisorderSymp);
        disorderTreat.setText(selectedDisorderTips);

        // Learn more button
        learnMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(selectedDisorderURL));
                startActivity(intent);
            }
        });
    }
}