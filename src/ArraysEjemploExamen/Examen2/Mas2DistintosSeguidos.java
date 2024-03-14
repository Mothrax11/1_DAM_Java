package ArraysEjemploExamen.Examen2;

public class Mas2DistintosSeguidos {
    public static void main(String[] args) {

        int [] a = new int []{1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3};

        System.out.println(masDeDosDistintos(a));
    }

    public static boolean masDeDosDistintos (int [] a){

        if (a.length <= 2){
            return false;
        }

        if (a[a.length - 1] != a[a.length - 2] && a[a.length - 1] != a[a.length - 3] && a[a.length - 2] != a[a.length - 3]){
            return true;
        }

        for (int k = 0; k < a.length - 2; k++){
            if (a[k] != a[k + 1] && a[k] != a[k + 2] && a[k + 1] != a[k + 2]){
                return true;
            }
        }

        return false;
    }
}
