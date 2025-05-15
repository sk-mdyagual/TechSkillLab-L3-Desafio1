package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {


    int [] sumEnteros;
    double [] sumDecimales;

    int [] divisionEnteros;
    int [] divisionEnterosConCero;
    double [] divisionDecimales;
    double [] divisionDecimalesConCero;

    @BeforeEach
    void setUp() {
        sumEnteros = new int[]{10, 8, 3};
        sumDecimales = new double[]{2.6, 1.7, 3.4};
        divisionEnteros = new int[]{20, 5, 2};
        divisionDecimales = new double[]{20.0, 5.0, 2.0};
        divisionDecimalesConCero    = new double[]{20.0, 5.0, 0.0};
        divisionEnterosConCero = new int[]{20, 5, 0};
    }

    @Test
    void sumar() {
        Assertions.assertEquals(21, Calculadora.sumar(sumEnteros));
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
    }

    @Test
    void dividir() {
        Assertions.assertEquals(2, Calculadora.dividir(divisionEnteros));
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.dividir(divisionEnterosConCero);
        });
        Assertions.assertNotEquals(4, Calculadora.dividir(divisionEnteros));
    }

    @Test
    void sumarDecimales() {
        Assertions.assertEquals(7.7, Math.round(Calculadora.sumar(sumDecimales) * 10.0 ) / 10.0 , 0.0001);
    }

    @Test
    void testRestar() {
    }

    @Test
    void testMultiplicar() {
    }

    @Test
    void dividirDecimales() {
        Assertions.assertEquals(2.0, Math.round(Calculadora.dividir(divisionDecimales) * 10.0 ) / 10.0 , 0.0001);
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.dividir(divisionDecimalesConCero);
        });
        Assertions.assertNotEquals(4.0, Calculadora.dividir(divisionEnteros));
    }

    @Test
    void validar_operacion_solo_un_valor() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.validarArgumentos(0);
        });
    }

    @Test
    void Validar_operacion_con_mas_dos_valores() {
        assertDoesNotThrow(() -> {
            Calculadora.validarArgumentos(sumEnteros);
        });
    }
}