/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import vehiculos.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MenuIngreso {
       public static int menuIngreso() {
           
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
        
        
       public static Automovil iAutomovil() {
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |         INGRESE LA MARCA DEL VEHICULO         |
                           |===============================================|""");
            String marca = inputJava.nextLine();
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL MODELO DEL VEHICULO         |
                           |===============================================|""");
            String modelo= inputJava.nextLine();
            int llantas = 4 ;
            System.out.println("""
                           |===============================================|
                           |         INGRESE EL AÑO DEL VEHICULO           |
                           |===============================================|""");
            int year = inputJava.nextInt(); 
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL PRECIO DEL VEHICULO         |
                           |===============================================|""");
            double precio = inputJava.nextInt();
            
            VehiculoCombustible combustible;
             System.out.println("""
                           |===============================================|
                           |      ESPECIFIQUE EL TIPO DE COMBUSTIBLE       |
                           |===============================================|
                           |1. Gasolina                                    |
                           |2. Diesel                                      |
                           |3. Electrico                                   |
                           |-----------------------------------------------|     
                           """);
            int opcionCombustible =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesCombustible;
            listaOpcionesCombustible = new ArrayList<>();
            listaOpcionesCombustible.add(1);
            listaOpcionesCombustible.add(2);
            listaOpcionesCombustible.add(3);
            while (!(listaOpcionesCombustible.contains(opcionCombustible))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionCombustible = inputJava.nextInt();
            }
            if(opcionCombustible==1){
            combustible= VehiculoCombustible.GASOLINA;
            }   
            else if(opcionCombustible==2){
            combustible= VehiculoCombustible.DIESEL;
            }   
            else{
            combustible= VehiculoCombustible.ELECTRICO;
            }
             
             
            
             System.out.println("""
                           |===============================================|
                           |    . INGRESE LOS ASIENTOS DEL VEHICULO         |
                           |===============================================|""");
            int asientos = inputJava.nextInt();
            boolean camara;
            System.out.println("""
                           |===============================================|
                           |    ESPECIFIQUE SI TIENE CAMARA EL VEHICULO    |
                           |===============================================|
                           |1. Incluida                                    |
                           |2. No incluida                                 |    
                           |-----------------------------------------------|    
                               """);
            int opcionCamara =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesCamara;
            listaOpcionesCamara = new ArrayList<>();
            listaOpcionesCamara.add(1);
            listaOpcionesCamara.add(2);
            while (!(listaOpcionesCamara.contains(opcionCamara))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionCamara = inputJava.nextInt();
            }
            if(opcionCamara==1){
            camara= true;
            }else{camara= false;}                 
            boolean convertible;            
            System.out.println("""
                           |===============================================|
                           |   ESPECIFIQUE SI EL VEHICULO ES CONVERTIBLE   |
                           |===============================================|
                           |1. Convertible                                 |
                           |2. No Convertible                              |    
                           |-----------------------------------------------|    """);
            int opcionConvertible =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesConvertible;
            listaOpcionesConvertible = new ArrayList<>();
            listaOpcionesConvertible.add(1);
            listaOpcionesConvertible.add(2);
            while (!(listaOpcionesConvertible.contains(opcionConvertible))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionConvertible = inputJava.nextInt();
            }
            if(opcionConvertible==1){
            convertible= true;
            }   
            else{
            convertible= false;
            }       
            
            Automovil a1 = new Automovil(asientos,convertible,camara,year,marca,llantas,modelo, precio, combustible,VehiculoEstado.INVENTARIO);
         System.out.println("""
                           |===============================================|
                           |        AUTOMOVIL CREADO CORRECTAMENTE         |
                           |===============================================|""");
            
            return a1;
       }
       
       public static Motocicleta iMotocicleta() {
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |         INGRESE LA MARCA DEL VEHICULO         |
                           |===============================================|""");
            String marca = inputJava.nextLine();
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL MODELO DEL VEHICULO         |
                           |===============================================|""");
            String modelo= inputJava.nextLine();
             System.out.println("""
                           |===============================================|
                           |         INGRESE EL AÑO DEL VEHICULO           |
                           |===============================================|""");
            int year = inputJava.nextInt(); 
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL PRECIO DEL VEHICULO         |
                           |===============================================|""");
            double precio = inputJava.nextInt();
            VehiculoCombustible combustible;
             System.out.println("""
                           |===============================================|
                           |      ESPECIFIQUE EL TIPO DE COMBUSTIBLE       |
                           |===============================================|
                           |1. Gasolina                                    |
                           |2. Diesel                                      |
                           |3. Electrico                                   |
                           |-----------------------------------------------|     
                           """);
            int opcionCombustible =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesCombustible;
            listaOpcionesCombustible = new ArrayList<>();
            listaOpcionesCombustible.add(1);
            listaOpcionesCombustible.add(2);
            listaOpcionesCombustible.add(3);
            while (!(listaOpcionesCombustible.contains(opcionCombustible))) {
             System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionCombustible = inputJava.nextInt();
            }
            if(opcionCombustible==1){
            combustible= VehiculoCombustible.GASOLINA;
            }   
            else if(opcionCombustible==2){
            combustible= VehiculoCombustible.DIESEL;
            }   
            else{
            combustible= VehiculoCombustible.ELECTRICO;
            }
            TipoMoto tipoMoto;   
             System.out.println("""
                           |===============================================|
                           |      ESPECIFIQUE EL TIPO DE MOTOCICLETA       |
                           |===============================================|
                           |1. Deportiva                                   |
                           |2. Scooter                                     |
                           |3. Todo terreno                                |
                           |-----------------------------------------------|     
                           """);
            int opcionMoto =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesMoto;
            listaOpcionesMoto = new ArrayList<>();
            listaOpcionesMoto.add(1);
            listaOpcionesMoto.add(2);
            listaOpcionesMoto.add(3);
            while (!(listaOpcionesMoto.contains(opcionMoto))) {
             System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionMoto = inputJava.nextInt();
            }
            if(opcionMoto==1){
            tipoMoto=TipoMoto.DEPORTIVA;
            }   
            else if(opcionMoto==2){
            tipoMoto=TipoMoto.SCOOTER;
            }   
            else{
            tipoMoto=TipoMoto.TODO_TERRENO;
            }
                    
            Motocicleta m1 = new Motocicleta(tipoMoto,year,marca, combustible,modelo, precio,VehiculoEstado.INVENTARIO);
         System.out.println("""
                           |===============================================|
                           |        MOTOCICLETA CREADO CORRECTAMENTE       |
                           |===============================================|""");
            
            return m1;
       }
         public static Tractor iTractor() {
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |         INGRESE LA MARCA DEL VEHICULO         |
                           |===============================================|""");
            String marca = inputJava.nextLine();
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL MODELO DEL VEHICULO         |
                           |===============================================|""");
            String modelo= inputJava.nextLine();
             System.out.println("""
                           |===============================================|
                           |         INGRESE EL AÑO DEL VEHICULO           |
                           |===============================================|""");
            int year = inputJava.nextInt(); 
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL PRECIO DEL VEHICULO         |
                           |===============================================|""");
            double precio = inputJava.nextInt();
            VehiculoCombustible combustible= VehiculoCombustible.DIESEL;
            boolean agricola;                       
            System.out.println("""
                           |===============================================|
                           |   ESPECIFIQUE SI EL TRACTOR ES AGRICOLA       |
                           |===============================================|
                           |1. Si                                          |
                           |2. No                                          |    
                           |-----------------------------------------------|    """);
            int opcionAgricola =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesAgricola;
            listaOpcionesAgricola = new ArrayList<>();
            listaOpcionesAgricola.add(1);
            listaOpcionesAgricola.add(2);
            while (!(listaOpcionesAgricola.contains(opcionAgricola))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionAgricola = inputJava.nextInt();
            }
            if(opcionAgricola==1){
            agricola= true;
            }   
            else{
            agricola= false;
            }       
         VehiculoTransmision transmision;
         System.out.println("""
                           |===============================================|
                           |   ESPECIFIQUE LA TRANSMISION DEL TRACTOR      |
                           |===============================================|
                           |1. MECANICA                                    |
                           |2. HIDRAULICA                                  |    
                           |-----------------------------------------------|    """);
            int opcionTransmision =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesTransmision;
            listaOpcionesTransmision = new ArrayList<>();
            listaOpcionesTransmision.add(1);
            listaOpcionesTransmision.add(2);
            while (!(listaOpcionesTransmision.contains(opcionTransmision))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionTransmision = inputJava.nextInt();
            }
            if(opcionTransmision==1){
            transmision=VehiculoTransmision.MECANICA;
            }   
            else{
            transmision=VehiculoTransmision.HIDRAULICA;
            }
           
            
            Tractor t1 = new Tractor(agricola,transmision,year,marca, combustible,modelo, precio,VehiculoEstado.INVENTARIO);
         System.out.println("""
                           |===============================================|
                           |          TRACTOR CREADO CORRECTAMENTE         |
                           |===============================================|""");
            
            return t1;
         }
          public static Camion iCamion() {
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |         INGRESE LA MARCA DEL VEHICULO         |
                           |===============================================|""");
            String marca = inputJava.nextLine();
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL MODELO DEL VEHICULO         |
                           |===============================================|""");
            String modelo= inputJava.nextLine();
            System.out.println("""
                           |===============================================|
                           |    .   INGRESE LA CANTIDAD DE LLANTAS         |
                           |===============================================|""");
            int llantas = inputJava.nextInt();
            
            
            
            System.out.println("""
                           |===============================================|
                           |         INGRESE EL AÑO DEL VEHICULO           |
                           |===============================================|""");
            int year = inputJava.nextInt(); 
             System.out.println("""
                           |===============================================|
                           |        INGRESE EL PRECIO DEL VEHICULO         |
                           |===============================================|""");
            double precio = inputJava.nextInt();
            
            VehiculoCombustible combustible;
             System.out.println("""
                           |===============================================|
                           |      ESPECIFIQUE EL TIPO DE COMBUSTIBLE       |
                           |===============================================|
                           |1. Gasolina                                    |
                           |2. Diesel                                      |
                           |3. Electrico                                   |
                           |-----------------------------------------------|     
                           """);
            int opcionCombustible =inputJava.nextInt();
            ArrayList<Integer> listaOpcionesCombustible;
            listaOpcionesCombustible = new ArrayList<>();
            listaOpcionesCombustible.add(1);
            listaOpcionesCombustible.add(2);
            listaOpcionesCombustible.add(3);
            while (!(listaOpcionesCombustible.contains(opcionCombustible))) {
                System.out.println("Dicho valor se encuentra fuera del rango de Opciones!");
                opcionCombustible = inputJava.nextInt();
            }
            if(opcionCombustible==1){
            combustible= VehiculoCombustible.GASOLINA;
            }   
            else if(opcionCombustible==2){
            combustible= VehiculoCombustible.DIESEL;
            }   
            else{
            combustible= VehiculoCombustible.ELECTRICO;
            }
             
             
            
             System.out.println("""
                           |===============================================|
                           |    . INGRESE LA CARGA MAXIMA DEL VEHICULO     |
                           |===============================================|""");
            int carga = inputJava.nextInt();
            
            
            Camion c1 = new Camion(carga,llantas,year,marca, combustible,modelo, precio,VehiculoEstado.INVENTARIO);
         System.out.println("""
                           |===============================================|
                           |           CAMION CREADO CORRECTAMENTE         |
                           |===============================================|""");
            
            return c1;
          }
    }
