package ArraysEjemploExamen.Examen2;

import java.util.Scanner;

public class SegundoMenorArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño del array?");
        int [] arraySegundoMenor = new int [sc.nextInt()];
        rellenar(arraySegundoMenor);
        System.out.println(arrayToString(arraySegundoMenor));
        System.out.println(segundoMenor(arraySegundoMenor));
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

    public static int segundoMenor(int [] a){
        int numMenor = a[0];
        int segundo = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[1] <= numMenor) {
                if (a[i] >= numMenor && a[i] <= segundo) {
                    
                    segundo = a[i];
                }
            }
        }
        return segundo;
    }
}
