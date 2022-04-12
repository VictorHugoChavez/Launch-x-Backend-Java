package semana1.Viernes;

public class Empleado {
    double salario=40000;

}
class Programaodra extends Empleado{
    int bono=1000;
    public void main(){
        Programaodra Victor=new Programaodra();
        System.out.println("El salario de la programadora es de " + Victor.salario + " con un bono de " + Victor.bono);
    }
    void mensaje(){
        System.out.println("Soy un programador de Lunch-x por parte de micorsoft");
        main();
    }
}
class web extends Programaodra{
    public static void main(String[] args) {
        web Javas= new web();
        Javas.mensaje();
    }
}