package moreles.com;

import java.util.Scanner;

public class IdentificarEstacionAnio {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 - 12. " +
                "\nRepresenta el número del mes a evaluar su estación");

        System.out.print("Ingrese el número de mes: ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = switch (mes){
            case 1,2,12 -> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            default -> "Estación desconocida";
        };

        // Imprimir
        System.out.printf("La estación para el mes %d es: %s%n",mes,estacion);
    }
}
