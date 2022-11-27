import usuarios.*;
import java.util.ArrayList;

public class Concesionario {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    private Usuario usuario;
    
    public Concesionario(Usuario usuario) {
        this.usuario = usuario;
    }
}
