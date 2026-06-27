package moreles.com;

public class OperadorTernario {
    public static void main(String[] args) {
        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar su un número es par o no
        var numero = 4;

        var esParImpar = (numero % 2 == 0)? "par" : "inpar";
        System.out.println("El número " + numero + " es " + esParImpar);

        // Calcular si es mayor de edad
        var edad = 18;
        var esMayorEdad = (edad >= 18) ? "mayor de edad" : "menor de edad";
        System.out.println("\nLa edad introducida: " + edad + ". Indica que es: " + esMayorEdad + ".");

        // Valor positovo negativo o cero (operador ternario animado)
        numero = 0;
        var esPositivoNegativoCero = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "cero ";
        System.out.println("\nEl numero " + numero + ", es: " + esPositivoNegativoCero + ".");

    }
}
