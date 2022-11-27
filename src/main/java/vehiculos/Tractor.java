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
public class Tractor extends Vehiculo {
    
    private boolean agricola;
    private VehiculoTransmision transmision;

    public Tractor(
        @JsonProperty("agricola") boolean agricola, 
        @JsonProperty("transmision") VehiculoTransmision transmision, 
        @JsonProperty("year") int year, 
        @JsonProperty("marca") String marca, 
        @JsonProperty("combustible") VehiculoCombustible combustible, 
        @JsonProperty("modelo") String modelo, 
        @JsonProperty("precio") Double precio,
        @JsonProperty("estado") VehiculoEstado estado
    ) {
        super(
            year, 
            marca,
            modelo, 
            precio, 
            VehiculoCombustible.DIESEL, 
            estado,
            TipoVehiculo.TRACTOR
        );
        this.agricola = agricola;
        this.transmision = transmision;
        this.llantas = 4;
    }

    public boolean getAgricola() {
        return agricola;
    }

    public void setAgricola(boolean agricola) {
        this.agricola = agricola;
    }

    public VehiculoTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(VehiculoTransmision transmision) {
        this.transmision = transmision;
    }
}
    
   