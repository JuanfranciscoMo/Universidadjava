package moreles.com;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al Sistema Bancario ***");
        var console = new Scanner(System.in);

        System.out.print("Deseas salir del sistema (true/false)? ");
        var salirSistema = Boolean.parseBoolean(console.nextLine());

        // Verificamos (aplicando una lógica inverssa)
        if(!salirSistema){
            System.out.println("Continuamos dentro del sistema...");
        } else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
