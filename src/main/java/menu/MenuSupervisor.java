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
                
            }
            
            if (opcion == 3) {
                
            }
            
            if (opcion == 4) {
                
            }
            
            if (opcion == 5) {
                
            }
            
            usuarioDeseaSalir = opcion == 6;
        }
        
        return usuarioCreado;
    }
    
    public static int menuSupervisor() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        listaOpciones.add(4);
        listaOpciones.add(5);
        
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |                MENÚ SUPERVISOR                |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Consultar Vendedores                        |
                           |2. Ingresar Nuevos Vehiculos                   |
                           |3. Bandeja de Solicitudes                      |
                           |4. Ingresar Usuario Nuevo                      |
                           |5. Salir                                       |
                           |-----------------------------------------------|
                           
                               -Ingrese el número de la opción a elegir- """);
        optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
            System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
            optionChose = inputJava.nextInt();
        }
        return optionChose;
    }
    
    public static int submenuUsuarioSupervisor() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        listaOpciones.add(4);
        listaOpciones.add(5);
        
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |                MENÚ SUPERVISOR                |
                           |         - OPCIÓN: INGRESAR USUARIO -          |
                           |===============================================|
                           |     Seleccione el tipo de Usuario a crear     |
                           |1. Cliente                                     |
                           |2. Jefe de Taller                              |
                           |3. Mecánico                                    |
                           |4. Vendedor                                    |
                           |                                               |
                           |5. Regresar                                    |
                           |-----------------------------------------------|
                           """);
        optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
            System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
            optionChose = inputJava.nextInt();
        }
        return optionChose;
    }
}
