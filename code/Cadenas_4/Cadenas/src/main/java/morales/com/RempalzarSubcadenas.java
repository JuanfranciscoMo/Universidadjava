package morales.com;

public class RempalzarSubcadenas {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("cadena original= " + cadena);

        // Remplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a Todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Rempalzar "Hola" por "Adios"

        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
