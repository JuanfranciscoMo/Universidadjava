package morales.com;

public class FuncionSumar {
    // Definimos la función de sumar
    static int Sumar(int a, int b){
        var resultado = a + b;
        return resultado;
    }
    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        var resultado_funcion = Sumar(arg1,arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);
        System.out.println(Sumar(8,3));
        resultado_funcion = Sumar(10,20);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }
}
