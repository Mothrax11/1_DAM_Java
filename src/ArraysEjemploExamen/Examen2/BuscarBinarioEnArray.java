package ArraysEjemploExamen.Examen2;
import java.util.Scanner;
public class BuscarBinarioEnArray {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int n = sc.nextInt();
        int[] a = new int[n];
        rellenar(a);
        System.out.println(arrayToString(a));
        ordenar(a);
        System.out.println(arrayToString(ordenar(a)));
        int buscar = sc.nextInt();
        buscar(a, buscar);
        System.out.println(buscar);
        sc.close();

    }

    public static int buscar (int [] a, int x){

        if (a.length <= 0 || x <= a[0] || x >= a[a.length -1]){
            return -1;
        }

        if (a[0] == x){
            return a[0];
        }

        int p = 0;
        int g = a.length - 1;

        while (p < g - 1) {

            int m = (p + g) / 2;

            if (a[m] > x){
                g = m;
            } else if (a[m] < x) {
                p = m;
            } else {
                return m;
            }
        }
        return -1;
    }
    public static int [] ordenar (int [] a) {
        int cambiado;

        for (int pasada = 0; pasada < a.length - 1; pasada++){
            for (int k = 0; k < a.length - 1; k++) {
                if (a[k] > a[k + 1]) {
                    cambiado = a[k];
                    a[k] = a[k+1];
                    a[k + 1] = cambiado;
                }
            }
        }
        return a;
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
