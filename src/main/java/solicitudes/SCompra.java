/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import com.fasterxml.jackson.annotation.JsonProperty;
import usuarios.Usuario;
import vehiculos.Vehiculo;

public class SCompra extends Solicitud  {
    
    private Vehiculo carro;
    private String tramite;

    public SCompra(
            @JsonProperty("carro") Vehiculo carro, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario
    ) {
        super(remitente, destinatario, TipoSolicitud.COMPRA);
        this.carro = carro;
        this.tramite = "compra";
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario.getNombres()+"\n Por medio de la presente le informo mi interes por comprar el vehiculo  "+carro.getMarca()+" "+carro.getModelo()+" que actualmente tienen en el catalogo");
    
    }
}