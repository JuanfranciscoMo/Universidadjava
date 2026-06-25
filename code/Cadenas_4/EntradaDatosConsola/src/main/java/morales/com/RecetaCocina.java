package morales.com;

import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("*** Instricciones importantes de una reseta ***");
        // Nombre de la receta
        System.out.print("\tNombre de la reseta: ");
        var receta = console.nextLine();
        // Ingredientes
        System.out.print("\tIngredientes principales: ");
        var ingredientes =  console.nextLine();
        // Tiempo de preparación
        System.out.print("\tTiempo de preparación: ");
        var timepoPreparacion = Float.parseFloat(console.nextLine());
        // Dificultad
        System.out.print("\tTipo de dificultad (FACÍL, MEDIA o ALTA): ");
        var tipoDificultas = console.nextLine().toUpperCase().trim();

        // Resultados
        System.out.println("*** Datos capturadps ***");
        System.out.println("\treceta = " + receta);
        System.out.println("\tingredientes = " + ingredientes);
        System.out.println("\ttimepoPreparacion = " + timepoPreparacion + " min.");
        System.out.println("\ttipoDificultas = " + tipoDificultas);


    }
}
