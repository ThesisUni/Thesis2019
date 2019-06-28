package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class InvestmentOppertunity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment_oppertunity);
        TextView textView = findViewById(R.id.investment_oppertunity_announcer);
        textView.setText(Database.getOppertunity());
    }

    public void startInteraction(View view) {


        if (Database.getStartState() == 0 && Database.getFirstConditionTaken() == false) {
            Intent intent = new Intent(this, NeutralQuestion1.class);
            startActivity(intent);
        } else if (Database.getInvestmentStyle().equals("StatusQuo")) {
            Intent intent = new Intent(this, StatusQuoQuestion1.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, OverconfidenceQuestion1.class);
            startActivity(intent);
        }
    }
}
