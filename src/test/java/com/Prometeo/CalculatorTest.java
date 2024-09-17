package com.Prometeo;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void startNumber() {
        Calculator calculator = new Calculator();
        assertDoesNotThrow(() -> calculator.startNumber());
    }

    @Test
    void getNumber() {
        Calculator calculator = new Calculator();
        String text = "El próximo día 21/05/2019 se celebrará desde las 14 a las 15:30 horas el congreso.";

        List<Integer> expectedNumbers = List.of(21, 5, 2019, 14, 15, 30);

        List<Integer> actualNumbers = calculator.getNumber(text);

        assertEquals(expectedNumbers, actualNumbers, "number has to be equals");
    }

    @Test
    void getNumber_EmptyString() {
        Calculator calculator = new Calculator();
        String text = "";

        List<Integer> expectedNumbers = List.of();

        List<Integer> actualNumbers = calculator.getNumber(text);

        assertEquals(expectedNumbers, actualNumbers, "it has to be empty");
    }

    @Test
    void getNumber_NoNumbers() {
        Calculator calculator = new Calculator();
        String text = "No hay ningún número en este texto.";

        List<Integer> expectedNumbers = List.of();

        List<Integer> actualNumbers = calculator.getNumber(text);

        assertEquals(expectedNumbers, actualNumbers, "Text without number has to be without number");
    }
}
