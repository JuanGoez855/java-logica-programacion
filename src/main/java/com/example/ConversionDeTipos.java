package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicito(String[] args) {
        System.out.println("Demostración de casting implícito");
        int numeroInt = 100;
        long numeroLong = numeroInt; // conversión implícita de int a long
        System.out.println(numeroInt); // imprime 100
        System.out.println(numeroLong); // imprime 100
    }

    public static void demostrarCastingExplicito(String[] args) {
        System.out.println("Demostración de casting explícito");
        double numeroDouble = 3.14;
        int numeroInt = (int) numeroDouble; // conversión explícita de double a int
        System.out.println(numeroDouble); // imprime 3.14
        System.out.println(numeroInt); // imprime 3
    }

    public static void ProblemasDePrecision(String[] args) {
        System.out.println("Problemas de precisión al convertir tipos");
        double numeroDouble = 123.456;
        int numeroInt = (int) numeroDouble; // conversión explícita de double a int
        System.out.println("Número double: " + numeroDouble); // imprime 123.456
        System.out.println("Número int: " + numeroInt); // imprime 123, se pierde la parte decimal
    }
}
