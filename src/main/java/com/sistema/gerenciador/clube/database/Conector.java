package com.sistema.gerenciador.clube.database;

/**
 *
 * @author rian_
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Conector {

    public static void createDatabase() {

        List<StringBuilder> builders = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ASSOCIADO( \n");
        sb.append("ID INTEGER PRIMARY KEY AUTOINCREMENT, \n");
        sb.append("NOME VARCHAR, \n");
        sb.append("ENDERECO VARCHAR, \n");
        sb.append("TELEFONE VARCHAR, \n");
        sb.append("EMAIL VARCHAR, \n");
        sb.append("TIPO_PAGAMENTO VARCHAR, \n");
        sb.append("CPF VARCHAR, \n");
        sb.append("DEPENDENTES INTEGER);");
        builders.add(sb);

        sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS USUARIO( \n");
        sb.append("ID INTEGER PRIMARY KEY AUTOINCREMENT, \n");
        sb.append("NOME VARCHAR, \n");
        sb.append("ENDERECO VARCHAR, \n");
        sb.append("LOGIN VARCHAR, \n");
        sb.append("SENHA VARCHAR, \n");
        sb.append("TELEFONE VARCHAR, \n");
        sb.append("EMAIL VARCHAR, \n");
        sb.append("CARGO VARCHAR, \n");
        sb.append("SALARIO DOUBLE); \n");
        builders.add(sb);

        for (StringBuilder builder : builders) {
            runCreate(builder);
        }
    }

    private static void runCreate(StringBuilder builder) {
        try ( Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {
            Statement statement = connection.createStatement();
            statement.execute(builder.toString());
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Boolean persist(String query) {
        try ( Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {
            Statement statement = connection.createStatement();

            // inserindo registros
            statement.execute(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:banco.db");
    }
}
