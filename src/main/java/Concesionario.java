import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import usuarios.*;
import java.util.ArrayList;
import solicitudes.Solicitud;
import java.io.File;
import java.io.IOException;

public class Concesionario {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    private Usuario usuario;
    
    public Concesionario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public static void main(String[] args) throws IOException {
        //Concesionario concesionario = new Concesionario();
        Concesionario.write();
        Concesionario.readUsuarios();
    }
    
    public static void write() {
        // TODO: Make generic
        ArrayList<Usuario> usuarios = new ArrayList();
        ObjectMapper objectMapper = new ObjectMapper();
        
        ArrayList<String> certificaciones = new ArrayList<String>();
        ArrayList<Solicitud> solicitudes = new ArrayList<Solicitud>();
        
        certificaciones.add("Hola mundo");
        
        JefeTaller jefeTaller = new JefeTaller(
                certificaciones,
                "infrative",
                "12345gmt",
                "Fredder",
                "Gudrow",
                solicitudes
        );
        
        
        
        
        
        
        usuarios.add(jefeTaller);
        try {
            File file = new File("usuarios.json");
            file.createNewFile();
            objectMapper.writeValue(file, usuarios);
        } catch (IOException e) {
           e.printStackTrace();
       }
    }
    
    public static void guardarUsuarios() {
        // TODO
    }

    
    public static void cargarUsuarios() throws IOException  {
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

        Concesionario.usuarios = usuarios;
    }
}
