package com.sistema.gerenciador.clube.database;

/**
 *
 * @author rian_
 */
import java.sql.*;

public class Conector {

    public static void createDatabase() {
        try ( Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {
            Statement statement = connection.createStatement();
            
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
            
            statement.execute(sb.toString());

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
