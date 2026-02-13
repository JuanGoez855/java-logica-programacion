package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        System.out.println("Demostración de tipos de datos enteros");
        byte numeroByte = 127;
        short numeroShort = 32767;
        int numeroInt = 2147483647;
        long numeroLong = 9223372036854775807L;

        System.out.println(numeroByte); // imprime 127
        System.out.println(numeroShort); // imprime 32767
        System.out.println(numeroInt); // imprime 2147483647
        System.out.println(numeroLong); // imprime 9223372036854775807
    }

    public static void demostrarFlotantes() {
        System.out.println("Demostración de tipos de datos flotantes");
        float numeroFloat = 3.4028235E38F;
        double numeroDouble = 1.7976931348623157E308;

        System.out.println(numeroFloat); // imprime 3.4028235E38
        System.out.println(numeroDouble); // imprime 1.7976931348623157E308
    }

    public static void demostrarCaracteres() {
        System.out.println("Demostración de tipos de datos caracteres");
        char caracter = 'A';
        System.out.println(caracter); // imprime A
    }

    public static void demostrarBooleanos() {
        System.out.println("Demostración de tipos de datos booleanos");
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(verdadero); // imprime true
        System.out.println(falso); // imprime false
    }

    /*
     * valoresPorDefecto: cuando declaras una variable como un atributo de una clase
     * (instancia o estática) pero no le asignas un valor manualmente,
     * Java le asigna un valor por defecto.
     * 
     * los valores por defecto son = byte: 0 short: 0 int: 0 long: 0L float: 0.0F
     * double: 0.0D char: boolean: false
     */
}
