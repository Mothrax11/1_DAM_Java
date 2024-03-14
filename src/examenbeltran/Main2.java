package examenbeltran;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerin1;
        int numerin2;

        try{
            System.out.println("Escribe 2 números: ");
            numerin1 = sc.nextInt();
            numerin2 = sc.nextInt();
                if(numerin1 > numerin2){
                    System.out.println(numerin1 + " es mayor");
                } else if(numerin1 == numerin2){
                    System.out.println(numerin1 + "es igual a" + numerin2);
                } else {
                    System.out.println(numerin2 + "es mayor");
                }
            
        } catch (InputMismatchException e){
            System.out.println("No has intrudoducido un número");
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
