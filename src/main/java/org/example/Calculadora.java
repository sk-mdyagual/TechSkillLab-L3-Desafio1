package org.example;

/*
* ¿Quieres crear tu clase de prueba para Calculadora? Tienes dos opciones:
* 1. Clic derecho sobre la clase Calculadora: Generate > Test > Seleccionar los métodos a poner a prueba
* 2. ALT + Enter > Create test > Seleccionar los métodos a poner a prueba
* Cualquiera de las opciones te generará una clase de prueba en la carpeta test/java
* */
public class Calculadora {
    //------------------------Operaciones con enteros-----------------------------
    public static int sumar(int... numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static int restar(int... numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static int multiplicar(int... numeros) {
        int producto = 1;
        for (int numero : numeros) {
            producto *= numero;
        }
        return producto;
    }

    public static int dividir(int... numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                throw new ArithmeticException("No se puede realizar la división por cero");
            }
            resultado /= numeros[i];
        }
        return resultado;
    }

    //------------------------Operaciones con decimales-----------------------------
    public static double sumar(double... numeros) {
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static double restar(double... numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static double multiplicar(double... numeros) {
        double producto = 1.0;
        for (double numero : numeros) {
            producto *= numero;
        }
        return producto;
    }

    public static double dividir(double... numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                throw new ArithmeticException("No se puede realizar la división por cero");
            }
            resultado /= numeros[i];
        }
        return resultado;
    }

    //TO - DO: Validar el número de argumentos


}