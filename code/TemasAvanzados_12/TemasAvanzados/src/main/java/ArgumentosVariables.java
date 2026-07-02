public class ArgumentosVariables {
    static void main() {
        // imprimirNumeros(1,2,3,4,5,6,7,8); // varargs
        variosParametros("Karla",10,20,30);
    }

    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
    }

    static void imprimirNumeros(int... numeros) {
        for (var i=0; i < numeros.length ; i++){
            System.out.println(numeros[i] + " ");
        }
    }
}
