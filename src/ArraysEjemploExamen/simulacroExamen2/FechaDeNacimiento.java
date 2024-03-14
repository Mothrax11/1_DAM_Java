package ArraysEjemploExamen.simulacroExamen2;
import java.util.Scanner;
public class FechaDeNacimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el dia de nacimiento: ");
        int diaNacimiento = sc.nextInt();
        System.out.println("Introduce el mes de nacimiento: ");
        int mesNacimiento = sc.nextInt();
        System.out.println("Introduce el ano de nacimiento: ");
        int anoNacimiento = sc.nextInt();
        System.out.println("Introduce el dia de hoy: ");
        int diaHoy = sc.nextInt();
        System.out.println("Introduce el mes de hoy: ");
        int mesHoy = sc.nextInt();
        System.out.println("Introduce el ano de hoy: ");
        int anoHoy = sc.nextInt();
        System.out.println (edad(diaNacimiento, mesNacimiento, anoNacimiento, diaHoy, mesHoy, anoHoy));
        sc.close();
    }

    public static int edad (int diaNacimiento, int mesNacimiento, int anoNacimiento, int diaHoy, int mesHoy, int anoHoy) {
        int r = anoHoy - anoNacimiento;

        if (mesHoy < mesNacimiento || (mesHoy == mesNacimiento && diaHoy < diaNacimiento)) {
            r--;
        }
        return r;
    }
}
