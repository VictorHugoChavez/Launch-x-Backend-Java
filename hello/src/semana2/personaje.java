package semana2;

abstract class sombra{
    abstract void dibujarSomba();
}

class Arma extends sombra{

    @Override// no afecta nada en quitarlo
    void dibujarSomba() {
        System.out.println("Dibujandio  sombras en el arma color azul");
    }
}

public class personaje extends Arma{
    public static void main(String[] args) {
        sombra flecha=new personaje();
        sombra arco=new Arma();
        flecha.dibujarSomba();
        arco.dibujarSomba();
    }

    @Override
    void dibujarSomba() {
        System.out.println("Dibuja una sombra blanca");
    }
}
