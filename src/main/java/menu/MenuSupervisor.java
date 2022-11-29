/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;
import util.Print;
import usuarios.*;
import vehiculos.*;

/**
 *
 * @author USER
 */
public class MenuSupervisor {
    public static void show(Scanner scanner) {
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
                
            }
            
            usuarioDeseaSalir = opcion == 4;
        }
    }
    
    public static void consultarSolicitudesDeCompra() {
        
    }
    
    public static Vehiculo crearVehiculo(Scanner scanner) {
        boolean usuarioDeseaSalir = false;
        Vehiculo vehiculoCreado = null;
        
        while (!usuarioDeseaSalir && vehiculoCreado != null) {
            Print.tiposDeVehiculo();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 5);
            
            if (opcion == 1) {
                
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
        
        while (!usuarioDeseaSalir && usuarioCreado != null) {
            Print.tiposDeUsuario();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 6);
            
            if (opcion == 1) {
                usuarioCreado = MenuUsuario.crearCliente(scanner);
            }
            
            if (opcion == 2) {
                usuarioCreado = MenuUsuario.crearJefeTaller(scanner);
            }
            
            if (opcion == 3) {
                usuarioCreado = MenuUsuario.crearMecanico();
            }
            
            if (opcion == 4) {
                usuarioCreado = MenuUsuario.crearSupervisor();
            }
            
            if (opcion == 5) {
                usuarioCreado = MenuUsuario.crearVendedor();
            }
            
            usuarioDeseaSalir = opcion == 6;
        }
        
        return usuarioCreado;
    }
}
