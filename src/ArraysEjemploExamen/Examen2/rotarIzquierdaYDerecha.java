package ArraysEjemploExamen.Examen2;

public class rotarIzquierdaYDerecha {
    public static void rellenar (int [] x) {
        for (int k = 0; k < x.length; k++) {
            x[k] = (int)(Math.random () * 100);
        }
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

    public static void rotarIzquierda (int [] a) {
        int t = a[0];

        for (int k = 0; k < a.length - 1; k++) {
            a[k] = a[k + 1];
        }

        a[a.length - 1] = t;
    }

    public static void rotarDerecha (int [] a) {
        int t = a[a.length - 1];

        for (int k = a.length - 2; k >= 0; k--) {
            a[k + 1] = a[k];
        }

        a[0] = t;
    }

    public static void main (String [] args) {
        int [] a = new int [6];
        rellenar (a);

        System.out.println (arrayToString (a));
        rotarIzquierda (a);
        System.out.println (arrayToString (a));
        rotarDerecha (a);
        System.out.println (arrayToString (a));
    }
}


