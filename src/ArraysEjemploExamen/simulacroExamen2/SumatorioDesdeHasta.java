package ArraysEjemploExamen.simulacroExamen2;
import java.util.Scanner;

public class SumatorioDesdeHasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        System.out.println(calculo(var1, var2));
        sc.close();
    }


    public static int calculo (int var1, int var2) {
        int desde = var1;
        int hasta = var2;


        if (desde > hasta) {
            desde = var2;
            hasta = var1;
        }
        return var1;
    }
}
