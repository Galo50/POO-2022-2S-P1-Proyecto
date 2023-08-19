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
    public Vehiculo vehiculo;

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
        this.vehiculo = carro;
    }
    
    @Override
    public void imprimir(){
        if (precio == 0.0){
    System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada");
            }
        if (precio != 0.0){
    System.out.println("Estimado "+destinatario.getNombres()+" "+destinatario.getApellidos()+"\n Por medio de la presente se le informa que su solicitud de "+tramite+" fue aceptada y tendra un costo de "+precio+"centavos por kilometro");
            }
        
        if(vehiculo != null){ 
            System.out.println(
                "Estimado "+destinatario.getNombres()
                +" "+destinatario.getApellidos()
                +"\n Por medio de la presente se le informa que su solicitud de "
                +tramite+" fue aceptada y este el precio del vehiculo"
                +vehiculo.getPrecio()
                +"marca " +vehiculo.getMarca()
                +"modelo"+vehiculo.getModelo()
                +"Año "+vehiculo.getYear()
                +"combustible"+ vehiculo.getCombustible()
            );
        }
    }   
}
    
