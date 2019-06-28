package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Starts the interaction process.
 */
public class StartInteraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_interaction);
    }

    public void startInteraction(View view) {
        Intent intent = new Intent(this, InvestmentOppertunity.class);
        startActivity(intent);
    }
}
