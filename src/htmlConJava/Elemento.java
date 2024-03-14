package htmlConJava;

import java.io.PrintWriter;

public class Elemento implements Contenido {
    private final String nombre;

    public Elemento (String n){
        this.nombre = n;
    }

    @Override
    public void imprimir(PrintWriter p, int sangrado){

    }

    public void imprimirApertura(PrintWriter p, int sangrado){
        p.println("<" + this.nombre + ">");
    }

    public void imprimirCierre(PrintWriter p, int sangrado){
        p.println("</"  + this.nombre + ">");
    }

}
