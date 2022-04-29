package semana2.sombrpractica;

public class SaludosCordiales implements Mostrar {

    @Override
    public void show() {
        System.out.println("Hola como estas");
    }

    @Override
    public void despide() {
        System.out.println("Bueno bye nos vemos");
    }

    public static void main(String[] args) {
        SaludosCordiales mov=new SaludosCordiales();
        mov.show();
        mov.despide();
    }
}
