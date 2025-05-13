package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
        Calculadora calculadora = new Calculadora();
    }

    @Test
    void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(10, Calculadora.sumar(1, 2, 3, 4));
        assertEquals(0, Calculadora.sumar());
    }

    @Test
    void testRestar() {
        assertEquals(1, Calculadora.restar(3, 2));
        assertEquals(-1, Calculadora.restar(2, 3));
        assertEquals(0, Calculadora.restar(3, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, Calculadora.multiplicar(2, 3));
        assertEquals(24, Calculadora.multiplicar(2, 3, 4));
        assertEquals(0, Calculadora.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, Calculadora.dividir(6, 3));
        assertEquals(1.5, Calculadora.dividir(3.0, 2.0), 0.0001);
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(5, 0));
    }

}