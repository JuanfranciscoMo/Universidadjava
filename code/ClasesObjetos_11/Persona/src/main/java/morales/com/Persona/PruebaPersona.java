package morales.com.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de Clases y Objetos Persona ***");
        System.out.println("variable estática: " + Persona.getContadorPersonas());
        var objeto1 = new Persona("Layla","acosta");
        System.out.println(objeto1); // Automáticamente se llama a toString
        System.out.println("variable estática: " + Persona.getContadorPersonas());
        // Segundo objeto
        var objeto2 = new Persona("Ian","Goméz");
        System.out.println(objeto2);
        System.out.println("variable estática: " + Persona.getContadorPersonas());
    }
}
