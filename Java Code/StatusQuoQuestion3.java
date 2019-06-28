package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This class represents the third status quo question in the interaction part of the experiment.
 */
public class StatusQuoQuestion3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_quo_question3);
        TextView setPreviousInvestmentOnScreen = findViewById(R.id.previousInvestmentDisplay22);
        setPreviousInvestmentOnScreen.setText((String.valueOf(Database.getPreviouslyEnteredInvestmentValue())));
    }

    public void nextQuestion(View view) {

        EditText newInvestment = findViewById(R.id.confidenceField3);
        Database.setPreviouslyEnteredInvestmentValue(new Double(newInvestment.getText().toString()));
        Intent intent = new Intent(this, StatusQuoQuestion4.class);
        startActivity(intent);
    }
}
