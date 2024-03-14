package ArraysEjemploExamen.Examen2;

import java.util.Scanner;

public class DevolverMayorArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño del array?");
        int [] arrayMayor = new int [sc.nextInt()];
        rellenar(arrayMayor);
        System.out.println(arrayToString(arrayMayor));
        System.out.println(maximo(arrayMayor));
        sc.close();

    }

    public static void rellenar(int[] x) {
        for (int k = 0; k < x.length; k++) {
            x[k] = (int) (Math.random() * 100);
        }
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
    }

    public static int maximo (int [] a){
        int numMayor = a[0];

        for (int i = 1; i < a.length; i++){
            if (a[i] >= numMayor ){
                numMayor = a[i];
            }
        }
        return numMayor;
    }
}
