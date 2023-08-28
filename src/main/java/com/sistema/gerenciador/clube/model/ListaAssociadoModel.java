package com.sistema.gerenciador.clube.model;

import com.sistema.gerenciador.clube.database.Conector;
import com.sistema.gerenciador.clube.entity.Associado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rian_
 */
public class ListaAssociadoModel extends Conector {

    public List<Associado> buscarAssociados(String pesquisa) {
        List<Associado> listaAssociados = new ArrayList<>();

        try ( Connection connection = connect()) {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM ASSOCIADO WHERE NOME LIKE '%"+pesquisa+"%'");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Long id = resultSet.getLong("ID");
                String nome = resultSet.getString("NOME");
                String endereco = resultSet.getString("ENDERECO");
                String telefone = resultSet.getString("TELEFONE");

                Associado associado = new Associado();
                associado.setId(id);
                associado.setNome(nome);
                associado.setEndereco(endereco);
                associado.setTelefone(telefone);
                
                listaAssociados.add(associado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaAssociados;
    }

}
