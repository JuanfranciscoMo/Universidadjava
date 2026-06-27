package moreles.com;

import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        System.out.println("***  Sistema de Envíos ***");
        var consola = new Scanner(System.in);

        // Registro de datos
        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var tipoEnvio = consola.nextLine();
        System.out.print("Ingrese el peso del paquete (en Kg): ");
        var pesoEnvio = Double.parseDouble(consola.nextLine());
//      var costoEnvio = 0.0;
//        if (tipoEnvio.trim().toLowerCase().equals("nacional")){
//            costoEnvio = pesoEnvio * TARIFA_NACIONAL;
//        } else if (tipoEnvio.trim().toLowerCase().equals("internacional")){
//            costoEnvio = pesoEnvio * TARIFA_INTERNACIONAL;
//        } else {
//            System.out.println("El tipo de envío es incorrecto!");
//        }

        Double costoEnvio = switch (tipoEnvio){
            case "nacional" -> pesoEnvio * TARIFA_NACIONAL;
            case "internacional" -> pesoEnvio * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino inválido. Ingresa nacional/internacional");
                yield null;
            }
        };

        if (tipoEnvio.trim().toLowerCase().equals("nacional") ||
                (tipoEnvio.trim().toLowerCase().equals ("internacional"))) {
            System.out.printf("El costo de envío es: $%.2f", costoEnvio);
        }
    }
}
