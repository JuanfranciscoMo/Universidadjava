package morales.com.aritmetica;

public class Aritmetica {
    private int operador1;
    private int operador2;
    // Constructor vació
    public Aritmetica(){

    }

    // Contructro con dos argumentos
    public Aritmetica(int op1, int op2){
        System.out.println("\nEjecutamos constructor");
        this.operador1 = op1;
        this.operador2 = op2;
        System.out.println("Operaedor this: " + this);
    }

    public void sumar(){
        var resultado = this.operador1 + this.operador2;
        System.out.println("Resultado Suma: " + resultado);
    }

    public void restar(){
        var resultado = this.operador1 - this.operador2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
}
