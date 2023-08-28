package com.sistema.gerenciador.clube.model;

import com.sistema.gerenciador.clube.database.Conector;
import com.sistema.gerenciador.clube.entity.Associado;

public class CadastroAssociadoModel extends Conector {

    public Boolean salvar(Associado associado) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ASSOCIADO (NOME, ENDERECO, TELEFONE, EMAIL, CPF, DEPENDENTES, TIPO_PAGAMENTO) \n");
        sb.append("VALUES (':NOME', ':ENDERECO', ':TELEFONE', ':EMAIL', ':CPF', ':DEPENDENTES', ':TIPOPAGAMENTO')");

        String query = sb.toString();

        query = query.replace(":NOME", associado.getNome());
        query = query.replace(":ENDERECO", associado.getEndereco());
        query = query.replace(":TELEFONE", associado.getTelefone());
        query = query.replace(":EMAIL", associado.getEmail());
        query = query.replace(":CPF", associado.getCpf());
        query = query.replace(":DEPENDENTES", associado.getDependentes() != null ? associado.getDependentes().toString() : "");
        query = query.replace(":TIPOPAGAMENTO", associado.getTipoPagamento() == null ? "" : associado.getTipoPagamento());

        return persist(query);
    }
}
