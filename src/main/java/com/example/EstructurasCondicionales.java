package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        int numero = 10;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        }
    }
    public static void ejemploIfElse() {
        int numero = -5;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número no es positivo.");
        }
    }
    public static void ejemploIfElseIfElse() {
        int numero = 0;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
    public static void ejemploSwitch() {
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día no válido.");
        }
    }
    public static void ejemploSwitchExpresion() {
        String fruta = "Manzana";
        switch (fruta) {
            case "Manzana":
                System.out.println("Es una manzana.");
                break;
            case "Banana":
                System.out.println("Es una banana.");
                break;
            case "Naranja":
                System.out.println("Es una naranja.");
                break;
            default:
                System.out.println("Fruta no reconocida.");
        }
    }
}
