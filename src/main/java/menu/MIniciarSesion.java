/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import util.Print;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Todos :v
 */
public class MIniciarSesion {
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
}
