/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import usuarios.Usuario;
import vehiculos.Vehiculo;

public class SCompra extends Solicitud  {
    
    private Vehiculo carro;
    private String tramite;

    public SCompra(Vehiculo carro, Usuario remitente, Usuario destinatario) {
        super(remitente, destinatario);
        this.carro = carro;
        this.tramite = "compra";
    }
    
    @Override
    public void imprimir(){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente le informo mi interes por comprar el vehiculo  "+carro.getMarca()+" "+carro.getModelo()+" que actualmente tienen en el catalogo");
    
    }
}