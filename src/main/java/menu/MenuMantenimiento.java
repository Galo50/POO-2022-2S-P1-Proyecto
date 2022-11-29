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
public class MenuMantenimiento {
    public static int menuMantenimiento() {
        Scanner inputJava = new Scanner(System.in);
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        int optionChose;
               
        
        System.out.println("""
                           |===============================================|
                           |       INGRESE EL TIPO DE MANTENIMIENTO        |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Preventivo                                  |
                           |2. Emergencia                                  |
                           |3. Salir al menu principal                     |
                           |Ingrese el número de la opción a elegir:       |
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
       