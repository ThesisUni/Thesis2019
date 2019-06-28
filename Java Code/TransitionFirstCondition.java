package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * This class is used to determine if the condition is done and the application can move on
 * , or if here is another investment oppertunity
 * to consider for the first condition.
 */
public class TransitionFirstCondition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_investment_decision_first_condition);
    }

    public void nextScreen(View view) {
        EditText neutralInvestment = findViewById(R.id.final_investment_decision_neutral_investment);
        Database.addInitialInvestment(new Double(neutralInvestment.getText().toString()));
        if (Database.getOppertunity().equals("EcoRun")) {
            Database.setOppertunity("ReloCoin");
            Intent intent = new Intent(this, InvestmentOppertunity.class);
            startActivity(intent);
        } else if (Database.getOppertunity().equals("ReloCoin")) {
            Database.setOppertunity("VirtualSociety");
            Intent intent = new Intent(this, InvestmentOppertunity.class);
            startActivity(intent);
        } else if (Database.getSecondConditionTaken() == false) {
            Database.setFirstConditionTaken(true);
            Database.setOppertunity("EcoRun");
            Intent intent = new Intent(this, SecondRoundStartScreen.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, Results.class);
            startActivity(intent);
        }
    }
}
