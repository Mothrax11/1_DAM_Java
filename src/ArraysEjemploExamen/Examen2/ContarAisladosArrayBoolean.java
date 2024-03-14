package ArraysEjemploExamen.Examen2;


public class ContarAisladosArrayBoolean {

    public static void main(String[] args) {
        boolean [] a = new boolean []{false,true,false,false,true,true,true,false,true,true};
        System.out.println(contarAislados(a));
    }

    public static int contarAislados (boolean [] a){
        int cuantosHay = 0;

        if (a.length < 2) {
            return a.length;
        }

        if (a[0] != a[1]) {
            cuantosHay++;
        }

        if (a[a.length - 1] != a[a.length - 2]) {
            cuantosHay++;
        }

        for (int k = 1; k < a.length - 1; k++){
            if ((a[k - 1] != a[k]) && a[k + 1] != a[k]) {
                cuantosHay++;
            }
        }
        return cuantosHay;
    }

    public static String arrayToStringBoolean (boolean [] x) {
        String r = "{";

        for (int k = 1; k < x.length; k++) {

            r = r + (x[k] ? "True, " : "False," );
        }

        return r + "}";
    }
}
