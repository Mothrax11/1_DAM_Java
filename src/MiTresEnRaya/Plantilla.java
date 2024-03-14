package MiTresEnRaya;

    public abstract class Plantilla {
        public Plantilla(){}

        public abstract String verTablero();

        public abstract void hacerMovimiento(String movimiento);
        
        public abstract void iniciar(String start);

        public abstract boolean getTurn();
        
        public abstract boolean getReset();

        public abstract boolean getExit();

        public abstract boolean getInicio();

        public abstract int verSiGana();

        public abstract String esGanador();

        public boolean turno;

        public Plantilla (boolean parametro){
            this.turno = parametro;
        }

        public boolean getTurno(){
            return turno;
        }
}
