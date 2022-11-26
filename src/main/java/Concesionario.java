import com.fasterxml.jackson.databind.ObjectMapper;
import usuarios.*;
import java.util.ArrayList;
import solicitudes.Solicitud;
import java.io.File;
import java.io.IOException;

public class Concesionario {
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private Usuario usuario;
    
    public Concesionario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public static void main(String[] args) {
        //Concesionario concesionario = new Concesionario();
        //concesionario.write();
        //concesionario.read();
    }
    
    public void write() {
        // TODO: Make generic
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
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
    
    public void read()  {
        // TODO: Make generic
        try {
            File file = new File("usuarios.json");
            
            ObjectMapper objectMapper = new ObjectMapper();
            JefeTaller jefeTaller = objectMapper.readValue(file, JefeTaller.class);
            System.out.println(jefeTaller.getUserName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void cargarUsuarios() {
        
    }
}
