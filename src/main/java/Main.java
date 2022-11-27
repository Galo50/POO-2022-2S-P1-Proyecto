
import java.io.IOException;
import java.util.ArrayList;
import usuarios.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author infrative
 */
public class Main {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    
    public static void main(String[] args) throws IOException {
        Concesionario.usuarios = Cargar.usuarios();
    }
}
