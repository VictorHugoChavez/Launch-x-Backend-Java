package semana2;

abstract class Hola{
    void saludar(){
        //Como lo hace
        System.out.println("¿COMO ESTAS?, Te ves bien eh");
    }
    abstract void saludo();
}

interface Monstrar {
    //Que hace
    void show();
    abstract void despide();
}



public class SaludosCordiales implements Monstrar{



    @Override
    public void show() {
        System.out.println("Hola, Como estas, espero no del todo mal ...");
    }

    @Override
    public void despide() {
        System.out.println("Gracias, si");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1= new SaludosCordiales();
        saludo1.show();
    }
}
