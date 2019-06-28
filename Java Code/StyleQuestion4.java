package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This class represents the fourth style question in the classification part of the experiment.
 */
public class StyleQuestion4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_question4);
    }

    // adds 1 point
    public void agree(View view) {
        Database.updateStatusQuoCounter(1);
        Intent intent = new Intent(this, IntroductionInteraction.class);
        startActivity(intent);
    }

    // subtracts 1 point
    public void disagree(View view) {
        Database.updateOverconfidenceCounter(1);
        Intent intent = new Intent(this, IntroductionInteraction.class);
        startActivity(intent);
    }
}
