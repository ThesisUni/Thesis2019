package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This class represents the fourth neutral question in the interaction part of the experiment.
 */
public class NeutralQuestion4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neutral_question4);
        TextView setPreviousInvestmentOnScreen = findViewById(R.id.previousInvestmentDisplay3);
        setPreviousInvestmentOnScreen.setText((String.valueOf(Database.getPreviouslyEnteredInvestmentValue())));
    }


    public void nextQuestion(View view) {
        Intent intent = new Intent(this, TransitionFirstCondition.class);
        startActivity(intent);

    }


}
