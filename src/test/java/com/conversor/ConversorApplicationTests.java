package com.conversor;

import com.conversor.domain.ConversorDeNumeroRomano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConversorApplicationTests {

    private ConversorDeNumeroRomano converter;

    @BeforeEach
    void setUp() {
        converter = new ConversorDeNumeroRomano();
    }

    @Test
    void shouldUnderstandSymbolI() {
        int number = converter.romanToDecimal("I");
        assertEquals(1, number);
    }

    @Test
    void shouldUnderstandSymbolV() {
        int number = converter.romanToDecimal("V");
        assertEquals(5, number);
    }

    @Test
    void shouldUnderstandSymbolX() {
        int number = converter.romanToDecimal("X");
        assertEquals(10, number);
    }

    @Test
    void shouldUnderstandSymbolL() {
        int number = converter.romanToDecimal("L");
        assertEquals(50, number);
    }

    @Test
    void shouldUnderstandSymbolII() {
        int number = converter.romanToDecimal("II");
        assertEquals(2, number);
    }

    @Test
    void shouldUnderstandSymbolIII() {
        int number = converter.romanToDecimal("III");
        assertEquals(3, number);
    }

    @Test
    void shouldUnderstandSymbolIX() {
        int number = converter.romanToDecimal("IX");
        assertEquals(9, number);
    }

    @Test
    void shouldUnderstandSymbolLVIII() {
        int number = converter.romanToDecimal("LVIII");
        assertEquals(58, number);
    }

    @Test
    void shouldUnderstandSymbolMCMXCIV() {
        int number = converter.romanToDecimal("MCMXCIV");
        assertEquals(1994, number);
    }

    @Test
    void shouldUnderstandSymbolIIII() {
        int number = converter.romanToDecimal("IIII");
        assertEquals(4, number);
    }

}
