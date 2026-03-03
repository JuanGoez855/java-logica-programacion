package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        System.out.println("Ejemplo de estructura de repetición while");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
    public static void ejemploDoWhile() {
        System.out.println("Ejemplo de estructura de repetición do-while");
        int contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);
    }
    public static void ejemploForClasico() {
        System.out.println("Ejemplo de estructura de repetición for clásico");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        }
    }
    public static void ejemploForAnidado() {
        System.out.println("Ejemplo de estructura de repetición for anidado");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
    public static void ejemploBreakContinue() {
        System.out.println("Ejemplo de uso de break y continue");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Se encontró el número 5, se detiene el ciclo");
                break; // sale del ciclo cuando i es igual a 5
            }
            if (i % 2 == 0) {
                continue; // salta la impresión de números pares
            }
            System.out.println("Número impar: " + i);
        }
    }
    public static void ejemploEtiquetas() {
        System.out.println("Ejemplo de uso de etiquetas en estructuras de repetición");
        outerLoop: // etiqueta para el ciclo externo
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Se encontró i=2 y j=2, se salta a la siguiente iteración del ciclo externo");
                    continue outerLoop; // salta a la siguiente iteración del ciclo externo
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
