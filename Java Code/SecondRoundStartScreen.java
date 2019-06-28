package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This class represents the frame that indicates the start of the second round in the interaction part
 * of the application.
 */
public class SecondRoundStartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_round_start_screen);
    }

    public void nextScreen(View view) {
        Intent intent = new Intent(this, InvestmentOppertunity.class);
        startActivity(intent);
    }
}
