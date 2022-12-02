/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;
import solicitudes.*;
import store.AppState;
import usuarios.*;
import util.Print;
import vehiculos.Vehiculo;

/**
 *
 * @author Todos xd
 */
public class MenuMecanico {
    public static void show(Scanner scanner,Usuario userLoggedIn,ArrayList<Usuario> usuarios) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeMecanico();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 3);
            
            if (opcion == 1) {
                consultarVehiculosEnEtapaDePrueba(userLoggedIn);
            }
            
            if (opcion == 2) {
                enviarCambioEstado(scanner,userLoggedIn, usuarios);
                        
            }
                
            if (opcion == 3) {    
                usuarioDeseaSalir = true;
                AppState.setUserLoggedIn(null);
            }
        }
    }
    
    public static void consultarVehiculosEnEtapaDePrueba(Usuario userLoggedIn) {
        Mecanico mecanicoLoggedIn = (Mecanico)userLoggedIn;
        System.out.println("############ CATÁLOGO DE VEHÍCULOS ASIGNADOS ############");
        for (Vehiculo i: mecanicoLoggedIn.getCarros()) {
            System.out.println("Marca: " + i.getMarca() +
                    "\nModelo: " + i.getModelo() +
                    "\nAño de Fabricación: " + i.getYear() +
                    "\nEstado del Vehículo: " + i.getEstado() +
                    "\nCombustible: " + i.getCombustible() +
                    "\nTipo de Vehículo: " + i.getTipo());
        }  
    }
    public static void enviarCambioEstado(Scanner scanner, Usuario userLoggedIn,ArrayList<Usuario> usuarios ) {
        /*
        for (Usuario i: usuarios){
            if (i instanceof JefeTaller == true){
                JefeTaller destinatario = (JefeTaller)i;
                 Mecanico remitente = (Mecanico) userLoggedIn;
                ArrayList<Vehiculo> carros = remitente.getCarros();
                System.out.print("""
                         ############ SOLICITUD CAMBIO DE ESTADO ############
                         Indique la posicion del vehículo a generar la
                         solicitud:""");
        
                float position = Menu.solicitarNumero(scanner, Print.ingresarOpcion,0,carros.size()-1);
                int posicion = (int)position;
                Vehiculo carroChose = carros.get(posicion);
                SEstado se1 = new SEstado(carroChose, remitente, destinatario);
                ArrayList<Solicitud> solicitudesJefe=destinatario.getSolicitudes();
                solicitudesJefe.add(se1);
                destinatario.setSolicitudes(solicitudesJefe);
                System.out.println("Solicitud enviada con éxito!");
            }
              
        }
*/
        System.out.println("Opcion en mantenimiento, vuelva mañana.");
    }
       
}