package morales.com;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("***  Operadores Artméticos ***");
        double a = 5, b = 3, resultado = 0;

        // Suma +
        resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        // Resta -
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        // Multiplicación *
        resultado = a * b;
        System.out.println("resultado multiplicación = " + resultado);

        // División /
        resultado = a / b;
        System.out.println("resultado división = " + resultado);

        // Módulo (residuo división) %
        resultado = a % b;
        System.out.println("resultado residuo = " + resultado);
    }
}
