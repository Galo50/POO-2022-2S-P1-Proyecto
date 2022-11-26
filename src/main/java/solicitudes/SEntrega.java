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
public class SEntrega extends Solicitud{
     private Vehiculo carro;

    public SEntrega(
            @JsonProperty("carro") Vehiculo carro, 
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario
    ) {
        super(remitente, destinatario);
        this.carro = carro;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente le informo que el vehiculo "+carro.getMarca()+" "+carro.getModelo() +" puede ser retirado a partir del dia de mañana en nuestro local");
    
    }
}
