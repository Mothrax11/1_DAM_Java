package htmlConJava;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.security.cert.CertPathChecker;
import java.util.Locale.Category;
import java.io.InputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ElementoConContenido html = new ElementoConContenido("html");
        Documento d = new Documento(html);        

        try{
            OutputStream f1 = new FileOutputStream("x.html");
            BufferedOutputStream f2 = new BufferedOutputStream(f1);
            OutputStreamWriter f3 = new OutputStreamWriter(f2);
            PrintWriter f = new PrintWriter(f3);

            d.imprimir(f, 0);
            f.close();
            f3.close();
            f2.close();
            f1.close();
            
            } catch (FileNotFoundException e){
                System.out.println("AAAAH!");
            } catch (IOException E){
                System.out.println("EEEEH!");
        }
    }
}

