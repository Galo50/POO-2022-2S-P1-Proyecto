package menu;

import java.util.Scanner;
import util.Print;

public class MenuCliente {
    public static void show(Scanner scanner) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeCliente();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 6);
            
            if (opcion == 1) {
                consultarStock();
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
    
    public static void consultarStock() {
        // TODO
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
