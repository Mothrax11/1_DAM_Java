package ArraysEjemploExamen.Examen2;

import java.util.Scanner;

public class SumarValoresArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño del array?");
        int [] arraysuma = new int [sc.nextInt()];
        rellenar(arraysuma);
        System.out.println(arrayToString(arraysuma));
        System.out.println("La suma de todos los elementos del array es: "+ suma(arraysuma));
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

    public static int suma (int [] a){
        int sumaTotal = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] != -1){
                sumaTotal = sumaTotal + a[i];
            }
        }
        return sumaTotal;
    }
}

