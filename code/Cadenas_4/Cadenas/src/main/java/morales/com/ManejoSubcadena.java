package morales.com;

public class ManejoSubcadena {
    public static void main(String[] args) {
        // Team sub subcadenas
        var cadena1 =  "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        System.out.println();
        System.out.println("subcadena2 = " + cadena1.substring(5,10));

    }
}
