package ejercicioCola;

public class Cola {

    private int [] cola;
    private int pEntrada;
    private int pSalida;

    public Cola(){
            cola = new int [10];
            pEntrada= 0;
            pSalida = 0;
    }

    public void push(int valor){
        
        if ((pSalida != pEntrada) || cuantos() == 0 ){
            cola[pEntrada] = valor;

            if (pEntrada >= cola.length){
                pEntrada = 0;
            } else {
                pEntrada++;
            }
        }
    }

    public int pop(){

        int guardar = 0; 
        
        if (pSalida != pEntrada) {
            
            guardar = cola[pSalida];
            cola[pSalida] = 0; 
            
            if (pSalida <= cola.length){
                cola[pSalida] = 0;
                pSalida++;
            }
        }
        return guardar == 0 ? -1 : guardar;
    }

    public int cuantos(){

        int contador = 0;
        
        for (int k = 0; k < cola.length; k++){
            if (cola[k] != 0){
                contador++;
            }
        }
        return contador;
    }

    public void vaciar(){
        for (int k = 0; k < cola.length; k++){
            cola[k] = 0;
        }
        pEntrada = 0;
        pSalida = 0;
    }

}
