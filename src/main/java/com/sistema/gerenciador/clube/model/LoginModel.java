/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.gerenciador.clube.model;

import com.sistema.gerenciador.clube.database.Conector;
import com.sistema.gerenciador.clube.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rian_
 */
public class LoginModel extends Conector{
        public Usuario getLogin(String login, String senha){
        Usuario usuario = new Usuario();

        try ( Connection connection = connect()) {
            PreparedStatement stmt = connection.prepareStatement(
                      "SELECT ID, LOGIN, NOME FROM USUARIO "
                    + "WHERE LOGIN = '"+login+"' "
                    + "AND SENHA = '"+senha+"'");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Long id = resultSet.getLong("ID");
                String loginTmp = resultSet.getString("LOGIN");
                String nome = resultSet.getString("NOME");

                usuario.setId(id);
                usuario.setLogin(loginTmp);
                usuario.setNome(nome);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return usuario;
    }
}
