import util.Guardar;
import util.Cargar;
import util.Print;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import menu.MenuCliente;
import usuarios.*;
import vehiculos.*;
import solicitudes.Solicitud;
import menu.*;  

public class Main {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    public static ArrayList<Solicitud> solicitudes = new ArrayList();
    public static ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        Main.usuarios = Cargar.usuarios();
        
        if (Main.usuarios.isEmpty()) {
            Guardar.crearSupervisorPredeterminado();
            Main.usuarios = Cargar.usuarios();
        }
        
        Usuario userLoggedIn = null;
        
        while(userLoggedIn == null) {
            userLoggedIn = Menu.autenticar(scanner, usuarios); // Este de aquí es quien genera el mensaje de Bievenida.
            
            if (userLoggedIn != null) {
                Print.darBienvenidaUsuario(userLoggedIn);

                if (userLoggedIn.getTipo() == TipoUsuario.CLIENTE) {
                    MenuCliente.show(scanner);
                }

                if (userLoggedIn.getTipo() == TipoUsuario.JEFE_TALLER) {
                    MenuJefeTaller.show(scanner, vehiculos);
                } 

                if (userLoggedIn.getTipo() == TipoUsuario.MECANICO) {
                    MenuMecanico.show(scanner);
                }

                if (userLoggedIn.getTipo() == TipoUsuario.SUPERVISOR) {
                    MenuSupervisor.show(scanner, usuarios);
                }

                if (userLoggedIn.getTipo() == TipoUsuario.VENDEDOR) {
                    MenuVendedor.show(scanner);
                }
            }
        }
            /*
            int optionChose = MenuCliente.menuCliente();
            while (optionChose != 8) {
                if (optionChose == 1) {
                    userCliente.consultarStock(uv1);
                    optionChose = MenuCliente.menuCliente();
                }
                else if (optionChose == 2) {
                    userCliente.verCarrosCliente();
                    optionChose = MenuCliente.menuCliente();
                }
                else if (optionChose == 3) {
                    userCliente.solicitudesCliente();
                    optionChose = MenuCliente.menuCliente();
                }
                else if (optionChose == 4) {
                    userCliente.drawVehicles(uv1);
                    optionChose = MenuCliente.menuCliente();
                }
                else if (optionChose == 5) {
                    System.out.println("""
                                        ############ SOLICITAR COTIZACIÓN ############
                                        Indique la posición del Vehículo en la Lista
                                        Stock del cual desea generar una solicitud de
                                        cotización para enviarla a un Vendedor alea-
                                        torio.
                                        """);
                    int position = inputJava.nextInt();
                    while (position > uv1.size() || position == 0) {
                        System.out.println("Ingrese una posición existente!");
                        position = inputJava.nextInt();
                    }
                    System.out.println("""
                                   Generando solicitud...""");
                    userCliente.solicitarCotizacion(uv1.get(position), userCliente, uvd1);
                    System.out.println("Solicitud enviada con éxito!");
                    optionChose = MenuCliente.menuCliente();
                }
                else if (optionChose == 6) {
                    System.out.println("""
                                        ############ SOLICITUD DE MANTENIMIENTO ############
                                        Indique la posición del Vehículo dentro de su Lista
                                        de Carros disponibles o que tiene a su disposición,
                                        de igual forma, escriba el tipo de mantenimiento
                                        que desea con la finalidad de generar la solicitud
                                        de Mantenimiento correspondiente.
                                        """);
                    int position = inputJava.nextInt();
                    while (position > userCliente.getCarros().size() || position == 0) {
                        System.out.println("Ingrese una posición existente!");
                        position = inputJava.nextInt();
                    }
                    System.out.println("""
                                   Generando solicitud...""");
                    userCliente.solicitarMantenimiento(userCliente.getCarros().get(position), "Limpieza profunda, Colgate 12 horas de acción", userCliente, userJFTaller);
                    System.out.println("Solicitud enviada con éxito!");
                    optionChose = MenuCliente.menuCliente();
                }
                else if (optionChose == 7) {
                    System.out.println("""
                                        ############ CONSULTAR ESTADO DEL VEHÍCULO ############
                                        Indique la posición del Vehículo al cual desea compro-
                                        bar su estado actual.
                                        """);
                    int position = inputJava.nextInt();
                    while (position > userCliente.getCarros().size() || position == 0) {
                        System.out.println("Ingrese una posición existente!");
                        position = inputJava.nextInt();
                    }
                    System.out.println("El estado del Vehículo es: " + 
                        userCliente.consultarEstado(userCliente.getCarros().get(position)));
                    optionChose = MenuCliente.menuCliente();
                }
            }
        }

*/
        
