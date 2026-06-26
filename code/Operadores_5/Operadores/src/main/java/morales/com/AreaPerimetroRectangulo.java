package morales.com;

import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Área y Périmetro de un Rectangulo");
        System.out.print("Introduce la base del rectagúlo: ");
        var base = Double.parseDouble(consola.nextLine());

        System.out.print("Introduce la altura del rectangúlo: ");
        var altura = Double.parseDouble(consola.nextLine());

        System.out.println("\n\t --- Respuestas ---");

        var areaRectangulo = base * altura;
        var perimetroRectangulo = 2 * (base + altura);

        System.out.println("El área del rectangúlo es: " + areaRectangulo);
        System.out.println("El perímetro del rectangúlo es: " + perimetroRectangulo);
    }
}
