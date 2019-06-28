package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


/**
 * This class is used to determine if the condition is done and the application can move on
 * , or if here is another investment oppertunity
 * to consider for the second condition.
 */

public class TransitionSecondCondition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_investment_decision);
    }

    public void nextScreen(View view) {
        EditText newInvestment = findViewById(R.id.final_investment_decision_new_investment);
        Database.addNewInvestment(new Double(newInvestment.getText().toString()));
        if (Database.getOppertunity().equals("EcoRun")) {
            Database.setOppertunity("ReloCoin");
            Intent intent = new Intent(this, InvestmentOppertunity.class);
            startActivity(intent);
        } else if (Database.getOppertunity().equals("ReloCoin")) {
            Database.setOppertunity("VirtualSociety");
            Intent intent = new Intent(this, InvestmentOppertunity.class);
            startActivity(intent);
        } else if (Database.getFirstConditionTaken() == false) {
            Database.setSecondConditionTaken(true);
            Database.setStartState(0);
            Database.setOppertunity("EcoRun");
            Intent intent = new Intent(this, SecondRoundStartScreen.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, Results.class);
            startActivity(intent);
        }
    }
}
