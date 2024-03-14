package ArraysEjemploExamen.Examen2;
import java.util.Scanner;

public class PrimeroQueNoEsta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 8;

        System.out.println(arrayToString(a));
        System.out.println(primeroQueNoEsta(a));
        sc.close();
    }
    public static int primeroQueNoEsta(int [] a) {
    int count = 1;

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a.length; k++) {
                if (a[k] == count) {
                    count++;
                } else {
                    return count;
                }
            }
        }
        return count;
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
