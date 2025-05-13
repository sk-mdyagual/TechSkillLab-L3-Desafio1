package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int[] sumaEnteros;
    double[] sumaDecimales;
    int[] divisionEnteros;
    double[] divisionDecimales;

    @BeforeEach
    void setUp() {
        sumaEnteros = new int[]{6, 5, 12};
        sumaDecimales = new double[]{6.5, 4, 4.3};
        divisionEnteros = new int[]{100, 5, 0};
        divisionDecimales = new double[]{6.5, 0};
    }

    @Test
    void sumaDeEnterosCorrectamente() {
        Assertions.assertEquals(23, Calculadora.sumar(sumaEnteros));
    }

    @Test
    void restaDeEnterosCorrectamente() {
        Assertions.assertEquals(7, Calculadora.restar(12, 5));
    }

    @Test
    void multiplicacionDeEnterosCorectamente() {
        Assertions.assertEquals(72, Calculadora.multiplicar(6, 12));
    }

    @Test
    void divisionDeEnterosCorrectamente() {
        Assertions.assertEquals(2, Calculadora.dividir(12, 6));
    }

    @Test
    void divisionDeEnterosConCeroDebeSacarExepcion() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(divisionEnteros);
        });
    }

    @Test
    void sumaDeDecimalesCorrectamente() {
        Assertions.assertEquals(14.8, Calculadora.sumar(sumaDecimales));
    }

    @Test
    void restaDeDecimalesCorrectamente() {
        Assertions.assertEquals(2.5, Calculadora.restar(6.5, 4));
    }

    @Test
    void multiplicacionDeDecimalesCorrectamente() {
        Assertions.assertEquals(26.0, Calculadora.multiplicar(6.5, 4));
    }

    @Test
    void divisionDeDecimalesCorrectamente() {
        Assertions.assertEquals(1.625, Calculadora.dividir(6.5, 4));
    }

    @Test
    void divisionDeDecimalesConCeroDebeSacarExepcion() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(divisionDecimales);
        });
    }
}