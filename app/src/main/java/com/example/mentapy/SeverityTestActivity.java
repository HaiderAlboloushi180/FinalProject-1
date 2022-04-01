package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class SeverityTestActivity extends AppCompatActivity {

    private int questionsDid = 1;
    private int severity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_severity_test);

        // Views
        TextView questionCount = findViewById(R.id.questionCount);
        TextView questionText  = findViewById(R.id.question);
        Button option1Btn = findViewById(R.id.option1);
        Button option2Btn = findViewById(R.id.option2);
        Button option3Btn = findViewById(R.id.option3);
        Button option4Btn = findViewById(R.id.option4);

        // Questions
        QuizModel q1 = new QuizModel("", "","", "", "", 20,0,0,0);
        QuizModel q2 = new QuizModel("", "","", "", "", 0,0,0,0);
        QuizModel q3 = new QuizModel("", "","", "", "", 0,0,0,0);
        QuizModel q4 = new QuizModel("", "","", "", "", 0,0,0,0);
        QuizModel q5 = new QuizModel("", "","", "", "", 0,0,0,0);

        // Setting the views
        questionCount.setText(questionsDid+"");
        questionText.setText(q1.getQuestion());
        option1Btn.setText(q1.getOption1());
        option2Btn.setText(q1.getOption2());
        option3Btn.setText(q1.getOption3());
        option4Btn.setText(q1.getOption4());

        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionText.getText() == q1.getQuestion()) {
                    severity = severity + q1.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q2.getQuestion());
                    option1Btn.setText(q2.getOption1());
                    option2Btn.setText(q2.getOption2());
                    option3Btn.setText(q2.getOption3());
                    option4Btn.setText(q2.getOption4());
                } else if (questionText.getText() == q2.getQuestion()) {
                    severity = severity + q2.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q3.getQuestion());
                    option1Btn.setText(q3.getOption1());
                    option2Btn.setText(q3.getOption2());
                    option3Btn.setText(q3.getOption3());
                    option4Btn.setText(q3.getOption4());
                } else if (questionText.getText() == q3.getQuestion()) {
                    severity = severity + q3.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q4.getQuestion());
                    option1Btn.setText(q4.getOption1());
                    option2Btn.setText(q4.getOption2());
                    option3Btn.setText(q4.getOption3());
                    option4Btn.setText(q4.getOption4());
                } else if (questionText.getText() == q4.getQuestion()) {
                    severity = severity + q4.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q5.getQuestion());
                    option1Btn.setText(q5.getOption1());
                    option2Btn.setText(q5.getOption2());
                    option3Btn.setText(q5.getOption3());
                    option4Btn.setText(q5.getOption4());
                } else if (questionText.getText() == q5.getQuestion()) {
                    severity = severity + q4.getOption1Sev();
                    Intent intent = new Intent(SeverityTestActivity.this, TestDetails.class);
                    intent.putExtra("BAGS", severity);
                }
            }
        });
    }

}