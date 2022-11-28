/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;
import vehiculos.*;

/**
 *
 * @author USER
 */
public class MEditar {
    public static int menuEditar() {
           
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
        public static void EMarca(Vehiculo carro){
        Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |         INGRESE LA MARCA DEL VEHICULO         |
                           |===============================================|""");
            String marca = inputJava.nextLine();
            carro.setMarca(marca);      
        
        } 
        public static void EModelo(Vehiculo carro){
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |        INGRESE EL MODELO DEL VEHICULO         |
                           |===============================================|""");
            String modelo= inputJava.nextLine();
            carro.setModelo(modelo);
        }
        public static void ELlantas(Vehiculo carro){
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |    .   INGRESE LA CANTIDAD DE LLANTAS         |
                           |===============================================|""");
            int llantas= inputJava.nextInt();
            carro.setLlantas(llantas);
        }
        public static void EYear(Vehiculo carro){
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |         INGRESE EL AÑO DEL VEHICULO           |
                           |===============================================|""");
            int year = inputJava.nextInt(); 
            carro.setYear(year);
        }
        public static void EPrecio(Vehiculo carro){
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |        INGRESE EL PRECIO DEL VEHICULO         |
                           |===============================================|""");
            double precio = inputJava.nextInt();
            carro.setPrecio(precio);
        }
        public static void ECombustible(Vehiculo carro){
            Scanner inputJava = new Scanner(System.in);
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
        
            carro.setCombustible(combustible);
        }
        public static void EAsiento(Automovil carro){
            Scanner inputJava = new Scanner(System.in);
            System.out.println("""
                           |===============================================|
                           |    . INGRESE LOS ASIENTOS DEL VEHICULO         |
                           |===============================================|""");
            int asientos = inputJava.nextInt();        
            carro.setAsientos(asientos);
        }
        public static void EConvertible(Automovil carro){
            Scanner inputJava = new Scanner(System.in);        
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
            
            carro.setConvertible(convertible);
        }
        public static void ECamara(Automovil carro){
        Scanner inputJava = new Scanner(System.in);
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
            carro.setCamara(camara);
        }
        public static void ETipoMoto(Motocicleta moto){
        Scanner inputJava = new Scanner(System.in);
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
            moto.setTipoMoto(tipoMoto);
        }
        public static void ECarga(Camion camion){
        Scanner inputJava = new Scanner(System.in);
        System.out.println("""
                           |===============================================|
                           |    . INGRESE LA CARGA MAXIMA DEL VEHICULO     |
                           |===============================================|""");
            int carga = inputJava.nextInt();        
            camion.setCarga(carga);
        }
        public static void EAgricola(Tractor tractor){
        Scanner inputJava = new Scanner(System.in);
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
        
        
            tractor.setAgricola(agricola);
        }
        public static void E(Tractor tractor){
        Scanner inputJava = new Scanner(System.in);
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
        
            tractor.setTransmision(transmision);
        }
        
       
}
