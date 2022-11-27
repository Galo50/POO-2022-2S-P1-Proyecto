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
public class Automovil extends Vehiculo {
    
    private int asientos;
    private boolean convertible;
    private boolean camara;

    public Automovil(
        @JsonProperty("asientos") int asientos,
        @JsonProperty("convertible") boolean convertible, 
        @JsonProperty("camara") boolean camara, 
        @JsonProperty("year") int year, 
        @JsonProperty("marca") String marca, 
        @JsonProperty("llantas") int llantas, 
        @JsonProperty("modelo") String modelo,
        @JsonProperty("precio") Double precio,
        @JsonProperty("combustible") VehiculoCombustible combustible,
        @JsonProperty("estado") VehiculoEstado estado
    ) {
        super(year, marca ,modelo, precio, combustible, estado);
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

    public boolean getConvertible() {
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
