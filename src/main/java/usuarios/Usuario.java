/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import solicitudes.Solicitud;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
/**
 *
 * @author USER
 */
public abstract class Usuario {
    protected String userName;
    
    protected String password;
    
    protected String nombres;
    
    protected String apellidos;
    
    protected ArrayList<Solicitud> solicitudes = new ArrayList<>();
   
    protected final TipoUsuario tipo;

    public Usuario(
            @JsonProperty("userName") String userName,
            @JsonProperty("password") String password,
            @JsonProperty("nombres") String nombres,
            @JsonProperty("apellidos") String apellidos,
            @JsonProperty("solicitudes") ArrayList solicitudes,
            @JsonProperty("tipo") TipoUsuario tipo
    ) {
        this.userName = userName;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.solicitudes = solicitudes;
        this.tipo = tipo;
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

    public ArrayList<Solicitud> getSolicitudes() {
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
    
    public TipoUsuario getTipo() {
        return this.tipo;
    }
}

