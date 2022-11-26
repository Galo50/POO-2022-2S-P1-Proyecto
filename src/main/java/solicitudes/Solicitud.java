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
    protected Usuario remitente;
    protected Usuario destinatario;

    public Solicitud(
            @JsonProperty("remitente") Usuario remitente, 
            @JsonProperty("destinatario") Usuario destinatario 
    ) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    
    public abstract void imprimir();
    
    @Override
    public String toString() {
        return "Remitente: " + remitente + "\nDestinatario: " + destinatario;
    }
    
}