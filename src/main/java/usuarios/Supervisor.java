/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import solicitudes.Solicitud;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Supervisor extends Usuario {
    private ArrayList<String> certificaciones;

    public Supervisor(ArrayList<String> certificaciones, String userName, String password, String nombres, String apellidos, ArrayList<Solicitud> solicitudes) {
        super(userName, password, nombres, apellidos, solicitudes);
        this.certificaciones = certificaciones;
    }

   
    }
    
 

