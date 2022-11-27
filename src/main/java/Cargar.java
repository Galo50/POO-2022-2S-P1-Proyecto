
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import usuarios.Cliente;
import usuarios.JefeTaller;
import usuarios.Mecanico;
import usuarios.Supervisor;
import usuarios.TipoUsuario;
import usuarios.Usuario;
import usuarios.Vendedor;
import solicitudes.*;
import vehiculos.*;

public class Cargar {
    public static ArrayList<Usuario> usuarios() throws IOException  {
        ArrayList<Usuario> usuarios = new ArrayList();
        
        try {
            File file = new File("usuarios.json");

            ObjectMapper mapper = new ObjectMapper();

            JsonNode node = mapper.valueToTree(mapper.readValue(file, JsonNode.class));

            for (int i = 0; i < node.size(); i++) {
                JsonNode usuarioJson = node.get(i);
                String tipo = usuarioJson.get("tipo").textValue();

                if (tipo.equals(TipoUsuario.JEFE_TALLER.name())) {
                    usuarios.add(mapper.readValue(usuarioJson.toString(), JefeTaller.class));
                }

                if (tipo.equals(TipoUsuario.CLIENTE.name())) {
                    usuarios.add(mapper.readValue(usuarioJson.toString(), Cliente.class));
                }

                if (tipo.equals(TipoUsuario.MECANICO.name())) {
                    usuarios.add(mapper.readValue(usuarioJson.toString(), Mecanico.class));
                }

                if (tipo.equals(TipoUsuario.SUPERVISOR.name())) {
                    usuarios.add(mapper.readValue(usuarioJson.toString(), Supervisor.class));
                }

                if (tipo.equals(TipoUsuario.VENDEDOR.name())) {
                    usuarios.add(mapper.readValue(usuarioJson.toString(), Vendedor.class));
                }
            }
        } catch(FileNotFoundException e) {
            Prints.ficheroNoEncontrado();
        }


        return usuarios;
    }
        
    public static ArrayList<Solicitud> solicitudes() throws IOException {
        ArrayList<Solicitud> solicitudes = new ArrayList();
        File file = new File("solicitudes.json");
        
        ObjectMapper mapper = new ObjectMapper();
        
        JsonNode node = mapper.valueToTree(mapper.readValue(file, JsonNode.class));
        for (int i = 0; i < node.size(); i++) {
            JsonNode solicitudJson = node.get(i);
            String tipo = solicitudJson.get("tipo").textValue();
            
            if (tipo.equals(TipoSolicitud.COMPRA.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SCompra.class));
            }
            
            if (tipo.equals(TipoSolicitud.COTIZACION.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SCotizacion.class));
            }
            
            if (tipo.equals(TipoSolicitud.ENTREGA.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SEntrega.class));
            }
            
            if (tipo.equals(TipoSolicitud.ESTADO.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SEstado.class));
            }
            
            if (tipo.equals(TipoSolicitud.MANTENIMIENTO.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SMantenimiento.class));
            }
            
            if (tipo.equals(TipoSolicitud.RECHAZO.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SRechazo.class));
            }
            
            if (tipo.equals(TipoSolicitud.RECOMENDACION.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SRecomendacion.class));
            }
            
            if (tipo.equals(TipoSolicitud.RESPUESTA.name())) {
                solicitudes.add(mapper.readValue(solicitudJson.toString(), SRespuesta.class));
            }
        }
        
        return solicitudes;
    }
    
    public static ArrayList<Vehiculo> vehiculos() throws IOException {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        File file = new File("vehiculos.json");
        
        ObjectMapper mapper = new ObjectMapper();
        
        JsonNode node = mapper.valueToTree(mapper.readValue(file, JsonNode.class));
        for (int i = 0; i < node.size(); i++) {
            JsonNode vehiculoJson = node.get(i);
            String tipo = vehiculoJson.get("tipo").textValue();
            
            if (tipo.equals(TipoVehiculo.AUTOMOVIL.name())) {
                vehiculos.add(mapper.readValue(vehiculoJson.toString(), Automovil.class));
            }
            
            if (tipo.equals(TipoVehiculo.CAMION.name())) {
                vehiculos.add(mapper.readValue(vehiculoJson.toString(), Camion.class));
            }
            
            if (tipo.equals(TipoVehiculo.MOTOCICLETA.name())) {
                vehiculos.add(mapper.readValue(vehiculoJson.toString(), Motocicleta.class));
            }
            
            if (tipo.equals(TipoVehiculo.TRACTOR.name())) {
                vehiculos.add(mapper.readValue(vehiculoJson.toString(), Tractor.class));
            }
        }
        
        return vehiculos;
    }
}
