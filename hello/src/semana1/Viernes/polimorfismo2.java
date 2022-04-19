package semana1.Viernes;

class Animal2{
    void eat(){
        System.out.println("Comiendo");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Esta comiendo croquetas de carne");
    }
}

class chachorro extends Animal{
    void eat(){
        System.out.println("Toma leche");
    }
}
public class polimorfismo2 {
    public static void main(String[] args) {
        Animal dander;
        dander=new Animal();
        dander.eat();
        dander=new Dog();
        dander.eat();
        dander=new chachorro();
        dander.eat();
    }
}
