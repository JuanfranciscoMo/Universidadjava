package morales.com;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Propoerciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];
        // Solicitar los valores del arreglo
        for (int i = 0; i < largoArreglo ; i++){
            System.out.print("Porporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("impreción del Arreglo: ");
        for (int i = 0 ; i < enteros.length ; i++){
            System.out.print(enteros[i] + " ");
        }
    }
}
