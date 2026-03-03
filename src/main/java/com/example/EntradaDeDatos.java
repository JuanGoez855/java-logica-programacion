package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    private static Scanner scanner = new Scanner(System.in);

    public static void leerVariosTipos() {
        System.out.println("Demostración de lectura de varios tipos de datos");
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();

        System.out.println("Número entero ingresado: " + numeroEntero);
        System.out.println("Número decimal ingresado: " + numeroDecimal);
        System.out.println("Palabra ingresada: " + palabra);

        scanner.nextLine(); 
    }

    public static void leerCadenaCompleta() {
        System.out.println("Demostración de lectura de una cadena completa");
        System.out.print("Ingrese una frase completa: ");

        String fraseCompleta = scanner.nextLine();

        System.out.println("Frase ingresada: " + fraseCompleta);

    }

    public static void manejarSaltoDeLineaPendiente() {
        System.out.println("Demostración de manejo de salto de línea pendiente");
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); 

        // Limpieza del buffer necesaria antes de un nextLine()
        scanner.nextLine(); 

        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine(); 

        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
