package ArraysEjemploExamen.Examen2;
import java.util.Scanner;

public class codigoBarrasArray {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        int [] barras = new int [13];

        System.out.println ("Introduzca primer número");
        barras[0]= sc.nextInt();
        System.out.println ("Introduzca segundo número");
        barras[1]= sc.nextInt();
        System.out.println ("Introduzca tercer número");
        barras[2]= sc.nextInt();;
        System.out.println ("Introduzca cuerto número");
        barras[3]= sc.nextInt();
        System.out.println ("Introduzca quinto número");
        barras[4]= sc.nextInt();
        System.out.println ("Introduzca sexto número");
        barras[5]= sc.nextInt();
        System.out.println ("Introduzca séptimo número");
        barras[6]= sc.nextInt();
        System.out.println ("Introduzca octavo número");
        barras[7]= sc.nextInt();
        System.out.println ("Introduzca noveno número");
        barras[8]= sc.nextInt();
        System.out.println ("Introduzca décimo número");
        barras[9]= sc.nextInt();
        System.out.println ("Introduzca undécimo número");
        barras[10]= sc.nextInt();
        System.out.println ("Introduzca duodécimo número");
        barras[11]= sc.nextInt();
        System.out.println ("Introduzca decimotercer número");
        barras[12]= sc.nextInt();

        System.out.println(ean13(barras));
        System.out.println(ean13v2(barras));
        sc.close();
    }

    public static boolean ean13 (int [] barras) {
        int calculo1;
        int calculo2;
        int calculoTotal;

        calculo1 = barras [0] + barras [2] + barras [4] + barras [6] + barras [8] + barras [10] + barras [12];
        calculo2 = (barras [1] + barras [3] + barras [5] + barras [7] + barras [9] + barras [11]) * 3;

        calculoTotal = calculo1 + calculo2;

        return (calculoTotal % 10 == 0);
    }
    public static boolean ean13v2 (int [] barras) {

        int suma = 0;

        for (int k = 0; k < 13; k++) {
            suma += (k % 2 != 0 ? 3 : 1) * (barras [k] % 10);
        }

        return suma % 10 == 0;
    }
}
