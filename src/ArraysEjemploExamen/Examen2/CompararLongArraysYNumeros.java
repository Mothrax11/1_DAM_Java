
package ArraysEjemploExamen.Examen2;

import java.util.Scanner;
import java.util.Random;



public class CompararLongArraysYNumeros {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño del primer array?");
        int [] array1 = new int [sc.nextInt()];
        System.out.println(arrayToString(array1));
        System.out.println("¿Tamaño del segundo array?");
        int [] array2 = new int [sc.nextInt()];
        System.out.println(arrayToString2(array2));

        System.out.println(comparar(array1, array2));
        sc.close();
    }
    public static boolean comparar (int [] a, int [] b) {
        Random rm = new Random();

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                a[i] = rm.nextInt(6);
                b[i] = rm.nextInt(6);

                if (a[1] == b[1]){
                    return true;
                }
            }
        }
        return false;
    }

    public static String arrayToString (int [] a) {
        if (a.length <= 0) {
            return "{}";
        }

        String r = "{" + a[0];
        for (int k = 1; k < a.length; k++) {
            r = r + "," + a[k];
        }
        return r + "}";
    }
    public static String arrayToString2 (int [] b) {
        if (b.length <= 0) {
            return "{}";
        }

        String r = "{" + b[0];
        for (int k = 1; k < b.length; k++) {
            r = r + "," + b[k];
        }
        return r + "}";
    }
}

