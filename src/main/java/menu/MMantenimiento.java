/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MMantenimiento {
    public static int menuMantenimiento() {
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           ===============================================
                                  INGRESE EL TIPO DE MANTENIMIENTO
                           ===============================================
                                             * Opciones *
                           1. Preventivo
                           2. Emergencia
                           3. Salir al menu principal
                           Ingrese el número de la opción a elegir:
                           """);
 
        int opcion;
       opcion = inputJava.nextInt();
       if ((0<opcion== false)){
           if (opcion>4 == false){
               opcion = 3;
               System.out.println("Opcion invalida, volviendo al menu pricipal");
           }
       }   
       
       return opcion;
}
}
