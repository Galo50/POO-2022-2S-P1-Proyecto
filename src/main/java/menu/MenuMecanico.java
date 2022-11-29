/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Todos xd
 */
public class MenuMecanico {
    public static void show(Scanner scanner) {
        // TODO
    }
    
    public static int menuMecanico() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |                  MENÚ MECÁNICO                |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Consultar Vehículos a Disposición           |
                           |2. Enviar Cambio de Estado                     |
                           |3. Salir                                       |
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
