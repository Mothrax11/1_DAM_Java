package fileCreator.htmlConJava.content;


import java.io.PrintWriter;

public class ElementoSinContenido extends Elemento {
    private final boolean cerrar;

    public ElementoSinContenido (String nombre, boolean c) {
        super(nombre);
        this.cerrar = c;
    }

    @Override
    public void imprimir (PrintWriter p, int sangrado) {
        imprimirApertura(p, sangrado, cerrar);
    }
}