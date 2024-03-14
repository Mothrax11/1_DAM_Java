package ArraysEjemploExamen.Examen2;

public class CuantosEdificiosVeo {

    public static void main(String[] args) {

        int [] a = new int []{2,4,3,5,1,6};

        System.out.println("Ves " + cuantosEdificiosSeVen(a) + " edificios");

    }

    public static int cuantosEdificiosSeVen (int [] a){

        int cuantosVeo = 1;

        if (a.length == 0){
            cuantosVeo = 0;
            return cuantosVeo;
        }

        int mayor = a[0];

        for (int k = 0; k < a.length - 1; k++) {

            if (a[k + 1] > a[k]) {
                if (a[k + 1] > mayor) {
                    mayor = a[k + 1];
                    cuantosVeo++;
                }
            }
        }
        return cuantosVeo;
    }
}
