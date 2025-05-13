package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    int numero1, numero2;
    double numero3, numero4;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        numero1 = 10;
        numero2 = 2;
        numero3 = 3.5;
        numero4 = 9.2;
    }

    @org.junit.jupiter.api.Test
    void sumar_exitoso() {
        Assertions.assertEquals(12, Calculadora.sumar(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void sumar_fallido() {
        Assertions.assertNotEquals(50, Calculadora.sumar(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void restar_exitoso() {
        Assertions.assertEquals(8, Calculadora.restar(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void restar_fallido() {
        Assertions.assertNotEquals(20, Calculadora.restar(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void multiplicar_exitosa() {
        Assertions.assertEquals(20, Calculadora.multiplicar(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void multiplicar_fallida() {
        Assertions.assertNotEquals(23, Calculadora.multiplicar(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void dividir_exitoso() {
        Assertions.assertEquals(5, Calculadora.dividir(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void dividir_fallido() {
        Assertions.assertNotEquals(15, Calculadora.dividir(numero1, numero2));
    }

    @org.junit.jupiter.api.Test
    void sumar_decimales() {
        double resultado = Calculadora.sumar(numero3, numero4);
        assertEquals(12.7, resultado);
        assertTrue(resultado > 0);
    }

    @org.junit.jupiter.api.Test
    void restar_decimales() {
        double resultado = Calculadora.restar(numero4, numero3);
        assertEquals(5.7, resultado, 0.00001);
    }

    @org.junit.jupiter.api.Test
    void multiplicar_decimales() {
        double resultado = Calculadora.multiplicar(numero4, numero3);
        assertEquals(32.2, resultado, 0.00001);
    }

    @org.junit.jupiter.api.Test
    void dividir_decimales_por_cero_nan() {
        Assertions.assertTrue(Double.isNaN(Calculadora.dividir(0.0, 0.0)));
    }

    @org.junit.jupiter.api.Test
    void dividir_decimales_por_cero_infinito() {
        Assertions.assertTrue(Double.isInfinite(Calculadora.dividir(10.0, 0.0)));
    }

    @org.junit.jupiter.api.Test
    void dividir_decimales_exitoso() {
        assertDoesNotThrow(() -> Calculadora.dividir(numero4, numero3));
    }
}