package moreles.com;

public class ValorPositivo {
    public static void main(String[] args) {
        var numero = 0;

        if (numero > 0) {
            System.out.println("El valor es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("El valor es negativo: " + numero);
        } else {
            System.out.println("El valor es cero: " + numero);
        }
    }
}
