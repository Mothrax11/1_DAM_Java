package ArraysEjemploExamen.Examen2;

public class MasRepetido {

    public static void main(String[] args) {
        int [] a = new int[]{1,1,1,2,2,3,3,3,3,3,3,3,3,3,3};


        System.out.println(arrayToString(a));
        System.out.println(elMasRepetido(a));
    }

    public static int elMasRepetido (int [] a){
        int actual = a[0];
        int mayor = a[0];

        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a.length;i++) {
                if (a[k] == k) {
                    actual++;
                }

                if (actual >= mayor) {
                    mayor = actual;
                }
            }
            actual = a[0];
            k++;
        }
        return mayor;
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
