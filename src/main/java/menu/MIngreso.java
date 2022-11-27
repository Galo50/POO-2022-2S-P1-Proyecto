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
public class MIngreso {
    public static int menu() {
           
        Scanner inputJava = new Scanner(System.in);
        ArrayList<Integer> listaOpciones;
        listaOpciones = new ArrayList<>();
        listaOpciones.add(1);
        listaOpciones.add(2);
        listaOpciones.add(3);
        listaOpciones.add(4);
        listaOpciones.add(5);
       
        int optionChose;
               
        
        System.out.println("""
                           |===============================================|
                           |         INGRESE EL TIPO DE VEHICULO           |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Automovil                                   |
                           |2. Motocicleta                                 |
                           |3. Tractor                                     |
                           |4. Camion                                      |
                           |5. Salir al menu principal                     |
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
        
        
        public static int EAutomovil() {
            Scanner inputJava = new Scanner(System.in);
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
            listaOpciones.add(9);
            int optionChose;
        
        
        System.out.println("""
                           |===============================================|
                           |       DETERMINE LA CARACTERISTICA A EDITAR    |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Marca                                       |
                           |2. Modelo                                      |
                           |3. Año de fabricacion                          |
                           |4. Precio                                      |
                           |5. Combustible                                 |
                           |6. Cantidad de asientos                        |
                           |7. Convertible                                 |
                           |8. Camara                                      |
                           |9. Salir al menu                               |
                           |-----------------------------------------------|
                           
                              -Ingrese el número de la opción a elegir- """);
        optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                optionChose = inputJava.nextInt();
        }
        return optionChose;
       }
       public static int EMotocicleta() {
            Scanner inputJava = new Scanner(System.in);
             ArrayList<Integer> listaOpciones;
            listaOpciones = new ArrayList<>();
            listaOpciones.add(1);
            listaOpciones.add(2);
            listaOpciones.add(3);
            listaOpciones.add(4);
            listaOpciones.add(5);
            listaOpciones.add(6);
            listaOpciones.add(7);
            int optionChose;
        
        
        System.out.println("""
                           |===============================================|
                           |       DETERMINE LA CARACTERISTICA A EDITAR    |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Marca                                       |
                           |2. Modelo                                      |
                           |3. Año de fabricacion                          |
                           |4. Precio                                      |
                           |5. Combustible                                 |
                           |6. Tipo de moto                                |
                           |7. Salir al menu                               |
                           |-----------------------------------------------|
                           
                               -Ingrese el número de la opción a elegir- """);
        optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                optionChose = inputJava.nextInt();
        }
        return optionChose;
       }     
        public static int ETractor() {
            Scanner inputJava = new Scanner(System.in);
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
        
        
        System.out.println("""
                           |===============================================|
                           |       DETERMINE LA CARACTERISTICA A EDITAR    |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Marca                                       |
                           |2. Modelo                                      |
                           |3. Año de fabricacion                          |
                           |4. Precio                                      |
                           |5. Combustible                                 |
                           |6. Agricola                                    |
                           |7. Transmision                                 |
                           |8. Salir al menu                               |
                           |-----------------------------------------------|
                           
                               -Ingrese el número de la opción a elegir- """);
        optionChose = inputJava.nextInt();
        while (!(listaOpciones.contains(optionChose))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                optionChose = inputJava.nextInt();
        }
        return optionChose;
       }
        public static int ECamion() {
            Scanner inputJava = new Scanner(System.in);
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
        
            
        System.out.println("""
                           |===============================================|
                           |       DETERMINE LA CARACTERISTICA A EDITAR    |
                           |===============================================|
                           |                  * Opciones *                 |
                           |1. Marca                                       |
                           |2. Modelo                                      |
                           |3. Año de fabricacion                          |
                           |4. Precio                                      |
                           |5. Combustible                                 |
                           |6. Carga                                       |
                           |7. Salir al menu                               |
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
