package com.sistema.gerenciador.clube.model;

import com.sistema.gerenciador.clube.database.Conector;
import com.sistema.gerenciador.clube.entity.Associado;
import com.sistema.gerenciador.clube.entity.Usuario;
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
public class ListaFuncionarioModel extends Conector {

    public List<Usuario> buscarFuncionarios(String pesquisa) {
        List<Usuario> listaUsuarios = new ArrayList<>();

        try ( Connection connection = connect()) {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM USUARIO WHERE NOME LIKE '%"+pesquisa+"%'");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Long id = resultSet.getLong("ID");
                String nome = resultSet.getString("NOME");

                Usuario usuario = new Usuario();
                usuario.setId(id);
                usuario.setNome(nome);
                
                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaUsuarios;
    }

}
