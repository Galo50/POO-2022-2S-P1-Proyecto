package util;

import usuarios.Usuario;

public class Print {
    public static String ingresarOpcion = "Ingrese su opción: ";
    public static String seCrearaCliente = "Va a crear un cliente, rellene los datos a continuación.";
    
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
    
    public static void ingresarPassword() {
        System.out.print("Ingrese su contraseña: ");
    }
    
    public static String ingresarTipoDeUsuario(boolean print) {
        String mensaje = "Ingrese el tipo de usuario: ";
        if (print) {
            System.out.print(mensaje);
        }
        return mensaje;
    }
    
    public static void seCrearaCliente() {
        System.out.println(Print.seCrearaCliente);
    }
    
    public static void valorFueraDeRango() {
        System.out.print("El valor ingresado está fuera del rango.");
    }
    
    public static void solicitarIniciarSesion() {
        System.out.print("Necesita iniciar sesion para usar el programa.");
    }
    
    public static void ingresarOpcion() {
        System.out.print(Print.ingresarOpcion);
    }
    
    public static void inicioDeSesionFallido() {
        System.out.println("Credenciales incorrectas o usuario inexistente.");
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
    
    public static void preguntaSiEsCliente() {
        System.out.println("""
            |===============================================|
            |          ¿USTED ES CLIENTE NUEVO?             |
            |===============================================|
            |1. Si                                          |
            |2. No                                          |    
            |-----------------------------------------------|    """);
    }
    
    public static void opcionesDeCliente() {
        System.out.println("""
            |===============================================|
            |                  MENÚ CLIENTE                 |
            |===============================================|
            |                  * Opciones *                 |
            |1. Consultar stock                             |
            |2. Consultar vehículos adquiridos              |
            |3. Consultar cotizaciones                      |
            |4. Consultar mantenimientos                    |
            |5. Solicitar mantenimiento                     |
            |6. Salir                                       |
            |-----------------------------------------------|

        """);
    }
    
    public static void opcionesDeJefeTaller() {
        System.out.println("""
            |===============================================|
            |               MENÚ JEFE TALLER                |
            |===============================================|
            |                  * Opciones *                 |
            |1. Entregar vehículos                          |
            |2. Consultar mantenimientos                    |
            |3. Consultar solicitudes de mantenimiento      |
            |4. Salir                                       |
            |-----------------------------------------------|

       """);
    }
    
    public static void opcionesDeSupervisor() {
        System.out.println("""
            |===============================================|
            |                MENÚ SUPERVISOR                |
            |===============================================|
            |                  * Opciones *                 |
            |1. Consultar Vendedores                        |
            |2. Ingresar Nuevos Vehiculos                   |
            |3. Bandeja de Solicitudes                      |
            |4. Ingresar Usuario Nuevo                      |
            |5. Salir                                       |
            |-----------------------------------------------|
                           
       """);
    }
    
    public static void opcionesDeVendedor() {
        System.out.println("""
            |===============================================|
            |                 MENÚ VENDEDOR                 |
            |===============================================|
            |                  * Opciones *                 |
            |1. Acceso a Stock                              |
            |2. Bandeja de Solicitudes                      |
            |3. Sugerir Modelos                             |
            |4. Salir                                       |
            |-----------------------------------------------|
                           
       """);
    }
}
