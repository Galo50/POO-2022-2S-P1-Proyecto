/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

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

    public SCotizacion(Vehiculo carro, Usuario remitente, Vendedor destinatario) {
        super(remitente, destinatario);
        this.carro = carro;
        this.tramite = "cotizacion";
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente le solicito una cotizacion del vehiculo "+carro.getMarca()+" "+carro.getModelo());
    
    }
    

    
}
