package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator c = new Calculator();

    @Test
    @DisplayName("Verifica addizione")
    void add() {
        float presentValue = c.add(3, 12);
        assertEquals(15, presentValue , "La somma deve essere 15.");
    }

    @Test
    @DisplayName ("Verifica sottrazione")
    void subtract() {
        float presentValue = c.subtract(10, 3);
        assertEquals(7, presentValue, "La sottrazione deve essere 7.");
    }

    @Test
    @DisplayName ("Verifica divisione")
    void divide() throws Exception {
        float presentValue = c.divide(10, 5);
        assertEquals(2, presentValue, "La divisione deve essere 2.");
    }

    @Test
    @DisplayName ("Verifica moltiplicazione")
    void multiply() {
        float presentValue  = c.multiply(5, 2);
        assertEquals(10, presentValue , "La moltiplicazione deve essere 10.");
    }
}