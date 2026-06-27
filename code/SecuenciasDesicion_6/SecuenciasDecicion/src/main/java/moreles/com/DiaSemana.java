package moreles.com;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Switch ***");
        var diaSemana = 7;
        String nombreDia;

        nombreDia = switch (diaSemana) {
            case 1 -> "Lunes";
            case 2 ->"Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día invalido " + diaSemana;
        };

        System.out.println(nombreDia);

    }
}
