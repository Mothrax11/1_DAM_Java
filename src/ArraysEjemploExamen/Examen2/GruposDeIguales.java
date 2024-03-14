package ArraysEjemploExamen.Examen2;

public class GruposDeIguales {

    public static void main(String[] args) {


        int [] a = new int []{0,0,2,2,5,2,5,2,5,4,8,9,9,987,52,7,87,897,987};

        System.out.println(gruposDeIguales(a));
    }

    public static int gruposDeIguales (int [] a){

        int grupos = 0;

        if (a.length < 2 || a.length == 0){
            return 0;
        } else if (a[0] == a[1]){
        grupos++;
        }

        for (int k = 1; k < a.length - 1; k++){
           if (a[k] != a[k - 1] && a[k] == a[k + 1]){
               grupos++;
           }
        }
        return grupos;
    }
}
