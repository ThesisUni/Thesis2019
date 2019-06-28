package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * This class represents the first status quo question in the interaction part of the experiment.
 */
public class StatusQuoQuestion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_quo_question1);
    }

    public void nextQuestion(View view) {
        EditText newInvestment = findViewById(R.id.confidenceField1);
        Database.setPreviouslyEnteredInvestmentValue(new Double(newInvestment.getText().toString()));
        Intent intent = new Intent(this, StatusQuoQuestion2.class);
        startActivity(intent);
    }
}
