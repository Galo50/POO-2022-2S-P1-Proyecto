import java.io.IOException;
import java.util.ArrayList;
import usuarios.Usuario;
import vehiculos.Vehiculo;
import solicitudes.Solicitud;
import menu.MIniciarSesion;

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
        int userIndex = Main.getUserIndexByCredentials(userCredentials.get(0), userCredentials.get(1), Main.usuarios);
        
        if (userIndex == -1) {
            Prints.usuarioNoEncontrado();
        }
        
        if (userIndex != -1) {
            Usuario userLoggedIn = Main.usuarios.get(userIndex);
            Prints.darBienvenida(userLoggedIn);
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
