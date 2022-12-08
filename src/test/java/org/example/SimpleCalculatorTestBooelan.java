package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTestBooelan {
    @Test
    void test_if_calculated_bool_is_working(){
        SimpleCalculator bool = new SimpleCalculator();
        assertEquals(0,bool.isEven(12));
    }

}