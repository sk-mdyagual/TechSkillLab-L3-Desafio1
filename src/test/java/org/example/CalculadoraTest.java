package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int[] divEntero;
    double[] divDecimal;

    @BeforeEach
    void setUp(){
        divEntero = new int[]{4,2};
        divDecimal = new double[]{4.0, 2.0};
    }

    @Test
    void testsumar() {
        Assertions.assertEquals(4,Calculadora.sumar(2,2));
    }

    @Test
    void testdividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividirConValidacion(10,0);
        });
    }

    @Test
    void testDividirEntero() {
        Assertions.assertEquals(2,Calculadora.dividir(divEntero[0],divEntero[1]));
    }

    @Test
    void testDividirDecimal() {
        Assertions.assertEquals(2.0,Calculadora.dividir(divEntero[0],divEntero[1]));
        assertTrue(Double.isInfinite(Calculadora.dividir(divDecimal[0],0.0)),"No se puede la division por cero");
    }
}