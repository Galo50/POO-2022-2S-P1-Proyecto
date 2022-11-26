/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;
import solicitudes.Solicitud;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author USER
 */
public abstract class Usuario {
    @JsonProperty("userName")
    protected String userName;
    
    @JsonProperty("password")
    protected String password;
    
    @JsonProperty("nombres")
    protected String nombres;
    
    @JsonProperty("apellidos")
    protected String apellidos;
    
    @JsonProperty("solicitudes")
    protected ArrayList<Solicitud> solicitudes = new ArrayList<>();

    public Usuario(String userName, String password, String nombres, String apellidos, ArrayList solicitudes) {
        this.userName = userName;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.solicitudes = solicitudes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    //public void bandejaEntrada(Usuario usuario){
      //  Object mensaje = banEntrada.get(0);
        
    
  
    
    //}
    
}

