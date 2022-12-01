/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;
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
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculosMain) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeVendedor();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 4);
            
            if (opcion == 1) {
                accesoStock(vehiculosMain);
            }
            
            if (opcion == 2) {
                
            }
            
            if (opcion == 3) {
                
            }
            
            usuarioDeseaSalir = opcion == 4;
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
    
    public static void bandejaDeEntrada(Usuario userLoggedIn) {
        System.out.println("############ BANDEJA DE ENTRADA ############");
        for (Solicitud i: userLoggedIn.getSolicitudes()) {
            
        }
    }
}