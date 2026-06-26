package morales.com;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        final var USUARIO_VALIDO ="paco";
        final var PASSWORD_VALIDO = "12345";

        var conosla = new Scanner(System.in);
        System.out.println("*** Sistema de Validacón de Uusarios ***");

        System.out.print("Introduce tu usuario: ");
        var usuario = conosla.nextLine();

        System.out.print("Ingrese su contreaseña: ");
        var password =  conosla.nextLine();

        var sonDatosCorrectos = usuario.equals(USUARIO_VALIDO) && password.equals(PASSWORD_VALIDO );

        System.out.println("¿Los datos son correctos? " + sonDatosCorrectos);
    }
}
