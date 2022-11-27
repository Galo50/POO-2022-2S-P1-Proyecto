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
public class MVendedor {
    public static int menuVendedor() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |                 MENÚ VENDEDOR                 |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Consultar Vehículos                         |
                           |2. Revisar solicitudes de cotización           |
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
