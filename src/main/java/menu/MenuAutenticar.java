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
    public static ArrayList<String> iniciarSesion() throws IOException {
        ArrayList<String> credenciales;
        credenciales = new ArrayList<>();
        
        Print.darBienvenidaPrograma();
        Print.iniciarSesion();
        
        Print.ingresarUsername();
        Scanner inputJava = new Scanner(System.in);
        String userName = inputJava.nextLine();
        System.out.println(
                "Ingrese su contraseña: "
        );
        String passwordUser = inputJava.nextLine();
        credenciales.add(userName);
        credenciales.add(passwordUser);
        return credenciales;
    }
    
    public static Cliente crearCliente(Scanner scanner) {
        String cedula;
        String ocupacion;
        float ingresos;
        String username;
        String password;
        String nombre;
        String apellido;
        
        System.out.print("Ingresar cédula: ");
        cedula = scanner.nextLine();
        
        System.out.print("Ingresar ocupación: ");
        ocupacion = scanner.nextLine();
        
        ingresos = Menu.solicitarNumero(scanner, "Ingresar ingresos: ");
        
        System.out.print("Ingresar nombre de usuario: ");
        username = scanner.nextLine();
        
        System.out.print("Ingresar contraseña: ");
        password =scanner.nextLine();
        
        System.out.print("Ingresar nombres: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingresar apellidos: ");
        apellido = scanner.nextLine();
        
        return new Cliente(cedula, ocupacion, ingresos, username, password, nombre, apellido, new ArrayList());
    }
    
    public static Usuario iniciarSesion(Scanner scanner, ArrayList<Usuario> usuarios) {
        Usuario usuarioEncontrado = null;
        
        while (usuarioEncontrado == null) {
            Print.ingresarUsername();
            String username = scanner.nextLine();

            Print.ingresarPassword();
            String password = scanner.nextLine();   
            
            for(Usuario usuario : usuarios) {
                if (username.equalsIgnoreCase(usuario.getUserName()) && password.equalsIgnoreCase(usuario.getPassword())) {
                    usuarioEncontrado = usuario;
                }
            }
            
            if (usuarioEncontrado == null) {
                Print.inicioDeSesionFallido();
            }
        }
        
        return usuarioEncontrado;
        
    }
}
