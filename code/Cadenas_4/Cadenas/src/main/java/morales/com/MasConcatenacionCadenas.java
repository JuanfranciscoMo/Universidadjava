package morales.com;

public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // mas formas de concatenar cedenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;

        //Mètodos concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 usando concat= " + cadena3);
        
        // StringBuilder
        var constructoCadenas = new StringBuilder();
        constructoCadenas.append(cadena1);
        constructoCadenas.append(" ");
        constructoCadenas.append(cadena2);
        var resultado = constructoCadenas.toString();
        System.out.println("resultado usando StringBuilder = " + resultado);

        // StringBuffer
        var stringBuffer =  new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado usnadon StringBuffer = " + resultado);

        // join
        resultado = String.join(" ",cadena1,cadena2, "Adios!");
        System.out.println("resultado = " + resultado);
    }
}
