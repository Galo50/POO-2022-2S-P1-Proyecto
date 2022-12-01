package menu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import solicitudes.*;
import util.Print;
import usuarios.*;
import vehiculos.Vehiculo;
import vehiculos.VehiculoEstado;

public class MenuCliente {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculosMain, Usuario userLoggedIn, ArrayList<Usuario> usuariosMain) {
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
                solicitarCotizaciones(scanner, vehiculosMain, userLoggedIn, usuariosMain);
            }
            
            if (opcion == 5) {
                consultarMantenimientos();
            }
            
            if (opcion == 6) {
                solicitarMantenimiento();
            }
            if (opcion == 7) {
                revisarSolicitudes();
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
                        + "\nAño de Fabricación: " + i.getYear()
                        + "\n----- Página: " + vehiculosMain.indexOf(i) + " -----\n");
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
    
    public static void solicitarCotizaciones(Scanner scanner, ArrayList<Vehiculo> vehiculosMain, Usuario userLoggedIn, ArrayList<Usuario> usuariosMain) {
        // TODO
        System.out.print("""
                         ############ SOLICITUD COTIZACIÓN ############
                         Indique la página del vehículo a generar la
                         solicitud:""");
        boolean pagVehiculo = false;
        while (!pagVehiculo) {
            if (vehiculosMain.isEmpty()) {
                System.out.println("\nNO HAY VEHÍCULOS EN STOCK!");
                pagVehiculo = true;
            }
            else {
                int opcionVehiculo = scanner.nextInt();
                if (opcionVehiculo >= 0 && opcionVehiculo < vehiculosMain.size()) {
                    ArrayList<Vendedor> vendedores = new ArrayList<>();
                    for (Usuario i : usuariosMain) {
                        if (i.getTipo() == TipoUsuario.VENDEDOR) {
                            Vendedor vUser = (Vendedor)i;
                            vendedores.add(vUser);
                        }
                    }
                    System.out.println("Encontró al vehículo: " + vehiculosMain.get(opcionVehiculo).getModelo());
                    Random rand = new Random();
                    int randomPosition = rand.nextInt(vendedores.size());
                    Vendedor destinatario = vendedores.get(randomPosition);
                    System.out.println("Encontró al vendedor: " + destinatario.getNombres());
                    Cliente remitente = (Cliente)userLoggedIn;
                    SCotizacion sc1 = new SCotizacion(vehiculosMain.get(opcionVehiculo), remitente, destinatario);
                    ArrayList<Solicitud> solicitudes = destinatario.getSolicitudes();
                    solicitudes.add(sc1);
                    destinatario.setSolicitudes(solicitudes);
                    pagVehiculo = true;
                }
                else {
                    System.out.println("No se encontró un vehículo en dicha página!");
                    pagVehiculo = true;
                }
            }
        }
    }
    
    public static void consultarMantenimientos() {
        // TODO
    }
    
    public static void solicitarMantenimiento() {
        // TODO
    }
    public static void revisarSolicitudes() {
        // TODO
    }
}
