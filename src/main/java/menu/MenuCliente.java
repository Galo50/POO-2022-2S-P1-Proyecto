package menu;

import java.util.ArrayList;
import java.util.Scanner;
import util.Print;
import usuarios.*;
import vehiculos.Vehiculo;
import vehiculos.VehiculoEstado;

public class MenuCliente {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculosMain, Usuario userLoggedIn) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeCliente();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 7);
            
            if (opcion == 1) {
                consultarStock(vehiculosMain);
            }
            
            if (opcion == 2) {
                consultarVehiculosAquiridos(userLoggedIn);
            }
            
            if (opcion == 3) {
                visualizarVehiculosAdquiridos();
            }
            
            if (opcion == 4) {
                consultarCotizaciones();
            }
            
            if (opcion == 5) {
                consultarMantenimientos();
            }
            
            if (opcion == 6) {
                solicitarMantenimiento();
            }
            
            usuarioDeseaSalir = opcion == 7;
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
    
    public static void consultarVehiculosAquiridos(Usuario userLoggedIn) {
        // TODO
        Cliente clienteLoggedIn = (Cliente)userLoggedIn;
        System.out.println("############ CATÁLOGO DE VEHÍCULOS ADQUIRIDOS ############");
        for (Vehiculo i: clienteLoggedIn.getCarros()) {
            System.out.println("Marca: " + i.getMarca() +
                    "\nModelo: " + i.getModelo() +
                    "\nAño de Fabricación: " + i.getYear() +
                    "\nEstado del Vehículo: " + i.getEstado() +
                    "\nCombustible: " + i.getCombustible() +
                    "\nTipo de Vehículo: " + i.getTipo());
        }
    }
    
    public static void visualizarVehiculosAdquiridos() {
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
