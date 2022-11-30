package menu;

import java.io.IOException;
import usuarios.*;
import util.Print;
import util.Guardar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Menu {
    
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
    
    public static Float solicitarNumero(Scanner scanner, String mensaje, int min, int max) {
        Float numero = Float.NaN;
        
        while (numero.isNaN()) {
            Float numeroIngresado = Menu.solicitarNumero(scanner, mensaje);
            
            if (numeroIngresado >= min && numeroIngresado <= max) {
                numero = numeroIngresado;
            } else {
                Print.valorFueraDeRango();
            }
        }
        
        return numero;
    }
    
    public static Usuario autenticar(Scanner scanner, ArrayList<Usuario> usuarios) throws IOException {
        Usuario usuarioAutenticado = null;
        
        Print.darBienvenidaPrograma();
        Print.solicitarIniciarSesion();
        boolean usuarioDeseaSalir = false;
        
        while (!usuarioDeseaSalir) {
            Print.tiposDeUsuario();
            Float opcion = Menu.solicitarNumero(scanner, Print.ingresarTipoDeUsuario(false), 1, 6);

            if (opcion == 1) {
                Print.preguntaSiEsCliente();
                Float opcionEsCliente = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1,2);

                if (opcionEsCliente == 1) {
                    Print.seCrearaCliente();
                     usuarioAutenticado = MenuUsuario.crearCliente(scanner);
                     
                     usuarios.add(usuarioAutenticado);
                     Guardar.usuarios(usuarios);
                     usuarioDeseaSalir = true;
                }

                 if (opcionEsCliente == 2) {
                    Print.iniciarSesion();
                    usuarioAutenticado = MenuAutenticar.iniciarSesion(scanner, usuarios);
                    usuarioDeseaSalir = true;
                 }
            }

            if (opcion == 6) {
                Print.brindarDespedida();
                usuarioDeseaSalir = true;
            }
            
            if (opcion != 1 && opcion != 6) {
                Print.iniciarSesion();
                usuarioAutenticado = MenuAutenticar.iniciarSesion(scanner, usuarios);
            }
        }
        
        return usuarioAutenticado;
        }
}
