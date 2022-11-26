import com.fasterxml.jackson.databind.ObjectMapper;
import usuarios.*;
import java.util.ArrayList;
import solicitudes.Solicitud;
import java.io.File;
import java.io.IOException;
import vehiculos.Vehiculo;

public class Concesionario {
    public static void main(String[] args) {
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
    
    
   
 
}
}
