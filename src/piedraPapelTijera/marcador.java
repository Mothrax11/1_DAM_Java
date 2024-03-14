
package piedraPapelTijera;

/**
 * Marcador de una serie de partidas de piedra-papel-tijera
 * Cuenta las partidas ganadas, perdidas y empatadas
 */
public class marcador {

    /** Numero de partidas ganadas */
    private int ganadas;

    /** Numero de partidas perdidas */
    private int perdidas;

    /** Numero de partidas empatadas */
    private int empatadas;

    public marcador(int g, int p, int e){
        this.ganadas = g;
        this.perdidas = p;
        this.empatadas = e;
    }

    /**
     * Getter para el numero de partidas ganadas
     * @return El numero de partidas ganadas
     */
    public int getGanadas(){
        return this.ganadas;
    }

    /**
     * Getter para el numero de partidas perdidas
     * @return El numero de partidas perdidas
     */
    public int getPerdidas(){
        return this.perdidas;
    }

    /**
     * Getter para el numero de partidas empatadas
     * @return El numero de partidas empatadas
     */
    public int getEmpatadas(){
        return this.empatadas;
    }

    /**
     * Getter para el numero TOTAL de partidas, da igual el resultado
     * @return El numero TOTAL de partidas
     */
    public int getTotal(){
        return this.ganadas + this.perdidas + this.empatadas;
    }

}



