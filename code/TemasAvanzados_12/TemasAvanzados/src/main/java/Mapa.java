import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre","Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        persona.put("edad", "31"); // no se permiten duplicados
        System.out.println("Valores del map: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad","35"); // Modificar el valor de la lave existente
        persona.remove("apellido");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Interar sobres los elementos del mapa por separado
        System.out.println("\nIterar los elementos (llave, valor)");
        persona.forEach((llave,valor) -> {
            System.out.println("Llave: " + llave + " Valor: " + valor);
        });
    }
}
