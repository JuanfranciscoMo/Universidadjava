package morales.com;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var random = new Random();

        // Genenerar un número aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 - 9 = " + numeroAleatorio);

        // Genenerar un número aleatorio entre 0 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entero 0 - 10 = " + numeroAleatorio);

        // Generar un número flotante entre 0.0 y 0.1
        var flotanteAleatorio = random.nextDouble();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simlar el lanzamiento de un dado (1 y 6)
        var dado = random.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dado = " + dado);
    }
}
