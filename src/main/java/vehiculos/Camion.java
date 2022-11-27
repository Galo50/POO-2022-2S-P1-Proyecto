/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author USER
 */
public class Camion extends Vehiculo {
    private int carga;
    private int ejes;

    public Camion (
        @JsonProperty("carga") int carga, 
        @JsonProperty("llantas") int llantas, 
        @JsonProperty("year") int year, 
        @JsonProperty("marca") String marca, 
        @JsonProperty("combustible") VehiculoCombustible combustible, 
        @JsonProperty("modelo") String modelo, 
        @JsonProperty("precio") Double precio,
        @JsonProperty("estado") VehiculoEstado estado
    ) {
        super(year, marca, modelo, precio, combustible, estado, TipoVehiculo.CAMION);
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

