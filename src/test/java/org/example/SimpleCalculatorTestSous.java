package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTestSous {
    @Test
    void test_if_calculated_sous_is_working(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(2,calculator.soustraction(12,10));
    }


}