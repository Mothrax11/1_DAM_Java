package juegoDeLaVida;

public class JuegoDeLaVida {
    private boolean [] casillas;
    private boolean [] newCasillas;

    public JuegoDeLaVida (int casillas){
        this.casillas = new boolean[casillas];
        this.newCasillas = new boolean[casillas];
        this.casillas [casillas / 2 + 1] = true;
    }

    public void avanzar(){
        newCasillas[0] = casillas[1];
        for (int k = 1; k < casillas.length - 1; k++){
            if (!casillas[k - 1] && casillas[k + 1] || casillas[k - 1] && !casillas[k + 1]){
                newCasillas[k] = true;
            } else {
                newCasillas[k] = false;
            }
        }
        newCasillas[newCasillas.length - 1] = casillas[casillas.length - 2];
        copyNewCasillas(newCasillas);
    }

    private void copyNewCasillas (boolean [] newCasillas){
        if (casillas[1]){
            casillas[0] = true;
        }
        if (casillas[casillas.length - 1]){
            casillas[casillas.length - 1] = true;
        }

        for (int i = 0; i < this.casillas.length; i++){
            this.casillas[i] = newCasillas[i];
        }
    }

    public String ver(){
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < this.casillas.length; k++){
            if (!casillas[k]){
                sb.append(".");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
