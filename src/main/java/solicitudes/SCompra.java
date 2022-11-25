/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import usuarios.Usuario;
import vehiculos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SCompra extends Solicitud  {
    
    private Vehiculo carro;
    private String tramite;

    public SCompra(Vehiculo carro, String tramite, Usuario remitente, Usuario destinatario) {
        super(remitente, destinatario);
        this.carro = carro;
        this.tramite = tramite;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente le informo mi interes por comprar el vehiculo  "+carro.getMarca()+" "+carro.getModelo()+" que actualmente tienen en el catalogo");
    
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
