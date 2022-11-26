/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import com.fasterxml.jackson.annotation.JsonProperty;
import usuarios.Usuario;
import vehiculos.Vehiculo;


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
        super(remitente, destinatario);
        this.tramite = tramite;
    }
    public SRespuesta(
            @JsonProperty("tramite") String tramite, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario,
            @JsonProperty("precio") double precio
    ) {
        super(remitente, destinatario);
        this.tramite = tramite;
        this.precio = precio;
    }
    public SRespuesta(
            @JsonProperty("tramite") String tramite, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario,
            @JsonProperty("carro") Vehiculo carro
    ) {
        super(remitente, destinatario);
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
        }
    }
    