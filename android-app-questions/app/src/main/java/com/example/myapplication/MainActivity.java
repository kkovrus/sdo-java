package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Question[] question = {
            new Question(R.string.question1, false),
            new Question(R.string.question2, true),
            new Question(R.string.question3, false),
            new Question(R.string.question4, true),
            new Question(R.string.question5, false),
    };
    int currentIndex = 0;
    TextView viewQuestion;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewQuestion = findViewById(R.id.view_question);
        updateUi();

        Button trueBtn = findViewById(R.id.true_btn);
        trueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
                currentIndex++;
                currentIndex = currentIndex%question.length;
                updateUi();
            }
        });

        Button falseBtn = findViewById(R.id.false_btn);
        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
                currentIndex++;
                currentIndex = currentIndex%question.length;
                updateUi();
            }
        });

    }

    protected void updateUi() {
        viewQuestion.setText(question[currentIndex].getQuestionId());
    }

    protected void checkAnswer(boolean answer) {
        if (question[currentIndex].isQuestionAnswer() == answer) {
            Toast.makeText(getApplicationContext(), "True", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
        }
    }
}
