package morales.com;

public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Or ***");
        // or (regresa true si cualquiera de los valores es true)
        boolean a = true, b = false;
        var respuesta = a || b; // caracter pipe
        System.out.println("respuesta = " + respuesta);
    }
}
