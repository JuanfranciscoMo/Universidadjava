package morales.com;

public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Moendo de Cadenas en java ***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        //Cadena multiples líneas (text block)
        var cadena4 = """
                \n\nEste es un texto
                multilinea
                más
                líneas
                """;

        System.out.println("cadena4 = " + cadena4);
    }
}
