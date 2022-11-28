import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import menu.MCliente;
import usuarios.*;
//import vehiculos.Vehiculo;
import vehiculos.*;
import solicitudes.Solicitud;
import menu.MIniciarSesion;
import menu.MJefeTaller;
import menu.MMecanico;
import menu.MSupervisor;
import menu.MVendedor;

public class Main {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    public static ArrayList<Solicitud> solicitudes = new ArrayList();
    public static ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public static void main(String[] args) throws IOException {
        Scanner inputJava = new Scanner(System.in);
        Main.usuarios = Cargar.usuarios();
        
        if (Main.usuarios.isEmpty()) {
            Guardar.crearSupervisorPredeterminado();
            Main.usuarios = Cargar.usuarios();
        }
        
        ArrayList<String> userCredentials = MIniciarSesion.iniciarSesion();
        
        // VARIABLES USADAS PARA TESTEAR -----------
        ArrayList<Solicitud> u1 = new ArrayList<>();
        ArrayList<String> uc1 = new ArrayList<>();
        ArrayList<Vehiculo> uv1 = new ArrayList<>();
        
        Automovil av1 = new Automovil(4, false, true, 2011, "Hyundai", 4, "i10", 23456, VehiculoCombustible.GASOLINA, VehiculoEstado.ENTREGADO);
        Camion ca1 = new Camion(2, 5, 2001, "HINO", VehiculoCombustible.DIESEL, "GTR-4500", 50000, VehiculoEstado.ENTREGADO);
        uv1.add(av1);
        uv1.add(ca1);
        
        Cliente cTester = new Cliente(0,"",0,"","","","",u1);
        Vendedor vTester = new Vendedor("",0,"","","","",u1);
        JefeTaller jTester = new JefeTaller(uc1, "", "", "", "", u1);
        Mecanico mTester = new Mecanico("", "", "", "", u1, uv1);
        // HASTA AQUÍ TERMINAN DICHAS VARIABLES -----------
        
        //int userIndex = Main.getUserIndexByCredentials(userCredentials.get(0), userCredentials.get(1), Main.usuarios);
        int userIndex = 1;
        
        if (userIndex == -1) {
            Prints.usuarioNoEncontrado();
        }
        
        if (userIndex != -1) {
            //Usuario userLoggedIn = Main.usuarios.get(userIndex);
            Mecanico userMecanico = new Mecanico("Lighty51015", "Shestillinsidemymemories", "Joan", "Mendoza", u1, uv1);
            //Prints.darBienvenida(userLoggedIn);
            
            //if (userLoggedIn.getTipo() == TipoUsuario.CLIENTE) {
            //    MCliente.menuCliente();
            //}
            
            //else if (userLoggedIn.getTipo() == TipoUsuario.JEFE_TALLER){
            //    MJefeTaller.menuJefeTaller();
            //}
            
            //else if (userLoggedIn.getTipo() == TipoUsuario.MECANICO) {
                int optionChose = MMecanico.menuMecanico();
                while (optionChose != 3) {
                    if(optionChose == 1) {
                        userMecanico.verCarrosMecanico();
                        optionChose = MMecanico.menuMecanico();
                    }
                    else {
                        System.out.println("Indique la posición del Vehículo: ");
                        int position = inputJava.nextInt();
                        while (position > userMecanico.getCarros().size() || position == 0) {
                            System.out.println("Ingrese una posición existente!");
                            position = inputJava.nextInt();
                        }
                        optionChose = MMecanico.menuMecanico();
                    }
                }
                Prints.brindarDespedida();
            //}
            
            //else if (userLoggedIn.getTipo() == TipoUsuario.VENDEDOR) {
            //    MVendedor.menuVendedor();
            //}
            
            //else {
            //    MSupervisor.menuSupervisor();
            //}
        }
    }
    
    public static int getUserIndexByCredentials(String userName, String password, ArrayList<Usuario> usuarios) {
        int userIndex = -1;
        
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            
            if (userName.equalsIgnoreCase(usuario.getUserName()) && password.equalsIgnoreCase(usuario.getPassword())) {
                userIndex = i;
            }
        }
        
        return userIndex;
    }
}
