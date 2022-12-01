package menu;

import java.util.ArrayList;
import java.util.Scanner;
import util.Print;
import util.Guardar;
import usuarios.*;
import vehiculos.*;

public class MenuSupervisor {
    public static void show(Scanner scanner, ArrayList<Usuario> usuarios) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeSupervisor();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 4);
            
            if (opcion == 1) {
                consultarSolicitudesDeCompra();
            }
            
            if (opcion == 2) {

            }
            
            if (opcion == 3) {
                Usuario usuarioCreado = crearUsuario(scanner);
                usuarios.add(usuarioCreado);
            }
            
            usuarioDeseaSalir = opcion == 4;
        }
    }
    
    public static void consultarSolicitudesDeCompra() {
        
    }
    
    public static void crearVehiculo(Scanner scanner, ArrayList<Vehiculo> vehiculosMain) {
        boolean usuarioDeseaSalir = false;
        Vehiculo vehiculoCreado = null;
        
        while (!usuarioDeseaSalir && vehiculoCreado == null) {
            Print.tiposDeVehiculo();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 5);
            
            if (opcion == 1) {
                vehiculosMain.add(MenuIngreso.iAutomovil());
                Guardar.vehiculos(vehiculosMain);
                
            }
            
            if (opcion == 2) {
                
            }
            
            if (opcion == 3) {
                
            }
            
            if (opcion == 4) {
                
            }
            
            usuarioDeseaSalir = opcion == 5;
        }
    }
    
    public static Usuario crearUsuario(Scanner scanner) {
        boolean usuarioDeseaSalir = false;
        Usuario usuarioCreado = null;
        
        while (!usuarioDeseaSalir && usuarioCreado == null) {
            Print.tiposDeUsuario();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 6);
            
            if (opcion == 1) {
                usuarioCreado = MenuUsuario.crearCliente(scanner);
            }
            
            if (opcion == 2) {
                usuarioCreado = MenuUsuario.crearJefeTaller(scanner);
            }
            
            if (opcion == 3) {
                usuarioCreado = MenuUsuario.crearMecanico(scanner);
            }
            
            if (opcion == 4) {
                usuarioCreado = MenuUsuario.crearSupervisor(scanner);
            }
            
            if (opcion == 5) {
                usuarioCreado = MenuUsuario.crearVendedor(scanner);
            }
            
            usuarioDeseaSalir = opcion == 6;
            
            if (usuarioCreado != null) {
                Print.seHaCreadoUnNuevoUsuario();
            }
        }
        
        return usuarioCreado;
    }
}
