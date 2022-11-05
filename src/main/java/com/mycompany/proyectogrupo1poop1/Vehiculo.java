/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectogrupo1poop1;

/**
 *
 * @author USER
 */
public class Vehiculo {
    private int year;
    private String marca;
    private int llantas;
    private String combustible;

    public Vehiculo(int year, String marca, int llantas, String combustible) {
       this.year = year;
       this.marca = marca;
       this.llantas = llantas;
       this.combustible = combustible;
    }

    public int getYear() {
        return year;
    }

    public String getMarca() {
        return marca;
    }

    public int getLlantas() {
        return llantas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    
    
    
}
