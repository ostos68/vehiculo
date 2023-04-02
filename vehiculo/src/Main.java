import com.miguel.concesionario.prueba1.Coche;
import com.miguel.concesionario.prueba1.Concesionario;
import com.miguel.concesionario.prueba1.Moto;
import com.miguel.concesionario.prueba1.Vehiculo;

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