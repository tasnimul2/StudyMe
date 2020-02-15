package com.mystudyapps.studyme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView questionTV, answerTV;




    //when question is tapped, the answer is shown
    public void questionOnClick(View view){
        questionTV.setEnabled(false);
        questionTV.setVisibility(View.INVISIBLE);

        answerTV.setVisibility(View.VISIBLE);
        answerTV.setEnabled(true);

    }

    //when the answer is tapped, the question is shown
    public void answerOnClick(View view){
        answerTV.setVisibility(View.INVISIBLE);
        answerTV.setEnabled(false);

        questionTV.setEnabled(true);
        questionTV.setVisibility(View.VISIBLE);


    }

    public void optionOnClick(View view){

        TextView text = (TextView) view;

        if (text.getText().equals("option One")){
            text.setBackground(ContextCompat.getDrawable(this,R.drawable.correct));
        }else{
            text.setBackground(ContextCompat.getDrawable(this,R.drawable.incorrect));
        }

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
