package piedraPapelTijera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ppt pipati = new ppt();
        int h = sc.nextInt();
        
        while (h >= 0 && h < 3) {
            int o = pipati.sacar(h);
            System.out.println("Humano: " + pipati.getNombre(h) + " Ordenador: " + pipati.getNombre(o));
            marcador m = pipati.getMarcador();
            System.out.println("Ganadas:" + m.getGanadas() + " Perdidas:" + m.getPerdidas() + " Empatadas:" + m.getEmpatadas() + " Total:" + m.getTotal());
            h = sc.nextInt();
        }
        sc.close();
    }
}
