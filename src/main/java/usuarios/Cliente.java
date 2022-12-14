package usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import vehiculos.*;
import solicitudes.*;
import java.util.Random;

public class Cliente extends Usuario {
    private final String cedula;
    private final String ocupacion;
    private final double ingresos;
    private ArrayList<Vehiculo> carros;

    public Cliente(
            @JsonProperty("cedula") String cedula, 
            @JsonProperty("ocupacion") String ocupacion, 
            @JsonProperty("ingresos") double ingresos, 
            @JsonProperty("userName") String userName, 
            @JsonProperty("password") String password, 
            @JsonProperty("nombres") String nombres, 
            @JsonProperty("apellidos") String apellidos, 
            @JsonProperty("solicitudes") ArrayList<Solicitud> solicitudes
    ) {
        super(userName, password, nombres, apellidos, solicitudes, TipoUsuario.CLIENTE);
        this.cedula = cedula;
        this.ocupacion = ocupacion;
        this.ingresos = ingresos;
        this.carros = new ArrayList();
    }
    
    public void solicitarCotizacion(Vehiculo carro, Usuario remitente, ArrayList<Vendedor> listaVendedores) {
        Random rand = new Random();
        int randomPosition = rand.nextInt(listaVendedores.size());
        SCotizacion sc1 = new SCotizacion(carro, remitente, listaVendedores.get(randomPosition));
        listaVendedores.get(randomPosition).solicitudes.add(sc1);
    }

    public String getCedula() {
        return cedula;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public double getIngresos() {
        return ingresos;
    }
    
    public ArrayList<Vehiculo> getCarros() {
        return carros;
    }
    
    public void solicitarMantenimiento(Vehiculo carro, String tipoMantenimiento, Cliente remitente, JefeTaller jefeTaller) {
        SMantenimiento sm1 = new SMantenimiento(tipoMantenimiento, carro, remitente, jefeTaller);
        jefeTaller.solicitudes.add(sm1);
    }
    
    public VehiculoEstado consultarEstado(Vehiculo carro) {
        return carro.getEstado();
    }
}
