package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.view.CadastroFuncionarioView;
import com.sistema.gerenciador.clube.view.ListaAssociadoView;
import com.sistema.gerenciador.clube.view.ListaFuncionarioView;
import com.sistema.gerenciador.clube.view.MenuView;

/**
 *
 * @author rian_
 */
public class MenuController {

    public void navegarListaAssociado(MenuView oldScreen) {
        oldScreen.setVisible(false);
        oldScreen = null;

        ListaAssociadoView newScreen = new ListaAssociadoView();
        newScreen.setVisible(true);
    }

    public void navegarListaFuncionarios(MenuView oldScreen) {
        oldScreen.setVisible(false);
        oldScreen = null;

        ListaFuncionarioView newScreen = new ListaFuncionarioView();
        newScreen.setVisible(true);
    }

    public void navegarCadastroFuncionario(MenuView oldScreen) {
        oldScreen.setVisible(false);
        oldScreen = null;

        CadastroFuncionarioView newScreen = new CadastroFuncionarioView();
        newScreen.setVisible(true);
    }
}
