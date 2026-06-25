package morales.com;

public class FomateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matías";
        var edad =  35;
        var salairo =  21000.50;
        
        //String.format
        var mensaje = String.format("Nombre: %s \nNombre: %d \nSalario: %.2f"
                ,nombre,edad,salairo);
        System.out.println(mensaje);

        // Método printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n",nombre,edad,salairo);

        var nuemorEmpleado = 12;
        // Formateo con text block
        mensaje = """
                %nDetalle Persona: \s
                ---------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre,nuemorEmpleado,edad,salairo);
        System.out.println(mensaje);

        // Formateo con tex bock y printf directamente
        System.out.printf("""
                %nDetalle Persona: \s
                ---------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """,nombre,nuemorEmpleado,edad,salairo);
    }
}
