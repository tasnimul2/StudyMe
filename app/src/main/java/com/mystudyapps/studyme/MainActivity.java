package com.mystudyapps.studyme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView questionTV, answerTV;




    public void questionOnClick(View view){
        questionTV.setEnabled(false);
        questionTV.setVisibility(View.INVISIBLE);

        answerTV.setVisibility(View.VISIBLE);
        answerTV.setEnabled(true);

    }


    public void answerOnClick(View view){
        answerTV.setVisibility(View.INVISIBLE);
        answerTV.setEnabled(false);

        questionTV.setEnabled(true);
        questionTV.setVisibility(View.VISIBLE);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        questionTV = findViewById(R.id.questionTV);
        answerTV = findViewById(R.id.answerTV);

        answerTV.setVisibility(View.INVISIBLE);
        answerTV.setEnabled(false);
    }
}
