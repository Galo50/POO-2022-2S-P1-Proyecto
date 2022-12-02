package usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import solicitudes.Solicitud;
import solicitudes.SRecomendacion;
import vehiculos.Vehiculo;

public class Vendedor extends Usuario{
    
    private final String id;
    private int vendidos;

    public Vendedor(
            @JsonProperty("id") String id, 
            @JsonProperty("vendidos") int vendidos, 
            @JsonProperty("userName") String userName, 
            @JsonProperty("password") String password, 
            @JsonProperty("nombres") String nombres, 
            @JsonProperty("apellidos") String apellidos, 
            @JsonProperty("solicitudes") ArrayList<Solicitud> solicitudes
    ) {
        super(userName, password, nombres, apellidos, solicitudes, TipoUsuario.VENDEDOR);
        this.id = id;
        this.vendidos = vendidos;
    }

    public String getId() {
        return id;
    }

    public int getVendidos() {
        return vendidos;
    }
    
    public void accesoStock(ArrayList<Vehiculo> carrosDisponibles) {
        System.out.println("Actualmente existen " + carrosDisponibles.size() + " vehículo en la Concesionaria.");
    }
    
    public void solicitudesVendedor() {
        System.out.println("############ LISTA DE SOLICITUDES ############");
        for (Solicitud i: this.solicitudes) {
            i.imprimir();
            solicitudes.remove(i);
        }
    }
    
    public void sugerirModelos(Cliente destinatario, Vendedor remitente, Vehiculo carro, ArrayList<Vehiculo> carrosDisponibles) {
        int posicionVehiculo = carrosDisponibles.indexOf(carro);
        SRecomendacion sr1 = new SRecomendacion(carro, posicionVehiculo, remitente, destinatario);
        destinatario.solicitudes.add(sr1);
    }
}
