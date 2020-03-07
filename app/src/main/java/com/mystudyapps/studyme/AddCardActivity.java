package com.mystudyapps.studyme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddCardActivity extends AppCompatActivity {


    FloatingActionButton removeCardBTN, saveBTN;
    EditText questionET,answerET;


    //----------------------------------------------------------------------//
    //                   BUTTON ON CLICK METHODS                           //
    // ---------------------------------------------------------------------//

    //removeCardOnClick method closes the add card activity
    public void removeCardOnClick(View view ){
        finish();
    }

    /*
    saveCardOnClick method :
    1) takes user input from edit texts and assigns it to question and answer variable
    2) creates a new intent that stores the user input
    3) the user's input data it put inside the setResult method and sent back to MainActivty
    4) ends the AddCard activity

     */
    public void saveCardOnClick(View view){

        String question = questionET.getText().toString();
        String answer = answerET.getText().toString();

        Intent data = new Intent();
        data.putExtra("QUESTION", question);
        data.putExtra("ANSWER",answer);
        setResult(RESULT_OK,data);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        removeCardBTN = findViewById(R.id.removeCard);
        saveBTN = findViewById(R.id.saveBTN);
        questionET = findViewById(R.id.questionET);
        answerET = findViewById(R.id.answerET);
    }
}
