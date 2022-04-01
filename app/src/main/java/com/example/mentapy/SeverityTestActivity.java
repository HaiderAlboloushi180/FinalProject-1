package com.example.mentapy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class SeverityTestActivity extends AppCompatActivity {

    // Views
    private TextView questionCount = findViewById(R.id.questionCount);
    private TextView questionText  = findViewById(R.id.question);
    private Button option1Btn = findViewById(R.id.option1);
    private Button option2Btn = findViewById(R.id.option2);
    private Button option3Btn = findViewById(R.id.option3);
    private Button option4Btn = findViewById(R.id.option4);
    ArrayList<QuizModel> quizModelArrayList = new ArrayList<>();
    private int questionsDid = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_severity_test);

        // Getting and setting the questions
        getQuizQuestions(quizModelArrayList);
        currentPos = new Random().nextInt(quizModelArrayList.size());
        setDataToView(currentPos);
    }

    private void setDataToView(int currentPos) {
        questionCount.setText("Question Number: "+currentPos+"/5");
        questionText.setText(quizModelArrayList.get(currentPos).getQuestion());
        option1Btn.setText(quizModelArrayList.get(currentPos).getOption1());
        option2Btn.setText(quizModelArrayList.get(currentPos).getOption2());
        option3Btn.setText(quizModelArrayList.get(currentPos).getOption3());
        option4Btn.setText(quizModelArrayList.get(currentPos).getOption4());
    }

    private void getQuizQuestions(ArrayList<QuizModel> quizModelArrayList) {
        quizModelArrayList.add(new QuizModel("Have you been able to do the stuff you enjoy doing?", "Yes, I am very productive", "Kinda, I am tired most of the time", "No but I want to be able to do em", "I have lost interest in the stuff that I used to do"));
        quizModelArrayList.add(new QuizModel("How long do you usually sleep?", "I am not so sure", "Very little, 1-5 hours", "About 6-10 hours", "Too much 11+ hours"));
        quizModelArrayList.add(new QuizModel("Have you been able to do the stuff you enjoy doing?", "Yes, I am very productive", "Kinda, I am tired most of the time", "No but I want to be able to do em", "I have lost interest in the stuff that I used to do"));
        quizModelArrayList.add(new QuizModel("Have you been able to do the stuff you enjoy doing?", "Yes, I am very productive", "Kinda, I am tired most of the time", "No but I want to be able to do em", "I have lost interest in the stuff that I used to do"));
        quizModelArrayList.add(new QuizModel("Have you been able to do the stuff you enjoy doing?", "Yes, I am very productive", "Kinda, I am tired most of the time", "No but I want to be able to do em", "I have lost interest in the stuff that I used to do"));
    }
}