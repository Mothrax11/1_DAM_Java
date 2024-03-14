package SecuenciaDeCaracteres;

public class Sintactico {
    private double resultado;
    private Lexico lex;
    public Sintactico (Lexico lex){
        this.lex = lex;
        this.resultado = expresion();
    }

    private double factor(){
        int factor = lex.mirar();
        if (factor >= 0) {
        } else if (factor != -7){
            throw new Error("Esperaba factor, encontré " + factor);
        } else {
            lex.avanzar();
            if(lex.mirar() != -8) {
                throw new Error("Esperaba ), encontré " + lex.mirar());
            }
        }
        lex.avanzar();
        return factor;
    }

    private double sumando(){
        double z = factor();
        int signo = lex.mirar();

        while (signo == -5 || signo == -6){
            lex.avanzar();
            double otro = sumando();

            if (signo == -5){
                lex.avanzar();
                z = z * otro;

            } else {
                lex.avanzar();
                z = z / otro;
            }
            signo = lex.mirar();
        }
        return z;
    }

    private double expresion(){
        double z = sumando();
        int signo = lex.mirar();

        while (signo == -3 || signo == -4){
            lex.avanzar();
            double otro = sumando();

            if (signo == -3){
                z = z + otro;
            } else {
                z = z - otro;
            }
            signo = lex.mirar();
        }
        return z;
    }
    public double getResultado() {
        return resultado;
    }
}
