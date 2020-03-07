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


    public void removeCardOnClick(View view ){
        finish();
    }
    public void saveCardOnClick(View view){
        String question = questionET.getText().toString();
        String answer = answerET.getText().toString();

        Intent intent = new Intent(AddCardActivity.this,MainActivity.class);
        intent.putExtra("QUESTION",question);
        intent.putExtra("ANSWER",answer);
        startActivity(intent);
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
