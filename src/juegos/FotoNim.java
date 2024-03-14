package juegos;

public class FotoNim extends Foto{
    private final int palillos;
    private FotoNim fn[];
    
    public FotoNim () {
        this (13,true);
    }

    public FotoNim (int palillos, boolean turno){
        super(turno);
        this.palillos = palillos;
        this.fn = null;
    }

    @Override
    public Foto [] getMovimientos (){
        if(this.fn == null){    
            final Foto [] r = new Foto[Math.min (palillos, 3)];
            for (int k = 0; k < r.length; k++){
                r[k] = new FotoNim(palillos - 1 - k, !super.getTurno());
            }
            return r;
        } else {
            return getFotos();
        }
    }

    @Override
    public boolean haGanadoA(){
        return palillos == 0 && super.getTurno();
    }

    public Foto [] getFotos(){
        return this.fn;
    }

    @Override
    public String toString (){
        return palillos + "-" + (super.getTurno() ? "A" : "B");
    }
}
