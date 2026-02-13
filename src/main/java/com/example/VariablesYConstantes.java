package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion(){
        System.out.println("Demostración de declaración y asignación de variables");
        int contador = 12;
        String nombre = "Juan";
        boolean hombre = true;
        System.out.println(contador);
        System.out.println(nombre);
        System.out.println(hombre);
    }

    public static void demostrarConvencionesNombres(){
        System.out.println("Demostración de convenciones de nombres");
        String comidaPreferida = "Pizza";
        String nombreDelEstudiante = "Juan";
        System.out.println(comidaPreferida);
        System.out.println(nombreDelEstudiante);
    }

    public static void demostrarConstantes() {
        System.out.println("Demostración de constantes");
        final String APELLIDO = "Rodríguez";
        final double PI = 3.1416;
        System.out.println(APELLIDO);
        System.out.println(PI);
    }
}



