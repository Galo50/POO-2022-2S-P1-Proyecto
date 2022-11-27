
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import solicitudes.Solicitud;
import usuarios.JefeTaller;
import usuarios.Usuario;

public class Guardar {
        public static void usuarios() {
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
}
