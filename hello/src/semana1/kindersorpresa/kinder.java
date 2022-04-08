package semana1.kindersorpresa;

public class kinder {
    public String capsulacolor,diadema,pelo,ropa,pantalon;
    public double estatura,tamaniopelo;

    public String getCapsulacolor() {
        return capsulacolor;
    }

    public boolean setCapsulacolor(String capsulacolor) {
        if(!capsulacolor.isEmpty()){
            this.capsulacolor = capsulacolor;
            return true;
        }else
            return false;
    }

    public String getDiadema() {
        return diadema;
    }

    public boolean setDiadema(String diadema) {
        if(!diadema.isEmpty()){
            this.diadema=diadema;
            return true;
        }else
            return false;
    }

    public double getEstatura() {
        return estatura;
    }

    public boolean setEstatura(double estatura) {
         if(estatura>0){
             this.estatura = estatura;
             return true;
         }else
            return false;
    }

    public String getPelo() {
        return pelo;
    }

    public boolean setPelo(String pelo) {
        if(!pelo.isEmpty()){
            this.pelo = pelo;
            return true;
        }else
            return false;
    }

    public String getRopa() {
        return ropa;
    }

    public boolean setRopa(String ropa) {
        if(!ropa.isEmpty()){
            this.ropa = ropa;
            return true;
        }else
            return false;
    }

    public String getPantalon() {
        return pantalon;
    }

    public boolean setPantalon(String pantalon) {
        if(!pantalon.isEmpty()){
            this.pantalon = pantalon;
            return true;
        }else
            return false;
    }

    public double getTamaniopelo() {
        return tamaniopelo;
    }

    public boolean setTamaniopelo(double tamaniopelo) {
        if(tamaniopelo>0){
            this.tamaniopelo = tamaniopelo;
            return true;
        }else
            return false;
    }
}
