package com.example;

public class ArreglosBidimensionales {
    public static void declararCrearMatrices(){
        System.out.println("Declaración, creación e inicialización de arreglos bidimensionales");
        // Declaración y creación de una matriz de enteros con 3 filas y 4 columnas
        int[][] matriz = new int[3][4];
        // Inicialización de los elementos de la matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;
        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        matriz[2][3] = 12;

        // Declaración, creación e inicialización en una sola línea
        String[][] nombresMatriz = {
            {"Juan", "María", "Pedro"},
            {"Ana", "Luis", "Sofía"},
            {"Carlos", "Lucía", "Miguel"}
        };

        // Imprimir los elementos de la matriz de enteros
        System.out.println("Elementos de la matriz de números:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir los elementos de la matriz de nombres
        System.out.println("Elementos de la matriz de nombres:");
        for (int i = 0; i < nombresMatriz.length; i++) {
            for (int j = 0; j < nombresMatriz[i].length; j++) {
                System.out.print(nombresMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void recorrerMatriz(){
        System.out.println("Recorrer una matriz con ciclos anidados");
        String[][] nombresMatriz = {
            {"Juan", "María", "Pedro"},
            {"Ana", "Luis", "Sofía"},
            {"Carlos", "Lucía", "Miguel"}
        };
        for (int i = 0; i < nombresMatriz.length; i++) {
            for (int j = 0; j < nombresMatriz[i].length; j++) {
                System.out.print(nombresMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
