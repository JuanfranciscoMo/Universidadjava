package org.morales.com;

public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (su valor por default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong =9223372036854775807L; // L o l para indicar tippo long
        System.out.println("tipolong = " + tipoLong);
        
        // Punto flotante (su alor por default es 0.0)
        float tipoFloat = 3.1416f;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para inidcar tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (Su valor por default es '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        tipoChar = 64;
        System.out.println("tipoChar = " + tipoChar);
        
        // Boolean (Su valor por defalut es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan Pérez";
        System.out.println("nombre = " + nombre);
    }
}
