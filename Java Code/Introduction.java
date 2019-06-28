package com.example.thesisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * This class gives a general introduction to the user.
 */
public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

    }

    public void nextQuestion(View view) {
        Intent intent = new Intent(this, ClassificationIntroduction.class);
        startActivity(intent);
    }
}
