package piedraPapelTijera;

/**
 * Esta clase representa una serie de partidas del ju8ego piedra-papel-tijera
 */
public class ppt {
    private static String [] nombres = new String [] {"Piedra", "Papel", "Tijera"};

    /** Numero de partidas ganadas */
    private int ganadas;

    /** Numero de partidas perdidas */
    private int perdidas;

    /** Numero de partidas empatadas */
    private int empatadas;

    public ppt () {
        ganadas = 0;
        perdidas = 0;
        empatadas = 0;
    }

    public String getNombre (int indice){
        return nombres[indice];
    }

    /**
     * Jugar una partida de piedra-papel-tijera
     * @param humano Lo que saca el jugador humano (0 = piedra, 1 = papel, 2 = tijera)
     * @return Lo que saca el jugador ordenador (0 = piedra, 1 = papel, 2 = tijera)
     */

    private static boolean ganaOrdenador(int humano, int ordenador){
        /* Ordenador = Piedra y Humano = tijera*/
        if (ordenador == 0 && humano == 2){
            return true;
        }
        /* Ordenador = Papel y Humano = Piedra */
        if (ordenador == 1 && humano == 0){
            return true;
        }
        /* Ordenador = Tijera y Humano = Papel */
        if (ordenador == 2 && humano == 1){
            return true;
        }
        return ordenador == 2 && humano == 1;
    }

    public int sacar (int humano){
        int ordenador = (int)(Math.random() * 3);

        if (ordenador == humano) {
            empatadas++;
        } else if (ganaOrdenador(humano,ordenador)) {
            perdidas++;
        } else {
            ganadas++;
        }
        return ordenador;
    }

    public marcador getMarcador () {
        return new marcador(ganadas, perdidas, empatadas);
    }
}
