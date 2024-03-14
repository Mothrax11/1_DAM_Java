package ArraysEjemploExamen.simulacroExamen2;
import java.util.Scanner;
public class EsFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        System.out.println (esFactorial(x));
        sc.close();
    }

    public static boolean esFactorial (int n) {
        int r = 1;
        int k = 2;

        while (r < n) {
            r = r * k;
            k++;
        }
        return r == n;
    }
}
