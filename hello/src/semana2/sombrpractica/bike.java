package semana2.sombrpractica;

abstract  class  Mountain{
    Mountain(){
        System.out.println("Se a creado un abicicleta de montaNIa");
    }
    abstract void  cambiarVelocidad();// metodo abstracto que debo implementar cuando extiendo de otra clase
    void cambiarColor(){
        System.out.println("Se cambia a color rojo");
    }
}
class Magistri extends Mountain{

    @Override
    void cambiarVelocidad() {
        System.out.println("la velocidad se ha cambiado de  0 a 10");
    }
}

public class bike {
    void cambiarVelocidad(){
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain BIKE1=new Magistri();
        BIKE1.cambiarColor();
        BIKE1.cambiarVelocidad();
    }
}
