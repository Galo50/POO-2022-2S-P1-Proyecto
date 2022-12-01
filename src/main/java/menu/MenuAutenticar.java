/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import util.Print;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import usuarios.*;

/**
 *
 * @author Todos :v
 */
public class MenuAutenticar {
    
    public static Usuario iniciarSesion(Scanner scanner, ArrayList<Usuario> usuarios) {
        Usuario usuarioEncontrado = null;
        
        Print.ingresarUsername();
        String username = scanner.nextLine();

        Print.ingresarPassword();
        String password = scanner.nextLine();   

        for(Usuario usuario : usuarios) {
            if (username.equalsIgnoreCase(usuario.getUserName()) && password.equalsIgnoreCase(usuario.getPassword())) {
                usuarioEncontrado = usuario;
                System.out.println("EL USUARIO ENCONTRADO ES: " + usuarioEncontrado);
                System.out.println("EL TIPO DE USUARIO ENCONTRADO ES: " + usuarioEncontrado.getTipo());
            }
        }

        if (usuarioEncontrado == null) {
            Print.inicioDeSesionFallido();
        }
        
        return usuarioEncontrado;
        
    }
}
