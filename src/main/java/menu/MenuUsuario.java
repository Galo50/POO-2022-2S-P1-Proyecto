package menu;

import java.util.ArrayList;
import java.util.Scanner;
import usuarios.*;
import solicitudes.Solicitud;
import vehiculos.Vehiculo;

public class MenuUsuario {
    public static Cliente crearCliente(Scanner scanner) {
        String cedula;
        String ocupacion;
        float ingresos;
        String username;
        String password;
        String nombre;
        String apellido;
        
        System.out.print("Ingresar cédula: ");
        cedula = scanner.nextLine();
        
        System.out.print("Ingresar ocupación: ");
        ocupacion = scanner.nextLine();
        
        ingresos = Menu.solicitarNumero(scanner, "Ingresar ingresos: ");
        
        System.out.print("Ingresar nombre de usuario: ");
        username = scanner.nextLine();
        
        System.out.print("Ingresar contraseña: ");
        password =scanner.nextLine();
        
        System.out.print("Ingresar nombres: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingresar apellidos: ");
        apellido = scanner.nextLine();
        
        return new Cliente(cedula, ocupacion, ingresos, username, password, nombre, apellido, new ArrayList());
    }
    
    public static JefeTaller crearJefeTaller(Scanner scanner) {
        ArrayList<String> certificaciones = new ArrayList();
        String username;
        String password;
        String nombre;
        String apellido; 
        ArrayList<Solicitud> solicitudes = new ArrayList();
        
        System.out.print("Ingresar certificación técnica: ");
        String certificacion = scanner.nextLine();
        
        certificaciones.add(certificacion);
        
        System.out.print("Ingresar nombre de usuario: ");
        username = scanner.nextLine();
        
        System.out.print("Ingresar contraseña: ");
        password =scanner.nextLine();
        
        System.out.print("Ingresar nombres: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingresar apellidos: ");
        apellido = scanner.nextLine();
        
        return new JefeTaller(certificaciones, username, password, nombre, apellido, solicitudes);
    }
    
    public static Supervisor crearSupervisor(Scanner scanner) {
        ArrayList<String> certificaciones = new ArrayList();
        ArrayList<Solicitud> solicitudes = new ArrayList();
        
        System.out.print("Ingresar certificación académica: ");
        String certificacion = scanner.nextLine();
        
        certificaciones.add(certificacion);
        
        System.out.print("Ingresar nombre de usuario: ");
        String username = scanner.nextLine();
        
        System.out.print("Ingresar contraseña: ");
        String password =scanner.nextLine();
        
        System.out.print("Ingresar nombres: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresar apellidos: ");
        String apellido = scanner.nextLine();
        
        return new Supervisor(certificaciones, username, password, nombre, apellido, solicitudes);
    }
    
    public static Mecanico crearMecanico(Scanner scanner) {        
        System.out.print("Ingresar nombre de usuario: ");
        String username = scanner.nextLine();
        
        System.out.print("Ingresar contraseña: ");
        String password =scanner.nextLine();
        
        System.out.print("Ingresar nombres: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresar apellidos: ");
        String apellido = scanner.nextLine();
        
        ArrayList<Solicitud> solicitudes = new ArrayList();
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        return new Mecanico(username, password, nombre, apellido, solicitudes, vehiculos);
    }
    
    public static Vendedor crearVendedor(Scanner scanner) {
        String id;
        String username;
        String password;
        String nombre;
        String apellido;
        int ventas;
        
        System.out.print("Ingresar id de usuario: ");
        id = scanner.nextLine();
        
        System.out.print("Ingresar nombre de usuario: ");
        username = scanner.nextLine();
        
        System.out.print("Ingresar contraseña: ");
        password =scanner.nextLine();
        
        System.out.print("Ingresar nombres: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingresar apellidos: ");
        apellido = scanner.nextLine();
        
        System.out.print("Ingresar cantidad de vehículos vendidos: ");
        ventas = scanner.nextInt();
        
        ArrayList<Solicitud> solicitudes = new ArrayList();
        
        return new Vendedor(id, ventas, username, password, nombre, apellido, solicitudes);
    }
}
