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
            File file = new File("usuarios.json");
            
            String json = "{\"userName\":\"infrative\",\"password\":\"12345gmt\",\"nombres\":\"Fredder\",\"apellidos\":\"Gudrow\",\"solicitudes\":[],\"certificaciones\":[]}";

            ObjectMapper objectMapper = new ObjectMapper();
            JefeTaller jefeTaller = objectMapper.readValue(json, JefeTaller.class);
            System.out.println(jefeTaller.getUserName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
