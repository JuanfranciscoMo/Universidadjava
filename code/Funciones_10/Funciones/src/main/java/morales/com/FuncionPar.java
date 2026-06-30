package morales.com;

import java.util.Scanner;

public class FuncionPar {
    // Función para saber si un número es par
    static boolean esPar(int numero){
        return (numero % 2 == 0)? true : false;
    }
    public static void main(String[] args) {
        System.out.print("Proporciona un valor numérico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("El número "+ numero +" es par: " + esPar(numero));
    }
}
