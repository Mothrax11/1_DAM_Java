package ArraysEjemploExamen.Examen2;
import java.util.Scanner;

public class Arrays1 {
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

        public static void main (String [] args) {
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt ();
            int [] a = new int [n];

            rellenar (a);

            System.out.println (a.length);
            System.out.println (arrayToString (a));
            sc.close();
        }
    }

