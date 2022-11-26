/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Random;
import solicitudes.Solicitud;
import vehiculos.Vehiculo;

/**
 *
 * @author USER
 */
public class JefeTaller extends Usuario{
    private ArrayList<String> certificacionTecnica;

    public JefeTaller(
            @JsonProperty("certificacionTecnica") ArrayList<String> certificacionTecnica,
            @JsonProperty("userName") String userName,
            @JsonProperty("password") String password,
            @JsonProperty("nombres") String nombres, 
            @JsonProperty("apellidos") String apellidos, 
            @JsonProperty("solicitudes") ArrayList<Solicitud> solicitudes
    ) {
        super(userName, password, nombres, apellidos, solicitudes);
        this.certificacionTecnica = certificacionTecnica;
    }
    
    public ArrayList<String> getCertificaciones() {
        return this.certificacionTecnica;
    }
    
    public void setCertificaciones(ArrayList<String> certificacionTecnica) {
        this.certificacionTecnica = certificacionTecnica;
    }
    
public void asignarMecanico(Vehiculo carro, ArrayList<Mecanico> listaMecanicos) {
        Random rand = new Random();
        int randomPosition = rand.nextInt(listaMecanicos.size());
        ArrayList<Vehiculo> carrosMecanico= listaMecanicos.get(randomPosition).getCarrosMecanico();
        carrosMecanico.add(carro);
        listaMecanicos.get(randomPosition).setCarrosMecanico(carrosMecanico);
    }
    public void vehiculosMantenimiento(ArrayList<Vehiculo> carrosMantenimiento){
        System.out.println("Actualmente existen "+carrosMantenimiento.size()+"vehiculos en el taller");
        }
}
