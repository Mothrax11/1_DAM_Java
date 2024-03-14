package ArraysEjemploExamen.Examen2;

import java.util.Scanner;
import java.util.Arrays;

public class esMenorArray {

    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el tamaño del primer array: ");
        int n = sc.nextInt ();
        int [] a = new int [n];
        rellenar (a);

        System.out.println("Introduce el tamaño del segundo array: ");
        int z = sc.nextInt ();
        int [] b = new int [z];
        rellenar (b);

        Arrays.sort(a);
        System.out.println(arrayToString (a));
        //System.out.println (arrayToString (a));
        //System.out.println (arrayToString (b));
        //System.out.println (esMenor (a, b));
        sc.close();
    }

    public static boolean esMenor (int [] a, int [] b){

        int k = 0;

        while (k < a.length && k < b.length){
            if (a[k] > b[k]){
                return true;
            } else if (a[k] < b[k]){
                return false;
            }

            k++;
        }


        return a.length > b.length;
    }
    public static void rellenar (int [] x) {
        for (int k = 0; k < x.length; k++) {
            x[k] = (int)(Math.random () * 100);
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


}


