package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TestDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_details);

        // Airport
        Bundle bundle = getIntent().getExtras();
        int severityInt = bundle.getInt("BAGS");

        // The Three Views
        TextView severeTitle = findViewById(R.id.severityTextView);
        TextView severeDesc  = findViewById(R.id.severityDesc);
        Button goHomeButton  = findViewById(R.id.goHome);

        // If Ztatement
        if (severityInt <= 4) {
            severeTitle.setText("Your Mental Health is good!");
            severeDesc.setText("Even though your mental health is good and you're healthy, we are not stopping you from talking to a professional, it is always good to talk to a therapist!");
        } else if (severityInt <= 8) {
            severeTitle.setText("Your Mental Health is ok");
            severeDesc.setText("Maybe it is time to consider a therapist, but don't worry, just because you may be facing issues, does not mean that they won't be solved, you got this!");
        } else if (severityInt <= 12) {
            severeTitle.setText("You might need to consider talking to a professional");
            severeDesc.setText("It is not the end of the world, but being supported and getting therapy could be very helpful, especially for your situation, you can do it!");
        }

        // HOME SWEET HOME
        goHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TestDetails.this, MainActivity.class));
            }
        });
    }
}