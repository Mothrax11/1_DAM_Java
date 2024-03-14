package ejercicioCola;

public class Main {

    public static void main(String[] args) {
            Cola cl = new Cola();
           System.out.println(cl.pop());
           System.out.println(cl.cuantos());
           cl.push(42);
           cl.push(28);
           System.out.println(cl.cuantos());
           System.out.println(cl.pop());
           System.out.println(cl.cuantos());
           cl.push(14);
           System.out.println(cl.pop());
           cl.vaciar();
           System.out.println(cl.cuantos());
           System.out.println(cl.pop());
    }
}
