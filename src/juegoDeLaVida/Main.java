package juegoDeLaVida;

public class Main {
    public static void main(String[] args) {
        final JuegoDeLaVida j = new JuegoDeLaVida(150);
        System.out.println(j.ver());

        for (int k = 0; k < 50; k++){
            j.avanzar();
            System.out.println(j.ver());
        }
    }
}
