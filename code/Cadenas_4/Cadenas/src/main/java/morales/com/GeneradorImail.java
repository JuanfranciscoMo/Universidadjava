package morales.com;

public class GeneradorImail {
    public static void main(String[] args) {
        System.out.println("***  Generador de Emials ***");
        // Datos
        String nombre = "   Uvaldo Acosta Soto  ";
        String empresa = "Global Mentoring";
        String dominio = ".com.mx";

        // Normalización de datos
        var eamilNombre = nombre.toLowerCase().trim().replace(" ",".");
        var emailEmpresa =  empresa.toLowerCase().trim().replace(" ",".");
        var emailDomino = dominio.toLowerCase().trim();

        // Respuesta
        System.out.println("email: " + eamilNombre + "@" + emailEmpresa + emailDomino);
    }
}
