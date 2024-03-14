package ArraysEjemploExamen.simulacroExamen2;


import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {


    Scanner sc = new Scanner (System.in);

        System.out.println("Introduce primer valor:");
    int varIns1ej2 = sc.nextInt();
        System.out.println("Introduce segundo valor:");
    int varIns2ej2 = sc.nextInt();
        System.out.println("Introduce tercer valor:");
    int varIns3ej2 = sc.nextInt();

        System.out.println(triple(varIns1ej2, varIns2ej2, varIns3ej2));
        sc.close();
    }
    public static boolean triple (int a, int b, int c){
        return (a * 3 == b || a * 3 == c || b * 3 == a || b * 3 == c || c * 3 == a || c * 3 == b);
    }

}
