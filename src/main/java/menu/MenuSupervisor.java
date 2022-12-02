package menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import solicitudes.*;
import store.AppState;
import util.Print;
import usuarios.*;
import vehiculos.*;

public class MenuSupervisor {
    public static void show(Scanner scanner, ArrayList<Usuario> usuarios, ArrayList<Vehiculo> vehiculosMain, Usuario userLoggedIn) throws IOException {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeSupervisor();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 5);
            
            if (opcion == 1) {
                consultarSolicitudesDeCompra(userLoggedIn, scanner);
            }
            
            if (opcion == 2) {
                vendidosVendedor(scanner,usuarios);
            }
            
            if (opcion == 3) {
                crearVehiculo(scanner, vehiculosMain);
            }
            
            if (opcion == 4) {
                Usuario usuarioCreado = crearUsuario(scanner);
                usuarios.add(usuarioCreado);
            }
            
            if (opcion == 5) {
                usuarioDeseaSalir = true;
                AppState.setUserLoggedIn(null);
            }
        }
    }
    
    public static void consultarSolicitudesDeCompra(Usuario userLoggedIn, Scanner scanner) {
        boolean continuarLeyendo = true;
        System.out.println("############ SOLICITUDES DE COMPRA ############");
        ArrayList<Solicitud> bandejaEntrada = userLoggedIn.getSolicitudes();
        
        while (!bandejaEntrada.isEmpty() && continuarLeyendo) {
            Solicitud solicitud = bandejaEntrada.get(0);
            solicitud.imprimir();
            
            bandejaEntrada.remove(0);
            
            System.out.println("Por favor, seleccione: 1. Leer otro mensaje | 2. Salir");
            float opcion = Menu.solicitarNumero(scanner, "Ingrese su opción: ", 1, 2);
            
            if (opcion == 2) {
                continuarLeyendo = false;
            }
            
            if (bandejaEntrada.isEmpty()) {
                System.out.println("No hay más mensajes por ahora.");
            }
        }

        userLoggedIn.setSolicitudes(bandejaEntrada);
    }
    
    public static void vendidosVendedor(Scanner scanner, ArrayList<Usuario> usuarios) {
        System.out.println("""
                           |===============================================|
                           |       INGRESE EL ID DEL VENDEDOR BUSCADO      |
                           |===============================================|""");
        String idBuscado = scanner.nextLine();
        for (Usuario i: usuarios){
            if (i instanceof Vendedor == true){
                Vendedor vendedor =(Vendedor)i;
                if (vendedor.getId().equals(idBuscado)==true){
                    System.out.println("El " + vendedor.getNombres()+ " vendió un total de "
        + vendedor.getVendidos() + ".");
                }
                else{
                     System.out.println("No se encontro vendedor con ese id ");
                }
        
        
            }
        }
    }
    
    public static void crearVehiculo(Scanner scanner, ArrayList<Vehiculo> vehiculosMain) throws IOException {
        boolean usuarioDeseaSalir = false;
        Vehiculo vehiculoCreado = null;
        
        while (!usuarioDeseaSalir && vehiculoCreado == null) {
            Print.tiposDeVehiculo();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 5);
            
            if (opcion == 1) {
                vehiculoCreado = MenuIngreso.iAutomovil();
                vehiculosMain.add(vehiculoCreado);
            }
            
            if (opcion == 2) {
                vehiculoCreado = MenuIngreso.iCamion();
                vehiculosMain.add(vehiculoCreado);
            }
            
            if (opcion == 3) {
                vehiculoCreado = MenuIngreso.iMotocicleta();
                vehiculosMain.add(vehiculoCreado);
            }
            
            if (opcion == 4) {
                vehiculoCreado = MenuIngreso.iTractor();
                vehiculosMain.add(vehiculoCreado);
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
