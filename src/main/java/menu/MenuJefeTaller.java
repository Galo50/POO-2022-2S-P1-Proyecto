package menu;

import java.util.ArrayList;
import java.util.Scanner;
import util.Print;
import vehiculos.Vehiculo;

public class MenuJefeTaller {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculos) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeJefeTaller();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 4);
            
            if (opcion == 1) {
                entregarVehiculos(scanner, vehiculos);
            }
            
            if (opcion == 2) {
                consultarMantenimientos();
            }
            
            if (opcion == 3) {
                consultarSolicitudesDeMantenimiento();
            }
            
            usuarioDeseaSalir = opcion == 4;
        }
    }
    
    public static void entregarVehiculos(Scanner scanner, ArrayList<Vehiculo> vehiculosParaEntregar) {
        // TODO
    }
    
    public static void consultarMantenimientos() {
        // TODO
    }
    
    public static void consultarSolicitudesDeMantenimiento() {
        // TODO
    }
}
