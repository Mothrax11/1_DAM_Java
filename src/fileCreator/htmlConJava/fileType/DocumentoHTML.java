package fileCreator.htmlConJava.fileType;

import fileCreator.htmlConJava.*;
import fileCreator.htmlConJava.content.*;


public class DocumentoHTML extends Documento {
    private final ElementoConContenido body;

    public DocumentoHTML (String title) {
        super(new ElementoConContenido("html"));
        body = new ElementoConContenido("body");

        final ElementoConContenido raiz = (ElementoConContenido) getRaiz();

        final ElementoSinContenido meta1 = new ElementoSinContenido("meta", true);
        final ElementoConContenido titulo = new ElementoConContenido("title");
        final ElementoConContenido head = new ElementoConContenido("head");
        final ElementoConContenido body = new ElementoConContenido("body");

        raiz.anadirContenido(head);
        raiz.anadirContenido(body);
        head.anadirContenido(titulo);

        head.anadirContenido(meta1);

        try {
            meta1.anadirAtributo("charset", "UTF-8");
        } catch (Exception e) {
            System.out.println("Error");
        }

        titulo.anadirContenido(new PCdata(title));
    }

    public void anadirContenido(Contenido c) {
        body.anadirContenido(c);
    }
}