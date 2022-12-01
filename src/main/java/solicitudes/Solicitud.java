/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solicitudes;

import com.fasterxml.jackson.annotation.JsonProperty;
import usuarios.Usuario;

/**
 *
 * @author USER
 */
public abstract class Solicitud {
    protected final TipoSolicitud tipo;
    protected Usuario remitente;
    protected Usuario destinatario;

    public Solicitud(
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario,
            @JsonProperty("tipo") TipoSolicitud tipo
    ) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tipo = tipo;
    }

    
    public abstract void imprimir();
    
    @Override
    public String toString() {
        return "Remitente: " + remitente + "\nDestinatario: " + destinatario;
    }
    
    public TipoSolicitud getTipo() {
        return this.tipo;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }
    
}