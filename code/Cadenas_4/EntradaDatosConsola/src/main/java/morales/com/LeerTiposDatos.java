package morales.com;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        // Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        // Leer un tipo double
        System.out.print("ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // Cosumimos el caracter de salto de línea
        consola.nextLine();
        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos
        System.out.println("Proporciona un valor entero: ");
        // var eneroString = consola.nextLine();
        // var entero = Integer.parseInt(eneroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        // Tipo flotante
        System.out.println("Propoeciona un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
    }
}
