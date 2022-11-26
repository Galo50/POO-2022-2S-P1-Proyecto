/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import usuarios.Usuario;
import vehiculos.Vehiculo;

/**
 *
 * @author USER
 */
public class SRecomendacion extends Solicitud{
    private Vehiculo carro;

    public SRecomendacion(Vehiculo carro, Usuario remitente, Usuario destinatario) {
        super(remitente, destinatario);
        this.carro = carro;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente le recomiendo este vehiculo "+carro.getMarca()+" "+carro.getModelo() +" ya que puede estar mas apegado a sus gustos");
    
    }
    
}
