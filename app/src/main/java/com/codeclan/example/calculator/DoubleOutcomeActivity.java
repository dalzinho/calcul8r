package com.codeclan.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DoubleOutcomeActivity extends AppCompatActivity {

    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_outcome);

        outcome = (TextView)findViewById(R.id.calculation_outcome_view);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        double answer = extras.getDouble("double_outcome");

        outcome.setText(Double.toString(answer));
    }
}
