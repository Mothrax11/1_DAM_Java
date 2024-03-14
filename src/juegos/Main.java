package juegos;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in); 
        Foto a = new FotoNim();;

        Foto [] m =  a.getMovimientos();

        while (m.length > 0){
            System.out.println("-----");
            System.out.println("Posición actual: ");
            System.out.println(a.toString());

            for(int k = 0; k < m.length; k++){
                System.out.println("Movimiento " + k);
                System.out.println(m[k].toString());
            }
            
            System.out.println("Le toca a " + (a.getTurno() ? "A" : "B"));
            System.out.println("Elige movimiento: ");
            final int eleccion = sc.nextInt();

            if (eleccion >= 0 && eleccion < m.length){
                a = m[eleccion];
                m = a.getMovimientos();
            }
        }

        System.out.println("Ha ganado " + (a.haGanadoA() ? "A" : "B"));
        sc.close();
    }
}