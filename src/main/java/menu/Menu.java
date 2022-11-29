package menu;

import usuarios.*;
import util.Print;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Menu {
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
    
    public static Float solicitarNumero(Scanner scanner, String mensaje) {
        Float numero = Float.NaN;
        while (numero.isNaN()) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextFloat();

            } catch (InputMismatchException e) {
                Print.valorNoProcesable();
                scanner.next();
            }
        }
        
        scanner.nextLine();
        return numero;
    }
    
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.crearCliente(scanner);
    }
}
