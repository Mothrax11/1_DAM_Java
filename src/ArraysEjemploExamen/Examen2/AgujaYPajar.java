package ArraysEjemploExamen.Examen2;

import java.util.Scanner;

public class AgujaYPajar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño del array?");
        int [] pajar = new int [sc.nextInt()];
        rellenar(pajar);
        System.out.println(arrayToString(pajar));

        System.out.println("¿Numero a buscar?");
        int aguja = sc.nextInt();

        System.out.println (buscar(pajar, aguja));
        sc.close();
    }

    public static void rellenar(int[] x) {
        for (int k = 0; k < x.length; k++) {
            x[k] = (int) (Math.random() * 100);
        }
    }

    public static int buscar(int[] pajar, int aguja) {

        for (int k = 0; k < pajar.length; k++) {
            if (aguja == pajar[k]) {
                return k;
            }
        }
        return -1;
    }

    public static String arrayToString (int [] x) {
        if (x.length <= 0) {
            return "{}";
        }

        String r = "{" + x[0];
        for (int k = 1; k < x.length; k++) {
            r = r + "," + x[k];
        }

        return r + "}";
        
    };
}
