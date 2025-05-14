package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private int[] enteros;
    private int[] enterosyceros;
    private double[] reales;
    private double[] realesyceros;

    @BeforeEach
    void setUp() {
        this.enteros= new int[]{100, 4, 5 };
        this.reales = new double[] {50.0, 2.5, 4.5};
        this.enterosyceros = new int[] {1, 2, 3, 0, 5};
        this.realesyceros = new double[] {1.5, 2.5, 3.5, 0.0, 5.5};
    }

    @Test
    void testDividirCorrectamenteEnteros() {
        assertEquals(5, Calculadora.dividir(this.enteros));
    }

    @Test
    void testDividirCorrectamenteReales() {
        assertEquals(4.44, Calculadora.dividir(this.reales));
    }

    @Test
    void testDividirEnterosEntreCeroExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.dividir(enterosyceros);
        });
    }

    @Test
    void testDividirRealesEntreCeroExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.dividir(realesyceros);
        });
    }

    @Test
    void testDividirEnterosUnArgumentoException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.dividir(1);
        });
    }
}