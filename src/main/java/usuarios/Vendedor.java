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
public class Vendedor extends Usuario{
    
    private final String id;
    private int vendidos;

    public Vendedor(String id, int vendidos, String userName, String contraseña, String nombres, String apellidos, ArrayList BanEntrada) {
        super(userName, contraseña, nombres, apellidos, BanEntrada);
        this.id = id;
        this.vendidos = vendidos;
    }

    public String getId() {
        return id;
    }

    public int getVendidos() {
        return vendidos;
    }
    
    
    
}
