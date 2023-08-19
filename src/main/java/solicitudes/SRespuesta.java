/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import com.fasterxml.jackson.annotation.JsonProperty;
import usuarios.Usuario;
import vehiculos.*;


/**
 *
 * @author USER
 */
public class SRespuesta extends Solicitud{
    public String tramite;
    public double precio;
    public Vehiculo carro;

    public SRespuesta(
            @JsonProperty("tramite") String tramite, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario
    ) {
        super(remitente, destinatario, TipoSolicitud.RESPUESTA);
        this.tramite = tramite;
    }
    public SRespuesta(
            @JsonProperty("tramite") String tramite, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario,
            @JsonProperty("precio") double precio
    ) {
        super(remitente, destinatario, TipoSolicitud.RESPUESTA);
        this.tramite = tramite;
        this.precio = precio;
    }
    public SRespuesta(
            @JsonProperty("tramite") String tramite, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario,
            @JsonProperty("carro") Vehiculo carro
    ) {
        super(remitente, destinatario, TipoSolicitud.RESPUESTA);
        this.tramite = tramite;
        this.carro = carro;
    }
    
    @Override
    public void imprimir(){
        if (precio == 0.0){
    System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada");
            }
        if (precio != 0.0){
    System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada y tendra un costo de "+precio+"centavos por kilometro");
            }
        
        if(carro != null){ 
            if(carro instanceof Automovil == true){
                Automovil carro2 =(Automovil) carro;
            System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada y este el precio del vehiculo"+carro2.getPrecio()        
       +"marca " +carro2.getMarca()+"modelo"+carro2.getModelo()+"Año "+carro2.getYear()+"combustible"+ carro2.getCombustible()+"Convertible"+carro2.getConvertible()+"Asientos"+carro2.getAsientos());
            }
            if(carro instanceof Camion == true){
            Camion carro2 =(Camion) carro;
            System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada y este el precio del vehiculo"+carro2.getPrecio()        
       +"marca " +carro2.getMarca()+"modelo"+carro2.getModelo()+"Año "+carro2.getYear()+"combustible"+ carro2.getCombustible()+"Ejes"+carro2.getEjes()+"Capacidad de carga "+carro2.getCarga());
            }
            if(carro instanceof Tractor == true){
            Tractor carro2 =(Tractor) carro;
            System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada y este el precio del vehiculo"+carro2.getPrecio()        
       +"marca " +carro2.getMarca()+"modelo"+carro2.getModelo()+"Año "+carro2.getYear()+"combustible"+ carro2.getCombustible()+"Agricola"+carro2.getAgricola()+"tipo de tranmision"+carro2.getTransmision());
            }
            if(carro instanceof Motocicleta == true){
            Motocicleta carro2 =(Motocicleta) carro;
            System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada y este el precio del vehiculo"+carro2.getPrecio()        
       +"marca " +carro2.getMarca()+"modelo"+carro2.getModelo()+"Año "+carro2.getYear()+"combustible"+ carro2.getCombustible()+"llantas"+carro2.getLlantas()+"tipo de Motocicleta"+carro2.getTipoMoto());
            }
          
        }
    }   
}
    