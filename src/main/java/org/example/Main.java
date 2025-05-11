package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("L3 - Desafío 1");

        //Números enteros
        System.out.println("Suma: " + Calculadora.sumar(1, 2, 3, 4, 5));
        System.out.println("Resta: " + Calculadora.restar(10, 2, 3));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(2, 3, 4));
        System.out.println("División: " + Calculadora.dividir(100, 2, 5));

        //Números decimales
        System.out.println("Suma: " + Calculadora.sumar(1.5, 2.5, 3.5));
        System.out.println("Resta: " + Calculadora.restar(10.5, 2.5, 3.5));
        System.out.println("Multiplicación: " + Calculadora.multiplicar(2.5, 3.5, 4.5));
        System.out.println("División: " + Calculadora.dividir(100.5, 2.5, 5.5));




    }
}