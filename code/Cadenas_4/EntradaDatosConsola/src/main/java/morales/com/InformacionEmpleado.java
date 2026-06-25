package morales.com;

import java.util.Scanner;

public class InformacionEmpleado {
    public static void main(String[] args) {
        // Nombre del empleado
        var consola = new Scanner(System.in);
        System.out.println("*** Datos del empleado ***");
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();
        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());
        // Salairio del empleado
        System.out.print("Salario del empleado: ");
        float salarioEmpleado =  Float.parseFloat(consola.nextLine());
        // Es Jefe de Departamento
        System.out.print("Es Jefe de Departamento (true/false): ");
        boolean esJefeDepartamento =  Boolean.parseBoolean(consola.nextLine());

        /*//Impresición de resultados
        System.out.println("\n*** Resultados de cuestionarios ***");
        System.out.println("\tnombreEmpleado = " + nombreEmpleado);
        System.out.println("\tedadEmpleado = " + edadEmpleado);
        System.out.println("\tsalarioEmpleado = " + salarioEmpleado);
        System.out.println("\tesJefeDepartamento = " + esJefeDepartamento);*/

        var stringBuffer = new StringBuffer();
        stringBuffer.append("\n*** Datos del empleado ***\n");
        stringBuffer.append("\tNombre Empleado: " + nombreEmpleado + "\n");
        stringBuffer.append("\tEdad Empleado: " + edadEmpleado + " años\n");
        stringBuffer.append("\tSalario del Empleado: $%.2f%n".formatted(salarioEmpleado));
        stringBuffer.append("\tEs Jefe de Departamento: " + esJefeDepartamento + "\n");

        System.out.println("stringBuffer = " + stringBuffer);
    }
}
