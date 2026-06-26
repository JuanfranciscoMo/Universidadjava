package morales.com;

import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo Libros ***");

        final var DISTACIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuentas con credencial de estudiante (true/false)? ");
        var tienesCredencial =  Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuantos km vivees de la biblioteca? ");
        var distanciaBibliotecaKm =  Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo =  tienesCredencial || distanciaBibliotecaKm <= DISTACIA_PERMITIDA_KM;
        System.out.println("¿Eres elegible para prestamo de libros? = " + esElegiblePrestamo);
    }
}
