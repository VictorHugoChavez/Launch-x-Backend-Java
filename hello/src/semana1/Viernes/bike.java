package semana1.Viernes;

//OVERLOAD : SOBRECARGA
//OVERRIDE : REDEFINE
//OVERWRITE SOBREESCRIBE

public class bike {
    //bike t= new bike();
    //propiedades
    private int velocidad;
    private String color,marca;

    public bike(){}
    public bike(String color){this.color=color;}
    public bike(String color,int velocidad){this.color=color; this.velocidad=velocidad;}
    public bike(String color, int velocidad,String marca){this.color=color; this.velocidad=velocidad; this.marca=marca;}

    public int getVelocidad(){ return velocidad; }
    public String getColor(){ return color; }
    public String getMarca(){ return marca; }

    @Override
    public String toString() {
        return "bike{" +
                "velocidad=" + velocidad +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
