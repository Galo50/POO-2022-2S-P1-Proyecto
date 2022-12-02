package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import usuarios.*;
import vehiculos.*;
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

        File file = new File("vehiculos.json");
        file.createNewFile();
        
        objectMapper.writeValue(file, vehiculos);
    }
    
    public static void crearUsuariosPredeterminados() throws IOException {
        ArrayList<String> certificacionesTecnicas = new ArrayList();
        ArrayList<String> certificacionesAcademicas = new ArrayList();
        
        certificacionesTecnicas.add("Mecánico automotriz");
        certificacionesAcademicas.add("Ingeniero mecánico");
        
        Supervisor supervisor = new Supervisor(
            new ArrayList(),
            "admin",
            "admin",
            "Administrador",
            "Predeterminado",
            new ArrayList()
        );
        
        Cliente cliente = new Cliente(
            "0951425675",
            "Vendedor de juegos pirateados",
            2500,
            "cliente",
            "12345",
            "Carlos Gustavo",
            "Pérez González",
            new ArrayList()
        );
        
        Cliente clienteDos = new Cliente(
            "0951435675",
            "Director del IESS",
            2500,
            "clientedos",
            "12345",
            "Pedro Tiger",
            "Petro Eyed",
            new ArrayList()
        );
        
        JefeTaller jefeTaller = new JefeTaller(
            certificacionesTecnicas,
            "jefetaller",
                "12345",
            "Lenin",
            "Guzmán",
            new ArrayList()
        );
        
        Vendedor vendedorUno = new Vendedor(
            "v-1",
            0,
            "vendedoruno",
            "12345",
            "Jenniffer",
            "Chica",
            new ArrayList()
        );
        
        Vendedor vendedorDos = new Vendedor(
            "v-2",
            0,
            "vendedordos",
            "12345",
            "Galo",
            "Mendoza",
            new ArrayList()
        );
        
        Vendedor vendedorTres = new Vendedor(
            "v-3",
            0,
            "vendedortres",
            "12345",
            "Joan",
            "Qhizpe",
            new ArrayList()
        );
        
        Mecanico mecanico = new Mecanico(
            "mecanico",
            "12345",
            "Fredder",
            "Gudrow",
            new ArrayList(),
            new ArrayList()
        );
        
        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios.add(supervisor);
        usuarios.add(cliente);
        usuarios.add(jefeTaller);
        usuarios.add(vendedorUno);
        usuarios.add(vendedorDos);
        usuarios.add(vendedorTres);
        usuarios.add(mecanico);
        usuarios.add(clienteDos);
        
        Guardar.usuarios(usuarios);
    }
    
    public static void crearVehiculosPredeterminados() throws IOException {
        Automovil automovilUno = new Automovil(5, true, true, 2010, "BMW", 4, "Persiana", 25000, VehiculoCombustible.GASOLINA, VehiculoEstado.INVENTARIO);
        Automovil automovilDos = new Automovil(5, false, true, 2011, "Renault", 4, "Logan", 9000, VehiculoCombustible.GASOLINA, VehiculoEstado.INVENTARIO);
        
        Camion camion = new Camion(5000, 8, 2015, "Mazda", VehiculoCombustible.DIESEL, "Introspectiva", 34000, VehiculoEstado.INVENTARIO);
        Tractor tractor = new Tractor(false, VehiculoTransmision.HIDRAULICA, 2018, "HONDA", VehiculoCombustible.DIESEL, "Destructor", 45000.0, VehiculoEstado.INVENTARIO);
        
        Automovil automovilTres = new Automovil(5, false, true, 2020, "Chevrolet", 4, "Spark", 12000, VehiculoCombustible.GASOLINA, VehiculoEstado.INVENTARIO);
        
        Motocicleta motocicleta = new Motocicleta(TipoMoto.TODO_TERRENO, 2017, "HONDA", VehiculoCombustible.GASOLINA, "450ECO Slow Flash", 6500.0, VehiculoEstado.INVENTARIO);
        
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        vehiculos.add(automovilUno);
        vehiculos.add(automovilDos);
        vehiculos.add(camion);
        vehiculos.add(tractor);
        vehiculos.add(automovilTres);
        vehiculos.add(motocicleta);
        
        Guardar.vehiculos(vehiculos);
    }
}