        /*
        else if (userLoggedIn.getTipo() == TipoUsuario.JEFE_TALLER){
            MenuJefeTaller.menuJefeTaller();
        }

        else if (userLoggedIn.getTipo() == TipoUsuario.MECANICO) {
            int optionChose = MenuMecanico.menuMecanico();
            while (optionChose != 3) {
                if (optionChose == 1) {
                    userMecanico.verCarrosMecanico();
                    optionChose = MenuMecanico.menuMecanico();
                }
                else {
                    System.out.println("""
                    ############ ENVIAR S. CAMBIO DE ESTADO ############
                    Indique la Posición del Vehículo en su Lista al cual
                    desea generarle una solicitud de cambio de estado.       
                    """);
                    int position = inputJava.nextInt();
                    while (position > userMecanico.getCarros().size() || position == 0) {
                        System.out.println("Ingrese una posición existente!");
                        position = inputJava.nextInt();
                    }
                    System.out.println("""
                    Generando solicitud...""");
                    userMecanico.enviarCambioEstado(position, userMecanico, sTester);
                    System.out.println("Solicitud enviada con éxito!");
                    optionChose = MenuMecanico.menuMecanico();
                }
            }
            Print.brindarDespedida();
        }

        else if (userLoggedIn.getTipo() == TipoUsuario.VENDEDOR) {
            MenuVendedor.menuVendedor();
        }

        else if (userLoggedIn.getTipo() == TipoUsuario.SUPERVISOR){
            int optionChose = MenuSupervisor.menuSupervisor();
            while (optionChose != 5) {
                if (optionChose == 1) {

                    optionChose = MenuSupervisor.menuSupervisor();
                }
                else if (optionChose == 4) {
                    int userTypeChose = MenuSupervisor.submenuUsuarioSupervisor();
                    if (userTypeChose == 1) { // CLIENTE
                        System.out.println("Ingrese la cédula: ");
                        String cCedula = inputJava.nextLine();
                        System.out.println("Ingrese la ocupación: ");
                        String cOcupacion = inputJava.nextLine();
                        System.out.println("Ingrese el nombre de usuario: ");
                        String cUsername = inputJava.nextLine();
                        System.out.println("Ingrese el password: ");
                        String cPassword = inputJava.nextLine();
                        System.out.println("Ingrese el nombre: ");
                        String cNombre = inputJava.nextLine();
                        System.out.println("Ingrese el apellido: ");
                        String cApellido = inputJava.nextLine();
                        System.out.println("Digite el ingreso monetario: ");
                        double cMoneyIncome = inputJava.nextDouble();
                        Cliente uCliente = new Cliente(
                                cCedula, 
                                cOcupacion, 
                                cMoneyIncome, 
                                cUsername, 
                                cPassword, 
                                cNombre, 
                                cApellido, 
                                solicitudes);
                        usuarios.add(uCliente);
                        Guardar.usuarios(usuarios);
                        System.out.println("""
                                           Usuario creado y guardado con éxito!
                                           """);
                    }
                    optionChose = MenuSupervisor.menuSupervisor();
                }
            }
        }
        */
    }
}
