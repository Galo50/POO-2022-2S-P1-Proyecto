
import java.io.IOException;
import java.util.ArrayList;
import usuarios.Usuario;

public class Main {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    
    public static void main(String[] args) throws IOException {
        Guardar.usuarios();
        Main.usuarios = Cargar.usuarios();
    }
}
