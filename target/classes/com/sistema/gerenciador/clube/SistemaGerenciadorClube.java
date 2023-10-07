package com.sistema.gerenciador.clube;

import com.sistema.gerenciador.clube.database.Conector;
import com.sistema.gerenciador.clube.view.LoginView;

/**
 *
 * @author rian_
 */
public class SistemaGerenciadorClube {

    public static void main(String[] args) {
        Conector.createDatabase();

        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }
}
