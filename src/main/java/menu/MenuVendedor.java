/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;
import store.AppState;
import solicitudes.*;
import usuarios.*;
import util.Print;
import vehiculos.Vehiculo;
import vehiculos.VehiculoEstado;
/**
 *
 * @author Todos :v
 */
public class MenuVendedor {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculosMain, Usuario userLoggedIn) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeVendedor();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 5);
            
            if (opcion == 1) {
                accesoStock(vehiculosMain);
            }
            
            if (opcion == 2) {
                bandejaDeEntrada(userLoggedIn, scanner);
            }
            
            if (opcion == 3) {
                
            }
            
            if (opcion == 4) {
                
            }
            
            if (opcion == 5) {
                usuarioDeseaSalir = true;
                AppState.setUserLoggedIn(null);
            }
        }
    }
    
    public static void accesoStock(ArrayList<Vehiculo> vehiculosMain) {
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
    
    public static void bandejaDeEntrada(Usuario userLoggedIn, Scanner scanner) {
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