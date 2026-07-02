import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jeves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        // miLista.add(1);

//        for (String elemento: miLista){
//            System.out.println("Día de semana: " + elemento);
//        }

//        // Función lambda (función anonima de un código muy compato)
//        miLista.forEach(elemento -> {
//            System.out.println("Elemento: " + elemento);
//        });

        miLista.forEach(System.out::println);

        System.out.println();
        List<String> nombre = Arrays.asList("Pedro","Ivonne","Nohemi");
        System.out.println("\nLista de Nombres: ");
        nombre.forEach(System.out::println);
    }
}
