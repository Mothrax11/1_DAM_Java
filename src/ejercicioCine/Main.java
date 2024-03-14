package ejercicioCine;

public class Main {
    public static void main(String[] args) {
        Cine cn = new Cine();

        for (int k = 20; k >= 1; k--){ 
            System.out.println(cn.reservar(k));
        }
        System.out.println(cn.reservar(2));
        System.out.println("Quedan " + cn.butacasLibres() + " butacas libres");
        System.out.println(cn.juntos(21));
    }
}
