package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculadoraTest {

    @Test
    void sumar_enteros() {
        Assertions.assertEquals(5, Calculadora.sumar(2,3));
    }

    @Test
    void restar() {
        Assertions.assertEquals(1, Calculadora.restar(3,2));
    }

    @Test
    void multiplicar() {
        Assertions.assertEquals(6, Calculadora.multiplicar(2,3));
    }

    @Test
    void dividir() {
    }

    @Test
    void testSumar() {
    }

    @Test
    void testRestar() {
    }

    @Test
    void testMultiplicar() {
    }

    @Test
    void testDividir() {
    }
}