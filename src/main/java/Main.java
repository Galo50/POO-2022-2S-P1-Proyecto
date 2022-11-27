import java.io.IOException;
import java.util.ArrayList;
import menu.MCliente;
//import usuarios.Usuario;
import usuarios.*;
import vehiculos.Vehiculo;
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
        Main.usuarios = Cargar.usuarios();
        
        if (Main.usuarios.isEmpty()) {
            Guardar.crearSupervisorPredeterminado();
            Main.usuarios = Cargar.usuarios();
        }
        
        ArrayList<String> userCredentials = MIniciarSesion.iniciarSesion();
        ArrayList<Solicitud> u1 = new ArrayList<>();
        ArrayList<String> uc1 = new ArrayList<>();
        ArrayList<Vehiculo> uv1 = new ArrayList<>();
        
        Cliente cTester = new Cliente(0,"",0,"","","","",u1);
        Vendedor vTester = new Vendedor("",0,"","","","",u1);
        JefeTaller jTester = new JefeTaller(uc1, "", "", "", "", u1);
        Mecanico mTester = new Mecanico("", "", "", "", u1, uv1);
        
        int userIndex = Main.getUserIndexByCredentials(userCredentials.get(0), userCredentials.get(1), Main.usuarios);
        
        if (userIndex == -1) {
            Prints.usuarioNoEncontrado();
        }
        
        if (userIndex != -1) {
            Usuario userLoggedIn = Main.usuarios.get(userIndex);
            Prints.darBienvenida(userLoggedIn);
            
            if (userLoggedIn.getTipo().equals(cTester)) {
                MCliente.menuCliente();
            }
            
            else if (userLoggedIn.getTipo().equals(jTester)){
                MJefeTaller.menuJefeTaller();
            }
            
            else if (userLoggedIn.getTipo().equals(mTester)) {
                MMecanico.menuMecanico();
            }
            
            else if (userLoggedIn.getTipo().equals(vTester)) {
                MVendedor.menuVendedor();
            }
            
            else {
                MSupervisor.menuSupervisor();
            }
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
