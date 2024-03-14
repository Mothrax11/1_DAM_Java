package cronometro;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cronometro chrn = new Cronometro(4);
        System.out.println(chrn.start(2));
        Thread.sleep(2000);
        System.out.println(chrn.peek(2));
        Thread.sleep(2000);
        System.out.println(chrn.stop(2));
        
    }
}
