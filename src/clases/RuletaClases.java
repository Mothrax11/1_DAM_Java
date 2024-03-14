package clases;

public class RuletaClases {

    public static void  main(String[] args) {
        Caja c1 = new Caja ();
        Caja c2 = new Caja ();

        System.out.println(c1.mirar());
        c1.siguiente();
        System.out.println(c1.mirar());

        System.out.println(c2.mirar());
        c2.anterior();
        System.out.println(c2.mirar());
    }
}
