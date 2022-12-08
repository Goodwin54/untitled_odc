package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTestmulti {
    @Test
    void test_if_calculated_multi_is_working(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(16,calculator.multiplication(4,4));
    }

}