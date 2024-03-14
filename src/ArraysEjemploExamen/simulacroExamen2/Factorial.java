package ArraysEjemploExamen.simulacroExamen2;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
        System.out.println (factorial(x));
        sc.close();
        }

      public static int factorial (int n) {
        int resultado = 1;
        for (int k = 1; k <= n; k++) {
            resultado = k * resultado;
          }
      return resultado;
    }
}
