package store;

import usuarios.Usuario;

public class AppState {
    private static boolean runApp = true;
    private static Usuario userLoggedIn = null;
    
    public static boolean getRunApp() {
        return AppState.runApp;
    }
    
    public static Usuario getUserLoggedIn() {
        return AppState.userLoggedIn;
    }
    
    public static void setRunApp(boolean runApp) {
        AppState.runApp = false;
    }
    
    public static void setUserLoggedIn(Usuario userLoggedIn) {
        AppState.userLoggedIn = userLoggedIn;
    }
}
