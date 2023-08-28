
package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.view.LoginView;
import com.sistema.gerenciador.clube.view.MenuView;

/**
 *
 * @author rian_
 */
public class LoginController {
    public MenuView logar(LoginView oldScreen){
        oldScreen.setVisible(false);
        oldScreen = null;
        
        MenuView menuScreen = new MenuView();
        menuScreen.setVisible(true);
        
        return menuScreen;
    }
}
