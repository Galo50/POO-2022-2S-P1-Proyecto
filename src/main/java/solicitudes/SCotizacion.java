/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import com.fasterxml.jackson.annotation.JsonProperty;
import usuarios.Usuario;
import usuarios.Vendedor;
import vehiculos.Vehiculo;


/**
 *
 * @author USER
 */
public class SCotizacion extends Solicitud{
    private Vehiculo carro;
    private String tramite;

    public SCotizacion(
            @JsonProperty("carro") Vehiculo carro, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Vendedor destinatario) 
    {
        super(remitente, destinatario, TipoSolicitud.COTIZACION);
        this.carro = carro;
        this.tramite = "cotizacion";
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario.getNombres()+"\n Por medio de la presente le solicito una cotizacion del vehiculo "+carro.getMarca()+" "+carro.getModelo());
    
    }

    public TipoSolicitud getTipo() {
        return tipo;
    }

    public Usuario getRemitente() {
        return remitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public Vehiculo getCarro() {
        return carro;
    }
    

    
}
