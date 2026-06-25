package org.morales.com;

public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un libro
        String tituloLibro = "El seño de los anillos";
        int anioPublicacion = 1957;
        boolean libroDisponible = true;
        double precio = 500.50;

        // Imprimir el valor de las variables
        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        //Modificar el valor de las variables
        tituloLibro = "El señor de los Anillos";
        System.out.println("\n\n"+tituloLibro);
    }
}
