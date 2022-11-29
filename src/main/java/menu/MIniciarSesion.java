/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

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
        
        System.out.println("""
                           -----------------------------------------------
                           |Bienvenido a la Concesionaria 'AMLO'         |
                           |                                             |
                           |El siguiente sistema le otorgará la capacidad|
                           |de aprobar solicitudes de crédito para la    |
                           |compra de vehículos, receptar pagos, emitir, | 
                           |cotizaciones entre otros aspectos.           |
                           |                                             |
                           |Para ingresar al programa, siga los pasos    |
                           |indicados en la parte inferior...            |
                           -----------------------------------------------
                           """);
        System.out.println("""
                           ===============================================
                                     I N I C I A R  S E S I Ó N
                           ===============================================
                           Ingrese su nombre de usuario:""");
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
