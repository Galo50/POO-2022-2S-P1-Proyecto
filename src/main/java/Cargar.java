
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import usuarios.Cliente;
import usuarios.JefeTaller;
import usuarios.Mecanico;
import usuarios.Supervisor;
import usuarios.TipoUsuario;
import usuarios.Usuario;
import usuarios.Vendedor;
import solicitudes.*;
import vehiculos.*;

public class Cargar {
    public static ArrayList<Usuario> usuarios() throws IOException  {
        ArrayList<Usuario> usuarios = new ArrayList();
        File file = new File("usuarios.json");

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node = mapper.valueToTree(mapper.readValue(file, JsonNode.class));

        for (int i = 0; i < node.size(); i++) {
            JsonNode usuarioJson = node.get(i);
            String tipo = usuarioJson.get("tipo").textValue();

            if (tipo.equals(TipoUsuario.JEFE_TALLER.name())) {
                usuarios.add(mapper.readValue(usuarioJson.toString(), JefeTaller.class));
            }

            if (tipo.equals(TipoUsuario.CLIENTE.name())) {
                usuarios.add(mapper.readValue(usuarioJson.toString(), Cliente.class));
            }

            if (tipo.equals(TipoUsuario.MECANICO.name())) {
                usuarios.add(mapper.readValue(usuarioJson.toString(), Mecanico.class));
            }

            if (tipo.equals(TipoUsuario.SUPERVISOR.name())) {
                usuarios.add(mapper.readValue(usuarioJson.toString(), Supervisor.class));
            }

            if (tipo.equals(TipoUsuario.VENDEDOR.name())) {
                usuarios.add(mapper.readValue(usuarioJson.toString(), Vendedor.class));
            }
        }

        return usuarios;
    }
        
    public static ArrayList<Solicitud> solicitudes() {
        ArrayList<Solicitud> solicitudes = new ArrayList();
        return solicitudes;
    }
    
    public static ArrayList<Vehiculo> vehiculos() {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        return vehiculos;
    }
    
}
