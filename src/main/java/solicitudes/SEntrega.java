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
public class SEntrega extends Solicitud{
     

    public SEntrega(
           
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario
    ) {
        super(remitente, destinatario, TipoSolicitud.ENTREGA);
        
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario.getNombres()+"\n Por medio de la presente le informo que su vehiculo puede ser retirado a partir del dia de mañana en nuestro local");
    
    }
}
