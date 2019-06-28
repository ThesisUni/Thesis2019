package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This class represents the first style statement in the classification part of the experiment.
 */
public class StyleStatement1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_statement1);
    }


    // adds 1 point to the Overconfidence Counter
    public void agree(View view) {
        Database.updateOverconfidenceCounter(1);
        Intent intent = new Intent(this, StyleStatement2.class);
        startActivity(intent);
    }

    // adds 1 point to the Status Quo Counter
    public void disagree(View view) {
        Database.updateStatusQuoCounter(1);
        Intent intent = new Intent(this, StyleStatement2.class);
        startActivity(intent);
    }
}
