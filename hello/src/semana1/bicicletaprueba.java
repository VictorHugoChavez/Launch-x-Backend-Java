package semana1;

public class bicicletaprueba {
    public static void main(String[] args) {// la clase principal
        def();
    }
    public static void def(){
        bicicleta bicimontain=new bicicleta();
        bicicleta bicipista=new bicicleta("Blanco");

        bicimontain.setColor("Negro");
        bicimontain.setPines(3);
        bicimontain.setRodada(26);
        bicimontain.setVelocidad(22.6);

        String msg="Soy una bici de montain con estas caracteristicas";
        msg += "\nColor "+ bicimontain.getColor();
        msg += "\nVelocidad "+bicimontain.getVelocidad();
        msg += "\nRodada "+bicimontain.getRodada();
        msg += "\nPines "+bicimontain.getPines();

        System.out.println(msg);
    }
}
