package MiTresEnRaya;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        
        try{
            final InputStream f = new FileInputStream("ResultadosPartidas.txt");
            int x = f.read();
            
            while (x >= 0){
                System.out.print((char) x);
                x = f.read();
            }
            f.close();
        } catch (FileNotFoundException e){
            System.out.println("Not found");
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println("I/O Exception");
            System.out.println(e.getMessage());
        }
    }    
}