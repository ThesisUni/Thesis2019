package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Random;

/**
 * This class gives a general introduction for the interacton part of the application.
 */
public class IntroductionInteraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_interaction);
        determineStyle();
        setOppertunity();
        Random generator = new Random();
        Database.setStartState(generator.nextInt(1 - 0 + 1) + 0);
    }

    /**
     * Determines the investment style of the user .
     * Also, this method sets the determined investment style in the database.
     */
    private void determineStyle() {
        int overconfidenceScore = Database.getOverconfidenceCounter();
        int statusQuoScore = Database.getStatusQuoCounter();
        if (overconfidenceScore > statusQuoScore) {
            Database.setInvestmentStyle("Overconfident");
        } else {
            Database.setInvestmentStyle("StatusQuo");
        }
    }

    /**
     * Sets the current oppertunity in the database.
     */
    private void setOppertunity() {
        Database.setOppertunity("EcoRun");
    }

    public void startInvesting(View view) {
        Intent intent = new Intent(this, InvestmentOppertunity.class);
        startActivity(intent);

    }
}
