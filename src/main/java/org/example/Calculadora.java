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
        validar_argumentos(numeros);
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static int restar(int... numeros) {
        validar_argumentos(numeros);
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static int multiplicar(int... numeros) {
        validar_argumentos(numeros);
        int producto = 1;
        for (int numero : numeros) {
            producto *= numero;
        }
        return producto;
    }

    public static int dividir(int... numeros) {
        validar_argumentos(numeros);
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                throw new IllegalArgumentException("No se puede dividir entre cero.");
            }
            resultado /= numeros[i];
        }
        return (int) Math.round(resultado);
    }

    //------------------------Operaciones con decimales-----------------------------
    public static double sumar(double... numeros) {
        validar_argumentos(numeros);
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static double restar(double... numeros) {
        validar_argumentos(numeros);
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    public static double multiplicar(double... numeros) {
        validar_argumentos(numeros);
        double producto = 1.0;
        for (double numero : numeros) {
            producto *= numero;
        }
        return producto;
    }

    public static double dividir(double... numeros) {
        validar_argumentos(numeros);
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0.0) {
                throw new IllegalArgumentException("No se puede dividir entre cero.");
            }
            resultado /= numeros[i];
        }
        return Math.round(resultado * 100.0) / 100.0;
    }

    private static void validar_argumentos(int... numeros){
        if (numeros.length < 2) {
            throw new IllegalArgumentException("Se requieren al menos dos números para realizar la operación.");
        }
    }
    private static void validar_argumentos(double... numeros){
        if (numeros.length < 2) {
            throw new IllegalArgumentException("Se requieren al menos dos números para realizar la operación.");
        }
    }


}