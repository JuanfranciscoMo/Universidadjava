package moreles.com;

import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("*** Sisitema de accero a la casa de los espejos ***");
        var consola = new Scanner(System.in);

        System.out.print("¿Qué edad tienes? ");
        int edad =  Integer.parseInt(consola.nextLine());

        System.out.print("¿Tienes miedo a la obscuridad (true/false)? ");
        boolean tienesMiedo = Boolean.parseBoolean(consola.nextLine());

        // Verificación
        if (!tienesMiedo && edad >= 10) {
            System.out.println("Tienes acceso a la casa de los espejos" +
                    "\n ¡Bienvenido!");
        } else {
            System.out.println("No cumples con los requisotos para el acceso" +
                    "\n te ofresemos una disculpa");
        }
    }
}
