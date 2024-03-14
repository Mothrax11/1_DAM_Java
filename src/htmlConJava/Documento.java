package htmlConJava;

import java.io.PrintWriter;

public class Documento implements Imprimible{
    private final Elemento raiz;

    public Documento(Elemento r){
        this.raiz = r;
    }

    @Override
    public void imprimir(PrintWriter p, int sangrado){
        raiz.imprimir(p, sangrado);
    }
    
}
