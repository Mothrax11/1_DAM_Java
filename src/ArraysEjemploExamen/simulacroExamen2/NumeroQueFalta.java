package ArraysEjemploExamen.simulacroExamen2;
import java.util.Scanner;

public class NumeroQueFalta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        int var3 = sc.nextInt();
        System.out.println(numeroQueFalta(var1, var2, var3));
        sc.close();
    }


    public static int numeroQueFalta (int a, int b, int c) {

        return 1 + 2 + 3 + 4 - a - b - c;
    }
}
