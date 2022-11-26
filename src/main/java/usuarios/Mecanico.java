/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.util.ArrayList;
import solicitudes.Solicitud;

/**
 *
 * @author USER
 */
public class Mecanico extends Usuario{

    public Mecanico(String userName, String password, String nombres, String apellidos, ArrayList<Solicitud> solicitudes) {
        super(userName, password, nombres, apellidos, solicitudes); 
    }
    
}
