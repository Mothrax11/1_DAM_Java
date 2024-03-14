package fileCreator.htmlConJava.content;

import java.io.PrintWriter;

import fileCreator.htmlConJava.*;

public class PCdata extends Contenido{
    private final String texto;

    public PCdata (String t) {
        this.texto = t;
    }

    @Override
    public void imprimir(PrintWriter p, int sangrado) {
        p.println(Imprimible.sangrar(texto, sangrado));
    }
}