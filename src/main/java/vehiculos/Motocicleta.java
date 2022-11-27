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

    private TipoMoto tipo;

    public Motocicleta(
        @JsonProperty("tipo") TipoMoto tipo, 
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
            estado
        );
        this.tipo = tipo;
        this.llantas = 2;
    }

    public TipoMoto getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoMoto tipo) {
        this.tipo = tipo;
    }
    
    
}
