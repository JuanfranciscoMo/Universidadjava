package org.morales.com;

public class DetalleProductoTienda {
    public static void main(String[] args) {

        String nombreProducto = "Leche";
        float precio = 23.50f;
        int cantidadDisponible = 32;
        boolean isVenta =  true;

        System.out.println("*** Tiendas en línea (Detalle Producto) ****");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isVenta = " + isVenta);

        System.out.println("___________ Valores Nuevos _______________");

        nombreProducto = "Huevo";
        precio = 40.00f;
        cantidadDisponible = 50;
        isVenta = false;

        System.out.println("*** Tiendas en línea (Detalle Producto) ****");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isVenta = " + isVenta);
    }
}
