package MiTresEnRaya;

public class TresEnRaya extends Plantilla {
    private int tablero[][] = new int [3][3];
    private int countEmpate = 0;
    private boolean reset = false;
    private boolean exit = false;
    private boolean inicio = false;

    @Override
    public boolean getReset(){
        return this.reset;
    }
    @Override
    public boolean getExit(){
        return this.exit;
    }

    @Override
    public boolean getInicio(){
        return this.inicio;
    }  

    @Override
    public String verTablero(){
        StringBuilder sb2 = new StringBuilder();
            for(int fila = 0; fila < tablero.length;  fila++){
                if (fila == 0){
                    sb2.append("o-------------------o");
                    sb2.append("\n");
                }

                for(int i = 0; i < tablero[fila].length;i++){
                    if (i == 0){    
                        sb2.append("| ");
                    }
                    
                    sb2.append("[ ");

                    if (tablero[fila][i] == 0) {
                        sb2.append(". ");
                    }

                    if (tablero[fila][i] == -1) {
                        sb2.append("X ");
                    } else if (tablero[fila][i] == 1) {
                        sb2.append("O ");
                    }    
                    
                    sb2.append("] ");

                    if (i == tablero[fila].length - 1) {
                        sb2.append("| ");
                    }
                }

                if (fila == tablero.length - 1){
                    sb2.append("\n");
                    sb2.append("o-------------------o");
                }
                sb2.append("\n");
            }
        return sb2.toString();
    }

    @Override
    public void iniciar(String start){
        if (start.equalsIgnoreCase("S")) {
            inicio = true;
            return;
        }
    }

    @Override
    public void hacerMovimiento(String move){


            if (move.equalsIgnoreCase("R")){
                reset = true;
                return;
            }
            if (move.equalsIgnoreCase("E")) {
                exit = true;
                return;
            }

        int movimiento = 0;

        Integer x = Integer.valueOf(move);
        movimiento = x.intValue();

        int poss = 1;
        for (int fila = 0; fila < tablero.length; fila++){
            for (int columna = 0; columna < tablero[fila].length; columna++){
                if (poss == movimiento && tablero[fila][columna] == 0 && turno){
                    tablero[fila][columna] = 1;
                    turno = !turno;
                } else if (poss == movimiento && tablero [fila][columna] == 0 && !turno){
                    tablero[fila][columna] = -1;
                    turno = !turno;
                }   
               poss++;
            }
        }
    }
    
    @Override
    public boolean getTurn(){
        return super.getTurno();    
    }

    @Override
    public int verSiGana(){
        int jugadorActual = turno ? -1 : 1;

         // Comprobación de filas
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] == jugadorActual && tablero[fila][1] == jugadorActual && tablero[fila][2] == jugadorActual) {
                return 1;
            }
        }

        // Comprobación de columnas
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] == jugadorActual && tablero[1][columna] == jugadorActual && tablero[2][columna] == jugadorActual) {
                return 1;
            }
    
        }

        // Comprobación de diagonal principal
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return 1;
        }

        // Comprobación de diagonal secundaria
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return 1;
        }

        for (int k = 0; k < tablero.length; k++) {
            for (int i = 0; i < tablero[k].length; i++) {
                if (tablero[k][i] == 0) {
                    countEmpate++;
                }
            }
        }

        if (countEmpate == 0) {
            return 0;
        }
        countEmpate = 0;

        return -1;
    }
    
    @Override
    public String esGanador(){

        if(verSiGana() == -1){
            return "No hay ganador";
        }

        if (verSiGana() == 1){
            if (getTurn() == true){
                return "¡Ha ganado X!";
            } else {
                return "¡Ha ganado O!";
            }
        }

        if (verSiGana() == 0){
            return "Hay un empate";
        }

        return null;
    }
}