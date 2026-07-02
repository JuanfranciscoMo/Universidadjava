public class ClaseAbstracta {
    static void main() {
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica();  // error, no se puede instansear
        FiguraGeometrica figuraGeometrica = new Rectagulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta
abstract  class FiguraGeometrica{ //
    public abstract void dibujar();

}

class Rectagulo extends  FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un Rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un Circulo");
    }
}
