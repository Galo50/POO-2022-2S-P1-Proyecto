import util.Guardar;
import util.Cargar;
import util.Print;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import menu.MenuCliente;
import usuarios.*;
import vehiculos.*;
import menu.*;  
import store.AppState;

public class Main {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    public static ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        Guardar.crearUsuariosPredeterminados();
        Main.usuarios = Cargar.usuarios();
       
        Guardar.crearVehiculosPredeterminados();
        Main.vehiculos = Cargar.vehiculos();
        
        
        Print.darBienvenidaPrograma();
        
        while(AppState.getUserLoggedIn() == null && AppState.getRunApp()) {
            Print.solicitarIniciarSesion();
            
            Menu.autenticar(scanner, usuarios);
            
            Usuario userLoggedIn = AppState.getUserLoggedIn();
            
            if (userLoggedIn != null) {
                Print.darBienvenidaUsuario(userLoggedIn);

                if (userLoggedIn.getTipo() == TipoUsuario.CLIENTE) {
                    MenuCliente.show(scanner, vehiculos, userLoggedIn, usuarios);
                }

                if (userLoggedIn.getTipo() == TipoUsuario.JEFE_TALLER) {
                    MenuJefeTaller.show(scanner, vehiculos, usuarios,userLoggedIn);
                } 

                if (userLoggedIn.getTipo() == TipoUsuario.MECANICO) {
                    MenuMecanico.show(scanner,userLoggedIn,usuarios);
                }

                if (userLoggedIn.getTipo() == TipoUsuario.SUPERVISOR) {
                    MenuSupervisor.show(scanner, usuarios, vehiculos, userLoggedIn);
                }

                if (userLoggedIn.getTipo() == TipoUsuario.VENDEDOR) {
                    MenuVendedor.show(scanner, vehiculos, userLoggedIn);
                }
            }
            
            if (userLoggedIn == null && AppState.getRunApp()) {
                Print.inicioDeSesionFallido();
            }
            
            if (!AppState.getRunApp()) {
                Print.brindarDespedida();
            }
        }
    }
}