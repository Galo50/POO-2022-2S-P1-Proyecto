package menu;

import usuarios.*;
import util.Print;
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
    
    public static Usuario autenticar(Scanner scanner, ArrayList<Usuario> usuarios) {
        Usuario usuarioAutenticado = null;
        
        Print.darBienvenidaPrograma();
        Print.solicitarIniciarSesion();
        
        while (usuarioAutenticado == null) {
            Print.tiposDeUsuario();
            Float tipoDeUsuario = Menu.solicitarNumero(scanner, Print.ingresarTipoDeUsuario(false), 1, 5);

            if (tipoDeUsuario == 1) {
                Print.preguntaSiEsCliente();
                Float opcionEsCliente = Menu.solicitarNumero(scanner, Print.ingresarOpcion, 1,2);

                if (opcionEsCliente == 1) {
                    Print.iniciarSesion();
                    usuarioAutenticado = MenuAutenticar.iniciarSesion(scanner, usuarios);
                }

                 if (opcionEsCliente == 2) {
                     Print.seCrearaCliente();
                     usuarioAutenticado = MenuAutenticar.crearCliente(scanner);
                 }
            }

            if (tipoDeUsuario != 1) {
                Print.iniciarSesion();
                usuarioAutenticado = MenuAutenticar.iniciarSesion(scanner, usuarios);
            }
        }
        
        return usuarioAutenticado;
    }
}
