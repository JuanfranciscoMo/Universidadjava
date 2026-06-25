package morales.com;

public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcandenas
        // indexOf - Devuelve el inidce de la preimera aparcicion de la subcadena
        var cadena1 = "Hola Mundo";
        // subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Mundo");
        System.out.println("indice1 = " + indice1);
        // LastIndexOf - devuelve el inidce de la última aparición de la sucadena
        var indice2 = cadena1.lastIndexOf(" ");
        System.out.println("indice2 = " + indice2);
        // subcadena no encontrada devuelve -1
        var indice3 =  cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
