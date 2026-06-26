package morales.com;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asingancón ***");
        // Asingación =
        var miNumero = 10;
        int miNumero2;
        miNumero2 = 15;

        // Asignación compuesto
        // +=
        miNumero += 5; // miNumero = miNumero + 5;
        // -=, *=, /=, y %=
        System.out.println("\tmiNumero = " + miNumero);
        miNumero *= 2; // miNumero = miNumero * 3 -> 30;
        System.out.println("\tmiNumero = " + miNumero);
        // Asignación de variables multiples
        int a = 10, b = 20, c = 30;
        System.out.printf("a = %d, b = %d, c = %d",a,b,c);
    }
}
