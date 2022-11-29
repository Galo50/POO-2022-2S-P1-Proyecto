package menu;

import java.util.ArrayList;
import java.util.Scanner;
import util.Print;
import vehiculos.Vehiculo;
import vehiculos.VehiculoEstado;

public class MenuCliente {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculosMain) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeCliente();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 6);
            
            if (opcion == 1) {
                consultarStock(vehiculosMain);
            }
            
            if (opcion == 2) {
                consultarVehiculosAquiridos();
            }
            
            if (opcion == 3) {
                consultarCotizaciones();
            }
            
            if (opcion == 4) {
                consultarMantenimientos();
            }
            
            if (opcion == 5) {
                solicitarMantenimiento();
            }
            
            usuarioDeseaSalir = opcion == 6;
        }
    }
    
    public static void consultarStock(ArrayList<Vehiculo> vehiculosMain) {
        // TODO
        System.out.println("############ CATÁLOGO DE VEHÍCULOS EN STOCK ############");
        for (Vehiculo i: vehiculosMain) {
            if (i.getEstado() == VehiculoEstado.INVENTARIO) {
                System.out.println("Marca: " + i.getMarca()
                        + "\nModelo: " + i.getModelo()
                        + "\nAño de Fabricación: " + i.getYear() + "\n");
            }
        }
    }
    
    public static void consultarVehiculosAquiridos() {
        // TODO
    }
    
    public static void consultarCotizaciones() {
        // TODO
    }
    
    public static void consultarMantenimientos() {
        // TODO
    }
    
    public static void solicitarMantenimiento() {
        // TODO
    }
    
}
