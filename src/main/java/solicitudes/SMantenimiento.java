/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;


import java.util.ArrayList;
import usuarios.Usuario;
import vehiculos.Vehiculo;

/**
 *
 * @author USER
 */
public class SMantenimiento extends Solicitud{
    private String tramite;
    private String tipoMantenimiento;
    private Vehiculo carro;
    private enum tipoMantenimiento{PREVENTIVO, EMERGENCIA};

    public SMantenimiento( String tipoMantenimiento, Vehiculo carro, Usuario remitente, Usuario destinatario) {
        super(remitente, destinatario);
        this.tramite = "Mantenimiento";
        this.tipoMantenimiento = tipoMantenimiento;
        this.carro = carro;
    }
    
    
    @Override
    public void imprimir(){}
    
    public void imprimir(ArrayList <Vehiculo> mantenimientos){
    System.out.println("Estimado "+destinatario+"\n Por medio de la presente se le pido el ingreso de mi vehiculo "+carro.getMarca()+" "+carro.getModelo() +" al taller para un matenimiento de tipo "+tipoMantenimiento);
    carro.setEstado("Admitido");
    mantenimientos.add(carro);
    }
}
