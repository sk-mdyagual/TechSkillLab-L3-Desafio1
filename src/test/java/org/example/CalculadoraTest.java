package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int[] divisionEnteros;
    int[] divisionCeroEnteros;
    double[] divisionDecimales;
    double[] divisionCeroDecimales;

    @BeforeEach
    void setUp(){
        divisionEnteros = new int[]{10,2};
        divisionCeroEnteros = new int[]{10,0};
        divisionDecimales = new double[]{6.9, 2.3};
        divisionCeroDecimales = new double[]{6.9, 0.0};
    }

    @Test
    void dividirEnterosResultadoCorrecto() {
        assertEquals(5, Calculadora.dividir(divisionEnteros));
    }

    @Test
    void dividirEnterosArrojaExcepcion() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(divisionCeroEnteros));
    }

    @Test
    void dividirDecimalesResultadoCorrecto() {
        assertEquals(3.0000000000000004, Calculadora.dividir(divisionDecimales));
    }

    @Test
    void dividirDecimalesArrojaExcepcion() {
        var valor = Calculadora.dividir(divisionCeroDecimales);
        assertTrue(Double.isInfinite(valor));
    }
}