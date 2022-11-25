/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class Camion extends Vehiculo {
     private int carga;
    private int ejes;

    public Camion (int carga, int llantas, int year, String marca, String combustible, String modelo, Double precio,String estado) {
        super(year, marca, combustible, modelo, precio, estado);
        this.carga = carga;
        this.llantas=llantas;
        this.ejes = llantas/2;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    
}

