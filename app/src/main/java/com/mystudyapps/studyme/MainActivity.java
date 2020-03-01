package com.mystudyapps.studyme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView questionTV, answerTV , option1TV,option2TV,option3TV ;
    FloatingActionButton addCardBTN;
    boolean isShowingOptions = true;





    //----------------------------------------------------------------------//
    //                   BUTTON ON CLICK METHODS                           //
    // ---------------------------------------------------------------------//

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

    public void showOnclick(View view){

        if(isShowingOptions) {
            option1TV.setVisibility(View.INVISIBLE);
            option2TV.setVisibility(View.INVISIBLE);
            option3TV.setVisibility(View.INVISIBLE);
            isShowingOptions = false;
        }else {
            option1TV.setVisibility(View.VISIBLE);
            option2TV.setVisibility(View.VISIBLE);
            option3TV.setVisibility(View.VISIBLE);
            isShowingOptions = true;
        }
    }

    public void addCardOnClick(View view){
        Intent intent = new Intent(MainActivity.this, AddCardActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        questionTV = findViewById(R.id.questionTV);
        answerTV = findViewById(R.id.answerTV);
        option1TV = findViewById(R.id.option1TV);
        option2TV = findViewById(R.id.option2TV);
        option3TV = findViewById(R.id.option3TV);
        addCardBTN = findViewById(R.id.addCardBTN);

        answerTV.setVisibility(View.INVISIBLE);
        answerTV.setEnabled(false);
    }
}
