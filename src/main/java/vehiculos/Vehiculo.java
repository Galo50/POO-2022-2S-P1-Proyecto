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
    private String combustible;
    private double precio;
    private String estado;
    public enum combustible{GASOLINA,DIESEL};
    public enum estado{ADMITIDO,REPARACION,PRUEBA,ENTREGADO};

    public Vehiculo(int year, String marca, String combustible,String modelo,Double precio,String estado) {
       this.year = year;
       this.marca = marca;
       this.combustible = combustible;
       this.modelo=modelo;
       this.precio=precio;
       this.estado=estado;
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

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
}
