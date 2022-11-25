/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import usuarios.Usuario;
import usuarios.Vendedor;
import vehiculos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SCotizacion extends Solicitud{
    private Vehiculo carro;
    private String tramite;

    public SCotizacion(Vehiculo carro, String tramite, Usuario remitente, Vendedor destinatario) {
        super(remitente, destinatario);
        this.carro = carro;
        this.tramite = tramite;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente le solicito una cotizacion del vehiculo "+carro.getMarca()+" "+carro.getModelo());
    
    }
    
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
    
}
