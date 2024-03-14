package cronometro;

public class Cronometro {

    private Cronometro [] chrono;
    private long time;
    private long t;
    private long t1970 = System.currentTimeMillis();

    public Cronometro (int cantidad){
        this.chrono  = new Cronometro[cantidad];
        this.time = System.currentTimeMillis();
    } 

    public long reset (int n) {
        this.chrono[n].time = 0;
        return this.time;
    }

    public void resetTodos(){
        for (int k = 0; k < this.chrono.length; k++) {
            this.reset(k);
        }
    }

    public long peek (int n){
        return System.currentTimeMillis() - t;
    }

    public long stop (int n){
        long tms =System.currentTimeMillis();

        return tms;
    }

    public long start (int n){
        t = System.currentTimeMillis() - t1970;
        return t;
    }


}
