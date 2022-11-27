/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import vehiculos.Vehiculo;
import solicitudes.*;

/**
 *
 * @author USER
 */
public class Mecanico extends Usuario{

    private ArrayList<Vehiculo> carros;

    public ArrayList<Vehiculo> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Vehiculo> carros) {
        this.carros = carros;
    }

    public Mecanico(
            @JsonProperty("userName") String userName,
            @JsonProperty("password") String password,
            @JsonProperty("nombres") String nombres, 
            @JsonProperty("apellidos") String apellidos, 
            @JsonProperty("solicitudes") ArrayList<Solicitud> solicitudes,
            @JsonProperty("carroMecanico") ArrayList<Vehiculo> carros
            ) 
            {
        super(userName, password, nombres, apellidos, solicitudes, TipoUsuario.MECANICO);
        this.carros = carros;
    }
   
    public void verCarrosMecanico() {
        System.out.println("############ VEHÍCULOS DEL MECÁNICO ############");
        for (Vehiculo i: this.carros) {
            System.out.println("Marca: " + i.getMarca() + "\nModelo: " + i.getModelo() + "\nAño de Fabricación: " + i.getYear() + "\n");
        }
    }
    
}
