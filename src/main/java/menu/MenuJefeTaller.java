package menu;

import java.util.ArrayList;
import java.util.Scanner;
import solicitudes.*;
import store.AppState;
import usuarios.Cliente;
import usuarios.JefeTaller;
import usuarios.Mecanico;
import usuarios.Usuario;
import util.Print;
import vehiculos.Vehiculo;
import vehiculos.VehiculoEstado;

public class MenuJefeTaller {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculos, ArrayList<Usuario> usuarios, Usuario userLoggedIn) {
        JefeTaller jefe = (JefeTaller)userLoggedIn;
        ArrayList<Vehiculo> carrosMantenimiento =jefe.getCarrosMantenimiento();
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeJefeTaller();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 7);
            
            if (opcion == 1) {
                
                entregarVehiculos(vehiculos,jefe);
            }
            
            if (opcion == 2) {
                consultarMantenimientos(carrosMantenimiento);
            }
            
            if (opcion == 3) {
                consultarSolicitudesDeMantenimiento( jefe);
            }
            
            if (opcion == 4) {
                darAlta(carrosMantenimiento, jefe);
            }
            if (opcion == 5){
                administrarMantenimiento(scanner,jefe,carrosMantenimiento);
            }
            if (opcion == 6 ){
                asignarMecanico(scanner,usuarios,vehiculos);
            
            }
            
            if (opcion == 7) {
                usuarioDeseaSalir = true;
                AppState.setUserLoggedIn(null);
            }
            
        }
    }
    
    
    public static void entregarVehiculos(ArrayList<Vehiculo> vehiculosParaEntregar,JefeTaller jefe) {
        ArrayList<Solicitud> jefeSolicitudes = jefe.getSolicitudes();
        for (Solicitud i : jefeSolicitudes){
            if(i instanceof SRespuesta == true ){
                Usuario cliente = i.getDestinatario();
                SEntrega se1 = new SEntrega(jefe,cliente);
                ArrayList<Solicitud> solicitudesCliente = cliente.getSolicitudes();
                solicitudesCliente.add(se1);
                cliente.setSolicitudes(solicitudesCliente);
            }        
        }       
        
    }
     
    
    public static void consultarMantenimientos(ArrayList<Vehiculo> carrosMantenimiento) {
        if (carrosMantenimiento.isEmpty()) {
            System.out.println("No hay mantenimientos.");
        }
        
        if (!carrosMantenimiento.isEmpty()) {
            System.out.println("Actualmente existen "+carrosMantenimiento.size()+"vehiculos en el taller");
        }
    }
    
    public static void consultarSolicitudesDeMantenimiento(JefeTaller jefe) {
        System.out.println("############ LISTA DE SOLICITUDES ############");
        ArrayList<Solicitud> solicitudesJefe = jefe.getSolicitudes();
        for (Solicitud i: solicitudesJefe) {
            i.imprimir();
            solicitudesJefe.remove(i);
        }
       jefe.setSolicitudes(solicitudesJefe); 
    }
    public static  void darAlta ( ArrayList <Vehiculo> mantenimientos,JefeTaller jefe){
        ArrayList<Solicitud> jefeSolicitudes = jefe.getSolicitudes();
        for (Solicitud i : jefeSolicitudes){
            if(i instanceof SMantenimiento == true ){
                SMantenimiento sm1 = (SMantenimiento) i;
                Vehiculo carro = sm1.getCarro();
                Cliente cliente= carro.getPropietario();
                mantenimientos.remove(carro);
                carro.setEstado(VehiculoEstado.ENTREGADO);
                SEntrega se1 = new SEntrega(jefe,cliente);
                ArrayList<Solicitud> solicitudesCliente = cliente.getSolicitudes();
                solicitudesCliente.add(se1);
                cliente.setSolicitudes(solicitudesCliente);
              
            }
        }
    }    
    public static void administrarMantenimiento(Scanner scanner ,JefeTaller jefe,ArrayList<Vehiculo> carros){
        System.out.print("""
                         ############ SOLICITUD CAMBIO DE ESTADO ############
                         Indique la posicion del vehículo a cambiar 
                         de estado: """);
        
        float position = Menu.solicitarNumero(scanner, Print.ingresarOpcion,0,carros.size()-1);
        int posicion = (int)position;
        Vehiculo carro = carros.get(posicion);
        carro.setEstado(VehiculoEstado.PRUEBA);
    }
    
    public static void asignarMecanico(Scanner scanner, ArrayList<Usuario> usuarios,ArrayList<Vehiculo> carros) {
         System.out.print("""
                         ############ ASIGNACION DE MECANICO ############
                         Indique la posicion del vehículo a asignar: """);
        
        float position = Menu.solicitarNumero(scanner, Print.ingresarOpcion,0,carros.size()-1);
        int posicion = (int)position;
        Vehiculo carro = carros.get(posicion);
        for (Usuario i: usuarios){
            if (i instanceof Mecanico == true){
                Mecanico mecanico = (Mecanico)i;        
                ArrayList<Vehiculo> carrosMecanico= mecanico.getCarros();
                carrosMecanico.add(carro);
                mecanico.setCarros(carrosMecanico);
            
           }
       }        
    }
}