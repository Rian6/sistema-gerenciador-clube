package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.entity.Associado;
import com.sistema.gerenciador.clube.model.ListaAssociadoModel;
import com.sistema.gerenciador.clube.view.CadastroAssociadoView;
import com.sistema.gerenciador.clube.view.ListaAssociadoView;
import com.sistema.gerenciador.clube.view.MenuView;
import java.util.List;

/**
 *
 * @author rian_
 */
public class ListaAssociadoController {
    
    private ListaAssociadoModel listaAssociadoModel;
    
    private List<Associado> listaAssociados;
    
    public ListaAssociadoController(){
        listaAssociadoModel = new ListaAssociadoModel();
    }
    
    public List<Associado> buscarAssociados(String pesquisa){
        return listaAssociadoModel.buscarAssociados(pesquisa);
    }
    
    //navegação
    public void navegarCadastroAssociado(ListaAssociadoView oldScreen){
        oldScreen.setVisible(false);
        oldScreen = null;
        
        CadastroAssociadoView newScreen = new CadastroAssociadoView();
        newScreen.setVisible(true);
    }
    
    public void voltar(ListaAssociadoView oldScreen){
        oldScreen.setVisible(false);
        oldScreen = null;
        
        MenuView newScreen = new MenuView();
        newScreen.setVisible(true);
    }
}
