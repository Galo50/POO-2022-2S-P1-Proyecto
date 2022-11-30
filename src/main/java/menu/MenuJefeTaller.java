package menu;

import java.util.ArrayList;
import java.util.Scanner;
import solicitudes.SEntrega;
import solicitudes.Solicitud;
import usuarios.Cliente;
import usuarios.JefeTaller;
import util.Print;
import vehiculos.Vehiculo;
import vehiculos.VehiculoEstado;

public class MenuJefeTaller {
    public static void show(Scanner scanner, ArrayList<Vehiculo> vehiculos, ArrayList<Vehiculo> carrosMantenimiento,JefeTaller jefe) {
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.opcionesDeJefeTaller();
            
            float opcion = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1, 4);
            
            if (opcion == 1) {
                
                entregarVehiculos(scanner, vehiculos,jefe);
            }
            
            if (opcion == 2) {
                consultarMantenimientos(carrosMantenimiento);
            }
            
            if (opcion == 3) {
                consultarSolicitudesDeMantenimiento( jefe);
            }
            
            usuarioDeseaSalir = opcion == 4;
        }
    }
    
    
    public static void entregarVehiculos(Scanner scanner, ArrayList<Vehiculo> vehiculosParaEntregar,JefeTaller jefe) {
        
        scanner=(int) scanner;
        Vehiculo carro = vehiculosParaEntregar[scanner];
        SEntrega se1 = new SEntrega(carro,jefe,cliente);
        ArrayList<Solicitud> solicitudesCliente = cliente.getSolicitudes();
        solicitudesCliente.add(se1);
        cliente.setSolicitudes(solicitudesCliente);
    }
     
    
    public static void consultarMantenimientos(ArrayList<Vehiculo> carrosMantenimiento) {
        System.out.println("Actualmente existen "+carrosMantenimiento.size()+"vehiculos en el taller");
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
    public  ArrayList <Vehiculo> darAlta (Vehiculo carro, ArrayList <Vehiculo> mantenimientos,Cliente cliente,JefeTaller jefe){
        mantenimientos.remove(carro);
        carro.setEstado(VehiculoEstado.ENTREGADO);
        SEntrega se1 = new SEntrega(carro,jefe,cliente);
        ArrayList<Solicitud> solicitudesCliente = cliente.getSolicitudes();
        solicitudesCliente.add(se1);
        cliente.setSolicitudes(solicitudesCliente);
        return mantenimientos;   
    }
    public void AdministrarMantenimiento(Vehiculo carro){
        carro.setEstado(VehiculoEstado.PRUEBA);
    }
}