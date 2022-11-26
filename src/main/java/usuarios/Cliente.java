/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import vehiculos.*;
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

    public Cliente(
            @JsonProperty("cedula") int cedula, 
            @JsonProperty("ocupacion") String ocupacion, 
            @JsonProperty("ingresos") double ingresos, 
            @JsonProperty("userName") String userName, 
            @JsonProperty("password") String password, 
            @JsonProperty("nombres") String nombres, 
            @JsonProperty("apellidos") String apellidos, 
            @JsonProperty("solicitudes") ArrayList<Solicitud> solicitudes
    ) {
        super(userName, password, nombres, apellidos, solicitudes);
        this.cedula = cedula;
        this.ocupacion = ocupacion;
        this.ingresos = ingresos;
    }
    
    public void solicitarCotizacion(Vehiculo carro, Usuario remitente, ArrayList<Vendedor> listaVendedores) {
        Random rand = new Random();
        int randomPosition = rand.nextInt(listaVendedores.size());
        SCotizacion sc1 = new SCotizacion(carro, remitente, listaVendedores.get(randomPosition));
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
    
    public void drawVehicles(ArrayList<Vehiculo> carrosDisponibles) {
        System.out.println("############ GRAFICACIÓN DE VEHÍCULOS EN STOCK ############");
        for (Vehiculo i: carrosDisponibles) {
            if (i instanceof Automovil) {
                System.out.println("""
                                     ______
                                    /|_||_\\`.__
                                   (   _    _ _\\
                                   =`-(_)--(_)-' """);
                System.out.println("\n");
            }
            if (i instanceof Camion) {
                System.out.println("""
                                      o_______________}o{
                                      |              |   \\
                                      |    911       |____\\_____
                                      | _____        |    |_o__ |
                                      [/ ___ \\       |   / ___ \\|
                                     []_/.-.\\_\\______|__/_/.-.\\_[]
                                        |(O)|             |(O)|
                                         '-'   ScS         '-'""");
                System.out.println("\n");
            }
            if (i instanceof Motocicleta) {
                System.out.println("""
                                      ,
                                   .-/c-.,::  
                                   (_)'==(_)""");
                System.out.println("\n");
            }
            if (i instanceof Tractor) {
                System.out.println("""
                                         /\\  ,-,---,
                                        //\\\\/|_|___|  Y
                                    ,__//  \\\\|/``\\ |--'-q  _
                                     \\_/    {( () ) {(===t||
                                              \\__/````\\_/  \\ """);
                System.out.println("\n");
            }
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
    
    public void solicitarMantenimiento(Vehiculo carro, String tipoMantenimiento, Cliente remitente, JefeTaller jefeTaller) {
        SMantenimiento sm1 = new SMantenimiento(tipoMantenimiento, carro, remitente, jefeTaller);
        jefeTaller.solicitudes.add(sm1);
    }
    
    public String consultarEstado(Vehiculo carro) {
        return carro.getEstado();
    }
}
