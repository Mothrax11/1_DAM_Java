package ArraysEjemploExamen.Examen2;

public class ArrayBoolean {

    public static void main(String[] args) {
        boolean [] a = new boolean [] {true,true,true,false,false,true,false,true,true,false,false};

        System.out.println(cuantosCambios(a));
    }

    public static int cuantosCambios (boolean [] a){
        int cambios = 0;
        for (int k = 0; k < a.length - 1; k++){

            if (a[k] != a[k +1]) {
                cambios++;
                System.out.println("Aquí hay un cambio");
            }
        }

        return cambios;
    }
}
