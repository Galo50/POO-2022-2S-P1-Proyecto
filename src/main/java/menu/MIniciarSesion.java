/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Todos :v
 */
public class MIniciarSesion {
    public static ArrayList<String> iniciarSesion() {
        ArrayList<String> credenciales;
        credenciales = new ArrayList<>();
        
        System.out.println(
                "-------------------------------------"+"\n"+
                "           INICIAR SESIÓN            "+"\n"+
                "-------------------------------------"+"\n"+
                "Ingrese su nombre de usuario: "
        );
        Scanner inputJava = new Scanner(System.in);
        String userName = inputJava.nextLine();
        System.out.println(
                "Ingrese su contraseña: "
        );
        String passwordUser = inputJava.nextLine();
        System.out.println(userName + passwordUser);
        credenciales.add(userName);
        credenciales.add(passwordUser);
        return credenciales;
    }
}
