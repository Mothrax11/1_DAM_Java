package clases;

public class Caja {
    private int [] array = new int[]{7, 22, 11, 34, 17, 52, 26, 13, 40, 20};
    private int posicion = 0;
     public int mirar (){
        return array[posicion];
    }

    public void anterior (){
        posicion--;
        if (posicion < 0) {
            posicion = array.length - 1;
        }
    }

   public void siguiente (){
        posicion++;
        if (posicion >= array.length) {
            posicion = 0;
        }

    }

}
