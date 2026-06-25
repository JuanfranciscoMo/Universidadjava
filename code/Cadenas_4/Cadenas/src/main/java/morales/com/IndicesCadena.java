package morales.com;

public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de índces en una cadena
        var cadena1 = "Hola Mundo";


        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); //Esto debe de traer el primer caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);

        // Recuperar el último caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        // Ejercicio -- Imprimir la letra M
        var caraterM = cadena1.charAt(5);
        System.out.println("caraterM = " + caraterM);
    }
}
