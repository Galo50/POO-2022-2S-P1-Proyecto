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
public class JefeTaller extends Usuario{
    private ArrayList cetificacionTecnica;

    public JefeTaller(ArrayList cetificacionTecnica, String userName, String contraseña, String nombres, String apellidos, ArrayList BanEntrada) {
        super(userName, contraseña, nombres, apellidos, BanEntrada);
        this.cetificacionTecnica = cetificacionTecnica;
    }
    
    
    
}
