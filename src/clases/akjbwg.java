package clases;

public class akjbwg {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,8,9,10};
        System.out.println(consecutivos(a));

        System.out.println(mayorDiferencia(a));
    }

    public static boolean consecutivos(int[] a) {
        if (a.length <= 1) {
            return true;
        }

        int anterior = a[0];
        int contador = 0;

        if (a[0] < a[1]) {
            for (int k = 0; k < a.length; k++) {
                if (a[k] == anterior + 1) {
                    anterior = a[k];
                    contador++;
                }

                if (contador == a.length - 1) {
                    return true;
                }
            }
        } else {
            anterior = a[0];
            contador = 0;
            for (int j = 1; j < a.length; j++) {
                if (a[j] == anterior - 1) {
                    anterior = a[j];
                    contador++;
                }

                if (contador == a.length - 1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static int terminanEn7(int[] a) {
        int cuantosTerminan = 0;

        for (int k = 0; k <= a.length - 1; k++) {
            if (a[k] % 10 == 7) {
                cuantosTerminan++;
            }
        }

        return cuantosTerminan;
    }


    public static int mayorDiferencia (int[] a) {

        if (a.length <= 1) {
            return -1;
        }

        int resta = 0;
        int diferenciMayor = 0;


        for (int k = 0; k < a.length - 1; k++) {

            if (a[k] < a[k + 1]) {
                resta = a[k + 1] - -a[k];
            } else {
                resta = a[k] - a[k + 1];
            }

            if (resta > diferenciMayor) {
                diferenciMayor = resta;
            }
        }
        return diferenciMayor;
    }
}
