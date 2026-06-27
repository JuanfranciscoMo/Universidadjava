package moreles.com;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        final var USUARIO = "admin";
        final var PASSWORD = "12345";

        var consola = new Scanner(System.in);
        System.out.println("*** Sistema de Autenticación ***");
        System.out.print("Ingresa tu usuario: ");
        var usuario = consola.nextLine().trim().toLowerCase();
        System.out.print("Ingresa tu password: ");
        var password = consola.nextLine().trim().toLowerCase();

//        if (!usuario.equals(USUARIO) && !password.equals(PASSWORD)) {
//        System.out.println("El usuario y el password son incorrectos");
//        } else if (!usuario.equals(USUARIO)){
//            System.out.println("El usuario es incorrecto, intentalo nuevamente!");
//        } else if (!password.equals(PASSWORD)) {
//            System.out.println("El password del usuario es incorrecto!");
//        } else if (usuario.equals(USUARIO) && password.equals(PASSWORD)){
//            System.out.println("Bienvenido!!!");
//        } else {
//            System.out.println("Situación no controlada !!!");
//        }

        var mensajeAutenticacion = switch (usuario){
            case USUARIO -> {
                if (PASSWORD.equals(password))
                    yield "Bienvenido al Sistema!";
                else
                    yield "Password incorrecto, favor de corregirlo!";
            }
            default -> {
                if (PASSWORD.equals(password))
                    yield "Usuario incorrecto favor de corregirlo";
                else
                    yield "Usuario y password incorrectos, favor de corregirlos!";

            }
        };
        // Imprimir el mensaje
        System.out.println(mensajeAutenticacion);
    }
}
