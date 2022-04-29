package semana2.hilos;

public class hilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("Saludos desde Runnable ");
    }

    public static void main(String[] args) {
        hilosR hilo2=new hilosR();
        Thread hilo2r=new Thread(hilo2);
        hilo2r.start();
    }
}
