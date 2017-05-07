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
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;
    private Button powerButton;
    private Calculator calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        firstNumber = (EditText)findViewById(R.id.first_number);
        secondNumber = (EditText)findViewById(R.id.second_number);
        addButton = (Button) findViewById(R.id.add_button);
        subtractButton = (Button) findViewById(R.id.subtract_button);
        multiplyButton = (Button) findViewById(R.id.multiply_button);
        divideButton = (Button) findViewById(R.id.divide_button);
        powerButton = (Button) findViewById(R.id.power_button);
        calc = new Calculator();
    }

    public void onCalcButtonClick(View view) {
        int num1 = Integer.parseInt(firstNumber.getText().toString());
        int num2 = Integer.parseInt(secondNumber.getText().toString());
        int outcome = 0;

        switch (view.getId()) {
            case R.id.add_button:
                outcome = calc.add(num1, num2);
                break;
            case R.id.subtract_button:
                outcome = calc.subtract(num1, num2);
                break;
            case R.id.multiply_button:
                outcome = calc.multiply(num1, num2);
                break;
            case R.id.power_button:
                outcome = calc.findPower(num1, num2);
                break;
        }

        Intent intent = new Intent(this, OutcomeActivity.class);
        intent.putExtra("int_outcome", outcome);

        startActivity(intent);
    }

    public void onClickDivideButton(View button){
        Double first = Double.valueOf(firstNumber.getText().toString());
        int second = Integer.parseInt(secondNumber.getText().toString());

        Intent intent = new Intent(this, DoubleOutcomeActivity.class);
        Double outcome = calc.divide(first, second);
        intent.putExtra("double_outcome", outcome);

        startActivity(intent);


    }

}
