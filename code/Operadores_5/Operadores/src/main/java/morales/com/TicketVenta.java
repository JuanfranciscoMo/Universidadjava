package morales.com;

import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("**** Ticket de Venta ****");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos: ");
        var precioPlatanos =  Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Cálculo del subtotal (sin inpuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        //Aplicar el descuento
        var descuento = subtotal * (descuentoPorcentaje/ 100.0);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Cáculo con impuestos (%16)
        var impuesto = subtotalConDescuento * 0.16;

        // Cáculo total de la compra (con inpuestos)10
        var costoTotalCompra = subtotalConDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %n\tTicket de Venta
                %n-----------------------------
                Subtotal: $%.2f
                Descuento $%.3f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                %n-----------------------------
                """,subtotal,descuento,descuentoPorcentaje,impuesto,costoTotalCompra);
    }
}
