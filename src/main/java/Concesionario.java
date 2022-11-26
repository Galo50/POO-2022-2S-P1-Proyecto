import com.fasterxml.jackson.databind.ObjectMapper;
import usuarios.*;
import java.util.ArrayList;
import solicitudes.Solicitud;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URISyntaxException;

public class Concesionario {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        concesionario.write();
        concesionario.read();
    }
    
    public void write() {
        ObjectMapper objectMapper = new ObjectMapper();
        
        ArrayList<String> certificaciones = new ArrayList<String>();
        ArrayList<Solicitud> solicitudes = new ArrayList<Solicitud>();
        
        Usuario usuario = new Usuario(
                "infrative",
                "12345gmt",
                "Fredder",
                "Gudrow",
                solicitudes
        );
        
        try {
            File file = new File("usuarios.json");
            file.createNewFile();
            objectMapper.writeValue(file, usuario);
        } catch (IOException e) {
           e.printStackTrace();
       }
    }
    
    public void read()  {
        try {
            File file = new File("usuarios.json");

            ObjectMapper objectMapper = new ObjectMapper();
            Usuario jefeTaller = objectMapper.readValue(file, Usuario.class);
            System.out.println(jefeTaller.getUserName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
