package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion(){
        System.out.println("Demostración de concatenación de cadenas");
        String nombre = "Juan";
        String apellido = "Pérez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Nombre completo: " + nombreCompleto);
    }
    public static void demostrarMetodosUtiles(){
        System.out.println("Demostración de métodos útiles de la clase String");
        String texto = "  Hola Mundo  ";
        System.out.println("Texto original: '" + texto + "'");
        System.out.println("Texto en mayúsculas: '" + texto.toUpperCase() + "'");
        System.out.println("Texto en minúsculas: '" + texto.toLowerCase() + "'");
        System.out.println("Texto sin espacios al inicio y al final: '" + texto.trim() + "'");
        System.out.println("Longitud del texto: " + texto.length());
        System.out.println("Caracter en la posición 5: '" + texto.charAt(5) + "'");
        System.out.println("¿El texto es igual a 'hola mundo'? " + texto.trim().equals("hola mundo"));
        System.out.println("Subcadena desde el índice 2 hasta el 7: '" + texto.substring(2, 7) + "'");
        System.out.println("¿El texto es igual a 'hola mundo' (ignorando mayúsculas)? " + texto.trim().equalsIgnoreCase("hola mundo"));
        System.out.println("¿El texto contiene la palabra 'Mundo'? " + texto.contains("Mundo"));
        System.out.println("¿El texto empieza con '  Hola'? " + texto.startsWith("  Hola"));
        System.out.println("¿El texto termina con 'Mundo  '? " + texto.endsWith("Mundo  ") );
    }
    public static void demostrarInmutabilidad(){
        System.out.println("Demostración de la inmutabilidad de las cadenas");
        String original = "Hola";
        String modificada = original + " Mundo";
        System.out.println("Cadena original: '" + original + "'");
        System.out.println("Cadena modificada: '" + modificada + "'");
    }
    public static void usarStringBuilder(){
        System.out.println("Demostración del uso de StringBuilder para manipulación eficiente de cadenas");
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");
        String resultado = sb.toString();
        System.out.println("Resultado de concatenar con StringBuilder: '" + resultado + "'");
    }
}
