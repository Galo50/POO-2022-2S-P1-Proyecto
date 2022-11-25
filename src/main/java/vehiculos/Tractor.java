/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class Tractor extends Vehiculo {
    
    private boolean agricola;
    private String transmision;
    private enum transmision{HIDRAULICA,MECANICA};

    public Tractor(boolean agricola, String transmision, int year, String marca, String combustible, String modelo, Double precio,String estado) {
        super(year, marca, combustible, modelo, precio, estado);
        this.agricola = agricola;
        this.transmision = transmision;
        this.llantas = 4;
    }

    public boolean isAgricola() {
        return agricola;
    }

    public void setAgricola(boolean agricola) {
        this.agricola = agricola;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
    
   