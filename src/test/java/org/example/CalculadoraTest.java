package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void dividirEntreCero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(10, 0));
    }

    @Test
    void dividirVariosNumeros() {
        int resultado = Calculadora.dividir(100, 2, 5);
        assertEquals(10, resultado);
    }

    @Test
    void dividirEnteros() {
        int resultado = Calculadora.dividir(100, 2, 2);
        assertNotEquals(20, resultado);
    }


    @Test
    void sumarEnteros() {
        int resultado = Calculadora.sumar(2, 3, 5);
        assertEquals(10, resultado);
    }

    @Test
    void restarEnteros() {
        int resultado = Calculadora.restar(10, 2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void multiplicarEnteros() {
        int resultado = Calculadora.multiplicar(2, 3, 4);
        assertEquals(24, resultado);
    }

    @Test
    void dividirEntreCeroEntero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(10, 0));
    }

    @Test
    void sumarDecimales() {
        double resultado = Calculadora.sumar(1.5, 2.5, 3.0);
        assertEquals(7.0, resultado, 0.0001);
    }

    @Test
    void restarDecimales() {
        double resultado = Calculadora.restar(10.0, 2.5, 2.5);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    void multiplicarDecimales() {
        double resultado = Calculadora.multiplicar(2.0, 3.5);
        assertEquals(7.0, resultado, 0.0001);
    }

    @Test
    void dividirDecimales() {
        double resultado = Calculadora.dividir(100.0, 2.0, 5.0);
        assertEquals(10.0, resultado, 0.0001);
    }

    @Test
    void dividirEntreCeroDecimal() {
        double resultado = Calculadora.dividir(10.0, 0.0);
        assertTrue(Double.isInfinite(resultado));
    }
}
