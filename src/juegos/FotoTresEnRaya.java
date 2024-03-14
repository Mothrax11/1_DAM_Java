package juegos;

/* 
    public class FotoTresEnRaya extends Foto{
        private int tablero[] =  new int[8]; 

    public FotoTresEnRaya (){
        this ();
    }
    
    public FotoTresEnRaya (int tablero[], boolean turno) {
        super(turno);
        this.tablero[8] = tablero[8];
        
    }

    @Override
    public int [] getMovimientos(){
        int ceros = 0;
        for (int k = 0; k < tablero.length; k++){
            if (tablero[k] == 0){
                ceros++;
            }
        }

        int moves[] = new int[ceros];
        int puntero = 0;

        for (int k = 0; k < tablero.length; k++) {
            if (tablero[k] == 0){
                moves[puntero] = k;
                puntero++;
            }
        }
        return moves;
    }
    
    @Override
    public boolean haGanadoA(){

            if ((tablero[0] == -1 && tablero[1] == -1 && tablero[2] == -1)
                ||(tablero[0] == 1 && tablero[1] == 1 && tablero[2] == 1)){
                    return super(getTurno());

            } else if (
                (tablero[3] == -1 && tablero[4] == -1 && tablero[5] == -1)
                ||(tablero[3] == 1 && tablero[4] == 1 && tablero[5] == 1)){
                    return super(getTurno());

            } else if (
                (tablero[6] == -1 && tablero[7] == -1 && tablero[8] == -1)
                ||(tablero[6] == 1 && tablero[7] == 1 && tablero[8] == 1)) {
                    return super(getTurno());

            } else if (
                (tablero[0] == -1 && tablero[3] == -1 && tablero[6] == -1)
                ||(tablero[0] == 1 && tablero[3] == 1 && tablero[6] == 1)) {
                    return super(getTurno());

            } else if (
                (tablero[1] == -1 && tablero[4] == -1 && tablero[7] == -1)
                || (tablero[1] == 1 && tablero[4] == 1 && tablero[7] == 1)) {
                    return super(getTurno());

            } else if (
                (tablero[2] == -1 && tablero[5] == -1 && tablero[8] == -1)
                || (tablero[2] == 1 && tablero[5] == 1 && tablero[8] == 1)) {
                    return super(getTurno());

            } else if (
                (tablero[0] == -1 && tablero[4] == -1 && tablero[8] == -1)
                ||(tablero[0] == 1 && tablero[4] == 1 && tablero[8] == 1)) {
                    return super(getTurno());

            } else if (
                (tablero[2] == -1 && tablero[4] == -1 && tablero[6] == -1)
                || (tablero[2] == 1 && tablero[4] == 1 && tablero[6] == 1)) {
                    return super(getTurno());
                }
        }
    }
    */
