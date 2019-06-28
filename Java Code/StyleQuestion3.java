package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This class represents the third style question in the classification part of the experiment.
 */
public class StyleQuestion3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_question3);
    }

    // adds 1 point
    public void agree(View view) {
        Database.updateOverconfidenceCounter(1);
        Intent intent = new Intent(this, StyleQuestion4.class);
        startActivity(intent);
    }

    // subtracts 1 point
    public void disagree(View view) {
        Database.updateStatusQuoCounter(1);
        Intent intent = new Intent(this, StyleQuestion4.class);
        startActivity(intent);
    }
}
