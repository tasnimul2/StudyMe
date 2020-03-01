package com.mystudyapps.studyme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddCardActivity extends AppCompatActivity {


    FloatingActionButton removeCardBTN;


    private void removeCardOnClick(View view ){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        removeCardBTN = findViewById(R.id.removeCard);
    }
}
