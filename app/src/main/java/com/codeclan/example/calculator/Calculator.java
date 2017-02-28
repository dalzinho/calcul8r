package com.codeclan.example.calculator;

/**
 * Created by user on 28/02/2017.
 */


public class Calculator {

    public Calculator(){

    }

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public Double divide(Double firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public int findPower(int firstNumber, int secondNumber){
        return (int) Math.pow(firstNumber,secondNumber);
    }
}
