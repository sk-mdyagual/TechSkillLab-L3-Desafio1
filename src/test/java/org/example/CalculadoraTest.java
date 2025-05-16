package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    int[] divEnteros;
    double [] divDecimales;

    @BeforeEach
    void setUp () {
        divEnteros = new int[]{8, 2};
        divDecimales = new double[]{8.4, 2};
    }
    @Test
    void dividirEntero_RetornaResultadoCorrecto() {
        assertEquals(4, Calculadora.dividir(divEnteros));
    }

    @Test void dividirEntero_RetornaBooleano() {
        int resultado = Calculadora.dividir(4, 2);
        Assertions.assertTrue(resultado==2);
    }

    @Test
    void dividirDecimales_RetornaResultadoCorrecto() {
        assertEquals(4.2, Calculadora.dividir(divDecimales), 0.0001);
    }


    @Test void dividirEnteros_ResultadoNosperado() {
        int resultado = Calculadora.dividir(divEnteros);
        assertNotEquals (10, resultado, "El resultado no debe ser 10");
    }

    @Test
    void dividir_ExcepcionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(4, 0);
        }, "No se puede dividir por cero");
    }


    @Test
    void dividir_ResultadoNegativo() {
        double resultado = Calculadora.dividir(-10, 2);
        assertEquals(-5.0, resultado, 0.0001, "La división de -10 entre 2 debería dar -5.0");
    }
}