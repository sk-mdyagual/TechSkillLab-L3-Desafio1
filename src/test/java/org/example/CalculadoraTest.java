package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int[] NumEnteros;
    double[] NumDecimales;
    int[] ExcDivEnteros;
    double[] ExcDivDecimales;

    @BeforeEach
    void setUp(){
        NumEnteros = new int[]{10,2};
        NumDecimales = new double[]{10.5,2.5};
        ExcDivEnteros = new int[]{100,0};
        ExcDivDecimales = new double[]{10.5, 0.0};
    }

    @Test
    void sumar() {
        Assertions.assertEquals(12,Calculadora.sumar(NumEnteros));
    }

    @Test
    void restar() {
        Assertions.assertEquals(8,Calculadora.restar(NumEnteros));
    }

    @Test
    void multiplicar() {
        Assertions.assertEquals(20,Calculadora.multiplicar(NumEnteros));
    }

    @Test
    void dividir() {
        Assertions.assertEquals(5,Calculadora.dividir(NumEnteros));
    }

    @Test
    void testDivisionPorCeroLanzaExcepcionEnteros(){
        Assertions.assertThrows(ArithmeticException.class,()->{
            Calculadora.dividir(ExcDivEnteros);
        });
    }

    @Test
    void testSumarDecimales() {
        Assertions.assertEquals(13,Calculadora.sumar(NumDecimales));
    }

    @Test
    void testRestarDecimales() {
        Assertions.assertEquals(8,Calculadora.restar(NumDecimales));
    }

    @Test
    void testMultiplicarDecimales() {
        Assertions.assertEquals(26.25, Calculadora.multiplicar(NumDecimales));
    }

    @Test
    void testDividirDecimales() {
        Assertions.assertEquals(4.2, Calculadora.dividir(NumDecimales));
    }

    @Test
    void testDivisionPorCeroLanzaExcepcionDecimales() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Calculadora.dividir(ExcDivDecimales);
        });
    }
}