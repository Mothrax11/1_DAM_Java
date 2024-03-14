package ArraysEjemploExamen.Examen2;
import java.util.Scanner;
public class MayorSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 1, 7, 6, 5, 4, 3, 2, 1};
        int n = sc.nextInt();

        System.out.println(mayorSuma2(a));
        System.out.println(mayorSumaN(a, n));
        sc.close();
    }

    public static int mayorSuma2(int[] a) {

        if (a.length == 1){
            return a[0];
        } else if (a.length == 0){
            return 0;
        }

        int sumaMayor = -42;

        for (int k = 0; k < a.length - 1; k++) {
            if ((a[k] + a[k + 1]) > sumaMayor) {
                sumaMayor = a[k] + a[k + 1];
            }
        }
        return sumaMayor;
    }


    public static int mayorSumaN (int [] a, int n){

        int sumaMayor = 0;
        int suma = 0;
        
        for (int g = 0; g < n; g++){
            sumaMayor += a[g];
        }

        for (int k = 1; k < a.length; k++){
            suma = 0;
            for (int x = k; x <= n; x++){

                suma += a[k];
            }
            
            if (suma > sumaMayor){
                sumaMayor = suma;
            }
            
        }
        return sumaMayor;
    }
}


