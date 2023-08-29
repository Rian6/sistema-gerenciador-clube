package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.entity.Usuario;
import com.sistema.gerenciador.clube.model.ListaFuncionarioModel;
import com.sistema.gerenciador.clube.view.CadastroAssociadoView;
import com.sistema.gerenciador.clube.view.CadastroFuncionarioView;
import com.sistema.gerenciador.clube.view.ListaAssociadoView;
import com.sistema.gerenciador.clube.view.ListaFuncionarioView;
import com.sistema.gerenciador.clube.view.MenuView;
import java.util.List;

/**
 *
 * @author rian_
 */
public class ListaFuncionarioController {
    
    private ListaFuncionarioModel listaFuncionarioModel;
    
    private List<Usuario> listaFuncionarios;
    
    public ListaFuncionarioController(){
        listaFuncionarioModel = new ListaFuncionarioModel();
    }
    
    public List<Usuario> buscarFuncionarios(String pesquisa){
        return listaFuncionarioModel.buscarFuncionarios(pesquisa);
    }
    
    //navegação
    public void navegarCadastroFuncionario(ListaFuncionarioView oldScreen){
        oldScreen.setVisible(false);
        oldScreen = null;
        
        CadastroFuncionarioView newScreen = new CadastroFuncionarioView();
        newScreen.setVisible(true);
    }
    
    public void voltar(ListaFuncionarioView oldScreen){
        oldScreen.setVisible(false);
        oldScreen = null;
        
        MenuView newScreen = new MenuView();
        newScreen.setVisible(true);
    }
}
