package morales.com.Persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPerosna;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Asignamos el id único con ayuda de la variable estatica
        this.idPerosna = ++Persona.contadorPersonas;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    public int getIdPerosna() {
        return this.idPerosna;
    }

    public void setIdPerosna(int idPerosna) {
        this.idPerosna = idPerosna;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return  "Id: " + this.idPerosna +
                ", Nombre: " + this.nombre + ", Apellido: " + this.apellido
                + ", Dir. Mem: " + super.toString();
    }
}
