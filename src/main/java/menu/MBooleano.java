/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MBooleano {
   public static int menuBooleano() {
      ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        
        System.out.println("""
                           |===============================================|
                           |        DETERMINE LA ACCION A REALIZAR         |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Aceptar                                     |
                           |2. Rechazar                                    |
                           |3. Salir al menu                               |
                           |-----------------------------------------------|
                           
                              -Ingrese el número de la opción a elegir- """);
      optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                optionChose = inputJava.nextInt();
        }
        return optionChose;
   }     
}
