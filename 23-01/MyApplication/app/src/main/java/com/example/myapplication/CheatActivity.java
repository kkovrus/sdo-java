package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {
    private TextView answerTextView;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        boolean isAnswerTrue = getIntent().getBooleanExtra("isAnswerTrue",false);
        answerTextView = (TextView) findViewById(R.id.answer_text_view);

        if (isAnswerTrue)
            answerTextView.setText("Правильный ответ: ДА");
        else
            answerTextView.setText("Правильный ответ: НЕТ");

        back = (Button) findViewById(R.id.close_cheat_activity);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
