package util;

import usuarios.Usuario;

public class Print {
    public static void darBienvenidaUsuario(Usuario usuario) {
        System.out.println("Bienvenido " + usuario.getNombres() + " " + usuario.getApellidos() + "!");
    }
    
    public static void usuarioNoEncontrado() {
        System.out.println("No existe el usuario ingresado!");
    }
    
    public static void ficheroNoEncontrado() {
        System.out.println("Fichero no encontrado, se creará uno automáticamente.");
    }
    
    public static void valorNoProcesable() {
        System.out.println("No se puede procesar el valor ingresado, intenta de nuevo.");
    }
    
    public static void ingresarUsername() {
        System.out.print("Ingrese su nombre de usuario: ");
    }
    
    public static void brindarDespedida() {
        System.out.println("""

            |----------------------------------------|
            |              EXIT PROGRAM              |
            |----------------------------------------|
            |                                        |
            |Gracias por emplear nuestros servicios! |
            |Nos vemos pronto!                       |
            |----------------------------------------|
        """);
    }
    
    public static void darBienvenidaPrograma() {
        System.out.println("""
            -----------------------------------------------
            |Bienvenido a la Concesionaria 'AMLO'         |
            |                                             |
            |El siguiente sistema le otorgará la capacidad|
            |de aprobar solicitudes de crédito para la    |
            |compra de vehículos, receptar pagos, emitir, | 
            |cotizaciones entre otros aspectos.           |
            |                                             |
            |Para ingresar al programa, siga los pasos    |
            |indicados en la parte inferior...            |
            -----------------------------------------------
        """);
    }
    
    public static void iniciarSesion() {
        System.out.println("""
            ===============================================
                      I N I C I A R  S E S I Ó N
            ===============================================
        """);
    }
    
    public static void tiposDeUsuario() {
        System.out.println("""
            |===============================================|
            | TIPOS DE USUARIO                              |
            |===============================================|
            | 1. Cliente                                    |
            | 2. Jefe de taller                             |  
            | 3. Mecánico                                   |  
            | 4. Supervisor                                 |  
            | 5. Vendedor                                   |   
            |-----------------------------------------------|                 
        """);
    }
}
