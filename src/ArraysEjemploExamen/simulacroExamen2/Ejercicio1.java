package ArraysEjemploExamen.simulacroExamen2;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce primer valor:");
        int varIns1 = sc.nextInt();
        System.out.println("Introduce segundo valor:");
        int varIns2 = sc.nextInt();
        System.out.println("Introduce tercer valor:");
        int varIns3 = sc.nextInt();

        System.out.println(diferenciaMenor(varIns1, varIns2, varIns3));
        sc.close();


    }
    public static int diferenciaMenor (int a, int b, int c) {
        int mediano = 0;
        int mayorMenosMediano = 0;
        int medianoMenosMenor = 0;

        int mayor = a;
        int menor = a;

        if (b <= menor) {
            menor = b;
        }

        if (b >= mayor) {
            mayor = b;
        }

        if (c <= menor) {
            menor = c;
        }

        if (c >= mayor) {
            mayor = c;
        }

        mediano = a + b + c - mayor - menor;
        mayorMenosMediano = mayor - mediano;
        medianoMenosMenor = mediano - menor;

        if (mayorMenosMediano >= medianoMenosMenor) {
            return medianoMenosMenor;
        } else {
            return mayorMenosMediano;
        }
    }
}

