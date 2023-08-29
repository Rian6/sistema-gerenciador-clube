package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.entity.Usuario;
import com.sistema.gerenciador.clube.model.LoginModel;
import com.sistema.gerenciador.clube.session.UsuarioLogado;
import com.sistema.gerenciador.clube.view.LoginView;
import com.sistema.gerenciador.clube.view.MenuView;
import javax.swing.JOptionPane;

/**
 *
 * @author rian_
 */
public class LoginController {

    public void logar(LoginView oldScreen, String login, String senha) {
        LoginModel loginModel = new LoginModel();
        
        Usuario usuario = loginModel.getLogin(login, senha);
        
        if(usuario != null && usuario.getId() != null && usuario.getId() != 0){
            UsuarioLogado.id = usuario.getId();
            UsuarioLogado.login = usuario.getLogin();
            UsuarioLogado.nome = usuario.getNome();
            
            navegarMenu(oldScreen);
        } else {
            JOptionPane.showMessageDialog(null, "Senha ou Login incorreto(s)");
        }
    }

    private MenuView navegarMenu(LoginView oldScreen) {
        oldScreen.setVisible(false);
        oldScreen = null;

        MenuView menuScreen = new MenuView();
        menuScreen.setVisible(true);

        return menuScreen;
    }
}
