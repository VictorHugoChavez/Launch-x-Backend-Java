package semana2.hilos;

public class test2  implements Runnable{

    @Override
    public void run() {
        try{
            for(int i=0; i<=10000;i++){
                Thread.sleep(5);
                System.out.println(i);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test2 h2=new test2();
        Thread h2r=new Thread(h2);
        h2r.start();
    }
}
