package org.morales.com;

import java.util.Arrays;

public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** uso de var en Java ***");
        // Sin el sudo de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        // Definir otra varibales usando
        var edad = 30; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 500.5f;
        System.out.println("sueldo = " + sueldo); // Se infiere tipo float
        
        var esCasado = false; //Se infiere que es boolean
        System.out.println("esCasado = " + esCasado);
    }
}
