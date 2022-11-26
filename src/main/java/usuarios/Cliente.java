/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.util.ArrayList;
import vehiculos.Vehiculo;
import solicitudes.*;
import java.util.Random;

/**
 *
 * @author USER
 */
public class Cliente extends Usuario {
    private final int cedula;
    private final String ocupacion;
    private final double ingresos;
    private ArrayList<Vehiculo> carros;

    public Cliente(int cedula, String ocupacion, double ingresos, String userName, String contraseña, String nombres, String apellidos, ArrayList BanEntrada) {
        super(userName, contraseña, nombres, apellidos, BanEntrada);
        this.cedula = cedula;
        this.ocupacion = ocupacion;
        this.ingresos = ingresos;
    }
    
    public void Cotizacion(Vehiculo carro, String tramite, Usuario remitente, ArrayList<Vendedor> listaVendedores) {
        Random rand = new Random();
        int randomPosition = rand.nextInt(listaVendedores.size());
        SCotizacion sc1 = new SCotizacion(carro, tramite, remitente, listaVendedores.get(randomPosition));
        listaVendedores.get(randomPosition).solicitudes.add(sc1);
    }

    public int getCedula() {
        return cedula;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public double getIngresos() {
        return ingresos;
    }   
    
    public void consultarStock(ArrayList<Vehiculo> carrosDisponibles) {
        System.out.println("############ CATÁLOGO DE VEHÍCULOS EN STOCK ############");
        for (Vehiculo i: carrosDisponibles) {
            System.out.println("Marca: " + i.getMarca() + "\nModelo: " + i.getModelo() + "\nAño de Fabricación: " + i.getYear() + "\n");
        }
    }
    
    public void verCarrosCliente() {
        System.out.println("############ VEHÍCULOS DEL CLIENTE ############");
        for (Vehiculo i: this.carros) {
            System.out.println("Marca: " + i.getMarca() + "\nModelo: " + i.getModelo() + "\nAño de Fabricación: " + i.getYear() + "\n");
        }
    }
    
    public void solicitudesCliente() {
        System.out.println("############ LISTA DE SOLICITUDES ############");
        for(Solicitud i: this.solicitudes) {
            System.out.println(i);
        }
    }
    
    public void solicitarMantenimiento(Vehiculo carro, String tipoMantenimiento, Usuario remitente, JefeTaller jefeTaller) {
        String tramite = "MANTENIMIENTO";
        SMantenimiento sm1 = new SMantenimiento(tramite, tipoMantenimiento, carro, remitente, jefeTaller);
        
    }
    
    public String consultarEstado(Vehiculo carro) {
        return carro.getEstado();
    }
}
