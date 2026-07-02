package Excepeciones;

public class PruebaAritmetica {
    static void main() {
        try {
            var resultado = Aritmetica.divicion(10, 2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Cocurrio un error: " + e);
        }
        finally {
            System.out.println("Se reviso la división entre cero");
        }
    }
}
