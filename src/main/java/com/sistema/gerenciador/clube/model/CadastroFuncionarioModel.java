package com.sistema.gerenciador.clube.model;

import com.sistema.gerenciador.clube.database.Conector;
import com.sistema.gerenciador.clube.entity.Associado;
import com.sistema.gerenciador.clube.entity.Usuario;

public class CadastroFuncionarioModel extends Conector {

    public Boolean salvar(Usuario usuario) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO USUARIO (NOME, ENDERECO, LOGIN, SENHA, TELEFONE, EMAIL, CARGO, SALARIO) \n");
        sb.append("VALUES (':NOME', ':ENDERECO', ':LOGIN', ':SENHA', ':TELEFONE', ':EMAIL', ':CARGO', ':SALARIO')");

        String query = sb.toString();

        query = query.replace(":NOME", usuario.getNome());
        query = query.replace(":ENDERECO", usuario.getEndereco());
        query = query.replace(":LOGIN", usuario.getLogin());
        query = query.replace(":SENHA", usuario.getSenha());
        query = query.replace(":TELEFONE", usuario.getTelefone());
        query = query.replace(":EMAIL", usuario.getEmail());
        query = query.replace(":CARGO", usuario.getCargo());
        String salarioDoubleToString = String.valueOf(usuario.getSalario());
        query = query.replace(":SALARIO", salarioDoubleToString);
        return persist(query);
    }
}
