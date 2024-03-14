package ArraysEjemploExamen.Examen2;
import java.util.Scanner;
import java.util.Arrays;

public class Rellenar123 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int [n];

        rellenarCon123(x);
        System.out.println(Arrays.toString(x));
        sc.close();
    }

    public static void rellenarCon123 (int [] a){
    int q = 1;

        for (int k = 0; k < a.length; k++) {

            if (q > 3) {
                q = 1;
            }
            a[k] = q;
            q++;
        }
    }
}
