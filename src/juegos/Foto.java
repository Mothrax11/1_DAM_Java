package juegos;

    public abstract class Foto {
        public abstract Foto [] getMovimientos();
        public abstract boolean haGanadoA();
        private final boolean turno;

    public Foto(boolean parametro){
        this.turno = parametro;
    }

    public boolean getTurno(){
        return turno;
    }
}
