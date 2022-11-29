package util;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import usuarios.*;
import solicitudes.Solicitud;
import vehiculos.Vehiculo;

public class Guardar {
    public static void usuarios(ArrayList<Usuario> usuarios) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File("usuarios.json");
        file.createNewFile();
        
        objectMapper.writeValue(file, usuarios);

    }
    
    public static void solicitudes(ArrayList<Solicitud> solicitudes) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File("solicitudes.json");
        file.createNewFile();
        
        objectMapper.writeValue(file, solicitudes);
    }  
    
    public static void vehiculos(ArrayList<Vehiculo> vehiculos) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File("solicitudes.json");
        file.createNewFile();
        
        objectMapper.writeValue(file, vehiculos);
    }
    
    public static void crearSupervisorPredeterminado() throws IOException {
        Supervisor supervisorPredeterminado = new Supervisor(
            new ArrayList(),
            "admin",
            "admin",
            "Admin",
            "Admin",
            new ArrayList()
        );
        
        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios.add(supervisorPredeterminado);
        
        Guardar.usuarios(usuarios);
    }
}
