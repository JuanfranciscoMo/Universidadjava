package org.morales.com;

public class DetalleReservacionHotel {
    public static void main(String[] args) {
        String nombreCliente = "Juan Francisco";
        int diasEstancia = 5;
        float tarifaDiaria = 350.40f;
        boolean tieneVistaMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaMar = " + tieneVistaMar);

        nombreCliente = "Jorge López";
        diasEstancia = 3;
        tarifaDiaria = 200f;
        tieneVistaMar = false;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaMar = " + tieneVistaMar);
    }
}
