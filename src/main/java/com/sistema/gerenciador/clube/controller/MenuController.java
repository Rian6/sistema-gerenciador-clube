package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.view.ListaAssociadoView;
import com.sistema.gerenciador.clube.view.MenuView;

/**
 *
 * @author rian_
 */
public class MenuController {
    public void navegarListaAssociado(MenuView oldScreen){
        oldScreen.setVisible(false);
        oldScreen = null;
        
        ListaAssociadoView newScreen = new ListaAssociadoView();
        newScreen.setVisible(true);
    }
}
