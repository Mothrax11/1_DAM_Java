package ArraysEjemploExamen.simulacroExamen2;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce primer valor:");
        int varIns1ej3 = sc.nextInt();

        System.out.println(siguiente7(varIns1ej3));
        sc.close();
    }

    public static int siguiente7 (int n) {

        while (n % 10 != 7) {
            n++;
        }
        return n;
    }
}
