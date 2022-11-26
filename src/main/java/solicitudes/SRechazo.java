/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import usuarios.Usuario;

/**
 *
 * @author USER
 */
public class SRechazo extends Solicitud {
    private String justificacion;
    private String tramiteRechazado;

    public SRechazo(String justificacion, String tramite, Usuario remitente, Usuario destinatario) {
        super(remitente, destinatario);
        this.justificacion = justificacion;
        this.tramiteRechazado = tramite;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente se le informa que su solicitud de "+tramiteRechazado+" fue rechazada por el siguiente motivo:\n"+justificacion);
    
    }
}
    
    
