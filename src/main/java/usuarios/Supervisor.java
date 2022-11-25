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
public class Supervisor extends Usuario {
    private ArrayList certificaciones;

    public Supervisor(ArrayList certificaciones, String userName, String contraseña, String nombres, String apellidos, ArrayList BanEntrada) {
        super(userName, contraseña, nombres, apellidos, BanEntrada);
        this.certificaciones = certificaciones;
    }

   
    }
    
 

