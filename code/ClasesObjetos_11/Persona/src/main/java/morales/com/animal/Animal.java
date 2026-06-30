package morales.com.animal;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un solido");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("El perro hace wouf");
    }
}

class Gato extends Animal{
    public void hacerSonido(){
        System.out.println("El gato hace meau");
    }
}

class PruebaAnimal {

    // Método plimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Objeto de la clase Padre (Animal)
        Animal animal = new Animal();
        imprimirSonido(animal);
        Perro perro = new Perro();
        imprimirSonido(perro);
        Gato gato = new Gato();
        imprimirSonido(gato);
    }
}