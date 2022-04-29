package semana2.hilos;

public class Test1  extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            try{
                Thread.sleep(50);
                System.out.println(i);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test1 prueba=new Test1();
        prueba.start();
    }
}
