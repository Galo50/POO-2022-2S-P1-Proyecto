package menu;

import java.util.ArrayList;
import java.util.Scanner;
import usuarios.*;
import solicitudes.Solicitud;

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
    
    public static Supervisor crearSupervisor() {
        
    }
    
    public static Mecanico crearMecanico() {
        
    }
    
    public static Vendedor crearVendedor() {
        
    }
}
