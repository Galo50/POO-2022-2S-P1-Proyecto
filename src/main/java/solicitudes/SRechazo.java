/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import com.fasterxml.jackson.annotation.JsonProperty;
import usuarios.Usuario;

/**
 *
 * @author USER
 */
public class SRechazo extends Solicitud {
    private String justificacion;
    private String tramiteRechazado;

    public SRechazo(
            @JsonProperty("justificacion") String justificacion, 
            @JsonProperty("tramite") String tramite, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario
    ) {
        super(remitente, destinatario, TipoSolicitud.RECHAZO);
        this.justificacion = justificacion;
        this.tramiteRechazado = tramite;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario.getNombres()+"\n Por medio de la presente se le informa que su solicitud de "+tramiteRechazado+" fue rechazada por el siguiente motivo:\n"+justificacion);
    }
}
    
    
