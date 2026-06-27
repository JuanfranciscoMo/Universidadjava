package moreles.com;

import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        final var MONTO_MINIMO_PARA_DESCUENTO = 1000.00;
        var consola = new Scanner(System.in);

        System.out.println("*** Tienda Virtual ***");
        System.out.print("Introduce el monto de tu compra: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Tienes membrecia (true/false)? ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        // Calculamos el descuento
        double descuneto = 0.0;

        System.out.println("----- Resultados ------");
        // Verificamos cada caso, con los datos proporcionados
        if (montoCompra >= MONTO_MINIMO_PARA_DESCUENTO && eresMiembro) {
            descuneto = 0.10; // Descueto del 10%
        } else if (eresMiembro){
            descuneto = 0.05; // Descuento del 5%
        } else {
            descuneto = 0; // Descuento del 0%
        }

        if (descuneto != 0){
            var montoDescuento = montoCompra * descuneto;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    Felicidades! has obtenido un descuento del %.0f%%
                    El monto origial es: $%.2f
                    Descuento: $%.2f
                    Monto final de la compra con el descuento: $%.2f
                    """,descuneto * 100,montoCompra,montoDescuento,montoFinal);
        } else {
            System.out.printf("""
                    No obtuviste ningún tipo de descuento
                    Te invitamos a adquirir tu membrecia de la tienda
                    Monto final de la compra es $%.2f
                    """,montoCompra);
        }

    }
}
