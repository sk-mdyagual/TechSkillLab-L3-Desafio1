package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalculadoraTest {
    int suma;
    int resta;
    int multiplicar;
    int dividir;
    double suma_double;
    double resta_double;
    double multiplicar_double;
    double dividir_double;

    @BeforeEach
    void setUp(){
        suma = Calculadora.sumar(2,3);
        resta = Calculadora.restar(3,2);
        multiplicar = Calculadora.multiplicar(2,3);
        dividir = Calculadora.dividir(4,2);
        suma_double = Calculadora.sumar(2.1,3.2);
        resta_double = Calculadora.restar(3.1,2.3);
        multiplicar_double = Calculadora.multiplicar(2.1,5.5);
        dividir_double = Calculadora.dividir(4.2,2.1);
    }

    @Test
    void sumar_enteros() {
        Assertions.assertEquals(5, suma);
    }

    @Test
    void restar_enteros() {
        Assertions.assertEquals(1, resta);
    }

    @Test
    void multiplicar_enteros() {
        Assertions.assertEquals(6, multiplicar);
    }

    @Test
    void dividir_enteros_por_cero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculadora.dividir(10,0));
    }

    @Test
    void dividir_enteros(){
        Assertions.assertEquals(2, dividir);
    }


    @Test
    void testSumar_double() {
        Assertions.assertEquals(5.3, suma_double, 0.0001);
    }

    @Test
    void testRestar_double() {
        Assertions.assertEquals(0.8, resta_double, 0.0001);
    }

    @Test
    void testMultiplicar_double() {
        Assertions.assertEquals(11.55, multiplicar_double, 0.0001);
    }

    @Test
    void testDividir_double_por_cero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculadora.dividir(10,0));
    }

    @Test
    void testDividir_double() {
        Assertions.assertEquals(2, dividir_double);
    }
}