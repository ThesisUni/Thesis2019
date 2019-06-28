package com.example.thesisapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * This class is concerned with showing the results of the experiment to the user.
 */
public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        getResults();
    }

    /**
     * Gets the investments and the investment style from the database and displays them.
     * Furthermore, a short conclusion regarding if the investment behavior has changed throughout the
     * experiment is shown.
     */
    private void getResults() {
        double totalInitialInvestments = Database.getInitialInvestment(0) + Database.getInitialInvestment(1) + Database.getInitialInvestment(2);
        double totalNewInvestments = Database.getNewInvestment(0) + Database.getNewInvestment(1) + Database.getNewInvestment(2);
        TextView investmentStyle = findViewById(R.id.result_screen_investment_style);
        TextView differenceInInvestmentsAmount = findViewById(R.id.result_screen_difference_investments);
        TextView ecorunInitialInvestment = findViewById(R.id.result_screen_initial_investment_ecorun);
        TextView relocoinInitialInvestment = findViewById(R.id.result_screen_initial_investment_relocoin);
        TextView virtualsocietyInitialInvestment = findViewById(R.id.result_screen_initial_investment_virtualsociety);
        TextView ecorunUpdatedInvestment = findViewById(R.id.result_screen_new_investment_ecorun);
        TextView relocoinUpdatedInvestment = findViewById(R.id.result_screen_new_investment_relocoin);
        TextView virtualsocietyUpdatedInvestment = findViewById(R.id.result_screen_new_investment_virtualsociety);
        ecorunInitialInvestment.setText(Database.getInitialInvestment(0).toString());
        relocoinInitialInvestment.setText(Database.getInitialInvestment(1).toString());
        virtualsocietyInitialInvestment.setText(Database.getInitialInvestment(2).toString());
        ecorunUpdatedInvestment.setText(Database.getNewInvestment(0).toString());
        relocoinUpdatedInvestment.setText(Database.getNewInvestment(1).toString());
        virtualsocietyUpdatedInvestment.setText(Database.getNewInvestment(2).toString());
        investmentStyle.setText("Investment Style: " + Database.getInvestmentStyle());
        if (totalInitialInvestments > totalNewInvestments)
            differenceInInvestmentsAmount.setText("On average, your influenced investments are lower in amount than your neutral ones.");
        else if ((totalInitialInvestments < totalNewInvestments))
            differenceInInvestmentsAmount.setText("On average, your influenced investments are higher in amount than your neutral ones.");
        else
            differenceInInvestmentsAmount.setText("Your influenced investments are equal in amount compared to your neutral investments.");
    }
}
