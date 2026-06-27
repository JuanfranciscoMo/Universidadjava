package moreles.com;

import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; // Valor aproximado en kilocalorias

        System.out.println("***  Aplicación Fitness ***");
        var consola = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        var nombreUsuario = consola.nextLine();

        System.out.print("¿Cuál es tu número de pasos caminado? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());
        var caloreiasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
        var seCumplioMeta = (pasosDiarios >= META_PASOS_DIARIO) ? "Si :)" : "No :( ";

        System.out.printf("""
                \t*** Respuestas ***
                El usuario: %s
                Tiene %d, pasos
                El número de las calorías quemadas es: %.2f
                ¿La meta fue cumplida? %s
                --------------------------------------------
                La meta de pasos diarios es de: %d pasos
                """,nombreUsuario,pasosDiarios,caloreiasQuemadas,seCumplioMeta,META_PASOS_DIARIO);
    }
}
