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
        
        JefeTaller jefeTaller = new JefeTaller(
                certificaciones,
                "infrative",
                "12345gmt",
                "Fredder",
                "Gudrow",
                solicitudes
        );
        
        try {
            File file = new File("usuarios.json");
            file.createNewFile();
            objectMapper.writeValue(file, jefeTaller);
        } catch (IOException e) {
           e.printStackTrace();
       }
    }
    
    public void read()  {
        try {
            ClassLoader cargador = getClass().getClassLoader();
            URL resource = cargador.getResource("../../src/main/java/usuarios.json");
            System.out.println(resource);
            File file = new File(resource.toURI());

            ObjectMapper objectMapper = new ObjectMapper();
            JefeTaller jefeTaller = objectMapper.readValue(file, JefeTaller.class);
            System.out.println(jefeTaller.getUserName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
