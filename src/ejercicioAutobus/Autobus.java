package ejercicioAutobus;

public class Autobus {   

    private int pasajeros;
    private int plazas;


    public Autobus(int capacidad){

         if (capacidad <=0){
            capacidad = 45;
         }
         plazas = capacidad;
         pasajeros=0;
    }

    public int subir(int personas){
        if (personas < 0){
            return - bajar(-personas);
        }
        final int r = Math.min(personas, plazas - pasajeros);
        pasajeros += r;
        return r;
    }

    public int bajar(int personas){
        if (personas < 0){
            return - bajar (-personas);
        }
        final int r = Math.min(personas, plazas - pasajeros);
        pasajeros -= r;

        return r;
    }

    public int pasajeros(){
        return pasajeros;
    }

    public int plazasLibres(){
        return plazas - pasajeros;
    }
}
