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
public class SRecomendacion extends Solicitud{
    private Vehiculo carro;
    private int posicionVehiculo;

    public SRecomendacion(
            @JsonProperty("carro") Vehiculo carro, 
            @JsonProperty("posicionVehiculo") int posicionVehiculo, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario
    ) {
        super(remitente, destinatario, TipoSolicitud.RECOMENDACION);
        this.carro = carro;
        this.posicionVehiculo = posicionVehiculo;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario.getNombres()+"\n Por medio de la presente le recomiendo este vehiculo "+carro.getMarca()+" "+carro.getModelo() +" ya que puede estar mas apegado a sus gustos");
    
    }
    
}
