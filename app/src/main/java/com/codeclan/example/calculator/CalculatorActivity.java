package com.codeclan.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private Button addButton;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        firstNumber = (EditText)findViewById(R.id.first_number);
        secondNumber = (EditText)findViewById(R.id.second_number);
        addButton = (Button) findViewById(R.id.add_button);
        calculator = new Calculator();
    }

    public void onClickAddButton(View button){
        int first = Integer.parseInt(firstNumber.getText().toString());
        int second = Integer.parseInt(secondNumber.getText().toString());

        Intent intent = new Intent(this, OutcomeActivity.class);
        int outcome = calculator.add(first, second);
        intent.putExtra("add_outcome", (int)outcome);

        startActivity(intent);
    }
}
