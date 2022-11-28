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
public class MInicio {
    public static boolean menuInicio(){
    Scanner inputJava = new Scanner(System.in);
        boolean registrado;                       
            System.out.println("""
                           |===============================================|
                           |          ¿USTED ES CLIENTE NUEVO?             |
                           |===============================================|
                           |1. Si                                          |
                           |2. No                                          |    
                           |-----------------------------------------------|    """);
            int opcionRegistrado =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesRegistrado;
            listaOpcionesRegistrado = new ArrayList<>();
            listaOpcionesRegistrado.add(1);
            listaOpcionesRegistrado.add(2);
            while (!(listaOpcionesRegistrado.contains(opcionRegistrado))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionRegistrado = inputJava.nextInt();
            }
            if(opcionRegistrado==1){
            registrado= true;
            }   
            else{
            registrado= false;
            }
        return registrado;
    
    
    }
    
}
