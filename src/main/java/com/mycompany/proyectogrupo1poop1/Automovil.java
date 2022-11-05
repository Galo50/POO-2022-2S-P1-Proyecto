/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectogrupo1poop1;

/**
 *
 * @author USER
 */
public class Automovil extends Vehiculo {
    
    private int asientos;
    private boolean convertible;
    private boolean camara;

    public Automovil(int asientos, boolean convertible, boolean camara, int year, String marca, int llantas, String combustible) {
        super(year, marca, llantas, combustible);
        this.asientos = asientos;
        this.convertible = convertible;
        this.camara = camara;
    }
    
    
    
    
    
}
