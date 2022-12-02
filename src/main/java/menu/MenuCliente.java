package menu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import store.AppState;
import solicitudes.*;
import util.Print;
import usuarios.*;
import vehiculos.*;

public class MenuCliente {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculosMain, Usuario userLoggedIn, ArrayList<Usuario> usuariosMain) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeCliente();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 8);
            
            if (opcion == 1) {
                consultarStock(scanner, vehiculosMain);
            }
            
            if (opcion == 2) {
                consultarVehiculosAquiridos(userLoggedIn);
            }
            
            if (opcion == 3) {
                visualizarVehiculosAdquiridos(scanner, vehiculosMain, userLoggedIn);
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
                bandejaDeEntrada(userLoggedIn, scanner);
            }
            
            if (opcion == 8) {
                usuarioDeseaSalir = true;
                AppState.setUserLoggedIn(null);
            }
        }
    }
    
    public static void consultarStock(Scanner scanner, ArrayList<Vehiculo> vehiculosMain) {
        // TODO
        float readStock = 1;
        String mensaje = """
                         ¿Desea seguir leyendo la siguiente página?
                         1. Sí
                         2. No
                         """;
        System.out.println("############ CATÁLOGO DE VEHÍCULOS EN STOCK ############");
        for (Vehiculo i: vehiculosMain) {
            if (readStock == 1) {
                if (i.getEstado() == VehiculoEstado.INVENTARIO && vehiculosMain.indexOf(i) + 1 != vehiculosMain.size()) {
                    System.out.println("Marca: " + i.getMarca()
                            + "\nModelo: " + i.getModelo()
                            + "\nAño de Fabricación: " + i.getYear()
                            + "\n----- Página: " + vehiculosMain.indexOf(i) + " -----\n");
                    readStock = Menu.solicitarNumero(scanner, mensaje, 1, 2);
                }
                if (vehiculosMain.indexOf(i) + 1 == vehiculosMain.size() && i.getEstado() == VehiculoEstado.INVENTARIO) {
                    System.out.println("Marca: " + i.getMarca()
                            + "\nModelo: " + i.getModelo()
                            + "\nAño de Fabricación: " + i.getYear()
                            + "\n----- Página: " + vehiculosMain.indexOf(i) + " -----\n");
                }
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
    
    public static void visualizarVehiculosAdquiridos(Scanner scanner, ArrayList<Vehiculo> vehiculosMain, Usuario userLoggedIn) {
        // TODO
        if (userLoggedIn.getTipo() == TipoUsuario.CLIENTE) {
            float readStock = 1;
            String mensaje = """
                         ¿Desea seguir graficando vuestros autos?
                         1. Sí
                         2. No
                         """;
            Cliente c1 = (Cliente)userLoggedIn;
            for (Vehiculo i: c1.getCarros()) {
                if (readStock == 1) {
                    if (i.getTipo() == TipoVehiculo.AUTOMOVIL) {
                        Print.drawAutomovil();
                        readStock = Menu.solicitarNumero(scanner, mensaje, 1, 2);
                    }
                    if (i.getTipo() == TipoVehiculo.CAMION) {
                        Print.drawCamion();
                        readStock = Menu.solicitarNumero(scanner, mensaje, 1, 2);
                    }
                    if (i.getTipo() == TipoVehiculo.MOTOCICLETA) {
                        Print.drawMotocicleta();
                        readStock = Menu.solicitarNumero(scanner, mensaje, 1, 2);
                    }
                    if (i.getTipo() == TipoVehiculo.TRACTOR) {
                        Print.drawTractor();
                        readStock = Menu.solicitarNumero(scanner, mensaje, 1, 2);
                    } 
                }
            }
        }
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
    public static void bandejaDeEntrada(Usuario userLoggedIn, Scanner scanner) {
        // TODO
        boolean continuarLeyendo = true;
        System.out.println("############ BANDEJA DE ENTRADA ############");
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
}
