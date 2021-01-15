package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button trueButton;
    private Button falseButton;
    private Button openCheatActivity;
    private TextView questionTextView;
    private int currentIndex = 0;
    private Question[] questionBank = new Question[]{
            new Question(R.string.question_text_1,true),
            new Question(R.string.question_text_2,false),
            new Question(R.string.question_text_3,true),
            new Question(R.string.question_text_4,false),
            new Question(R.string.question_text_5,true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate(Bundle) called");
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            currentIndex = savedInstanceState.getInt("currentIndex");
        }
        trueButton = (Button) findViewById(R.id.true_button);
        falseButton= (Button) findViewById(R.id.false_button);
        openCheatActivity = (Button) findViewById(R.id.open_cheat_activity);
        questionTextView = (TextView) findViewById(R.id.question_text_view);
        final int question = questionBank[currentIndex].getTextResId();
        questionTextView.setText(question);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(true);
                updateQuestion();
            }
        });
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
                updateQuestion();
            }
        });
        openCheatActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheatActivity.class);
                intent.putExtra("isAnswerTrue",questionBank[currentIndex].isAnswerTrue());
                startActivity(intent);
            }
        });

    }

    private void updateQuestion(){
        currentIndex = (currentIndex+1)%questionBank.length;
        int question = questionBank[currentIndex].getTextResId();
        questionTextView.setText(question);
    }

    private void checkAnswer(boolean userAnswer){
        boolean answerIsTrue = questionBank[currentIndex].isAnswerTrue();
        if(userAnswer == answerIsTrue)
            Toast.makeText(MainActivity.this,R.string.correct_answer,Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this,R.string.incorrect_answer,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG,"onSaveInstanceState() called");
        savedInstanceState.putInt("currentIndex",currentIndex);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart() called");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"onResume() called");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy() called");
    }
}