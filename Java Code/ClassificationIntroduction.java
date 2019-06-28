package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Gives directions on the classification part of the application.
 */
public class ClassificationIntroduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classification_introduction);
    }

    public void nextQuestion(View view) {
        Intent intent = new Intent(this, StyleStatement1.class);
        startActivity(intent);
    }
}
