package semana1.Viernes;

class bike2{
    void run (){
        System.out.println("running....");
    }
}

public class polimorfismo extends bike2 {
    @Override
    void run() {
        System.out.println("Runnin safely with 60millates for hour");
    }
    public static void main(String[] args) {
    bike2 w=new polimorfismo();
    w.run();
    }
}


