package ejercicioCine;

public class Cine {
    
    private final boolean [] reservado;

    public Cine(){
        reservado = new boolean[40];
    
    }

    public boolean reservar (int butaca){

        int nButaca = butaca - 1;

            if (reservado[nButaca]){
                return false;
            }

            if (nButaca <= 39 && nButaca >= 0){
            if (!reservado[nButaca]){
                reservado[nButaca] = true;
            }
        }
        return !reservado[butaca] ? true : false;
    }

    public boolean anular (int butaca){

        int nButaca = butaca - 1;

        if (nButaca <= 39 && nButaca > 0) {
            if (reservado[nButaca]) {
                reservado[nButaca] = false;
            }
        }
        return !reservado[butaca] ? false : true;
    }

    public int butacasLibres(){

        int libres = 0;

        for (int k = 0; k < reservado.length ; k++){
            if(!reservado[k]){
                libres++;
            }
        }
        return libres;
    }

    public int juntos (int personas){

        int seguidos = 0;
        int primeraLibre = 0;

        for (int k = 0 ; k < reservado.length; k++){
           if (!reservado[k]){
            if (seguidos == 0){
                primeraLibre = k;
            }
                seguidos++;
           } else {
            seguidos = 0;
           }

           if (seguidos == personas){
            return primeraLibre;
           }
        }
        return -1;
    } 
}
