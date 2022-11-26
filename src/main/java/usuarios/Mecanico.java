/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.util.ArrayList;
import vehiculos.Vehiculo;

/**
 *
 * @author USER
 */
public class Mecanico extends Usuario{
    
    private ArrayList<Vehiculo> carrosMecanico;

    public Mecanico(ArrayList<Vehiculo> carrosMecanico, String userName, String password, String nombres, String apellidos, ArrayList solicitudes) {
        super(userName, password, nombres, apellidos, solicitudes);
        this.carrosMecanico = carrosMecanico;
    }

    public ArrayList<Vehiculo> getCarrosMecanico() {
        return carrosMecanico;
    }

    public void setCarrosMecanico(ArrayList<Vehiculo> carrosMecanico) {
        this.carrosMecanico = carrosMecanico;
    }
            
    
    
}
