package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This class represents the second style statement in the classification part of the experiment.
 */
public class StyleStatement2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_statement2);
    }

    // adds 1 point to the
    public void agree(View view) {
        Database.updateOverconfidenceCounter(1);
        Intent intent = new Intent(this, StyleStatement3.class);
        startActivity(intent);
    }

    public void disagree(View view) {
        Intent intent = new Intent(this, StyleStatement3.class);
        startActivity(intent);
    }
}
