/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class Automovil extends Vehiculo {
    
    private int asientos;
    private boolean convertible;
    private boolean camara;

    public Automovil(int asientos, boolean convertible, boolean camara, int year, String marca, int llantas, String combustible,String modelo,Double precio,String estado) {
        super(year, marca, combustible ,modelo, precio, estado);
        this.llantas = 4;
        this.asientos = asientos;
        this.convertible = convertible;
        this.camara = camara;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }
       
}
