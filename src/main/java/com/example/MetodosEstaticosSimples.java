package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("Este es un método estático simple");
    }
    public static void ejemploPasoParametros(int numero) {
        System.out.println("El número pasado como parámetro es: " + numero);
    }
    public static int ejemploRetornoValores() {
        return 42; // retorna un valor entero
    }
    /**
     *Recibe un entero.
     */
    public static void ejemploSobrecarga(int numero) {
        System.out.println("Ejecutando sobrecarga con un número entero: " + numero);
    }

    /**
     * Mismo nombre, pero recibe un String.
     */
    public static void ejemploSobrecarga(String texto) {
        System.out.println("Ejecutando sobrecarga con una cadena de texto: " + texto);
    }

    /**
     *Mismo nombre, pero recibe dos parámetros.
     */
    public static void ejemploSobrecarga(int a, int b) {
        int suma = a + b;
        System.out.println("Ejecutando sobrecarga con dos enteros. La suma es: " + suma);
    }
}
