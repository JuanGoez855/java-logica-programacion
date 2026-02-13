package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion(){
        System.out.println("Demostración de declaración y asignación de variables");
        int contador = 12;
        String nombre = "Juan";
        boolean hombre = true;

        System.out.println(contador); // imprime 12
        System.out.println(nombre); // imprime Juan
        System.out.println(hombre); // imprime true
    }

    public static void demostrarConvencionesNombres(){
        System.out.println("Demostración de convenciones de nombres");
        String comidaPreferida = "Pizza";
        String nombreDelEstudiante = "Juan";

        System.out.println(comidaPreferida); // imprime Pizza
        System.out.println(nombreDelEstudiante); // imprime Juan
    }

    public static void demostrarConstantes() {
        System.out.println("Demostración de constantes");
        final String APELLIDO = "Rodríguez";
        final double PI = 3.1416;

        System.out.println(APELLIDO); // imprime Rodríguez
        System.out.println(PI); // imprime 3.1416
    }
}



