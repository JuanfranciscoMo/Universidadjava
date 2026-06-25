package morales.com;

public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");
        // Compración de cadenas (==) compra la referencia
        System.out.println("cadena1 es igual en referencia a cadena2");
        System.out.println(cadena1 == cadena2);
        // Comparamos cadenaq con cadena3 (referencias)
        System.out.println("cadena1 es igual en referencia a cadena2");
        System.out.println(cadena1 == cadena3);

        // Coparar contenido usaremos el metodo equals
        System.out.println("cadena1 es igual en referencia a cadena2");
        System.out.println(cadena1.equals(cadena3));
    }
}
