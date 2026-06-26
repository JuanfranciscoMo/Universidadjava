package morales.com;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
//        1. Postfijo: expr++, expr--
//        2. Unarios: ++expr, --expr, +expr, -expr, ~, !
//        3. Creación de Objetos: new, new[]
//        4. Multiplicación/División: *, /, %
//        5. Aditivos: +, -
//        6. Relacionales: <, >, <=, >=
//        7. Igualdad: ==, !=
//        8. Lógicos AND Condicional: &&
//        9. Lógicos OR Condicional: ||
//        10. Ternario: ? :
//        11. Asignación: =, +=, -=, *=, /=, %=

        // Expereción
        // Paso 1. Divición 12 / 3 = 4
        // Paso 2. Multipplicación 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9
        var a = 12 / 3 + 2 * 3 - 1;

        System.out.println("a = " + a);
    }
}
