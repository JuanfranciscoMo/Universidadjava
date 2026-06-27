package moreles.com;

import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        System.out.print("Ingresa tu edad: ");
        var edad = 6;

        if (edad >= 18  && edad <= 100){
            System.out.println("Eres mayor de edad");
        } else if (edad < 0 || edad > 100) {
            System.out.println("Edad fuera de rango");
        }else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolecente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
