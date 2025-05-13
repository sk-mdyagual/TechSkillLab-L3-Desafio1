package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int[] divEnteros;
    double[] divDecimales;
    int[] divEnterosError;

    @BeforeEach
    void setUp() {
        divEnteros = new int[]{9,3};
        divDecimales = new double[]{4.5,3.0};
        divEnterosError = new int[]{10,0};
    }

    @Test
    void DivideEnteros_DevuelveResultadoCorrecto() {
        assertEquals(3, Calculadora.dividir(divEnteros));
    }

    @Test
    void DivideDecimales_DevuelveResultadoCorrecto() {
        assertEquals(1.5, Calculadora.dividir(divDecimales));
    }

    @Test
    void DivideEnteros_DevuelveExcepcion() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(divEnterosError);
        });
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void DivideEnteros_NoDevuelveExcepcion() {
        assertDoesNotThrow(() -> {
            Calculadora.dividir(divEnteros);
        });
    }
}