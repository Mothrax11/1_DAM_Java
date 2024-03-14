package ArraysEjemploExamen.Examen2;

import java.util.Scanner;

public class MediaSinExtremosArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño del array?");
        int [] arrayMayor = new int [sc.nextInt()];
        rellenar(arrayMayor);
        System.out.println(arrayToString(arrayMayor));
        System.out.println(mediaSinMayorNiMenor(arrayMayor));
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

    public static double mediaSinMayorNiMenor (int [] a){
        int numMayor = a[0];
        int numMenor = a[0];
        int sumaTotal = 0;
        double media;

        for (int i = 0; i < a.length; i++){
            if (a[i] >= numMayor ){
                numMayor = a[i];
                sumaTotal = sumaTotal + a[i];

            } else if (a[i] <= numMenor){
                sumaTotal = sumaTotal + a[i];
                numMenor = a[i];
            }

        }
        media = (double)(sumaTotal - (numMenor + numMayor)) / (a.length - 2);
        return media;
    }
}
