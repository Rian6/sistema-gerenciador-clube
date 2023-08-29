package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.entity.Usuario;
import com.sistema.gerenciador.clube.model.CadastroFuncionarioModel;
import com.sistema.gerenciador.clube.view.CadastroFuncionarioView;
import com.sistema.gerenciador.clube.view.ListaAssociadoView;

/**
 *
 * @author rian_
 */
public class CadastroFuncionarioController {

    private CadastroFuncionarioModel cadastroFuncionarioModel;

    public CadastroFuncionarioController() {
        cadastroFuncionarioModel = new CadastroFuncionarioModel();
    }

    public Boolean salvar(Usuario usuario) {
        return cadastroFuncionarioModel.salvar(usuario);
    }

    public void voltar(CadastroFuncionarioView oldScreen) {
        oldScreen.setVisible(false);
        oldScreen = null;

        ListaAssociadoView newScreen = new ListaAssociadoView();
        newScreen.setVisible(true);
    }
}
