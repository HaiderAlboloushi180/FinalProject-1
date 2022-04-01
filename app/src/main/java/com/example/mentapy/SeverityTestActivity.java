package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        QuizModel q1 = new QuizModel("Do you find yourself not doing what you were interested in?", "No, I still do what I am interested in","No but sometimes I don't feel like it", "Yes, but I really am interested", "I have fully lost interest in what I loved doing", 0,1,2,3);
        QuizModel q2 = new QuizModel("How long have you been sleeping?", "Very little, 1-5 hours","A good amount, 6-10 hours", "A lot, 11+ hours", "I'm not sure", 1,0,1,0);
        QuizModel q3 = new QuizModel("Have you been tired lately?", "Nope, not at all","Not really, just exhausted from tasks", "Yes I get tired pretty quick", "I am tired most of the time, even if I rested", 0,1,2,3);
        QuizModel q4 = new QuizModel("Have you been able to enjoy your free time?", "Yes, I enjoy every minute of it","Yes but sometimes I do get anxious from my responsibilities", "No, sometimes I just want to leave", "I don't have time for free time", 0,2,3,2);
        QuizModel q5 = new QuizModel("How confident do you think you are with your mental health?", "I'd say that my mental health is good, maybe perfect","I think my mental health is good, but I still talk to professionals", "I think that I should talk to a professional", "I need to seek a professional but I don't feel comfortable", 0,1,2,2);

        // Setting the views
        questionCount.setText(questionsDid+"");
        questionText.setText(q1.getQuestion());
        option1Btn.setText(q1.getOption1());
        option2Btn.setText(q1.getOption2());
        option3Btn.setText(q1.getOption3());
        option4Btn.setText(q1.getOption4());

        // The Large wall of code (setOnClickListeners)
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionText.getText() == q1.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q1.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q2.getQuestion());
                    option1Btn.setText(q2.getOption1());
                    option2Btn.setText(q2.getOption2());
                    option3Btn.setText(q2.getOption3());
                    option4Btn.setText(q2.getOption4());
                } else if (questionText.getText() == q2.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q2.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q3.getQuestion());
                    option1Btn.setText(q3.getOption1());
                    option2Btn.setText(q3.getOption2());
                    option3Btn.setText(q3.getOption3());
                    option4Btn.setText(q3.getOption4());
                } else if (questionText.getText() == q3.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q3.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q4.getQuestion());
                    option1Btn.setText(q4.getOption1());
                    option2Btn.setText(q4.getOption2());
                    option3Btn.setText(q4.getOption3());
                    option4Btn.setText(q4.getOption4());
                } else if (questionText.getText() == q4.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q4.getOption1Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q5.getQuestion());
                    option1Btn.setText(q5.getOption1());
                    option2Btn.setText(q5.getOption2());
                    option3Btn.setText(q5.getOption3());
                    option4Btn.setText(q5.getOption4());
                } else if (questionText.getText() == q5.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q5.getOption1Sev();
                    Intent intent = new Intent(SeverityTestActivity.this, TestDetails.class);
                    intent.putExtra("BAGS", severity);
                    startActivity(intent);
                }
            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionText.getText() == q1.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q1.getOption2Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q2.getQuestion());
                    option1Btn.setText(q2.getOption1());
                    option2Btn.setText(q2.getOption2());
                    option3Btn.setText(q2.getOption3());
                    option4Btn.setText(q2.getOption4());
                } else if (questionText.getText() == q2.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q2.getOption2Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q3.getQuestion());
                    option1Btn.setText(q3.getOption1());
                    option2Btn.setText(q3.getOption2());
                    option3Btn.setText(q3.getOption3());
                    option4Btn.setText(q3.getOption4());
                } else if (questionText.getText() == q3.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q3.getOption2Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q4.getQuestion());
                    option1Btn.setText(q4.getOption1());
                    option2Btn.setText(q4.getOption2());
                    option3Btn.setText(q4.getOption3());
                    option4Btn.setText(q4.getOption4());
                } else if (questionText.getText() == q4.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q4.getOption2Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q5.getQuestion());
                    option1Btn.setText(q5.getOption1());
                    option2Btn.setText(q5.getOption2());
                    option3Btn.setText(q5.getOption3());
                    option4Btn.setText(q5.getOption4());
                } else if (questionText.getText() == q5.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q5.getOption2Sev();
                    Intent intent = new Intent(SeverityTestActivity.this, TestDetails.class);
                    intent.putExtra("BAGS", severity);
                    startActivity(intent);
                }
            }
        });
        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionText.getText() == q1.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q1.getOption3Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q2.getQuestion());
                    option1Btn.setText(q2.getOption1());
                    option2Btn.setText(q2.getOption2());
                    option3Btn.setText(q2.getOption3());
                    option4Btn.setText(q2.getOption4());
                } else if (questionText.getText() == q2.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q2.getOption3Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q3.getQuestion());
                    option1Btn.setText(q3.getOption1());
                    option2Btn.setText(q3.getOption2());
                    option3Btn.setText(q3.getOption3());
                    option4Btn.setText(q3.getOption4());
                } else if (questionText.getText() == q3.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q3.getOption3Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q4.getQuestion());
                    option1Btn.setText(q4.getOption1());
                    option2Btn.setText(q4.getOption2());
                    option3Btn.setText(q4.getOption3());
                    option4Btn.setText(q4.getOption4());
                } else if (questionText.getText() == q4.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q4.getOption3Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q5.getQuestion());
                    option1Btn.setText(q5.getOption1());
                    option2Btn.setText(q5.getOption2());
                    option3Btn.setText(q5.getOption3());
                    option4Btn.setText(q5.getOption4());
                } else if (questionText.getText() == q5.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q5.getOption3Sev();
                    Intent intent = new Intent(SeverityTestActivity.this, TestDetails.class);
                    intent.putExtra("BAGS", severity);
                    startActivity(intent);
                }
            }
        });
        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionText.getText() == q1.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q1.getOption4Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q2.getQuestion());
                    option1Btn.setText(q2.getOption1());
                    option2Btn.setText(q2.getOption2());
                    option3Btn.setText(q2.getOption3());
                    option4Btn.setText(q2.getOption4());
                } else if (questionText.getText() == q2.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q2.getOption4Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q3.getQuestion());
                    option1Btn.setText(q3.getOption1());
                    option2Btn.setText(q3.getOption2());
                    option3Btn.setText(q3.getOption3());
                    option4Btn.setText(q3.getOption4());
                } else if (questionText.getText() == q3.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q3.getOption4Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q4.getQuestion());
                    option1Btn.setText(q4.getOption1());
                    option2Btn.setText(q4.getOption2());
                    option3Btn.setText(q4.getOption3());
                    option4Btn.setText(q4.getOption4());
                } else if (questionText.getText() == q4.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q4.getOption4Sev();
                    questionsDid++;
                    questionCount.setText(questionsDid+"");
                    questionText.setText(q5.getQuestion());
                    option1Btn.setText(q5.getOption1());
                    option2Btn.setText(q5.getOption2());
                    option3Btn.setText(q5.getOption3());
                    option4Btn.setText(q5.getOption4());
                } else if (questionText.getText() == q5.getQuestion()) {
                    Toast.makeText(SeverityTestActivity.this, "👍", Toast.LENGTH_SHORT).show();
                    severity = severity + q5.getOption4Sev();
                    Intent intent = new Intent(SeverityTestActivity.this, TestDetails.class);
                    intent.putExtra("BAGS", severity);
                    startActivity(intent);
                }
            }
        });
    }

}