import usuarios.Usuario;

public class Prints {
    public static void darBienvenida(Usuario usuario) {
        System.out.println("Bienvenido " + usuario.getNombres() + " " + usuario.getApellidos() + "!");
    }
    
    public static void usuarioNoEncontrado() {
        System.out.println("No existe el usuario ingresado!");
    }
    
    public static void ficheroNoEncontrado() {
        System.out.println("Fichero no encontrado, se creará uno automáticamente.");
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
}
