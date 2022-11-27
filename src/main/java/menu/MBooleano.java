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
public class MBooleano {
   public static int menuVendedor() {
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           ===============================================
                                  DETERMINE LA ACCION A REALIZAR
                           ===============================================
                                             * Opciones *
                           1. Aceptar
                           2. Rechazar
                           3. Salir al menu
                           
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
