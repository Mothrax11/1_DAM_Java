package SecuenciaDeCaracteres;

public class Lexico {
    private SDC sdc;
    private int token;

    public Lexico(SDC sdc) {
        this.sdc = sdc;
        avanzar();
    }

    public int mirar() {
        return token;
    }

    public void avanzar() {

        while (sdc.mirar() == ' ') {
            sdc.avanzar();
        }

        if (sdc.mirar() <= '0' || sdc.mirar() >= '9') {
            this.token = traducir();
            sdc.avanzar();
        } else {
            int ac = 0;
            while (sdc.mirar() >= '0' && sdc.mirar() <= '9') {
                ac = ac * 10 + sdc.mirar() - '0';
                sdc.avanzar();
                this.token = ac;
            }
        }
    }

    public int traducir() {

        if (sdc.mirar() == '+') {
            return -3;
        } else if (sdc.mirar() == '-') {
            return -4;
        } else if (sdc.mirar() == '*') {
            return -5;
        } else if (sdc.mirar() == '/') {
            return -6;
        } else if (sdc.mirar() == '(') {
            return -7;
        } else if (sdc.mirar() == ')') {
            return -8;
        } else if (sdc.mirar() == -1) {
            return -1;
        } else {
            return -2;
        }
    }
}


