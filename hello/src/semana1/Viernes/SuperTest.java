package semana1.Viernes;

class Animal{
    //caso1
    String color="Blanco";

    //caso2
    void eat(){
        System.out.println("Esta comiendo...");
    }
    //caso3
    Animal(){
        System.out.println("Se crea un animal");
    }
}



class Gato extends Animal{
    //caso1
    String color="Cafe";
    void printColor(){
        System.out.println("Color de la clase gato: "+color);
        System.out.println("Color de la clase animal: "+super.color); /// el super hace referencia al de la clase padre en este caso animal
    }


    //caso2
    void eat(){
        System.out.println("Come atun ");
    }
    //caso2
    void dormir(){
        System.out.println("Ya se durmio el mishi");
    }

    void call(){
        super.eat();
        dormir();
    }

    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }
}



public class SuperTest {
    public static void main(String[] args) {
      // new Gato().printColor(); // objetos anonimos, por que se contruyen a directo, porque no tienen nombre y tip
        //caso2
        new Gato().call();

        //caso3
        new Gato();
    }
}
