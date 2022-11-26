/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import solicitudes.Solicitud;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Supervisor extends Usuario {
    private ArrayList<String> certificaciones;

    public Supervisor(
            @JsonProperty("certificaciones") ArrayList<String> certificaciones,
            @JsonProperty("userName") String userName,
            @JsonProperty("password") String password,
            @JsonProperty("nombres") String nombres,
            @JsonProperty("apellidos") String apellidos,
            @JsonProperty("solicitudes") ArrayList<Solicitud> solicitudes) {
        super(userName, password, nombres, apellidos, solicitudes, TipoUsuario.SUPERVISOR);
        this.certificaciones = certificaciones;
    }
}
    
 

