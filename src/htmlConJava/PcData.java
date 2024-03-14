package htmlConJava;

import java.io.PrintWriter;

public class PcData implements Contenido {
    private final String texto;

    public PcData (String s){
        this.texto = s;
    }


    @Override
    public void imprimir(PrintWriter p, int sangrado){
        p.println(texto);
    }
    
}
