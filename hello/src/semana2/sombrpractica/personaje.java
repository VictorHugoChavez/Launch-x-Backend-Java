package semana2.sombrpractica;

abstract class Sombrax{
    abstract  void dibujarSombra();
}

class Arma extends Sombrax{
    @Override
    void dibujarSombra() {
        System.out.println("Dibujando sombra de armas");
    }
}



public class personaje extends Arma{

    public static void main(String[] args) {

        Sombrax flecha = new personaje();
        Sombrax arco = new Arma();
        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    @Override
    void dibujarSombra() {
        System.out.println("Se dibuja una sombra de flecha");
    }
}
