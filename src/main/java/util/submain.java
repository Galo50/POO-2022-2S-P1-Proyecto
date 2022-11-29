package util;


import menu.*;
import usuarios.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class submain {
    public void submain(){
     Usuario userLoggedIn;
     if (userLoggedIn.getTipo() == TipoUsuario.SUPERVISOR) {
                MCliente.menuCliente();
                int optionChose = MSupervisor.menuSupervisor();
                while (optionChose != 8) {
                    if (optionChose == 1) {
                        
                    }
                    else if (optionChose == 2) {
                        
                    }
                    else if (optionChose == 3) {
                        
                    }
                    else if (optionChose == 4) {
                        
                    }
                    else {
                        
                    }
                }
    
     }
     }
    
     
