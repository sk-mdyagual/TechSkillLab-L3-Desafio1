package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    int enteros[];
    double decimales[];

    @BeforeEach
    void setup(){
        enteros = new int[] {10,2};
        decimales = new double[] {10.0, 4.0};

    }

    @Test
    void dividir() {
        Assertions.assertEquals(5, Calculadora.dividir(enteros));
    }


    @Test
    void dividirDecimales() {
        Assertions.assertEquals(2.5, Calculadora.dividir(decimales));
    }

    @Test
    void dividirEntreCero() {
        Assertions.assertThrows(ArithmeticException.class, () ->{
            Calculadora.dividir(10,0);
        });
    }

    @Test
    void dividirSinError() {
        Assertions.assertDoesNotThrow(() ->{
            Calculadora.dividir(10,8);
        });
    }

}