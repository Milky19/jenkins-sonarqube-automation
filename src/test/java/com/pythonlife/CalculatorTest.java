package com.pythonlife;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(200, calculator.multiply(10, 20));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }

    @Test
    void testWelcome() {
        assertEquals(
            "Welcome to PythonLife DevOps Training, Krishna",
            calculator.welcome("Krishna")
        );
    }
}

