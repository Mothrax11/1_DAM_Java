package MiTresEnRaya;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player; 
        Plantilla pl = new TresEnRaya();
        String eleccion = "";
        String decision = "";
        String inputMove = "";


        System.out.println("¿Quieres iniciar una partida de 3 en raya?  S/N : ");
        decision = sc.nextLine();
        pl.iniciar(decision);
        if (pl.getInicio()){
            do {
                Plantilla pl2 = new TresEnRaya();
                pl = pl2;
                System.out.println("");
                System.out.println("¡Vamos a jugar una partida de 3 en raya!");
                System.out.println("- Si ves que la partida va a terminar en un empate, pulsa la tecla 'R' para reiniciar.");
                System.out.println("- Si no quieres jugar más, pulsa la tecla 'E' para salir del juego.");
                

                System.out.println("En que posición quieres iniciar la partida:");
                while (pl.verSiGana() == -1){
                
                if (pl.getTurno() == true) {
                    player = "O";
                } else {
                    player = "X";
                }

                System.out.println("Turno de " + player);
                System.out.println(pl.verTablero());
                try {
                    inputMove = sc.nextLine();
                    Plantilla gameReset = new TresEnRaya();
                    pl.hacerMovimiento(inputMove);
                    if (pl.getExit()){
                        System.out.println("Saliendo del juego");
                        System.exit(0);
                    }

                    if (pl.getReset()){
                        pl = gameReset;
                        System.out.println("¡Vamos a jugar una partida de 3 en raya!");
                        System.out.println("En que posición quieres iniciar la partida:");
                        };
                    }    catch (NumberFormatException er ) {
                    System.err.println("¡DEBES ELEGIR UN NUMERO ENTRE 1 O 9!");
                    System.out.println("Turno de " + player);
                    inputMove = sc.nextLine();
                    pl.hacerMovimiento(inputMove);
                    System.out.println(pl.verTablero());
                }
                pl.verSiGana();
            }
            System.out.println(pl.verTablero());
            System.out.println(pl.esGanador());
            System.out.println("");
            System.out.print("Ha terminado la partida, ¿Quieres reiniciar y jugar otra? S/N : ");
            eleccion = sc.nextLine();
            } while(eleccion.equalsIgnoreCase("S"));
            sc.close();
        }
    }
}