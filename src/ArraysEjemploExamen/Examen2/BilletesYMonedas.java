package ArraysEjemploExamen.Examen2;
import java.util.Scanner;
import java.util.Arrays;
public class BilletesYMonedas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad a calcular: ");
        int dineroTotal = sc.nextInt();

        System.out.println(Arrays.toString(repartirDinero(dineroTotal)));
        sc.close();
    }

    public static int [] repartirDinero (int euros){
        int [] r = new int [9];
        int [] billetes = new int []{500,200,100,50,20,10,5,2,1};

        for (int k = 0; k < r.length; k++){
            r[k] = euros / billetes[k];
            euros = euros % billetes[k];
        }

        return r;
    }
}
