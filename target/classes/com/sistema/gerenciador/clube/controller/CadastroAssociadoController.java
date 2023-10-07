package com.sistema.gerenciador.clube.controller;

import com.sistema.gerenciador.clube.entity.Associado; 
import com.sistema.gerenciador.clube.model.CadastroAssociadoModel;
import com.sistema.gerenciador.clube.view.CadastroAssociadoView;
import com.sistema.gerenciador.clube.view.ListaAssociadoView;

/**
 *
 * @author rian_
 */                            
public class CadastroAssociadoController {
    
    private CadastroAssociadoModel cadastroAssociadoModel;
    
    public CadastroAssociadoController(){
        cadastroAssociadoModel = new CadastroAssociadoModel();
    }
    
    public Boolean salvar(Associado associado){
        return cadastroAssociadoModel.salvar(associado);
    }
    
    public void voltar(CadastroAssociadoView oldScreen) {
        oldScreen.setVisible(false);
        oldScreen = null;

        ListaAssociadoView newScreen = new ListaAssociadoView();
        newScreen.setVisible(true);
    }
}
