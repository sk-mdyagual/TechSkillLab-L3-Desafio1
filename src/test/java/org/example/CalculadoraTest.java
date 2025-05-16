package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;
    private int a, b, e;
    private double c, d, f;


    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
        // Arrange
        a = 4;
        b = 2;
        c = 10.0;
        d = 2.0;
        e = 0;
        f = 0.0;
    }

    @Test
    void sumar() {

        int a = 5;
        int b = 3;

        int resultado = calculadora.sumar(a, b);

        assertEquals(8, resultado);
    }

    @Test
    void restar() {
        int a = 5;
        int b = 3;

        int resultado = calculadora.restar(a, b);

        assertEquals(2, resultado);
    }

    @Test
    void multiplicar() {
        int a = 5;
        int b = 3;

        int resultado = calculadora.multiplicar(a, b);

        assertEquals(15, resultado);
    }

    @Test
    void dividir() {
        int a = 6;
        int b = 3;

        int resultado = calculadora.dividir(a, b);

        assertEquals(2, resultado);
    }

    /*
    Desafio 1 : Escribir pruebas unitarias para el método dividir de modo que retorne el resultado correcto o que lance una excepción si el divisor es 0.
                   Usar al menos dos asserciones distintas (assertEquals, assertThrows, etc) y aplicar @BeforeEach para inicializar el objeto a probar.
    */

    @Test
    void dividirResultadoCorrecto() {

        // Act
        int resultado = calculadora.dividir(a, b);

        // Assert
        assertNotNull(resultado);
        assertEquals(2, resultado);
    }

    @Test
    void dividirLanzaExcepcionSiDivisorEsCero() {

        // Act & Assert
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(a, e);
        });

        String mensajeEsperado = "División por cero no permitida";
        String mensajeReal = exception.getMessage();


        assertTrue(mensajeReal.contains(mensajeEsperado));
    }

    @Test
    void dividirResultadoCorrectoConDecimales() {
        // Act
        double resultado = calculadora.dividir(c, d);

        // Assert
        assertNotNull(resultado);
        assertEquals(5.0, resultado);
    }

    @Test
    void dividirLanzaExcepcionSiDivisorEsCeroConDecimales() {

        // Act & Assert
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(c, f);
        });

        String mensajeEsperado = "División por cero no permitida";
        String mensajeReal = exception.getMessage();

        assertTrue(mensajeReal.contains(mensajeEsperado));
    }



}