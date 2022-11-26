
import java.util.ArrayList;
import solicitudes.SRechazo;
import solicitudes.SRespuesta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class main {
        public void resolucionCot(boolean aceptacion){
        if (aceptacion == true){
        SRespuesta mensaje1 = new SRespuesta(tramite, destinatario, remitente) ;
        ArrayList BandejaCliente = destinatario.getSolicitudes();
        BandejaCliente.add(mensaje1);
}
         if (aceptacion == false){
         String justificacion = "***********************";
         SRechazo mensaje1 =  new SRechazo(justificacion,tramite,remitente,destinatario);
         ArrayList BandejaCliente = destinatario.getSolicitudes();
         BandejaCliente.add(mensaje1);
         }  
        
    }
        
         public void resolucionCompra(boolean aceptacion){
        if (aceptacion == true){
        SRespuesta mensaje1 = new SRespuesta(tramite, destinatario, remitente) ;
        ArrayList BandejaCliente = destinatario.getSolicitudes();
        BandejaCliente.add(mensaje1);
}
         if (aceptacion == false){
         String justificacion = "***********************";
         SRechazo mensaje1 =  new SRechazo(justificacion,tramite,remitente,destinatario);
         ArrayList BandejaCliente = destinatario.getSolicitudes();
         BandejaCliente.add(mensaje1);
}
    }
}

}
