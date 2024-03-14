package htmlConJava;

import java.io.PrintWriter;

public class ElementoConContenido extends Elemento {

    public ElementoConContenido (String nombre){
        super(nombre);
    }

    @Override
    public void imprimir(PrintWriter p, int sangrado){
        imprimirApertura(p, sangrado);
        imprimirCierre(p, sangrado);
    }

    
}
