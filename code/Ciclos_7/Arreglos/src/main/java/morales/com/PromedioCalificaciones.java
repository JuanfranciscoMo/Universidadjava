package morales.com;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Promedio de Calificaciones ***");
        System.out.print("¿Cuantas Calificaiones deseas agregar? ");
        int nMaterias = Integer.parseInt(consola.nextLine());
        // Creamos el arreglo
        int[] calificaiones = new int[nMaterias];
        int contador = 0;

        // Solicitamos los valores de las calificaciones
        for (int i = 0; i < nMaterias; i++){
            System.out.print("Introduce la calificación [" + (i+1) + "]: ");
            calificaiones[i] = Integer.parseInt(consola.nextLine());
            contador += calificaiones[i];
        }

        System.out.println("--- Respuestas ---");
        for (int i = 0; i < calificaiones.length; i++){
            System.out.println("Las calificacion restrada [" + (i+1) + "] es: " + calificaiones[i]);
        }
        // Obtener el promedio de las calificicaiones
        int evaluacion = contador / calificaiones.length;
        System.out.println("Las evalaucón es: " + evaluacion);
    }
}
