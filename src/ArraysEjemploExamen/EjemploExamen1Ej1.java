package ArraysEjemploExamen;
import java.util.Scanner;
public class EjemploExamen1Ej1 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int[] a = new int[]{1,5,3,6,2,4};
      ;
        System.out.println(arrayToString(a));
        ordenarMenos3(a);
        System.out.println(arrayToString(ordenarMenos3(a)));
        sc.close();

    }

    public static int [] ordenarMenos3 (int [] a) {
        int cambiado;

        for (int pasada = 0; pasada < a.length - 1; pasada++){
            for (int k = 3; k < a.length - 1; k++) {
                if (a[k] > a[k + 1]) {
                    cambiado = a[k];
                    a[k] = a[k+1];
                    a[k + 1] = cambiado;
                }
            }
        }
        return a;
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
