package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    int[] divEnteros;
    int[] divEnteroCero;
    int[] divEnteroVacio;

    @BeforeEach
    void setUp(){
        divEnteros = new int[]{4, 1};
        divEnteroVacio = new int[]{};
        divEnteroCero = new int[]{3, 0};
    }
    @Test
    void dividirEnteros_DevuelveResultadoCorrecto() {
        Assertions.assertEquals(4, Calculadora.dividir(divEnteros));
    }

    @Test
    void dividirEnteros_OperacionSinValores() {
        assertThrows(IllegalArgumentException.class, ()-> Calculadora.validate(divEnteroVacio));
    }

    @Test
    void dividirEnteros_OperacionValores() {
        assertDoesNotThrow(()-> Calculadora.validate(divEnteros));
    }

    @Test
    void dividirEnteros_OperacionDivisorCero() {
        assertThrows(Exception.class, ()-> Calculadora.validate(divEnteroCero));
    }

    @Test
    void dividirEnteros_OperacionSinDivisorCero() {
        assertDoesNotThrow( ()-> Calculadora.validate(divEnteros));
    }
}