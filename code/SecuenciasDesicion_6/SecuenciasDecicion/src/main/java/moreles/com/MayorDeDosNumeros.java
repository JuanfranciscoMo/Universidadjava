package moreles.com;

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Cuál es el mayor de dos números ***");
        var consola = new Scanner(System.in);

        // Recolección de datos
        System.out.print("Introduce el primer número: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Introduce el segundo número: ");
        var num2 = Integer.parseInt(consola.nextLine());

        // Validación
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El número " + num1 + " es menor que " + num2);
        } else {
            System.out.println("El numero " + num1 + " es igual " + num2);
        }
    }
}
