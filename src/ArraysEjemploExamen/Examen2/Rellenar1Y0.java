package ArraysEjemploExamen.Examen2;
import java.util.Arrays;
public class Rellenar1Y0 {
    public static void main(String[] args) {

        boolean [] a = new boolean [14];
        rellenarTrueFalse(a);
        System.out.println(arrayToStringBoolean(a));

    }

    public static void rellenarTrueFalse (boolean [] a){

        Arrays.fill(a, false);

        int valorAumento = 2;
        int k = 0;

        while (k < a.length) {
            a[k] = true;
            k = k + valorAumento;
            valorAumento++;
        }
    }


    public static String arrayToStringBoolean (boolean [] x) {
        String r = "{";

        for (int k = 0; k < x.length; k++) {
            r = r + (x[k] ? "True, " : "False," );
        }

        return r + "}";
    }
}
