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
public class MenuVendedor {
    public static void show(Scanner scanner) {
        // TODO
    }
    
    public static int menuVendedor() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        listaOpciones.add(4);
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |                 MENÚ VENDEDOR                 |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Acceso a Stock                              |
                           |2. Bandeja de Solicitudes                      |
                           |3. Sugerir Modelos                             |
                           |4. Salir                                       |
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
