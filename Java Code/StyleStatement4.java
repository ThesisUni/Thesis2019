package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This class represents the fourth style statement in the classification part of the experiment.
 */
public class StyleStatement4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_statement4);
    }


    public void disagree(View view) {
        Intent intent = new Intent(this, StyleStatement5.class);
        startActivity(intent);
    }

    // adds 1 point to the Status Quo Counter
    public void agree(View view) {
        Database.updateStatusQuoCounter(1);
        Intent intent = new Intent(this, StyleStatement5.class);
        startActivity(intent);
    }
}
