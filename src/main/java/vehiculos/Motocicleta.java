/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public class Motocicleta extends Vehiculo {
     
    private String tipoMoto;
    private enum tipoMoto{DEPORTIVA,SCOOTER,TODO_TERRENO};

    public Motocicleta(String tipoMoto, int year, String marca, String combustible, String modelo, Double precio,String estado) {
        super(year, marca, combustible, modelo, precio, estado);
        this.tipoMoto = tipoMoto;
        this.llantas = 2;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String TipoMoto) {
        this.tipoMoto = TipoMoto;
    }
    
    
}
