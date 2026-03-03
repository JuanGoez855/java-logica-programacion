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
    public static void ejemploSobrecarga() {
        System.out.println("Ejemplo de método sobrecargado sin parámetros");
    }
}
