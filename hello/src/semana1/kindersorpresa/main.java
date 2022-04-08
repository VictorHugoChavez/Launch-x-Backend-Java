package semana1.kindersorpresa;

public class main {
    public static void main(String[] args) {
        kinder muneco= new kinder();
        muneco.setPantalon("Morado");
        muneco.setPelo("Risado");
        muneco.setTamaniopelo(6.8);
        muneco.setCapsulacolor("Amarillo");
        muneco.setEstatura(6.8);
        muneco.setDiadema("Morado");
        muneco.setRopa("Blusa");

        String juguete;
        juguete = "El juguete que me salio de mi kinder tienen las siguinetes caracteristicas en la cpasula de color "+ muneco.getCapsulacolor();
        juguete+= "\n Ropa: " + muneco.getRopa();
        juguete+= "\n Diadema de color : " + muneco.getDiadema();
        juguete+= "\n Pelo : " + muneco.getPelo();
        juguete+= "\n Color del pantalon : " + muneco.getPantalon();
        juguete+= "\n Estatura : "+ muneco.getEstatura() + " cm";

        System.out.println(juguete);
    }
}
