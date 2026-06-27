package moreles.com;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        var consola = new Scanner(System.in);

        System.out.print("Introduce una calificacion de 0 - 10: ");
        var calificacion = Double.parseDouble(consola.nextLine());
        var calificacionLetra = "";

        if (calificacion >= 9 && calificacion <= 10){
            calificacionLetra = "A";
        } else if (calificacion >= 8 && calificacion <= 9){
            calificacionLetra = "B";
        } else if (calificacion >= 7 && calificacion <= 8) {
            calificacionLetra = "C";
        } else if (calificacion >= 6 && calificacion <=7){
            calificacionLetra = "D";
        } else if (calificacion >= 0 && calificacion <= 5){
            calificacionLetra = "F";
        } else {
            calificacionLetra = "Valor descocnocido";
        }
        System.out.printf("La califiacción es %.1f  es equivaletne a \'%s\'",calificacion,calificacionLetra);
    }
}
