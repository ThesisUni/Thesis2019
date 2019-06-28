package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This class represents the second neutral question in the interaction part of the experiment.
 */
public class NeutralQuestion2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neutral_question2);
        TextView setPreviousInvestmentOnScreen = findViewById(R.id.previousInvestmentDisplay1);
        setPreviousInvestmentOnScreen.setText((String.valueOf(Database.getPreviouslyEnteredInvestmentValue())));

    }

    public void nextQuestion(View view) {

        EditText newInvestment = findViewById(R.id.confidenceField22);
        Database.setPreviouslyEnteredInvestmentValue(new Double(newInvestment.getText().toString()));
        Intent intent = new Intent(this, NeutralQuestion3.class);
        startActivity(intent);

    }
}
