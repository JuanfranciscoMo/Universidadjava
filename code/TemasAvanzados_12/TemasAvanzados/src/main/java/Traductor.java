public interface Traductor {
    // public y bastract
    void traducir();

    // Métodos con implementación por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a Inglés");
    }
}

class Frances implements Traductor{
    public void traducir(){
        System.out.println("Traduzco a Frances");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Frances");
    }
}

class PruebaTraductor{
    static void main() {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();
        // Traductor en Frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
