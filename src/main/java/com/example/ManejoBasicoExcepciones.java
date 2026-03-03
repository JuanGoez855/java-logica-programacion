package com.example;

public class ManejoBasicoExcepciones {
    public static void ejemploTryCatchDivision(){
        System.out.println("Ejemplo de manejo básico de excepciones con try-catch");
        int numerador = 10;
        int denominador = 0;
        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero. Detalles: " + e.getMessage());
        }
    }
    public static void ejemploTryCatchInput(){
        System.out.println("Ejemplo de manejo básico de excepciones con entrada de datos");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        try {
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero. Detalles: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static void ejemploBloqueFinally(){
        System.out.println("Ejemplo de uso del bloque finally");
        try {
            int[] arreglo = new int[5];
            System.out.println(arreglo[10]); // Esto lanzará una excepción
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del arreglo. Detalles: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre, independientemente de si ocurrió una excepción o no.");
        }
    }
    public static void evitarCierrePrograma(){
        System.out.println("Ejemplo de cómo evitar que el programa se cierre abruptamente debido a una excepción");
        String[] nombres = {"Juan", "María", "Pedro"};
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(nombres[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Índice fuera de los límites del arreglo. Detalles: " + e.getMessage());
            }
        }
    }
}
