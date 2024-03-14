package ArraysEjemploExamen.Examen2;

public class Mas2Distintos {
    public static void main(String[] args) {

        int [] a = new int []{1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3};

        System.out.println(masDeDosDistintos(a));
    }

    public static boolean masDeDosDistintos (int [] a){

        if (a.length <= 2){
            return false;
        }

        for (int k = 0; k < a.length - 1; k++) {
            if (a[k] != a[k + 1]) {
                int primero = a[k];
                int segundo = a[k + 1];
                if (a[k] != primero && a[k] != segundo){
                    return true;
                }
            }
        }
        return false;
    }
}
