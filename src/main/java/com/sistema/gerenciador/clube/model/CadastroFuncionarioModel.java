package com.sistema.gerenciador.clube.model;

import com.sistema.gerenciador.clube.database.Conector;
import com.sistema.gerenciador.clube.entity.Associado;
import com.sistema.gerenciador.clube.entity.Usuario;

public class CadastroFuncionarioModel extends Conector {

    public Boolean salvar(Usuario usuario) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO USUARIO (NOME, LOGIN, SENHA) \n");
        sb.append("VALUES (':NOME', ':LOGIN', ':SENHA')");

        String query = sb.toString();

        query = query.replace(":NOME", usuario.getNome());
        query = query.replace(":LOGIN", usuario.getLogin());
        query = query.replace(":SENHA", usuario.getSenha());
        
        return persist(query);
    }
}
