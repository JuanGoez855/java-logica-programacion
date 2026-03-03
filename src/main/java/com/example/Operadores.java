package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        System.out.println("Demostración de operadores aritméticos");
        int a = 10;
        int b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        System.out.println("Demostración de operadores de incremento y decremento");
        int a = 10;
        System.out.println("Valor inicial de a: " + a);
        System.out.println("Pre-incremento: " + ++a);
        System.out.println("Post-incremento: " + a++);
        System.out.println("Valor final de a: " + a);
        int b = 5;
        System.out.println("Valor inicial de b: " + b);
        System.out.println("Pre-decremento: " + --b);
        System.out.println("Post-decremento: " + b--);
        System.out.println("Valor final de b: " + b);
    }

    public static void demostrarRelacionales() {
        System.out.println("Demostración de operadores relacionales");
        int a = 10;
        int b = 5;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
    }

    public static void demostrarLogicos() {
        System.out.println("Demostración de operadores lógicos");
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
    }
    
    public static void demostrarAsignacionCompuesta() {
        System.out.println("Demostración de operadores de asignación compuesta");
        int a = 10;
        System.out.println("Valor inicial de a: " + a);
        a += 5; // a = a + 5
        System.out.println("Después de a += 5: " + a);
        a -= 3; // a = a - 3
        System.out.println("Después de a -= 3: " + a);
        a *= 2; // a = a * 2
        System.out.println("Después de a *= 2: " + a);
        a /= 4; // a = a / 4
        System.out.println("Después de a /= 4: " + a);
    }

    public static void demostrarOperadoresTernarios() {
        System.out.println("Demostración de operadores ternarios");
        int a = 10;
        int b = 5;
        String resultado = (a > b) ? "a es mayor que b" : "a no es mayor que b";
        System.out.println(resultado);
    }
}
