/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Cliente extends Usuario {
    private final int cedula;
    private final String ocupacion;
    private final double ingresos;

    public Cliente(int cedula, String ocupacion, double ingresos, String userName, String contraseña, String nombres, String apellidos, ArrayList BanEntrada) {
        super(userName, contraseña, nombres, apellidos, BanEntrada);
        this.cedula = cedula;
        this.ocupacion = ocupacion;
        this.ingresos = ingresos;
    }

    public int getCedula() {
        return cedula;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public double getIngresos() {
        return ingresos;
    }   
    
    
}
