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
public class JefeTaller extends Usuario{
    private ArrayList certificacionTecnica;

    public JefeTaller(ArrayList certificacionTecnica, String userName, String password, String nombres, String apellidos, ArrayList<Solicitud> solicitudes) {
        super(userName, password, nombres, apellidos, solicitudes);
        this.certificacionTecnica = certificacionTecnica;
    }
    
    public ArrayList getCertificaciones() {
        return this.certificacionTecnica;
    }
}
