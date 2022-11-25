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
public class SEstado extends Solicitud{
    private Vehiculo carro;

    public SEstado(Vehiculo carro, Usuario remitente, Usuario destinatario) {
        super(remitente, destinatario);
        this.carro = carro;
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente le informo que el vehiculo "+carro.getMarca()+" "+carro.getModelo() +" le fueron realizadas todas las reparaciones respectivas y puede cambiar al estado \"A prueba\"");
    
    }
}
