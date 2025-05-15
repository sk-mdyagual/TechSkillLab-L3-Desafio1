package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase Calculadora.
 * Contiene pruebas unitarias para los métodos de división.
 */
class CalculadoraTest {
    private int[] numerosEnteros;
    private double[] numerosDecimales;


    @BeforeEach
    void inicializarNumeros() {
        numerosEnteros = new int[]{100, 2, 5};
        numerosDecimales = new double[]{100.5, 2.5, 5.5};
    }

    @Test
    void testDividirNumerosEnteros() {
        assertEquals(10, Calculadora.dividir(numerosEnteros), "La división de 100, 2 y 5 debería ser 10");
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(100, 0), "Dividir por cero debería lanzar ArithmeticException");
    }

    @Test
    void testDividirNumerosDecimales() {
        assertEquals(7.3, Calculadora.dividir(numerosDecimales), 0.01, "La división de 100.5, 2.5 y 5.5 debería ser aproximadamente 7.3");
        assertTrue(Double.isInfinite(Calculadora.dividir(100.5, 0.0)), "Dividir por cero debería devolver Infinity");
    }
}