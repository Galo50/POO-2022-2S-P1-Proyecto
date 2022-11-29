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
public class MenuCliente {
    public static int menuCliente() {
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
                           |                  MENÚ CLIENTE                 |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Consultar Stock                             |
                           |2. Consultar Vehículos Adquiridos              |
                           |3. Bandeja de Solicitudes                      |
                           |4. Graficar Vehículos de Stock                 |
                           |5. Solicitar Cotización                        |
                           |6. Solicitar Mantenimiento                     |
                           |7. Soliticar Estado del Vehículo               |
                           |8. Salir                                       |
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
