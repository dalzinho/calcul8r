package com.codeclan.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/02/2017.
 */

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testCalculatorCanAdd(){
        assertEquals(100, calculator.add(25,75));
    }

    @Test
    public void testCalculatorCanSubtract(){
        assertEquals(19, calculator.subtract(45, 26));
    }

    @Test
    public void testCalculatorCanDivide(){
        assertEquals(25, calculator.divide(100., 4), 0.01);
    }

    @Test
    public void testCalculatorReturnsDecimal(){
        assertEquals(10.25, calculator.divide(41.,4), 0.01);
    }

    @Test
    public void testCalculatorReturnsPower(){
        assertEquals(125, calculator.findPower(5,3));
    }
}
