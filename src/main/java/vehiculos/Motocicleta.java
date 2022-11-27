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
public class Motocicleta extends Vehiculo {

    private TipoMoto tipoMoto;

    public Motocicleta(
        @JsonProperty("tipo") TipoMoto tipoMoto, 
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
            combustible,
            estado,
            TipoVehiculo.MOTOCICLETA
        );
        this.tipoMoto = tipoMoto;
        this.llantas = 2;
    }

    public TipoMoto getTipoMoto() {
        return this.tipoMoto;
    }

    public void setTipo(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
    
    
}
