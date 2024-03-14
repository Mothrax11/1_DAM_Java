package fileCreator.htmlConJava;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import fileCreator.htmlConJava.content.*;
import fileCreator.htmlConJava.fileType.*;

public class Main {
    public static void main(String[] args) {
        DocumentoHTML d = new DocumentoHTML("Pelayo Putero");
        PCdata element = new PCdata("Full Box Full Piece");
        d.anadirContenido(element);
        try {
            OutputStream f1 = new FileOutputStream("PP.html");
            BufferedOutputStream f2 = new BufferedOutputStream(f1);
            OutputStreamWriter f3 = new OutputStreamWriter(f2, "UTF-8");
            PrintWriter f = new PrintWriter(f3);

            d.imprimir(f, 0);

            f.close();
            f3.close();
            f2.close();
            f1.close();

        } catch (FileNotFoundException fnf) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException ioe) {
            System.out.println("jodiose esto");}}
}