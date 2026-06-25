package morales.com;

import java.util.Locale;

public class MetodosCadenas {
    public static void main(String[] args) {
        // Metodos de cadenas
        var cadena1 = "Hola mundo";


        // Obtener el largo de una cadena
        var logitud = cadena1.length();
        System.out.println("logitud = " + logitud);

        // Reempalzar carcteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);


        // Convertir a mayúsculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayúsculas = " + mayusculas);

        // Convertir en minúsculas
        System.out.println("minúsculas = " + cadena1.toLowerCase());

        // Elimiar estpacios al inicio y al final
        var cadena2 = " Leo Reyes   ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 = " + cadena2.trim());


    }
}
