package morales.com;

public class FuncionRecursiva {
    // imprimir 1 al 5 usnado una funcion recuersiva
    static void funcioRecursiva(int numero){
        // Caso Base
        if (numero == 1) {
            System.out.print(numero + " ");
        } else {
            // Caso recursivo
            funcioRecursiva(numero -1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcioRecursiva(10);
    }
}
