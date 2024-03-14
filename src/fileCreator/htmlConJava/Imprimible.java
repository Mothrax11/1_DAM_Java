package fileCreator.htmlConJava;

import java.io.PrintWriter;

public abstract class Imprimible {
    private static int espacios = 2;
    public abstract void imprimir(PrintWriter p, int sangrado);
    
    public static String sangrar(String texto, int sangrado) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sangrado * espacios; i++) {
            sb.append(" ");
        }

        return sb.toString() + texto;
    }

    public static String CambiadorEspeciales(String s){
        
            s.replace("<", "&lt");
            s.replace(">", "&gt");
            s.replace("\"", "&quot");
            s.replace("'", "&apos");
            s.replace("&", "&amp");
            
        return s;
    } 

    public static void setEspacios(int espacios) {
        Imprimible.espacios = espacios;
    }
}