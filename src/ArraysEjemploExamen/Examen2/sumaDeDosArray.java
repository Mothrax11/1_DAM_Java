package ArraysEjemploExamen.Examen2;

import java.util.Arrays;
import java.util.Scanner;

public class sumaDeDosArray {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int[] cantidad1 = new int[4];
            System.out.println ("Introduzca primer número");
            cantidad1[0]= sc.nextInt();
            System.out.println ("Introduzca segundo número");
            cantidad1[1]= sc.nextInt();
            System.out.println ("Introduzca tercer número");
            cantidad1[2]= sc.nextInt();;
            System.out.println ("Introduzca cuarto número");
            cantidad1[3]= sc.nextInt();


            int [] cantidad2 = new int [4];
            System.out.println ("Introduzca primer número");
            cantidad2[0]= sc.nextInt();
            System.out.println ("Introduzca segundo número");
            cantidad2[1]= sc.nextInt();
            System.out.println ("Introduzca tercer número");
            cantidad2[2]= sc.nextInt();;
            System.out.println ("Introduzca cuarto número");
            cantidad2[3]= sc.nextInt();


            System.out.println("   " + arrayToString(cantidad1));
            System.out.println("+");
            System.out.println("   " + arrayToString(cantidad2));
            System.out.println("  -----------");
            System.out.println(Arrays.toString(sumaDeCantidades(cantidad1, cantidad2)));
            sc.close();
        }



        public static int[] sumaDeCantidades (int [] cantidad1, int [] cantidad2) {
            int [] resultado = new int [5];
            int suma = 0;
            int meLlevo = 0;

            for (int k = cantidad1.length -1; k >= 0; k--){
                suma = cantidad1[k] + cantidad2[k] + suma / 10;

                if (suma > 9) {
                    meLlevo = 1;
                } else {
                    meLlevo = 0;
                }

                resultado [k + 1] = suma % 10;
            }

            resultado[0] = meLlevo;
            return resultado;
        }

        public static String arrayToString (int [] x) {
            if (x.length <= 0) {
                return "{}";
            }

            String r = "{" + x[0];
            for (int k = 1; k < x.length; k++) {
                r = r + "," + x[k];
            }
            return r + "}";
        }
    }
