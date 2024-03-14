package ArraysEjemploExamen.Examen2;
import java.util.Scanner;
public class InvertirArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el tamaño del primer array: ");
        int n = sc.nextInt ();
        int [] a = new int [n];
        rellenar (a);

        System.out.println(arrayToString(a));
        System.out.println(arrayToString(invertir(a)));
        sc.close();
    }

    public static int [] invertir(int [] a){
        int almacen;

        for (int k = 0; k < a.length - 1 - k; k++){
            almacen = a[a.length - k -1];
            a[a.length - k -1] = a[k];
            a[k] = almacen;
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
