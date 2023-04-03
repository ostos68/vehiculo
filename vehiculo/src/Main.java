import com.miguel.concesionario.prueba1.*;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();
        Concesionario consecionario = new Concesionario();
        consecionario.setVehiculo(Arrays.asList(coche,moto));
        for (Vehiculo vehiculo:consecionario.getVehiculo()){
            System.out.println(vehiculo.getClass());
        }
    }
}