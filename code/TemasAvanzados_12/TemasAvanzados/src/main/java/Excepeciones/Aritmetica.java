package Excepeciones;

public class Aritmetica {
    public static int divicion(int numerodor, int denominador){
        if (denominador == 0){
            throw new RuntimeException("Divición entre Cero");
        }
        return numerodor / denominador;
    }
}
