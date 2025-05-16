package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

    int[] dataInteger;
    double[] dataDouble;

    @BeforeEach
    void setUp(){
        //inicializar datos o variables
        dataInteger=new int[]{8,4};
        dataDouble =new double[]{2.1,5.0};
    }

    @Test
    void sumarEnterosCorrecto() {
        Assertions.assertEquals(12,Calculadora.sumar(dataInteger));
    }

    @Test
    void restarEnterosCorrecto() {
        Assertions.assertEquals(4,Calculadora.restar(dataInteger));
    }

    @Test
    void multiplicarEnterosCorrecto() {
        Assertions.assertEquals(32,Calculadora.multiplicar(dataInteger));
    }

    @Test
    void dividirEnterosCorrecto() {
        Assertions.assertEquals(2,Calculadora.dividir(dataInteger));
    }

    @Test
    void dividirValidacionCantidadArgumentos(){
        IllegalArgumentException exception=assertThrows
                (IllegalArgumentException.class, ()-> Calculadora.dividir(0));
    }

    @Test
    void dividirValidacionPorCero(){
        IllegalArgumentException exception=assertThrows
                (IllegalArgumentException.class, ()->Calculadora.dividir(8,0));
    }

    @Test
    void testSumarDoblesCorrecto() {
        Assertions.assertEquals(7.1,Calculadora.sumar(dataDouble));
    }

    @Test
    void testRestarDoblesCorrecto() {
        Assertions.assertEquals(-2.9,Calculadora.restar(dataDouble));
    }

    @Test
    void testMultiplicarDoblesCorrecto() {
        Assertions.assertEquals(10.5,Calculadora.multiplicar(dataDouble));
    }

    @Test
    void testDividirDoblesCorrecto() {
        Assertions.assertEquals(0.42000000000000004,Calculadora.dividir(dataDouble));
    }

    @Test
    void dividirDobleValidacionCantidadArgumentos(){
        IllegalArgumentException exception=assertThrows
                (IllegalArgumentException.class, ()-> Calculadora.dividir(2.3));
    }

    @Test
    void dividirDobleValidacionPorCero(){
        IllegalArgumentException exception=assertThrows
                (IllegalArgumentException.class, ()->Calculadora.dividir(9.5,0));
    }

    @AfterEach
    void pruebas(){
        System.out.println("success");
    }
}