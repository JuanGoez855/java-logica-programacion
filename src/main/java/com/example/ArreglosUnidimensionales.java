package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar(){
        System.out.println("Declaración, creación e inicialización de arreglos unidimensionales");
        // Declaración y creación de un arreglo de enteros con tamaño 5
        int[] numeros = new int[5];
        // Inicialización de los elementos del arreglo
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Declaración, creación e inicialización en una sola línea
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis"};

        // Imprimir los elementos del arreglo de enteros
        System.out.println("Elementos del arreglo de números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Imprimir los elementos del arreglo de nombres
        System.out.println("Elementos del arreglo de nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
    public static void mostrarLongitud(){
        System.out.println("Mostrar la longitud de un arreglo");
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Longitud del arreglo de números: " + numeros.length);
    }
    public static void recorrerConForClasico(){
        System.out.println("Recorrer un arreglo con un ciclo for clásico");
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
    public static void recorrerConForEach(){
        System.out.println("Recorrer un arreglo con un ciclo for-each");
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    public static void arrayComoParametroYRetorno() {
        System.out.println("Uso de arrays como parámetros y retorno");
        
        //Definimos un array inicial
        int[] misNumeros = {5, 12, 8, 20, 3};
        
        //Llamamos al método que acepta el array y recibimos el nuevo array retornado
        int[] resultado = procesarYRetornarPares(misNumeros);
        
        //Mostramos el resultado
        System.out.println("Array filtrado (solo pares):");
        for (int n : resultado) {
            System.out.println(n);
        }
    }

    public static int[] procesarYRetornarPares(int[] numeros) {
        // Primero contamos cuántos pares hay para saber el tamaño del nuevo arrayx
        int contador = 0;
        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }

        // Creamos el array que vamos a retornar
        int[] pares = new int[contador];
        int j = 0;

        // Llenamos el array con los valores filtrados
        for (int n : numeros) {
            if (n % 2 == 0) {
                pares[j] = n;
                j++;
            }
        }

        return pares; // Retorno del array
    }
}
