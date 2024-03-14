package ArraysEjemploExamen.Examen2;
import java.util.Scanner;

public class TiraMasLarga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int [] a = new int[16];

        System.out.println(arrayToString(a));
        System.out.println(tiraMasLarga(a));
        sc.close();
    }

    public static int tiraMasLarga(int[] a) {
        int tira = 1;

        for (int k = 1; k < a.length; k++) {
            if (a[k] == a[k - 1]) {
                tira++;
            } else {
                tira = 1;
            }
        }
        return tira;
    }
        public static void rellenar (int [] x){
            for (int k = 0; k < x.length; k++) {
                x[k] = (int) (Math.random() * 5);
            }
        }

        public static String arrayToString ( int[] x){
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


