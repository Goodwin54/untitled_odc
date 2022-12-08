package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;

    @BeforeEach
    void setUp() {
       calculator  = new SimpleCalculator();
    }
    @Test
    void test_if_calculated_add_is_working(){
        assertEquals(22,calculator.addition(12,10));
    }
    @Test
    void test_soustration(){
        assertEquals(2,calculator.soustraction(12,10));
    }
    @Test
    void test_multiolication(){
        assertEquals(16,calculator.multiplication(4,4));
    }
    @Test
    void test_isEven(){
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(5));
    }




}