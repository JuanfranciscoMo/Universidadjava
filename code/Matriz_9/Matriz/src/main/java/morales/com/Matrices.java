package morales.com;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // introducir valores a una matirz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        // Definir la matriz
        System.out.print("Proporciona los rengoles de la matriz: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las culumnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];
        // Suma en diagonal
        var sumaDiagonal = 0;
        // Solicitar los valores
        for (var ren = 0; ren < renglones; ren++){
            for (var col =0; col < columnas; col++){
                System.out.print("Valor["+ren+"]["+col+"]: ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
                if (ren == col) {
                    sumaDiagonal += matriz[ren][col];
                }
            }
        }
//        System.out.println("\nMostrar valores de la matriz");
//        // Iterar los valores de la matriz
//        for (var ren = 0; ren < renglones; ren++){
//            for (var col =0; col < columnas; col++){
//                System.out.println("Valor["+ren+"]["+col+"]: " + matriz[ren][col]);
//                if (ren == col){
//                    sumaDiagonal += matriz[ren][col];
//                }
//            }
//        }

        // Suma en diagonal
        System.out.println("Suma diagonal: " + sumaDiagonal);
    }
}
