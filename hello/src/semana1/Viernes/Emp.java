package semana1.Viernes;

 class persona{
    int id;
    String nombre;

    persona(int id, String nombre){
        this.id =id;
        this.nombre=nombre;
    }
}

public class Emp extends persona{
    double salario;
    Emp(int id, String nombre , double salario) {
        super(id, nombre);
        this.salario=salario;
    }
    void display(){
        System.out.println(id+""+nombre+""+salario );
    }
}
class TestPersonaEmpleado{
    public static void main(String[] args) {
        Emp e= new Emp(1,"Victor",13678.98);
        e.display();
    }
}


