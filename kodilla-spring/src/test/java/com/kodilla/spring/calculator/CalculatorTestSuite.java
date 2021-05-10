package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testAdding() {

        double a = 8.0;
        double b = 12.0;

        double result = calculator.add(a, b);

        assertEquals(result,20.0);
    }
    @Test
    public void testSubstraction() {

        double a = 8.0;
        double b = 12.0;

        double result = calculator.sub(a, b);

        assertEquals(result,-4.0);
    }
    @Test
    public void testMultiplication() {

        double a = 8.0;
        double b = 12.0;

        double result = calculator.mul(a, b);

        assertEquals(result,96.0);

    }
    @Test
    public void testDivision() {

        double a = 10.0;
        double b = 5.0;

        double result = calculator.div(a, b);

        assertEquals(result, 2.0);
    }
}
