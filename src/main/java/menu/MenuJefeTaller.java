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
public class MenuJefeTaller {
    public static void show(Scanner scanner) {
        // TODO
    }
    
    public static int menuJefeTaller() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        listaOpciones.add(4);
        listaOpciones.add(5);
        listaOpciones.add(6);
        listaOpciones.add(7);
        listaOpciones.add(8);
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |               MENÚ JEFE TALLER                |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Dar de Alta un Vehiculo                     |
                           |2. Consultar Vehículos en Taller               |
                           |3. Bandeja de Solicitudes                      |
                           |4. Asignar un Vehiculo                         |
                           |5. Realizar una Entrega                        |
                           |6. Administrar Estados                         |
                           |7. Salir                                       |
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
