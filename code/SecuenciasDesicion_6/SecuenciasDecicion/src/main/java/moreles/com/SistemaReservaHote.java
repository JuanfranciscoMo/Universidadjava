package moreles.com;

import java.util.Scanner;

public class SistemaReservaHote {
    public static void main(String[] args) {
        final var CUARTO_SIN_VISTA_AL_MAR_X_DIA = 150.50;
        final var CUARTO_CON_VISTA_AL_MAR_X_DIA = 190.50;

        System.out.println("*** Sistema de Reservación Hotel ***");
        var consola = new Scanner(System.in);

        // Recolección de datos
        System.out.print("Nombre del cliente: ");
        var nombreCliente = consola.nextLine();
        System.out.print("Días de estadía en el Hotel: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("¿Tiene vista al mar (true/false)? ");
        var tieneVistaMar = Boolean.parseBoolean(consola.nextLine());

        // Calcular estadía
        var calculoTotal = 0.0;

        // Condición
        if (tieneVistaMar) {
            calculoTotal = diasEstadia * CUARTO_CON_VISTA_AL_MAR_X_DIA;

        } else {
            calculoTotal = diasEstadia * CUARTO_SIN_VISTA_AL_MAR_X_DIA;
        }

        System.out.printf("""
                %n ----------------- Detalles de la Reservación --------------------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """,nombreCliente,diasEstadia,calculoTotal,(tieneVistaMar) ? "Si :)" : "No :(");
    }
}
