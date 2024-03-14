package clases;
public class ArrayDeInt {
    private int [] a = new int[2];
    public int get (int indice){
        return this.a[indice];
    }
    public void setValue (int indice, int valor){
        this.a[indice] = valor;
    }

    public int lenght (){
    return this.a.length;
    }
    public void setLenght (int longitud){
        int [] nArray = new int [longitud];
        int n = Math.min(this.a.length, nArray.length);

         for (int k = 0; k < n; k++){
             a[k] = nArray[k];
        }
     a = nArray;
    }

}
