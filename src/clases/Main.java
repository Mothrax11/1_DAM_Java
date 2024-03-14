package clases;


public class Main {

    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.dia = 01;
        f.mes = 06;
        f.ano = 2004;
        Fecha f2;
        f2 = new Fecha();
        f2.dia = 01;
        f2.mes = 01;
        f2.ano = 2000;

        System.out.println(f.dia);
        System.out.println(f.mes);
        System.out.println(f.ano);
        System.out.println("-------------");
        System.out.println(f2.dia);
        System.out.println(f2.mes);
        System.out.println(f2.ano);
        System.out.println("-------------");
        System.out.println("-------------");
        f2 = f;
        System.out.println(f.dia);
        System.out.println(f.mes);
        System.out.println(f.ano);
        System.out.println("-------------");
        System.out.println(f2.dia);
        System.out.println(f2.mes);
        System.out.println(f2.ano);

    }
}
