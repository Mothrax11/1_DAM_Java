package SecuenciaDeCaracteres;

    public class Main {
        public static void main(String[] args) {
    SDC sdc = new SDC("8 + 4 *(14 / 2");
    Lexico lx = new Lexico(sdc);
    Sintactico sin = new Sintactico(lx);

    /*while (lx.mirar () != -1){
        System.out.println(lx.mirar());
        lx.avanzar();
        }
        */
            System.out.println(sin.getResultado());
    }
}
