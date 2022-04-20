package semana2;

abstract class Montain{
    Montain() {
        System.out.println("se ha creado una bicicleta de Montaña");
    }
    abstract void cambiarVelocidad();
    void changeColor(){
        System.out.println("Cmabiando color a rojo");
    }
}
class Magistroni extends Montain{

    @Override
    void cambiarVelocidad() {
        System.out.println("Se deben modificar las perillas del manibruio");
    }
}

public class bicicketa {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Montain bici1=new Magistroni();
        bici1.cambiarVelocidad();
        bici1.changeColor();
    }
}
