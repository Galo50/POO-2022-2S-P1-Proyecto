/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author USER
 */
public abstract class Vehiculo {
    
    private int year; 
    private String marca; 
    private String modelo; 
    protected int llantas;
    private double precio;
    protected VehiculoCombustible combustible;
    protected VehiculoEstado estado;

    public Vehiculo(
        int year, 
        String marca, 
        String modelo, 
        Double precio, 
        VehiculoCombustible combustible, 
        VehiculoEstado estado
    ) {
       this.year = year;
       this.marca = marca;
       this.modelo = modelo;
       this.precio = precio;
       this.estado = estado;
       this.combustible = combustible;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public VehiculoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(VehiculoCombustible combustible) {
        this.combustible = combustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public VehiculoEstado getEstado() {
        return estado;
    }

    public void setEstado(VehiculoEstado estado) {
        this.estado = estado;
    } 
}
