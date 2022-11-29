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
public class MSupervisor {
    public static int menuSupervisor() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        listaOpciones.add(4);
        listaOpciones.add(5);
        
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |                MENÚ SUPERVISOR                |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Consultar Vendedores                        |
                           |2. Ingresar Nuevos Vehiculos                   |
                           |3. Bandeja de Solicitudes                      |
                           |4. Ingresar Usuario Nuevo                      |
                           |5. Salir                                       |
                           |-----------------------------------------------|
                           
                               -Ingrese el número de la opción a elegir- """);
        optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
            System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
            optionChose = inputJava.nextInt();
        }
        return optionChose;
    }
    
    public static int submenuUsuarioSupervisor() {
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        listaOpciones.add(4);
        listaOpciones.add(5);
        
        int optionChose;
        Scanner inputJava = new Scanner(System.in);
        
        System.out.println("""
                           |===============================================|
                           |                MENÚ SUPERVISOR                |
                           |         - OPCIÓN: INGRESAR USUARIO -          |
                           |===============================================|
                           |     Seleccione el tipo de Usuario a crear     |
                           |1. Cliente                                     |
                           |2. Jefe de Taller                              |
                           |3. Mecánico                                    |
                           |4. Vendedor                                    |
                           |                                               |
                           |5. Regresar                                    |
                           |-----------------------------------------------|
                           """);
        optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
            System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
            optionChose = inputJava.nextInt();
        }
        return optionChose;
    }
}
