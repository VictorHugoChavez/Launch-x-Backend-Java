package semana1;

public class bicicleta {
    //constructor
    bicicleta(){

    }
    public bicicleta(String color){
        this.color=color;
    }

    //Caacteristicas
    public int rodada,pines;
    public double velocidad;
    public String color;

    public int getPines() {
        return pines;
    }

    public boolean setPines(int pines) {
        if(pines>0){
            this.pines = pines;
            return true;
        }else
            return false;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getRodada() {
        return rodada;
    }

    public boolean setRodada(int rodada) {
        if(rodada>0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad) {
        if(velocidad>=0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }

    public String getColor() {
        return color;
    }

    public boolean setColor(String color) {
        if(!color.isEmpty()){
            /* ! es diferente de */
            this.color = color;
            return true;
        }
            return false;
    }

    //todo lo de arriba es una clase pura
    // el main debe estar en otro lado y no en una clase del objeto


    @Override
    public String toString() {
        return "bicicleta{" +
                "rodada=" + rodada +
                ", pines=" + pines +
                ", velocidad=" + velocidad +
                ", color='" + color + '\'' +
                '}';
    }
}
