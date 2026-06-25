package morales.com;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GeneracionId {
    public static void main(String[] args) {
        var random = new Random();
        var scanner = new Scanner(System.in);
        System.out.println("*** Sistema Generador de ID Único");
        // Solucitamos nombre de usuario
        System.out.print("Introducir Nombre: ");
        var nombre1 = scanner.nextLine();
        // Soliucitamos apellido usuario
        System.out.print("Intruducir Aperllido: ");
        var apellido = scanner.nextLine();
        // Solicitamos el año de nacimiento
        System.out.print("Introducir Año Nacimiento (YYYY): ");
        var anioNacimiento = scanner.nextLine();

        System.out.println("------------------------");
         var nombre = nombre1.trim().toUpperCase().substring(0,2);
        apellido = apellido.trim().toUpperCase().substring(0,2);
        anioNacimiento = anioNacimiento.trim().substring(2);
        int numeroAleatorio = random.nextInt(9999) + 1;

        String idGenerado = String.format("%s%s%s%04d", nombre, apellido, anioNacimiento, numeroAleatorio);

        var mensaje = """
                Hola %s,
                \tTu nuevo número de indetificación (ID) generado por el sistema es:
                \t%s
                !Felicidades!
                """.formatted(nombre1,idGenerado);

        System.out.println(mensaje);
    }
}
