package semana2.hilos;

public class hilosT extends Thread { // extiende de la clase de holos que ya existe
    public static void main(String[] args) {
        hilosT hilo1=new hilosT();// se crea un objeto llamado hilo1
        hilo1.start();// le indicamos que inicie el hilo
    }

    @Override
    public void run() {// desde el runnable le indicoo que le hare
        System.out.println("El hilo se esta ejecutando");
    }
}
