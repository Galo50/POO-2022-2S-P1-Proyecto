/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;
import usuarios.*;
import util.Print;
import vehiculos.Vehiculo;

/**
 *
 * @author Todos xd
 */
public class MenuMecanico {
    public static void show(Scanner scanner) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeMecanico();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 2);
            
            if (opcion == 1) {

            }
            
            usuarioDeseaSalir = opcion == 2;
        }
    }
    
    public static void consultarVehiculosEnEtapaDePrueba(Usuario userLoggedIn) {
        Mecanico mecanicoLoggedIn = (Mecanico)userLoggedIn;
        System.out.println("############ CATÁLOGO DE VEHÍCULOS ADQUIRIDOS ############");
        for (Vehiculo i: mecanicoLoggedIn.getCarros()) {
            System.out.println("Marca: " + i.getMarca() +
                    "\nModelo: " + i.getModelo() +
                    "\nAño de Fabricación: " + i.getYear() +
                    "\nEstado del Vehículo: " + i.getEstado() +
                    "\nCombustible: " + i.getCombustible() +
                    "\nTipo de Vehículo: " + i.getTipo());
        }  
    }

}
