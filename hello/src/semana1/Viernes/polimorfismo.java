package semana1.Viernes;

class bike2{
    void run (){ // METODO
        System.out.println("running....");
    }
}

public class polimorfismo extends bike2 {
    @Override   // REDEFINE
    void run() {
        System.out.println("Running safely with 60 millates for hour"); // LO HACE ASU MODO Y ES CONOCIDO COMO POLIFORMISMO
    }
    public static void main(String[] args) {
    bike2 w=new polimorfismo();
    w.run();
    }
}


